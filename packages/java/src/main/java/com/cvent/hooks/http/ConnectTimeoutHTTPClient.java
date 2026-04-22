package com.cvent.hooks.http;

import com.cvent.hooks.CventTimeoutHook;
import com.cvent.utils.Blob;
import com.cvent.utils.Helpers;
import com.cvent.utils.HTTPClient;
import com.cvent.utils.ResponseWithBody;
import com.cvent.utils.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * A {@link HTTPClient} that mirrors the SDK's default {@code SpeakeasyHTTPClient} — including
 * its full debug-logging API — with the addition of a configurable connect timeout.
 *
 * <p>When a connect timeout is configured via {@link CventTimeoutHook}, this client replaces
 * the default {@code SpeakeasyHTTPClient} in the SDK configuration during
 * {@link CventTimeoutHook#sdkInit}, so that no observability is lost when the client is swapped.
 *
 * @see CventTimeoutHook
 */
public final class ConnectTimeoutHTTPClient implements HTTPClient {

    // global debug flag — mirrors SpeakeasyHTTPClient.debugEnabled
    private static boolean debugEnabled = false;

    // instance-level debug flag — overrides debugEnabled when set
    private Boolean localDebugEnabled;

    // header names stored uppercase for case-insensitive comparison
    private static Set<String> redactedHeaders = Set.of("AUTHORIZATION", "X-API-KEY");

    private static Consumer<? super String> logSink = System.out::println;

    private final HttpClient httpClient;

    /**
     * Constructs a new {@link ConnectTimeoutHTTPClient} with the given connect timeout.
     *
     * @param connectTimeout the maximum time to wait when establishing a TCP connection;
     *                       must not be {@code null}
     */
    public ConnectTimeoutHTTPClient(Duration connectTimeout) {
        this.httpClient = HttpClient.newBuilder()
                .connectTimeout(connectTimeout)
                .build();
    }

    // ---- Debug configuration ----

    /**
     * Sets debug logging on or off globally for all {@link ConnectTimeoutHTTPClient} instances.
     *
     * <p><strong>WARNING:</strong> This may expose sensitive information in logs and should only
     * be enabled temporarily for local debugging.
     *
     * @param enabled {@code true} to enable debug logging
     */
    public static void setDebugLogging(boolean enabled) {
        debugEnabled = enabled;
    }

    /**
     * Returns the global debug-logging flag.
     *
     * @return {@code true} if debug logging is globally enabled
     */
    public static boolean getDebugLoggingEnabled() {
        return debugEnabled;
    }

    @Override
    public boolean isDebugLoggingEnabled() {
        return Optional.ofNullable(localDebugEnabled).orElse(debugEnabled);
    }

    @Override
    public void enableDebugLogging(boolean enabled) {
        localDebugEnabled = enabled;
    }

    /**
     * Replaces the set of headers whose values are redacted in debug logs.
     * By default, {@code Authorization} and {@code X-API-Key} are redacted.
     *
     * @param headerNames header names to redact (case-insensitive)
     */
    public static void setRedactedHeaders(Collection<String> headerNames) {
        redactedHeaders = headerNames.stream()
                .map(name -> name.toUpperCase(Locale.ENGLISH))
                .collect(Collectors.toSet());
    }

    /**
     * Adds a single header to the redaction list.
     *
     * @param headerName header name to redact (case-insensitive)
     */
    public static void addRedactedHeader(String headerName) {
        Set<String> updated = new HashSet<>(redactedHeaders);
        updated.add(headerName.toUpperCase(Locale.ENGLISH));
        redactedHeaders = Set.copyOf(updated);
    }

    /**
     * Replaces the log sink used for debug output. Defaults to {@code System.out::println}.
     *
     * @param logger the new log sink
     */
    public static void setLogger(Consumer<? super String> logger) {
        ConnectTimeoutHTTPClient.logSink = logger;
    }

    // ---- HTTPClient implementation ----

    @Override
    public HttpResponse<InputStream> send(HttpRequest request)
            throws IOException, InterruptedException, URISyntaxException {
        if (isDebugLoggingEnabled()) {
            request = logRequest(request, true);
        }
        HttpResponse<InputStream> response =
                httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
        if (isDebugLoggingEnabled()) {
            response = logResponse(response, true);
        }
        return response;
    }

    @Override
    public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
        if (isDebugLoggingEnabled()) {
            request = logRequest(request, true);
        }
        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                .thenApply(response -> new ResponseWithBody<>(response, Blob::from));
    }

    // ---- Logging helpers (mirrors SpeakeasyHTTPClient logic) ----

    private HttpRequest logRequest(HttpRequest request, boolean logBody) {
        log("Sending request: " + request);
        log("Request headers: " + redactHeaders(request.headers()));
        if (logBody
                && request.bodyPublisher().isPresent()
                && request.headers()
                        .firstValue("Content-Type")
                        .filter(ct -> ct.equals("application/json") || ct.equals("text/plain"))
                        .isPresent()) {
            byte[] body = Helpers.bodyBytes(request);
            request = Helpers.copy(request)
                    .method(request.method(), BodyPublishers.ofByteArray(body))
                    .build();
            log("Request body:\n" + new String(body, StandardCharsets.UTF_8));
        }
        return request;
    }

    private static HttpResponse<InputStream> logResponse(
            HttpResponse<InputStream> response, boolean logBody) throws IOException {
        String contentType =
                response.headers().firstValue("Content-Type").orElse("application/octet-stream");
        log("Received response: " + response);
        log("Response headers: " + redactHeaders(response.headers()));

        // skip caching for streaming responses — they may hang
        if (contentType.startsWith("text/event-stream")
                || contentType.startsWith("application/x-ndjson")) {
            return response;
        }

        // cache response body so it can be read multiple times (e.g. for logging + processing)
        response = Utils.cache(response);

        if (logBody
                && (contentType.startsWith("application/json")
                        || contentType.startsWith("text/plain"))) {
            log("Response body:\n" + Utils.toUtf8AndClose(response.body()));
        }
        return response;
    }

    private static String redactHeaders(HttpHeaders headers) {
        return "{"
                + headers.map().entrySet().stream()
                        .map(entry -> {
                            String value = redactedHeaders.contains(
                                            entry.getKey().toUpperCase(Locale.ENGLISH))
                                    ? "[******]"
                                    : String.valueOf(entry.getValue());
                            return entry.getKey() + "=" + value;
                        })
                        .collect(Collectors.joining(", "))
                + "}";
    }

    private static void log(String message) {
        logSink.accept(message);
    }
}

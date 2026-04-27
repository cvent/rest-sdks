package com.cvent.hooks.http;

import com.cvent.SDKConfiguration;
import com.cvent.hooks.CventTimeoutHook;
import com.cvent.utils.HTTPClient;
import com.cvent.utils.Hook;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;

class CventTimeoutHookTest {

    private static final URI TEST_URI = URI.create("https://api.cvent.com/test");

    // ---- Constructor ----

    @Test
    void constructor_nullConnectTimeout_isAccepted() {
        assertDoesNotThrow(() -> new CventTimeoutHook(null, Duration.ofSeconds(30)));
    }

    @Test
    void constructor_nullCallTimeout_isAccepted() {
        assertDoesNotThrow(() -> new CventTimeoutHook(Duration.ofSeconds(10), null));
    }

    @Test
    void constructor_bothNull_isAccepted() {
        assertDoesNotThrow(() -> new CventTimeoutHook(null, null));
    }

    // ---- sdkInit: connect timeout ----

    @Test
    void sdkInit_withConnectTimeout_replacesHTTPClient() {
        SDKConfiguration config = new SDKConfiguration();
        HTTPClient originalClient = config.client();

        CventTimeoutHook hook = new CventTimeoutHook(Duration.ofSeconds(10), null);

        SDKConfiguration result = hook.sdkInit(config);

        assertNotNull(result);
        assertNotSame(originalClient, result.client(),
                "sdkInit should replace the HTTPClient when a connect timeout is configured");
    }

    @Test
    void sdkInit_withoutConnectTimeout_keepsOriginalHTTPClient() {
        SDKConfiguration config = new SDKConfiguration();
        HTTPClient originalClient = config.client();

        CventTimeoutHook hook = new CventTimeoutHook(null, Duration.ofSeconds(30));

        SDKConfiguration result = hook.sdkInit(config);

        assertNotNull(result);
        assertSame(originalClient, result.client(),
                "sdkInit should not replace the HTTPClient when no connect timeout is configured");
    }

    @Test
    void sdkInit_returnsTheSameConfigInstance() {
        SDKConfiguration config = new SDKConfiguration();
        CventTimeoutHook hook = new CventTimeoutHook(Duration.ofSeconds(5), null);

        SDKConfiguration result = hook.sdkInit(config);

        assertSame(config, result, "sdkInit should return the same SDKConfiguration instance");
    }

    @Test
    void sdkInit_withConnectTimeoutButCustomClient_doesNotReplaceCustomClient() {
        SDKConfiguration config = new SDKConfiguration();
        HTTPClient customClient = new HTTPClient() {
            @Override
            public HttpResponse<InputStream> send(HttpRequest request)
                    throws IOException, URISyntaxException, InterruptedException {
                throw new UnsupportedOperationException("stub");
            }

            @Override
            public CompletableFuture<HttpResponse<com.cvent.utils.Blob>> sendAsync(HttpRequest request) {
                throw new UnsupportedOperationException("stub");
            }
        };
        config.setClient(customClient);

        CventTimeoutHook hook = new CventTimeoutHook(Duration.ofSeconds(10), null);

        SDKConfiguration result = hook.sdkInit(config);

        assertSame(customClient, result.client(),
                "sdkInit should not replace an application-provided custom HTTPClient");
    }

    // ---- beforeRequest: call timeout ----

    @Test
    void beforeRequest_withCallTimeout_stampsTimeoutOnRequest() throws Exception {
        Duration callTimeout = Duration.ofSeconds(45);
        CventTimeoutHook hook = new CventTimeoutHook(null, Duration.ofSeconds(45));

        HttpRequest original = HttpRequest.newBuilder(TEST_URI).build();
        HttpRequest result = hook.beforeRequest(mockContext(), original);

        assertEquals(Optional.of(callTimeout), result.timeout(),
                "beforeRequest should stamp the configured call timeout on the request");
    }

    @Test
    void beforeRequest_withoutCallTimeout_leavesRequestUnchanged() throws Exception {
        CventTimeoutHook hook = new CventTimeoutHook(Duration.ofSeconds(10), null);

        HttpRequest original = HttpRequest.newBuilder(TEST_URI).build();
        HttpRequest result = hook.beforeRequest(mockContext(), original);

        assertSame(original, result,
                "beforeRequest should return the original request when no call timeout is configured");
    }

    @Test
    void beforeRequest_withCallTimeout_honorsPreviousTimeout() throws Exception {
        CventTimeoutHook hook = new CventTimeoutHook(null, Duration.ofSeconds(20));

        HttpRequest original = HttpRequest.newBuilder(TEST_URI)
                .timeout(Duration.ofSeconds(99))
                .build();

        HttpRequest result = hook.beforeRequest(mockContext(), original);

        assertSame(original, result,
                "beforeRequest should not modify a request that already has a timeout set");
        assertEquals(Optional.of(Duration.ofSeconds(99)), result.timeout(),
                "the caller-set timeout must be preserved");
    }

    // ---- Both timeouts configured ----

    @Test
    void bothTimeouts_sdkInitReplacesClientAndBeforeRequestStampsTimeout() throws Exception {
        SDKConfiguration config = new SDKConfiguration();
        HTTPClient originalClient = config.client();

        CventTimeoutHook hook = new CventTimeoutHook(Duration.ofSeconds(10), Duration.ofSeconds(60));

        hook.sdkInit(config);
        assertNotSame(originalClient, config.client());

        HttpRequest original = HttpRequest.newBuilder(TEST_URI).build();
        HttpRequest result = hook.beforeRequest(mockContext(), original);
        assertEquals(Optional.of(Duration.ofSeconds(60)), result.timeout());
    }

    // ---- Helpers ----

    private static Hook.BeforeRequestContext mockContext() {
        return null; // context is not used by CventTimeoutHook.beforeRequest
    }
}

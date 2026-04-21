package com.cvent.hooks;

import com.cvent.SDKConfiguration;
import com.cvent.hooks.http.ConnectTimeoutHTTPClient;
import com.cvent.utils.Helpers;
import com.cvent.utils.HTTPClient;
import com.cvent.utils.Hook;
import com.cvent.utils.SpeakeasyHTTPClient;

import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Objects;

/**
 * A hook that configures connection and call timeouts for all SDK HTTP requests.
 *
 * <p>Java's {@link java.net.http.HttpClient} exposes two levels of timeout:
 * <ul>
 *   <li><b>Connect timeout</b> ({@link HttpClient}-level): the maximum time to wait when
 *       establishing a TCP connection to the remote host. Set via
 *       {@link Builder#connectTimeout(Duration)} and applied during the
 *       {@link Hook.SdkInit} phase by replacing the SDK's {@link HTTPClient} with one
 *       backed by a newly built {@link HttpClient}.</li>
 *   <li><b>Call timeout</b> ({@link HttpRequest}-level): the maximum time allowed for the
 *       entire request/response cycle — connecting, sending the request, receiving response
 *       headers, and receiving the response body. Set via {@link Builder#callTimeout(Duration)}
 *       and stamped onto every outgoing request in the {@link Hook.BeforeRequest} phase.</li>
 * </ul>
 *
 * <p><b>Note on read timeout:</b> Java's built-in HTTP client does not expose a dedicated
 * <em>read timeout</em> (i.e., maximum time to wait between individual data chunks). The
 * call timeout is the closest equivalent and bounds the total response-receipt time. If
 * per-chunk read-timeout semantics are required, you would need to wrap the response body
 * stream with a custom {@link java.io.InputStream} that enforces a read deadline.
 *
 * <h3>Registration in {@code SDKHooks}</h3>
 * <pre>{@code
 * CventTimeoutHook timeoutHook = CventTimeoutHook.builder()
 *     .connectTimeout(Duration.ofSeconds(10))
 *     .callTimeout(Duration.ofSeconds(60))
 *     .build();
 *
 * hooks.registerSdkInit(timeoutHook);       // applies connect timeout at SDK init
 * hooks.registerBeforeRequest(timeoutHook); // applies call timeout per request
 * }</pre>
 *
 * <p>For the async hook registry, register the same instance as an async before-request hook
 * using {@link com.cvent.utils.HookAdapters#toAsync(Hook.BeforeRequest)}:
 * <pre>{@code
 * asyncHooks.registerBeforeRequest(HookAdapters.toAsync(timeoutHook));
 * }</pre>
 *
 * @see Hook.SdkInit
 * @see Hook.BeforeRequest
 */
public final class CventTimeoutHook implements Hook.SdkInit, Hook.BeforeRequest {

    private final Duration connectTimeout;
    private final Duration callTimeout;

    private CventTimeoutHook(Builder builder) {
        this.connectTimeout = builder.connectTimeout;
        this.callTimeout = builder.callTimeout;
    }

    /**
     * Returns a new {@link Builder} for {@link CventTimeoutHook}.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * If a connect timeout is configured <em>and</em> the application has not already supplied a
     * custom {@link HTTPClient}, replaces the SDK's default {@link SpeakeasyHTTPClient} with one
     * backed by an {@link java.net.http.HttpClient} built with
     * {@link java.net.http.HttpClient.Builder#connectTimeout(Duration)}.
     *
     * <p>If the application has provided its own {@link HTTPClient} via
     * {@link com.cvent.CventSDK.Builder#client(HTTPClient)}, that client is left untouched so
     * that application-level configuration (custom connect timeout, SSL context, executor, etc.)
     * is preserved. In that case, the application is responsible for configuring its own connect
     * timeout.
     *
     * <p><b>Caveat:</b> If the application explicitly passes a {@link SpeakeasyHTTPClient}
     * instance (e.g., one with debug logging or custom redacted headers configured) to
     * {@link com.cvent.CventSDK.Builder#client(HTTPClient)}, the hook will still replace it
     * because the {@code instanceof SpeakeasyHTTPClient} check cannot distinguish a
     * caller-configured instance from the SDK default. In that case, the application's
     * {@link SpeakeasyHTTPClient} settings will be lost. To avoid this, use
     * {@link ConnectTimeoutHTTPClient} directly or wrap a custom {@link java.net.http.HttpClient}
     * in a fully custom {@link HTTPClient} implementation.
     *
     * <p>This runs once at SDK initialization. The replaced client is used for both synchronous
     * and asynchronous requests because both paths share the same {@link SDKConfiguration}.
     *
     * @param config the current SDK configuration
     * @return the (possibly modified) SDK configuration
     */
    @Override
    public SDKConfiguration sdkInit(SDKConfiguration config) {
        if (connectTimeout != null && config.client() instanceof SpeakeasyHTTPClient) {
            config.setClient(new ConnectTimeoutHTTPClient(connectTimeout));
        }
        return config;
    }

    /**
     * If a call timeout is configured, stamps it onto the outgoing {@link HttpRequest}.
     *
     * <p>The call timeout bounds the entire request/response cycle. If the SDK client's
     * {@link HTTPClient#send} or {@link HTTPClient#sendAsync} does not complete within this
     * duration, a {@link java.net.http.HttpTimeoutException} is thrown.
     *
     * @param context context for the hook call
     * @param request the outgoing HTTP request
     * @return the request with the call timeout applied, or the original request unchanged if no
     *         call timeout was configured
     * @throws Exception on error
     */
    @Override
    public HttpRequest beforeRequest(Hook.BeforeRequestContext context, HttpRequest request) throws Exception {
        if (callTimeout != null && request.timeout().isEmpty()) {
            return Helpers.copy(request).timeout(callTimeout).build();
        }
        return request;
    }

    /**
     * Builder for {@link CventTimeoutHook}.
     */
    public static final class Builder {

        private Duration connectTimeout;
        private Duration callTimeout;

        private Builder() {}

        /**
         * Sets the connect timeout: the maximum time to wait when establishing a TCP connection
         * to the remote host. Equivalent to Retrofit's {@code connectTimeout}.
         *
         * <p>Applied once at SDK initialization via the {@link Hook.SdkInit} phase.
         *
         * @param connectTimeout a positive, non-null duration
         * @return this builder
         * @throws NullPointerException if {@code connectTimeout} is {@code null}
         */
        public Builder connectTimeout(Duration connectTimeout) {
            this.connectTimeout = Objects.requireNonNull(connectTimeout, "connectTimeout must not be null");
            return this;
        }

        /**
         * Sets the call timeout: the maximum time allowed for the entire request/response cycle.
         * This covers connecting, sending the request, receiving response headers, and receiving
         * the response body. Equivalent to Retrofit's {@code callTimeout}.
         *
         * <p>Applied per-request via the {@link Hook.BeforeRequest} phase.
         *
         * <p><b>Note:</b> Java's HTTP client does not support a dedicated <em>read timeout</em>
         * separate from the overall call timeout.
         *
         * @param callTimeout a positive, non-null duration
         * @return this builder
         * @throws NullPointerException if {@code callTimeout} is {@code null}
         */
        public Builder callTimeout(Duration callTimeout) {
            this.callTimeout = Objects.requireNonNull(callTimeout, "callTimeout must not be null");
            return this;
        }

        /**
         * Builds the {@link CventTimeoutHook}.
         *
         * @return a new {@link CventTimeoutHook}
         */
        public CventTimeoutHook build() {
            return new CventTimeoutHook(this);
        }
    }
}

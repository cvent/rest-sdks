package com.cvent.hooks.config;

import com.cvent.hooks.SDKHooks;
import jakarta.annotation.Nullable;

import java.time.Duration;

/**
 * Configuration for the connect and call timeouts applied to all SDK HTTP requests.
 *
 * <p>Pass {@code null} for either value to keep the existing global timeout unchanged.
 *
 * @see HooksConfiguration
 * @see SDKHooks#configure(HooksConfiguration)
 */
public final class TimeoutHookConfiguration {

    /**
     * Maximum time to wait when establishing a TCP connection.
     * {@code null} means keep the existing value.
     */
    private final Duration connectTimeout;

    /**
     * Maximum time allowed for the entire request/response cycle.
     * {@code null} means keep the existing value.
     */
    private final Duration callTimeout;

    /**
     * Creates a new {@link TimeoutHookConfiguration}.
     *
     * @param connectTimeout maximum time to wait when establishing a TCP connection;
     *                       {@code null} keeps the existing value
     * @param callTimeout    maximum time allowed for the entire request/response cycle;
     *                       {@code null} keeps the existing value
     */
    public TimeoutHookConfiguration(@Nullable Duration connectTimeout, @Nullable Duration callTimeout) {
        this.connectTimeout = connectTimeout;
        this.callTimeout = callTimeout;
    }

    /**
     * @return the connect timeout to apply, or {@code null} to keep the existing value
     */
    public Duration getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * @return the call timeout to apply, or {@code null} to keep the existing value
     */
    public Duration getCallTimeout() {
        return callTimeout;
    }
}

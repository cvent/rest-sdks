package com.cvent.hooks.config;

import com.cvent.hooks.SDKHooks;
import jakarta.annotation.Nullable;

/**
 * Top-level configuration object for all SDK hooks.
 *
 * <p>Pass an instance to {@link SDKHooks#configure(HooksConfiguration)} before constructing any
 * {@link com.cvent.CventSDK} instance. Hook configuration entries set to {@code null} keep their
 * existing defaults.
 *
 * @see SDKHooks#configure(HooksConfiguration)
 * @see TimeoutHookConfiguration
 */
public final class HooksConfiguration {

    /**
     * Configuration for the connect and call timeouts.
     * {@code null} means no timeout changes are requested.
     */
    private final TimeoutHookConfiguration timeoutHook;

    /**
     * Creates a new {@link HooksConfiguration} with no changes to any hook settings.
     */
    public HooksConfiguration() {
        this(null);
    }

    /**
     * Creates a new {@link HooksConfiguration}.
     *
     * @param timeoutHook timeout hook configuration; {@code null} leaves timeout settings unchanged
     */
    public HooksConfiguration(@Nullable TimeoutHookConfiguration timeoutHook) {
        this.timeoutHook = timeoutHook;
    }

    /**
     * @return the timeout hook configuration, or {@code null} if no timeout changes are requested
     */
    public TimeoutHookConfiguration getTimeoutHook() {
        return timeoutHook;
    }
}

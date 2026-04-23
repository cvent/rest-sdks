package com.cvent.hooks;

import com.cvent.hooks.config.HooksConfiguration;
import com.cvent.hooks.config.TimeoutHookConfiguration;

import java.time.Duration;

//
// This file is written once by speakeasy code generation and
// thereafter will not be overwritten by speakeasy updates. As a
// consequence any customization of this class will be preserved.
//

public final class SDKHooks {

    /**
     * Maximum time to wait when establishing a TCP connection. If the connection cannot be established within this
     * time, the request will fail with a timeout error.
     */
    private static volatile Duration connectTimeout = Duration.ofSeconds(10);

    /**
     * Maximum time allowed for the entire request/response cycle. If the request/response cycle cannot complete within
     * this time, the request will fail with a timeout error.
     */
    private static volatile Duration callTimeout = Duration.ofSeconds(30);

    private SDKHooks() {
        // prevent instantiation
    }

    /**
     * Overrides the default hook settings applied to all SDK instances.
     *
     * <p>Must be called <em>before</em> constructing any {@link com.cvent.CventSDK} instance,
     * since settings are stamped into the SDK at initialization time.
     *
     * <p>Hook configuration entries left unset keep their existing values.
     *
     * <p>Default values:
     * <ul>
     *   <li><b>Connect timeout:</b> 10 seconds — time to establish a TCP connection</li>
     *   <li><b>Call timeout:</b> 30 seconds — time for the entire request/response cycle</li>
     * </ul>
     *
     * <p>For services with long-running operations (bulk imports, report generation, etc.),
     * increase the call timeout accordingly:
     * <pre>{@code
     * SDKHooks.configure(new HooksConfiguration(
     *     new TimeoutHookConfiguration(null, Duration.ofMinutes(5))
     * ));
     * CventSDK sdk = CventSDK.builder()...build();
     * }</pre>
     *
     * @param configuration the hook configuration to apply; must not be {@code null}
     */
    public static void configure(HooksConfiguration configuration) {
        if (configuration == null) {
            throw new IllegalArgumentException("configuration must not be null");
        }
        TimeoutHookConfiguration timeoutConfig = configuration.getTimeoutHook();
        if (timeoutConfig != null) {
            Duration newConnectTimeout = timeoutConfig.getConnectTimeout();
            Duration newCallTimeout = timeoutConfig.getCallTimeout();
            if (newConnectTimeout != null) {
                validatePositiveDuration("connectTimeout", newConnectTimeout);
                SDKHooks.connectTimeout = newConnectTimeout;
            }
            if (newCallTimeout != null) {
                validatePositiveDuration("callTimeout", newCallTimeout);
                SDKHooks.callTimeout = newCallTimeout;
            }
        }
    }

    public static void initialize(com.cvent.utils.Hooks hooks) {
        CventTimeoutHook timeoutHook = new CventTimeoutHook(connectTimeout, callTimeout);

        // register synchronous hooks here
        hooks.registerSdkInit(timeoutHook);
        hooks.registerBeforeRequest(new CventUserAgentHook());
        hooks.registerBeforeRequest(timeoutHook);
        hooks.registerAfterError(new CventRateLimitHook());

        // for more information see
        // https://www.speakeasy.com/docs/additional-features/sdk-hooks
    }

    public static void initialize(com.cvent.utils.AsyncHooks asyncHooks) {
        // connectTimeout is already applied via sdkInit in the synchronous Hooks above,
        // since both sync and async paths share the same SDKConfiguration and HTTPClient.
        CventTimeoutHook asyncTimeoutHook = new CventTimeoutHook(null, callTimeout);

        // Adapt synchronous hooks for async usage
        asyncHooks.registerBeforeRequest(com.cvent.utils.HookAdapters.toAsync(new CventUserAgentHook()));
        asyncHooks.registerBeforeRequest(com.cvent.utils.HookAdapters.toAsync(asyncTimeoutHook));
        asyncHooks.registerAfterError(com.cvent.utils.HookAdapters.toAsync(new CventRateLimitHook()));

        // for more information see
        // https://www.speakeasy.com/docs/additional-features/sdk-hooks
    }

    /**
     * Validates that the provided Duration is positive (greater than zero).
     * @param name the name of the duration parameter (for error messages)
     * @param duration the duration to validate
     */
    private static void validatePositiveDuration(String name, Duration duration) {
        if (duration.isZero() || duration.isNegative()) {
            throw new IllegalArgumentException(name + " must be a positive Duration");
        }
    }

}

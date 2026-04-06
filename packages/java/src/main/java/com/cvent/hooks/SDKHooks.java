package com.cvent.hooks;

//
// This file is written once by speakeasy code generation and
// thereafter will not be overwritten by speakeasy updates. As a
// consequence any customization of this class will be preserved.
//

public final class SDKHooks {

    private SDKHooks() {
        // prevent instantiation
    }

    public static void initialize(com.cvent.utils.Hooks hooks) {
        // register synchronous hooks here
        hooks.registerBeforeRequest(new CventUserAgentHook());
        hooks.registerAfterError(new CventRateLimitHook());

        // for more information see
        // https://www.speakeasy.com/docs/additional-features/sdk-hooks
    }

    public static void initialize(com.cvent.utils.AsyncHooks asyncHooks) {
        // Adapt synchronous hooks for async usage
        asyncHooks.registerBeforeRequest(com.cvent.utils.HookAdapters.toAsync(new CventUserAgentHook()));
        asyncHooks.registerAfterError(com.cvent.utils.HookAdapters.toAsync(new CventRateLimitHook()));

        // for more information see
        // https://www.speakeasy.com/docs/additional-features/sdk-hooks
    }

}

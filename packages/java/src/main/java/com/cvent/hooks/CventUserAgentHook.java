
package com.cvent.hooks;

import java.net.http.HttpRequest;
import com.cvent.SDKConfiguration;
import com.cvent.utils.Helpers;
import com.cvent.utils.Hook.BeforeRequest;
import com.cvent.utils.Hook.BeforeRequestContext;

/**
 * A hook to set a custom User-Agent header for all requests made by the SDK.
 * The User-Agent header is set to "cvent/1.0 Cvent-SDK/{SDK Version} (java {OpenAPI Version})".
 * This hook overwrites any existing User-Agent header set on the request.
 */
public class CventUserAgentHook implements BeforeRequest {

    /**
     * Prefix for the User-Agent header to specify requests originate from the Cvent SDK.
     */
    private static final String SDK_IDENTIFIER = "Cvent-SDK";
    /**
     * Language identifier for the SDK.
     */
    private static final String SDK_LANGUAGE = "java";

    private final String userAgent;

    public CventUserAgentHook() {
        // Setting in constructor to ensure SDKConfiguration static values are initialized
        this.userAgent =
            // format is "cvent/1.0 Cvent-SDK/{SDK Version} (java {OpenAPI Version})"
            String.format("cvent/1.0 %s/%s (%s %s)",
                SDK_IDENTIFIER, SDKConfiguration.SDK_VERSION, SDK_LANGUAGE, SDKConfiguration.OPENAPI_DOC_VERSION);
    }

    @Override
    public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) throws Exception {

        return Helpers.copy(request) //
                // overwrites any previous value
                .setHeader("User-Agent", userAgent)
                .build();
    }
}
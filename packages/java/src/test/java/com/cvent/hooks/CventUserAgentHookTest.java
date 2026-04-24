package com.cvent.hooks;

import com.cvent.SDKConfiguration;
import com.cvent.utils.Hook;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Optional;

public class CventUserAgentHookTest {
    private final CventUserAgentHook hook = new CventUserAgentHook();

    @Mock
    private Hook.BeforeRequestContext beforeRequestContext;

    @Test
    void beforeRequest_overridesUserAgentWithCorrectValue() throws Exception {
        HttpRequest requestResult = hook.beforeRequest(beforeRequestContext,
                HttpRequest.newBuilder().uri(new URI("https://test.com")).setHeader("User-Agent", "incorrect").build());
        // User agent value at time of writing this test "cvent/1.0 Cvent-SDK/0.0.1 (java ea)"
        assertEquals(requestResult.headers().firstValue("User-Agent"),
                Optional.of(String.format("cvent/1.0 Cvent-SDK/%s (java %s)", SDKConfiguration.SDK_VERSION,
                        SDKConfiguration.OPENAPI_DOC_VERSION)));
    }
}

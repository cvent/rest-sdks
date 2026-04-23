package com.cvent.hooks;

import com.cvent.SDKConfiguration;
import com.cvent.SecuritySource;
import com.cvent.hooks.http.ConnectTimeoutHTTPClient;
import com.cvent.utils.Hook;
import com.cvent.utils.Hook.BeforeRequestContextImpl;
import com.cvent.utils.Hooks;
import com.cvent.hooks.config.HooksConfiguration;
import com.cvent.hooks.config.TimeoutHookConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SDKHooksTest {

    private static final URI TEST_URI = URI.create("https://api.cvent.com/test");

    @BeforeEach
    @AfterEach
    void resetToDefaults() {
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(Duration.ofSeconds(10), Duration.ofSeconds(30))));
    }

    // ---- Call timeout ----

    @Test
    void initialize_defaultCallTimeout_is30Seconds() throws Exception {
        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        HttpRequest result = hooks.beforeRequest(makeContext(), requestWithoutTimeout());

        assertEquals(Optional.of(Duration.ofSeconds(30)), result.timeout());
    }

    @Test
    void configure_customCallTimeout_appliedToRequests() throws Exception {
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(null, Duration.ofSeconds(120))));

        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        HttpRequest result = hooks.beforeRequest(makeContext(), requestWithoutTimeout());

        assertEquals(Optional.of(Duration.ofSeconds(120)), result.timeout());
    }

    @Test
    void configure_nullCallTimeout_keepsExistingValue() throws Exception {
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(null, Duration.ofSeconds(90))));
        SDKHooks.configure(new HooksConfiguration(null));

        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        HttpRequest result = hooks.beforeRequest(makeContext(), requestWithoutTimeout());

        assertEquals(Optional.of(Duration.ofSeconds(90)), result.timeout());
    }

    @Test
    void configure_calledMultipleTimes_lastCallWins() throws Exception {
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(null, Duration.ofSeconds(60))));
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(null, Duration.ofSeconds(180))));

        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        HttpRequest result = hooks.beforeRequest(makeContext(), requestWithoutTimeout());

        assertEquals(Optional.of(Duration.ofSeconds(180)), result.timeout());
    }

    @Test
    void configure_callTimeout_doesNotOverrideRequestWithExistingTimeout() throws Exception {
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(null, Duration.ofSeconds(120))));

        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        HttpRequest original = HttpRequest.newBuilder(TEST_URI)
                .timeout(Duration.ofSeconds(999))
                .build();

        HttpRequest result = hooks.beforeRequest(makeContext(), original);

        assertEquals(Optional.of(Duration.ofSeconds(999)), result.timeout(),
                "a caller-set timeout on the request must not be overwritten by the default");
    }

    // ---- Connect timeout ----

    @Test
    void initialize_defaultConnectTimeout_replacesDefaultClient() {
        SDKConfiguration config = new SDKConfiguration();
        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        SDKConfiguration result = hooks.sdkInit(config);

        assertTrue(result.client() instanceof ConnectTimeoutHTTPClient,
                "sdkInit should replace the default SpeakeasyHTTPClient with ConnectTimeoutHTTPClient");
    }

    @Test
    void configure_customConnectTimeout_replacesDefaultClient() {
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(Duration.ofSeconds(5), null)));

        SDKConfiguration config = new SDKConfiguration();
        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        SDKConfiguration result = hooks.sdkInit(config);

        assertTrue(result.client() instanceof ConnectTimeoutHTTPClient);
    }

    @Test
    void configure_nullConnectTimeout_keepsExistingValue() {
        SDKHooks.configure(new HooksConfiguration(
                new TimeoutHookConfiguration(Duration.ofSeconds(7), null)));
        SDKHooks.configure(new HooksConfiguration(null));

        SDKConfiguration config = new SDKConfiguration();
        Hooks hooks = new Hooks();
        SDKHooks.initialize(hooks);

        SDKConfiguration result = hooks.sdkInit(config);

        assertTrue(result.client() instanceof ConnectTimeoutHTTPClient,
                "connect timeout should still be set after a configure(null, null) call");
    }

    // ---- Helpers ----

    private static HttpRequest requestWithoutTimeout() {
        return HttpRequest.newBuilder(TEST_URI).build();
    }

    private static Hook.BeforeRequestContext makeContext() {
        return new BeforeRequestContextImpl(
                new SDKConfiguration(),
                "https://api.cvent.com",
                "testOperation",
                Optional.<List<String>>empty(),
                Optional.<SecuritySource>empty());
    }
}

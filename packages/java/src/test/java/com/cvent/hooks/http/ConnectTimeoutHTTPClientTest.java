package com.cvent.hooks.http;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockserver.client.MockServerClient;
import org.mockserver.junit.jupiter.MockServerExtension;

import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

@ExtendWith(MockServerExtension.class)
class ConnectTimeoutHTTPClientTest {

    @BeforeEach
    void setUp(MockServerClient mockClient) {
        mockClient.reset();
        resetStaticState();
    }

    @AfterEach
    void tearDown() {
        resetStaticState();
    }

    // ---- Constructor ----

    @Test
    void constructor_withConnectTimeout_buildsSuccessfully() {
        assertDoesNotThrow(() -> new ConnectTimeoutHTTPClient(Duration.ofSeconds(10)));
    }

    // ---- Global debug flag ----

    @Test
    void getDebugLoggingEnabled_defaultsToFalse() {
        assertFalse(ConnectTimeoutHTTPClient.getDebugLoggingEnabled());
    }

    @Test
    void setDebugLogging_true_enablesGlobalDebugLogging() {
        ConnectTimeoutHTTPClient.setDebugLogging(true);
        assertTrue(ConnectTimeoutHTTPClient.getDebugLoggingEnabled());
    }

    @Test
    void setDebugLogging_false_disablesGlobalDebugLogging() {
        ConnectTimeoutHTTPClient.setDebugLogging(true);
        ConnectTimeoutHTTPClient.setDebugLogging(false);
        assertFalse(ConnectTimeoutHTTPClient.getDebugLoggingEnabled());
    }

    // ---- Instance debug flag ----

    @Test
    void isDebugLoggingEnabled_withNoInstanceOverride_followsGlobalFlag() {
        ConnectTimeoutHTTPClient client = new ConnectTimeoutHTTPClient(Duration.ofSeconds(10));

        ConnectTimeoutHTTPClient.setDebugLogging(true);
        assertTrue(client.isDebugLoggingEnabled());

        ConnectTimeoutHTTPClient.setDebugLogging(false);
        assertFalse(client.isDebugLoggingEnabled());
    }

    @Test
    void enableDebugLogging_true_overridesGlobalFalse() {
        ConnectTimeoutHTTPClient client = new ConnectTimeoutHTTPClient(Duration.ofSeconds(10));
        ConnectTimeoutHTTPClient.setDebugLogging(false);
        client.enableDebugLogging(true);

        assertTrue(client.isDebugLoggingEnabled(),
                "instance flag of true should override global flag of false");
    }

    @Test
    void enableDebugLogging_false_overridesGlobalTrue() {
        ConnectTimeoutHTTPClient client = new ConnectTimeoutHTTPClient(Duration.ofSeconds(10));
        ConnectTimeoutHTTPClient.setDebugLogging(true);
        client.enableDebugLogging(false);

        assertFalse(client.isDebugLoggingEnabled(),
                "instance flag of false should override global flag of true");
    }

    // ---- setLogger ----

    @Test
    void setLogger_replacesLogSink_logMessagesAreCaptured(MockServerClient mockClient) throws Exception {
        List<String> captured = new ArrayList<>();
        ConnectTimeoutHTTPClient.setLogger(captured::add);
        ConnectTimeoutHTTPClient.setDebugLogging(true);

        mockClient.when(request()).respond(response().withStatusCode(200));

        ConnectTimeoutHTTPClient client = new ConnectTimeoutHTTPClient(Duration.ofSeconds(10));
        client.send(HttpRequest.newBuilder(serverUri(mockClient, "/")).build());

        assertThat(captured).isNotEmpty();
        assertThat(captured.get(0)).contains("Sending request");
    }

    // ---- setRedactedHeaders ----

    @Test
    void setRedactedHeaders_replacesEntireSet_onlyNewHeadersAreRedacted(MockServerClient mockClient) throws Exception {
        // Replace the default set with only X-Custom-Secret
        ConnectTimeoutHTTPClient.setRedactedHeaders(List.of("X-Custom-Secret"));

        List<String> captured = captureLogOutput(mockClient, builder -> builder
                .header("Authorization", "open-value")
                .header("X-Custom-Secret", "hidden-value"));

        String logOutput = String.join("\n", captured);
        // X-Custom-Secret is in the new set — value must be redacted
        assertThat(logOutput).doesNotContain("hidden-value");
        assertThat(logOutput).contains("[******]");
        // Authorization is NOT in the new set — value must appear in plain text
        assertThat(logOutput).contains("open-value");
    }

    @Test
    void setRedactedHeaders_normalizesToUpperCase_headerIsRedacted(MockServerClient mockClient) throws Exception {
        // Provide header names in lowercase — they should still match when redacting
        ConnectTimeoutHTTPClient.setRedactedHeaders(List.of("x-custom-secret"));

        List<String> captured = captureLogOutput(mockClient, builder -> builder
                .header("X-Custom-Secret", "hidden-value"));

        assertThat(String.join("\n", captured)).doesNotContain("hidden-value");
    }

    // ---- addRedactedHeader ----

    @Test
    void addRedactedHeader_addsNewHeader_bothDefaultsAndNewHeaderAreRedacted(MockServerClient mockClient) throws Exception {
        ConnectTimeoutHTTPClient.addRedactedHeader("X-Custom-Secret");

        List<String> captured = captureLogOutput(mockClient, builder -> builder
                .header("X-Custom-Secret", "hidden-new")
                .header("Authorization", "hidden-default"));

        String logOutput = String.join("\n", captured);
        assertThat(logOutput).doesNotContain("hidden-new");
        assertThat(logOutput).doesNotContain("hidden-default");
    }

    @Test
    void addRedactedHeader_caseInsensitive_headerIsRedacted(MockServerClient mockClient) throws Exception {
        // Add in all-lowercase — should still match mixed-case header in the request
        ConnectTimeoutHTTPClient.addRedactedHeader("x-api-token");

        List<String> captured = captureLogOutput(mockClient, builder -> builder
                .header("X-Api-Token", "secret-value"));

        assertThat(String.join("\n", captured)).doesNotContain("secret-value");
    }

    @Test
    void addRedactedHeader_idempotent_repeatedCallsDoNotAffectOtherHeaders(MockServerClient mockClient) throws Exception {
        // Adding the same header multiple times should not corrupt the set or evict existing headers
        ConnectTimeoutHTTPClient.addRedactedHeader("Authorization");
        ConnectTimeoutHTTPClient.addRedactedHeader("Authorization");
        ConnectTimeoutHTTPClient.addRedactedHeader("AUTHORIZATION");

        List<String> captured = captureLogOutput(mockClient, builder -> builder
                .header("Authorization", "hidden-auth")
                .header("X-Api-Key", "hidden-key"));

        String logOutput = String.join("\n", captured);
        assertThat(logOutput).doesNotContain("hidden-auth");
        assertThat(logOutput).doesNotContain("hidden-key");
    }

    @Test
    void addRedactedHeader_existingDefaultHeaderStillRedactedAfterAddingNew(MockServerClient mockClient) throws Exception {
        ConnectTimeoutHTTPClient.addRedactedHeader("X-New-Secret");

        List<String> captured = captureLogOutput(mockClient, builder -> builder
                .header("Authorization", "auth-hidden")
                .header("X-Api-Key", "key-hidden")
                .header("X-New-Secret", "new-hidden")
                .header("X-Unredacted", "plaintext"));

        String logOutput = String.join("\n", captured);
        assertThat(logOutput).doesNotContain("auth-hidden");
        assertThat(logOutput).doesNotContain("key-hidden");
        assertThat(logOutput).doesNotContain("new-hidden");
        assertThat(logOutput).contains("plaintext");
    }

    // ---- Helpers ----

    @FunctionalInterface
    private interface RequestCustomizer {
        HttpRequest.Builder customize(HttpRequest.Builder builder);
    }

    private List<String> captureLogOutput(MockServerClient mockClient, RequestCustomizer customizer)
            throws Exception {
        List<String> captured = new ArrayList<>();
        ConnectTimeoutHTTPClient.setLogger(captured::add);
        ConnectTimeoutHTTPClient.setDebugLogging(true);

        mockClient.when(request()).respond(response().withStatusCode(200));

        ConnectTimeoutHTTPClient client = new ConnectTimeoutHTTPClient(Duration.ofSeconds(10));
        HttpRequest request = customizer.customize(
                HttpRequest.newBuilder(serverUri(mockClient, "/"))).build();
        client.send(request);

        return captured;
    }

    private static URI serverUri(MockServerClient mockClient, String path) {
        return URI.create("http://localhost:" + mockClient.getPort() + path);
    }

    private static void resetStaticState() {
        ConnectTimeoutHTTPClient.setDebugLogging(false);
        ConnectTimeoutHTTPClient.setRedactedHeaders(List.of("Authorization", "X-Api-Key"));
        ConnectTimeoutHTTPClient.setLogger(System.out::println);
    }
}

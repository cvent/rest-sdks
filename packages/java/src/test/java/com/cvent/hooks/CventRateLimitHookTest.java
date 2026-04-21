package com.cvent.hooks;

import com.cvent.hooks.exceptions.QuotaExceededException;
import com.cvent.hooks.exceptions.ThrottlingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Optional;
import javax.net.ssl.SSLSession;

import static org.junit.jupiter.api.Assertions.*;

class CventRateLimitHookTest {

    private CventRateLimitHook hook;

    @BeforeEach
    void setUp() {
        hook = new CventRateLimitHook();
    }

    // ---- Throttling (Too Many Requests) ----

    @Test
    void throttlingResponse_throwsThrottlingException() {
        String body = "{\"code\": 429, \"message\": \"Too Many Requests\"}";
        HttpResponse<InputStream> response = createResponse(429, body);

        ThrottlingException thrown = assertThrows(ThrottlingException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));

        assertEquals(429, thrown.statusCode());
        assertTrue(thrown.responseBody().contains("Too Many Requests"));
        assertSame(response, thrown.rawResponse());
    }

    // ---- Quota exceeded (Limit Exceeded) ----

    @Test
    void quotaExceededResponse_throwsQuotaExceededException() {
        String body = "{\"code\": 429, \"message\": \"Limit Exceeded\"}";
        HttpResponse<InputStream> response = createResponse(429, body);

        QuotaExceededException thrown = assertThrows(QuotaExceededException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));

        assertEquals(429, thrown.statusCode());
        assertTrue(thrown.responseBody().contains("Limit Exceeded"));
        assertSame(response, thrown.rawResponse());
    }

    @Test
    void quotaExceededResponse_caseInsensitive() {
        String body = "{\"code\": 429, \"message\": \"limit exceeded\"}";
        HttpResponse<InputStream> response = createResponse(429, body);

        assertThrows(QuotaExceededException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));
    }

    // ---- Unrecognized 429 messages default to throttling ----

    @Test
    void unrecognizedMessage_defaultsToThrottling() {
        String body = "{\"code\": 429, \"message\": \"Some Unknown Rate Limit Message\"}";
        HttpResponse<InputStream> response = createResponse(429, body);

        assertThrows(ThrottlingException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));
    }

    @Test
    void missingMessageField_defaultsToThrottling() {
        String body = "{\"code\": 429}";
        HttpResponse<InputStream> response = createResponse(429, body);

        assertThrows(ThrottlingException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));
    }

    @Test
    void malformedJson_defaultsToThrottling() {
        String body = "not valid json";
        HttpResponse<InputStream> response = createResponse(429, body);

        assertThrows(ThrottlingException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));
    }

    @Test
    void emptyBody_defaultsToThrottling() {
        HttpResponse<InputStream> response = createResponse(429, "");

        assertThrows(ThrottlingException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));
    }

    // ---- SCIM error schema (detail field) ----

    @Test
    void scimThrottlingResponse_throwsThrottlingException() {
        String body = "{\"schemas\": [\"urn:ietf:params:scim:api:messages:2.0:Error\"], \"status\": 429, \"detail\": \"Too Many Requests\"}";
        HttpResponse<InputStream> response = createResponse(429, body);

        ThrottlingException thrown = assertThrows(ThrottlingException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));

        assertEquals(429, thrown.statusCode());
        assertTrue(thrown.responseBody().contains("Too Many Requests"));
    }

    @Test
    void scimQuotaExceededResponse_throwsQuotaExceededException() {
        String body = "{\"schemas\": [\"urn:ietf:params:scim:api:messages:2.0:Error\"], \"status\": 429, \"detail\": \"Limit Exceeded\"}";
        HttpResponse<InputStream> response = createResponse(429, body);

        assertThrows(QuotaExceededException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));
    }

    @Test
    void scimNoDetailField_defaultsToThrottling() {
        String body = "{\"schemas\": [\"urn:ietf:params:scim:api:messages:2.0:Error\"], \"status\": 429}";
        HttpResponse<InputStream> response = createResponse(429, body);

        assertThrows(ThrottlingException.class, () ->
                hook.afterError(null, Optional.of(response), Optional.empty()));
    }

    // ---- extractMessage SCIM fallback ----

    @Test
    void extractMessage_scimDetailField_returnsDetail() {
        String body = "{\"schemas\": [\"urn:ietf:params:scim:api:messages:2.0:Error\"], \"status\": 429, \"detail\": \"Too Many Requests\"}";
        assertEquals("Too Many Requests", hook.extractMessage(body));
    }

    @Test
    void extractMessage_messageFieldTakesPrecedenceOverDetail() {
        String body = "{\"message\": \"Limit Exceeded\", \"detail\": \"Too Many Requests\"}";
        assertEquals("Limit Exceeded", hook.extractMessage(body));
    }

    // ---- Non-429 responses pass through ----

    @Test
    void non429Response_passesThrough() throws Exception {
        String body = "{\"code\": 502, \"message\": \"Bad Gateway\"}";
        HttpResponse<InputStream> response = createResponse(502, body);

        HttpResponse<InputStream> result = hook.afterError(null, Optional.of(response), Optional.empty());

        assertSame(response, result);
    }

    @Test
    void non429SuccessResponse_passesThrough() throws Exception {
        String body = "{}";
        HttpResponse<InputStream> response = createResponse(200, body);

        HttpResponse<InputStream> result = hook.afterError(null, Optional.of(response), Optional.empty());

        assertSame(response, result);
    }

    // ---- Error (no response) propagation ----

    @Test
    void errorWithNoResponse_rethrowsError() {
        Exception originalError = new RuntimeException("connection failed");

        RuntimeException thrown = assertThrows(RuntimeException.class, () ->
                hook.afterError(null, Optional.empty(), Optional.of(originalError)));

        assertSame(originalError, thrown);
    }

    @Test
    void neitherResponseNorError_throwsIllegalState() {
        assertThrows(IllegalStateException.class, () ->
                hook.afterError(null, Optional.empty(), Optional.empty()));
    }

    // ---- extractMessage unit tests ----

    @Test
    void extractMessage_validJson_returnsMessage() {
        String body = "{\"code\": 429, \"message\": \"Too Many Requests\"}";
        assertEquals("Too Many Requests", hook.extractMessage(body));
    }

    @Test
    void extractMessage_limitExceeded_returnsMessage() {
        String body = "{\"code\": 429, \"message\": \"Limit Exceeded\"}";
        assertEquals("Limit Exceeded", hook.extractMessage(body));
    }

    @Test
    void extractMessage_noMessageField_returnsNull() {
        String body = "{\"code\": 429}";
        assertNull(hook.extractMessage(body));
    }

    @Test
    void extractMessage_numericMessageField_returnsNull() {
        String body = "{\"code\": 429, \"message\": 12345}";
        assertNull(hook.extractMessage(body));
    }

    @Test
    void extractMessage_invalidJson_returnsNull() {
        assertNull(hook.extractMessage("not json"));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void extractMessage_nullOrEmpty_returnsNull(String body) {
        assertNull(hook.extractMessage(body));
    }

    @Test
    void extractMessage_withExtraFields_returnsMessage() {
        String body = "{\"code\": 429, \"message\": \"Limit Exceeded\", \"details\": []}";
        assertEquals("Limit Exceeded", hook.extractMessage(body));
    }

    // ---- Helper methods ----

    /**
     * Creates a minimal HttpResponse stub with the given status code and body.
     */
    private static HttpResponse<InputStream> createResponse(int statusCode, String body) {
        byte[] bodyBytes = body.getBytes(StandardCharsets.UTF_8);
        return new HttpResponse<>() {
            @Override
            public int statusCode() {
                return statusCode;
            }

            @Override
            public HttpRequest request() {
                return HttpRequest.newBuilder(URI.create("https://api.cvent.com/v1/events")).build();
            }

            @Override
            public Optional<HttpResponse<InputStream>> previousResponse() {
                return Optional.empty();
            }

            @Override
            public HttpHeaders headers() {
                return HttpHeaders.of(Map.of(), (k, v) -> true);
            }

            @Override
            public InputStream body() {
                return new ByteArrayInputStream(bodyBytes);
            }

            @Override
            public Optional<SSLSession> sslSession() {
                return Optional.empty();
            }

            @Override
            public URI uri() {
                return URI.create("https://api.cvent.com/v1/events");
            }

            @Override
            public HttpClient.Version version() {
                return HttpClient.Version.HTTP_1_1;
            }
        };
    }
}

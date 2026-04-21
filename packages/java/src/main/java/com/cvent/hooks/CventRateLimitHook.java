package com.cvent.hooks;

import com.cvent.hooks.exceptions.QuotaExceededException;
import com.cvent.hooks.exceptions.ThrottlingException;
import com.cvent.utils.Hook.AfterError;
import com.cvent.utils.Hook.AfterErrorContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

/**
 * An {@link AfterError} hook that differentiates between the two types of Cvent API
 * 429 responses by inspecting the response body {@code message} field:
 *
 * <ul>
 *   <li><strong>"Too Many Requests"</strong> — per-second rate throttling; throws
 *       {@link ThrottlingException} so consumers can retry with exponential backoff.</li>
 *   <li><strong>"Limit Exceeded"</strong> — daily API quota exhausted; throws
 *       {@link QuotaExceededException} so consumers stop immediately without wasting quota.</li>
 * </ul>
 *
 * <p>Any unrecognized 429 message is treated as throttling by default — this is the safer
 * assumption since a spurious retry is less harmful than a missed one.
 *
 * <p>Non-429 responses and connection errors are passed through unchanged.
 *
 * <h3>Registration</h3>
 * <p>This hook is registered in {@link SDKHooks#initialize(com.cvent.utils.Hooks)}:
 * <pre>{@code
 * hooks.registerAfterError(new CventRateLimitHook());
 * }</pre>
 *
 * <h3>Consumer usage</h3>
 * <pre>{@code
 * try {
 *     var response = sdk.events().getEvents().call();
 * } catch (ThrottlingException e) {
 *     // Per-second throttle — retry with exponential backoff
 *     // (2s initial, double each retry, 16s max, 5 attempts)
 * } catch (QuotaExceededException e) {
 *     // Daily quota exhausted — stop and log
 * }
 * }</pre>
 *
 * @see ThrottlingException
 * @see QuotaExceededException
 * @see <a href="https://developers.cvent.com/docs/rest-api/guides/handling-rate-limits">
 *      Cvent rate-limit guidance</a>
 */
public class CventRateLimitHook implements AfterError {

    static final int HTTP_TOO_MANY_REQUESTS = 429;
    static final String QUOTA_EXCEEDED_MESSAGE = "Limit Exceeded";

    private final ObjectMapper objectMapper;

    public CventRateLimitHook() {
        this.objectMapper = new ObjectMapper();
    }

    /**
     * Package-private constructor for testing.
     *
     * @param objectMapper the ObjectMapper to use for JSON parsing
     */
    CventRateLimitHook(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public HttpResponse<InputStream> afterError(
            AfterErrorContext context,
            Optional<HttpResponse<InputStream>> response,
            Optional<Exception> error) throws Exception {

        if (response.isPresent() && response.get().statusCode() == HTTP_TOO_MANY_REQUESTS) {
            HttpResponse<InputStream> httpResponse = response.get();
            byte[] bodyBytes = httpResponse.body().readAllBytes();
            String bodyString = new String(bodyBytes, StandardCharsets.UTF_8);
            String message = extractMessage(bodyString);

            if (QUOTA_EXCEEDED_MESSAGE.equalsIgnoreCase(message)) {
                throw new QuotaExceededException(httpResponse.statusCode(), bodyString, httpResponse);
            }

            // Default to throttling for "Too Many Requests" or any unrecognized message.
            // This is the safer assumption — a spurious retry is less harmful than a missed one.
            throw new ThrottlingException(httpResponse.statusCode(), bodyString, httpResponse);
        }

        // Non-429 case: pass through normally
        if (error.isPresent()) {
            throw error.get();
        }
        return response.orElseThrow(() ->
                new IllegalStateException("AfterError hook received neither a response nor an error"));
    }

    /**
     * Extracts the error message from a JSON response body.
     *
     * <p>Checks the {@code message} field first (standard {@code error-response} schema),
     * then falls back to the {@code detail} field (SCIM {@code error-response.json20} schema).
     *
     * @param body the response body as a string
     * @return the message value, or {@code null} if parsing fails or neither field is present
     */
    String extractMessage(String body) {
        try {
            JsonNode root = objectMapper.readTree(body);
            JsonNode messageNode = root.get("message");
            if (messageNode != null && messageNode.isTextual()) {
                return messageNode.asText();
            }
            // SCIM error schema uses "detail" instead of "message"
            JsonNode detailNode = root.get("detail");
            if (detailNode != null && detailNode.isTextual()) {
                return detailNode.asText();
            }
        } catch (Exception ignored) {
            // If JSON parsing fails, treat as throttling (safer default)
        }
        return null;
    }
}

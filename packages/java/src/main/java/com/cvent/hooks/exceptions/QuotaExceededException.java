package com.cvent.hooks.exceptions;

import java.net.http.HttpResponse;

/**
 * Thrown when the Cvent API returns a 429 response with a "Limit Exceeded" message,
 * indicating the daily API quota has been exhausted. This is a non-transient condition —
 * callers should <strong>not</strong> retry the request because every retry further
 * depletes the quota.
 *
 * <p>Per <a href="https://developers.cvent.com/docs/rest-api/guides/handling-rate-limits">
 * Cvent rate-limit guidance</a>: when a "Limit Exceeded" response is received, stop
 * making requests and wait for the quota to reset.
 *
 * @see ThrottlingException
 * @see com.cvent.hooks.CventRateLimitHook
 */
public class QuotaExceededException extends RuntimeException {

    private final int statusCode;
    private final String responseBody;
    private final transient HttpResponse<?> rawResponse;

    /**
     * Creates a new QuotaExceededException.
     *
     * @param statusCode   the HTTP status code (429)
     * @param responseBody the raw response body as a string
     * @param rawResponse  the raw HTTP response
     */
    public QuotaExceededException(int statusCode, String responseBody, HttpResponse<?> rawResponse) {
        super("Daily API quota exhausted (Limit Exceeded) — do not retry");
        this.statusCode = statusCode;
        this.responseBody = responseBody;
        this.rawResponse = rawResponse;
    }

    /**
     * Returns the HTTP status code (always 429).
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Returns the raw response body.
     */
    public String responseBody() {
        return responseBody;
    }

    /**
     * Returns the raw HTTP response.
     */
    public HttpResponse<?> rawResponse() {
        return rawResponse;
    }
}

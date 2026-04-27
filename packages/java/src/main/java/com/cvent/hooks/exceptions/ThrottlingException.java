package com.cvent.hooks.exceptions;

import java.net.http.HttpResponse;

/**
 * Thrown when the Cvent API returns a 429 response with a "Too Many Requests" message,
 * indicating per-second rate throttling. This is a transient condition — callers should
 * retry the request with exponential backoff.
 *
 * <p>Per <a href="https://developers.cvent.com/docs/rest-api/guides/handling-rate-limits">
 * Cvent rate-limit guidance</a>: start by waiting 2 seconds, then double the wait time
 * for each retry up to a maximum of 16 seconds. Stop after 5 attempts.
 *
 * @see QuotaExceededException
 * @see com.cvent.hooks.CventRateLimitHook
 */
public class ThrottlingException extends RuntimeException {

    private final int statusCode;
    private final String responseBody;
    private final transient HttpResponse<?> rawResponse;

    /**
     * Creates a new ThrottlingException.
     *
     * @param statusCode   the HTTP status code (429)
     * @param responseBody the raw response body as a string
     * @param rawResponse  the raw HTTP response
     */
    public ThrottlingException(int statusCode, String responseBody, HttpResponse<?> rawResponse) {
        super("Rate throttled (Too Many Requests) — retry with exponential backoff");
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

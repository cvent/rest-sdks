# Handling Rate Limits (429 Responses)

The Cvent API enforces rate limits to ensure platform stability. When limits are exceeded, the API
returns a `429 Too Many Requests` response. However, the same 429 status code is used for **two
distinct conditions** that require different handling strategies.

For official Cvent documentation, see:
[Handling Rate Limits](https://developers.cvent.com/docs/rest-api/guides/handling-rate-limits)

## Two Types of 429 Responses

| Condition                 | Response `message`    | Meaning                                               | Action                         |
| ------------------------- | --------------------- | ----------------------------------------------------- | ------------------------------ |
| **Per-second throttling** | `"Too Many Requests"` | You exceeded your calls-per-second or max-burst limit | Retry with exponential backoff |
| **Daily quota exhausted** | `"Limit Exceeded"`    | You exhausted your daily call allowance               | Stop — do not retry            |

Both responses share the same `error-response` schema:

```json
{
  "code": 429,
  "message": "Too Many Requests"
}
```

```json
{
  "code": 429,
  "message": "Limit Exceeded"
}
```

The **only** way to distinguish them is by inspecting the `message` field in the response body.
The HTTP status code alone is insufficient.

## Built-in SDK Behavior

The SDK includes a `CventRateLimitHook` (registered automatically via `SDKHooks`) that inspects
every 429 response and throws a typed exception based on the `message` field:

- **`ThrottlingException`** — per-second throttle (`"Too Many Requests"` or any unrecognized 429 message)
- **`QuotaExceededException`** — daily quota exhausted (`"Limit Exceeded"`)

This hook **only affects 429 responses**. All other status codes pass through unchanged — the
hook does not interfere with normal error handling or the SDK's built-in retry logic for
502/503/504.

For 429 responses specifically, unrecognized `message` values default to `ThrottlingException`
because a spurious retry is less harmful than missing a retry opportunity.

> **Why isn't 429 retried automatically by the SDK?**
>
> The SDK's built-in retry engine handles 502, 503, and 504 errors automatically with exponential
> backoff. 429 is excluded from automatic retries because blindly retrying a quota-exhausted 429
> would waste remaining quota. The typed exceptions let you implement the correct strategy for each
> case.

## Consumer Usage Pattern

```java
import com.cvent.hooks.ThrottlingException;
import com.cvent.hooks.QuotaExceededException;

// Wrap SDK calls with 429-aware retry logic
try {
    var response = sdk.events().getEvents().call();
    // process response...

} catch (ThrottlingException e) {
    // Per-second rate limit — retry with exponential backoff
    // Recommended: 2s initial delay, double each retry, 16s max, up to 5 attempts
    retryWithBackoff(() -> sdk.events().getEvents().call());

} catch (QuotaExceededException e) {
    // Daily quota exhausted — do NOT retry
    log.error("Daily API quota exhausted. Quota resets at midnight GMT.", e);
    throw e;
}
```

## Recommended Retry Strategy

When handling `ThrottlingException`, use exponential backoff with these parameters
(per [Cvent rate-limit guidance](https://developers.cvent.com/docs/rest-api/guides/handling-rate-limits)):

| Parameter          | Value      | Rationale                             |
| ------------------ | ---------- | ------------------------------------- |
| Initial delay      | 2 seconds  | Allows the per-second window to reset |
| Backoff multiplier | 2×         | Doubles the wait on each retry        |
| Maximum delay      | 16 seconds | Caps the wait time                    |
| Maximum attempts   | 5          | Covers worst-case burst scenarios     |
| Jitter             | ±50%       | Prevents synchronized retry storms    |

### Complete Retry Example

```java
import com.cvent.hooks.ThrottlingException;
import com.cvent.hooks.QuotaExceededException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

/**
 * Retries a supplier on ThrottlingException with exponential backoff.
 * Immediately propagates QuotaExceededException without retry.
 */
public static <T> T callWithRateLimitRetry(Supplier<T> action) throws QuotaExceededException {
    int maxAttempts = 5;
    long delayMs = 2000;       // 2 seconds initial
    long maxDelayMs = 16000;   // 16 seconds max

    for (int attempt = 1; attempt <= maxAttempts; attempt++) {
        try {
            return action.get();
        } catch (ThrottlingException e) {
            if (attempt == maxAttempts) {
                throw e; // Exhausted retries
            }
            // Apply jitter: ±50% of current delay
            long jitter = (long) (delayMs * 0.5 * (ThreadLocalRandom.current().nextDouble() * 2 - 1));
            long sleepMs = Math.min(delayMs + jitter, maxDelayMs);
            try {
                Thread.sleep(sleepMs);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                throw e;
            }
            delayMs = Math.min(delayMs * 2, maxDelayMs);
        }
        // QuotaExceededException is NOT caught — it propagates immediately
    }
    throw new IllegalStateException("Unreachable");
}
```

Usage:

```java
var response = callWithRateLimitRetry(() -> sdk.events().getEvents().call());
```

## Exception Reference

### `ThrottlingException`

| Method           | Type              | Description                   |
| ---------------- | ----------------- | ----------------------------- |
| `statusCode()`   | `int`             | HTTP status code (always 429) |
| `responseBody()` | `String`          | Raw response body JSON        |
| `rawResponse()`  | `HttpResponse<?>` | Full HTTP response object     |

Thrown when a 429 response has a `message` of `"Too Many Requests"` or any unrecognized value.
Callers should retry with backoff. This exception is only thrown for 429 status codes.

### `QuotaExceededException`

| Method           | Type              | Description                   |
| ---------------- | ----------------- | ----------------------------- |
| `statusCode()`   | `int`             | HTTP status code (always 429) |
| `responseBody()` | `String`          | Raw response body JSON        |
| `rawResponse()`  | `HttpResponse<?>` | Full HTTP response object     |

Thrown when the `message` field is `"Limit Exceeded"`. Callers should stop making requests
and wait for the daily quota to reset at midnight GMT.

## SCIM Endpoints

SCIM provisioning endpoints (`/scim/v2/...`) use a different error schema with `status` and
`detail` fields instead of `code` and `message`:

```json
{
  "schemas": ["urn:ietf:params:scim:api:messages:2.0:Error"],
  "status": 429,
  "detail": "Too Many Requests"
}
```

The hook handles this automatically — it checks the `message` field first, then falls back to
`detail`. The same throttling-vs-quota discrimination applies to both schemas.

## Related

- [Retries](../../../README.md#retries) — SDK built-in retry configuration for 502/503/504
- [Error Handling](../../../README.md#error-handling) — General SDK error handling patterns
- [CventRateLimitHook](../../src/main/java/com/cvent/hooks/CventRateLimitHook.java) — Hook source code

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

The SDK includes a `CventRateLimitHook` (registered automatically via `HookRegistration.cs`) that
inspects every 429 response and throws a typed exception based on the `message` field:

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

```csharp
using Cvent.SDK.Hooks;

try
{
    var response = await sdk.Events.GetEventsAsync();
    // process response...
}
catch (ThrottlingException ex)
{
    // Per-second rate limit — retry with exponential backoff
    // Recommended: 2s initial delay, double each retry, 16s max, up to 5 attempts
    var response = await CallWithRateLimitRetryAsync(() => sdk.Events.GetEventsAsync());
}
catch (QuotaExceededException ex)
{
    // Daily quota exhausted — do NOT retry
    Console.Error.WriteLine($"Daily API quota exhausted. Quota resets at midnight GMT. {ex}");
    throw;
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

```csharp
using Cvent.SDK.Hooks;

/// <summary>
/// Retries an async action on ThrottlingException with exponential backoff.
/// Immediately propagates QuotaExceededException without retry.
/// </summary>
public static async Task<T> CallWithRateLimitRetryAsync<T>(Func<Task<T>> action)
{
    const int maxAttempts = 5;
    var delayMs = 2000; // 2 seconds initial
    const int maxDelayMs = 16000; // 16 seconds max
    var random = new Random();

    for (var attempt = 1; attempt <= maxAttempts; attempt++)
    {
        try
        {
            return await action();
        }
        catch (QuotaExceededException)
        {
            throw; // Do NOT retry quota exhaustion
        }
        catch (ThrottlingException)
        {
            if (attempt == maxAttempts)
            {
                throw; // Exhausted retries
            }
            // Apply jitter: ±50% of current delay
            var jitter = delayMs * 0.5 * (random.NextDouble() * 2 - 1);
            var sleepMs = (int)Math.Min(delayMs + jitter, maxDelayMs);
            await Task.Delay(sleepMs);
            delayMs = Math.Min(delayMs * 2, maxDelayMs);
        }
    }
    throw new InvalidOperationException("Unreachable");
}
```

Usage:

```csharp
var response = await CallWithRateLimitRetryAsync(() => sdk.Events.GetEventsAsync());
```

## Error Reference

### `ThrottlingException`

| Property       | Type                   | Description                   |
| -------------- | ---------------------- | ----------------------------- |
| `StatusCode`   | `int`                  | HTTP status code (always 429) |
| `ResponseBody` | `string`               | Raw response body JSON        |
| `RawResponse`  | `HttpResponseMessage?` | Full HTTP response object     |
| `Message`      | `string`               | Human-readable summary        |

Thrown when a 429 response has a `message` of `"Too Many Requests"` or any unrecognized value.
Callers should retry with backoff. This exception is only thrown for 429 status codes.

### `QuotaExceededException`

| Property       | Type                   | Description                   |
| -------------- | ---------------------- | ----------------------------- |
| `StatusCode`   | `int`                  | HTTP status code (always 429) |
| `ResponseBody` | `string`               | Raw response body JSON        |
| `RawResponse`  | `HttpResponseMessage?` | Full HTTP response object     |
| `Message`      | `string`               | Human-readable summary        |

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
- [CventRateLimitHook](../src/Cvent/SDK/Hooks/CventRateLimitHook.cs) — Hook source code

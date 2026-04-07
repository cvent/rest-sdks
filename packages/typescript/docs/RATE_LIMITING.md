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

The SDK includes a `CventRateLimitHook` (registered automatically via `registration.ts`) that
inspects every 429 response and throws a typed error based on the `message` field:

- **`ThrottlingError`** — per-second throttle (`"Too Many Requests"` or any unrecognized 429 message)
- **`QuotaExceededError`** — daily quota exhausted (`"Limit Exceeded"`)

This hook **only affects 429 responses**. All other status codes pass through unchanged — the
hook does not interfere with normal error handling or the SDK's built-in retry logic for
502/503/504.

For 429 responses specifically, unrecognized `message` values default to `ThrottlingError`
because a spurious retry is less harmful than missing a retry opportunity.

> **Why isn't 429 retried automatically by the SDK?**
>
> The SDK's built-in retry engine handles 502, 503, and 504 errors automatically with exponential
> backoff. 429 is excluded from automatic retries because blindly retrying a quota-exhausted 429
> would waste remaining quota. The typed errors let you implement the correct strategy for each
> case.

## Consumer Usage Pattern

```typescript
import {
  ThrottlingError,
  QuotaExceededError,
} from "@cvent/sdk/hooks/ratelimit";

// Wrap SDK calls with 429-aware retry logic
try {
  const response = await sdk.events.getEvents();
  // process response...
} catch (error) {
  if (error instanceof ThrottlingError) {
    // Per-second rate limit — retry with exponential backoff
    // Recommended: 2s initial delay, double each retry, 16s max, up to 5 attempts
    const response = await callWithRateLimitRetry(() => sdk.events.getEvents());
  } else if (error instanceof QuotaExceededError) {
    // Daily quota exhausted — do NOT retry
    console.error(
      "Daily API quota exhausted. Quota resets at midnight GMT.",
      error,
    );
    throw error;
  } else {
    throw error;
  }
}
```

## Recommended Retry Strategy

When handling `ThrottlingError`, use exponential backoff with these parameters
(per [Cvent rate-limit guidance](https://developers.cvent.com/docs/rest-api/guides/handling-rate-limits)):

| Parameter          | Value      | Rationale                             |
| ------------------ | ---------- | ------------------------------------- |
| Initial delay      | 2 seconds  | Allows the per-second window to reset |
| Backoff multiplier | 2×         | Doubles the wait on each retry        |
| Maximum delay      | 16 seconds | Caps the wait time                    |
| Maximum attempts   | 5          | Covers worst-case burst scenarios     |
| Jitter             | ±50%       | Prevents synchronized retry storms    |

### Complete Retry Example

```typescript
import {
  ThrottlingError,
  QuotaExceededError,
} from "@cvent/sdk/hooks/ratelimit";

/**
 * Retries an async action on ThrottlingError with exponential backoff.
 * Immediately propagates QuotaExceededError without retry.
 */
async function callWithRateLimitRetry<T>(action: () => Promise<T>): Promise<T> {
  const maxAttempts = 5;
  let delayMs = 2000; // 2 seconds initial
  const maxDelayMs = 16000; // 16 seconds max

  for (let attempt = 1; attempt <= maxAttempts; attempt++) {
    try {
      return await action();
    } catch (error) {
      if (error instanceof QuotaExceededError) {
        throw error; // Do NOT retry quota exhaustion
      }
      if (error instanceof ThrottlingError) {
        if (attempt === maxAttempts) {
          throw error; // Exhausted retries
        }
        // Apply jitter: ±50% of current delay
        const jitter = delayMs * 0.5 * (Math.random() * 2 - 1);
        const sleepMs = Math.min(delayMs + jitter, maxDelayMs);
        await new Promise((resolve) => setTimeout(resolve, sleepMs));
        delayMs = Math.min(delayMs * 2, maxDelayMs);
      } else {
        throw error; // Unknown error — don't retry
      }
    }
  }
  throw new Error("Unreachable");
}
```

Usage:

```typescript
const response = await callWithRateLimitRetry(() => sdk.events.getEvents());
```

## Error Reference

### `ThrottlingError`

| Property       | Type       | Description                   |
| -------------- | ---------- | ----------------------------- |
| `statusCode`   | `number`   | HTTP status code (always 429) |
| `responseBody` | `string`   | Raw response body JSON        |
| `rawResponse`  | `Response` | Full HTTP Response object     |
| `name`         | `string`   | Always `"ThrottlingError"`    |
| `message`      | `string`   | Human-readable summary        |

Thrown when a 429 response has a `message` of `"Too Many Requests"` or any unrecognized value.
Callers should retry with backoff. This error is only thrown for 429 status codes.

### `QuotaExceededError`

| Property       | Type       | Description                   |
| -------------- | ---------- | ----------------------------- |
| `statusCode`   | `number`   | HTTP status code (always 429) |
| `responseBody` | `string`   | Raw response body JSON        |
| `rawResponse`  | `Response` | Full HTTP Response object     |
| `name`         | `string`   | Always `"QuotaExceededError"` |
| `message`      | `string`   | Human-readable summary        |

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
- [CventRateLimitHook](../../src/hooks/ratelimit.ts) — Hook source code

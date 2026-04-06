import { AfterErrorContext, AfterErrorHook } from "./types.js";

const HTTP_TOO_MANY_REQUESTS = 429;
const QUOTA_EXCEEDED_MESSAGE = "Limit Exceeded";

/**
 * Error thrown when the Cvent API returns a 429 indicating per-second rate throttling.
 * This is a transient condition — retry with exponential backoff.
 */
export class ThrottlingError extends Error {
  readonly statusCode: number;
  readonly responseBody: string;
  readonly rawResponse: Response;

  constructor(statusCode: number, responseBody: string, rawResponse: Response) {
    super(
      `Rate throttled (HTTP ${statusCode}): ${extractSummary(responseBody)}`,
    );
    this.name = "ThrottlingError";
    this.statusCode = statusCode;
    this.responseBody = responseBody;
    this.rawResponse = rawResponse;
  }
}

/**
 * Error thrown when the Cvent API returns a 429 indicating daily API quota exhaustion.
 * This is NOT a transient condition — do NOT retry.
 */
export class QuotaExceededError extends Error {
  readonly statusCode: number;
  readonly responseBody: string;
  readonly rawResponse: Response;

  constructor(statusCode: number, responseBody: string, rawResponse: Response) {
    super(
      `Daily API quota exhausted (Limit Exceeded) — do not retry (HTTP ${statusCode})`,
    );
    this.name = "QuotaExceededError";
    this.statusCode = statusCode;
    this.responseBody = responseBody;
    this.rawResponse = rawResponse;
  }
}

function extractSummary(body: string): string {
  if (!body) return "Too Many Requests";
  return body.length > 200 ? body.substring(0, 200) + "..." : body;
}

/**
 * Extracts the error message from a JSON response body.
 * Checks the `message` field first (standard error-response schema),
 * then falls back to the `detail` field (SCIM error-response schema).
 */
function extractMessage(body: string): string | null {
  try {
    const obj = JSON.parse(body);
    if (typeof obj.message === "string" && obj.message) return obj.message;
    // SCIM error schema uses "detail" instead of "message"
    if (typeof obj.detail === "string" && obj.detail) return obj.detail;
  } catch {
    // JSON parsing failed — treat as throttling (safer default)
  }
  return null;
}

/**
 * An {@link AfterErrorHook} that differentiates between the two types of
 * Cvent API 429 responses by inspecting the response body message field:
 *
 * - **"Too Many Requests"** — per-second rate throttling; returns a
 *   {@link ThrottlingError} so consumers can retry with exponential backoff.
 * - **"Limit Exceeded"** — daily API quota exhausted; returns a
 *   {@link QuotaExceededError} so consumers stop immediately.
 *
 * Any unrecognized 429 message is treated as throttling by default.
 * Non-429 responses and connection errors are passed through unchanged.
 */
export class CventRateLimitHook implements AfterErrorHook {
  async afterError(
    _hookCtx: AfterErrorContext,
    response: Response | null,
    error: unknown,
  ): Promise<{ response: Response | null; error: unknown }> {
    if (response && response.status === HTTP_TOO_MANY_REQUESTS) {
      const bodyString = await response.text();
      const message = extractMessage(bodyString);

      if (
        message &&
        message.toLowerCase() === QUOTA_EXCEEDED_MESSAGE.toLowerCase()
      ) {
        return {
          response: null,
          error: new QuotaExceededError(
            HTTP_TOO_MANY_REQUESTS,
            bodyString,
            response,
          ),
        };
      }

      // Default to throttling for "Too Many Requests" or any unrecognized message.
      // This is the safer assumption — a spurious retry is less harmful than a missed one.
      return {
        response: null,
        error: new ThrottlingError(
          HTTP_TOO_MANY_REQUESTS,
          bodyString,
          response,
        ),
      };
    }

    // Non-429 case: pass through unchanged
    return { response, error };
  }
}

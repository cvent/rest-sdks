namespace Cvent.SDK.Hooks
{
    using System;
    using System.Net.Http;
    using System.Threading.Tasks;
    using Newtonsoft.Json.Linq;

    /// <summary>
    /// An <see cref="IAfterErrorHook"/> that differentiates between the two types of
    /// Cvent API 429 responses by inspecting the response body message field:
    /// <list type="bullet">
    ///   <item><description><b>"Too Many Requests"</b> — per-second rate throttling;
    ///   returns a <see cref="ThrottlingException"/> so consumers can retry with
    ///   exponential backoff.</description></item>
    ///   <item><description><b>"Limit Exceeded"</b> — daily API quota exhausted;
    ///   returns a <see cref="QuotaExceededException"/> so consumers stop immediately
    ///   without wasting quota.</description></item>
    /// </list>
    /// Any unrecognized 429 message is treated as throttling by default — this is the
    /// safer assumption since a spurious retry is less harmful than a missed one.
    /// Non-429 responses and connection errors are passed through unchanged.
    /// </summary>
    public class CventRateLimitHook : IAfterErrorHook
    {
        internal const int HttpTooManyRequests = 429;
        internal const string QuotaExceededMessage = "Limit Exceeded";

        /// <inheritdoc />
        public async Task<(HttpResponseMessage?, Exception?)> AfterErrorAsync(
            AfterErrorContext hookCtx,
            HttpResponseMessage? response,
            Exception? error)
        {
            if (response != null && (int)response.StatusCode == HttpTooManyRequests)
            {
                string bodyString = await response.Content.ReadAsStringAsync();
                string? message = ExtractMessage(bodyString);

                if (string.Equals(QuotaExceededMessage, message, StringComparison.OrdinalIgnoreCase))
                {
                    return (null, new QuotaExceededException(HttpTooManyRequests, bodyString, response));
                }

                // Default to throttling for "Too Many Requests" or any unrecognized message.
                // This is the safer assumption — a spurious retry is less harmful than a missed one.
                return (null, new ThrottlingException(HttpTooManyRequests, bodyString, response));
            }

            // Non-429 case: pass through unchanged
            return (response, error);
        }

        /// <summary>
        /// Extracts the error message from a JSON response body.
        /// Checks the <c>message</c> field first (standard error-response schema),
        /// then falls back to the <c>detail</c> field (SCIM error-response schema).
        /// </summary>
        /// <param name="body">The response body as a string.</param>
        /// <returns>The message value, or <c>null</c> if parsing fails or neither field is present.</returns>
        internal static string? ExtractMessage(string body)
        {
            try
            {
                var obj = JObject.Parse(body);

                var message = obj["message"]?.ToString();
                if (!string.IsNullOrEmpty(message)) return message;

                // SCIM error schema uses "detail" instead of "message"
                var detail = obj["detail"]?.ToString();
                if (!string.IsNullOrEmpty(detail)) return detail;
            }
            catch
            {
                // JSON parsing failed — treat as throttling (safer default)
            }
            return null;
        }
    }
}

namespace Cvent.SDK.Hooks
{
    using System;
    using System.Net.Http;

    /// <summary>
    /// Exception thrown when the Cvent API returns a 429 response indicating daily API
    /// quota exhaustion ("Limit Exceeded"). This is NOT a transient condition — retrying
    /// will not help until the quota resets.
    /// </summary>
    public class QuotaExceededException : Exception
    {
        /// <summary>Gets the HTTP status code (429).</summary>
        public int StatusCode { get; }

        /// <summary>Gets the response body as a string.</summary>
        public string ResponseBody { get; }

        /// <summary>Gets the raw HTTP response.</summary>
        public HttpResponseMessage? RawResponse { get; }

        public QuotaExceededException(int statusCode, string responseBody, HttpResponseMessage? rawResponse)
            : base($"Daily API quota exhausted (Limit Exceeded) — do not retry (HTTP {statusCode})")
        {
            StatusCode = statusCode;
            ResponseBody = responseBody;
            RawResponse = rawResponse;
        }
    }
}

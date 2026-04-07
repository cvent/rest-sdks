namespace Cvent.SDK.Hooks
{
    using System;
    using System.Net.Http;

    /// <summary>
    /// Exception thrown when the Cvent API returns a 429 response indicating per-second
    /// rate throttling ("Too Many Requests"). This is a transient condition — the request
    /// can be retried with exponential backoff.
    /// </summary>
    public class ThrottlingException : Exception
    {
        /// <summary>Gets the HTTP status code (429).</summary>
        public int StatusCode { get; }

        /// <summary>Gets the response body as a string.</summary>
        public string ResponseBody { get; }

        /// <summary>Gets the raw HTTP response.</summary>
        public HttpResponseMessage? RawResponse { get; }

        public ThrottlingException(int statusCode, string responseBody, HttpResponseMessage? rawResponse)
            : base($"Rate throttled (HTTP {statusCode}): {ExtractSummary(responseBody)}")
        {
            StatusCode = statusCode;
            ResponseBody = responseBody;
            RawResponse = rawResponse;
        }

        private static string ExtractSummary(string body)
        {
            if (string.IsNullOrWhiteSpace(body)) return "Too Many Requests";
            return body.Length > 200 ? body.Substring(0, 200) + "..." : body;
        }
    }
}

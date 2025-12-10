namespace Cvent.SDK.Hooks.CventUserAgent
{
    using System.Text.RegularExpressions;
    using Cvent.SDK;
    using Cvent.SDK.Hooks;

    /// <summary>
    /// Hook to set the User-Agent header on outgoing requests.
    /// </summary>
    /// <remarks>
    /// Sets the User-Agent header to follow the Cvent standard of
    /// "cvent/1.0 Cvent-SDK/{SDK Version} (csharp {OpenAPI Version})"
    /// </remarks>
    public class CventUserAgentHook : ISDKInitHook
    {
        public SDKConfig SDKInit(SDKConfig config)
        {
            string[] parts = extractVersionsFromUserAgent(config.UserAgent);
            string cventUserAgent = $"cvent/1.0 Cvent-SDK/{parts[0]} (csharp {parts[1]})";
            config.UserAgent = cventUserAgent;
            return config;
        }

        /// <summary>
        /// Extracts the SDK version and OpenAPI version from the default User-Agent string and returns them in an array of size 2.
        /// </summary>
        /// <param name="userAgent">The default User-Agent string.</param>
        /// <returns>An array of size 2 where the first element is the SDK version and the second is the OpenAPI version.</returns>
        /// <remarks>
        /// Example User-Agent: "speakeasy-sdk/csharp 0.0.1 2.698.4 ea Cvent.SDK"
        /// Returns: [ "0.0.1", "ea" ]
        /// Have to extract these values as the C# SDK does not contain constants of those values like other languages.
        /// </remarks>
        private string[] extractVersionsFromUserAgent(string userAgent)
        {
            // Example User-Agent: "speakeasy-sdk/csharp 0.0.1 2.698.4 ea Cvent.SDK"
            Regex userAgentPartSelector = new Regex("speakeasy-sdk\\/csharp (.+) .+ (.+) Cvent\\.SDK");
            Match match = userAgentPartSelector.Match(userAgent);
            return new string[] { match.Groups[1].Value, match.Groups[2].Value };
        }
    }
}

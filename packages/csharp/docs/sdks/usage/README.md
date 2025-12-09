# Usage

## Overview

Use these APIs view your REST API usage and limits metrics. For more details on limits - [Rate Limits](#section/Getting-Started/Rate-Limits)

### Available Operations

* [GetUsage](#getusage) - Get Current Usage
* [GetUsageTier](#getusagetier) - Get Current Usage Tier

## GetUsage

Returns API call usage for the last seven days, or between some date range (up to the past seven days) for
the current caller's account.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="getUsage" method="get" path="/usage" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetUsageRequest? req = null;

var res = await sdk.Usage.GetUsageAsync(req);

// handle response
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetUsageRequest](../../Models/Requests/GetUsageRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetUsageResponse](../../Models/Requests/GetUsageResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetUsageTier

Returns the current usage tier of the caller's account.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getUsageTier" method="get" path="/usage/tier" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

var res = await sdk.Usage.GetUsageTierAsync();

// handle response
```

### Response

**[GetUsageTierResponse](../../Models/Requests/GetUsageTierResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 429                         | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
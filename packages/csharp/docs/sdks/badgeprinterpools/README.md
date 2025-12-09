# BadgePrinterPools

## Overview

Badge printer pools are set up from Cvent UI. You can use this API to retrieve badge printer pools.

### Available Operations

* [GetBadgePrinterPools](#getbadgeprinterpools) - List Badge Printer Pools
* [GetBadgePrinterPool](#getbadgeprinterpool) - Get Badge Printer Pool

## GetBadgePrinterPools

Gets a paginated list of badge printer pools

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBadgePrinterPools" method="get" path="/events/{eventId}/badge-printer-pools" -->
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

GetBadgePrinterPoolsRequest req = new GetBadgePrinterPoolsRequest() {
    EventId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "disabled eq 'true'",
};

GetBadgePrinterPoolsResponse? res = await sdk.BadgePrinterPools.GetBadgePrinterPoolsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetBadgePrinterPoolsRequest](../../Models/Requests/GetBadgePrinterPoolsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetBadgePrinterPoolsResponse](../../Models/Requests/GetBadgePrinterPoolsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBadgePrinterPool

Gets a single badge printer pool by its ID

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBadgePrinterPool" method="get" path="/events/{eventId}/badge-printer-pools/{poolId}" -->
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

GetBadgePrinterPoolRequest req = new GetBadgePrinterPoolRequest() {
    EventId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PoolId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.BadgePrinterPools.GetBadgePrinterPoolAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetBadgePrinterPoolRequest](../../Models/Requests/GetBadgePrinterPoolRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetBadgePrinterPoolResponse](../../Models/Requests/GetBadgePrinterPoolResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
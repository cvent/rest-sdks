# BadgePrintJob

## Overview

Badge print jobs can be scheduled to a printer pool, so a printer in the printer pool can consume the job and print the badge.

### Available Operations

* [CreateBadgePrintJob](#createbadgeprintjob) - Create Badge Print Job
* [GetEventBadgePrintJobs](#geteventbadgeprintjobs) - List Badge Print Jobs
* [GetBadgePrintJob](#getbadgeprintjob) - Get Badge Print Job

## CreateBadgePrintJob

Creates a new badge print job

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createBadgePrintJob" method="post" path="/events/{eventId}/badge-print-jobs" -->
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

CreateBadgePrintJobRequest req = new CreateBadgePrintJobRequest() {
    EventId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    BadgePrintJobCreated = new BadgePrintJobCreatedInput() {
        Status = BadgePrintJobStatusJson.Scheduled,
        Pool = new BadgePrinterPoolReferenceJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        BadgeId = "VNNDLJ6DKVK",
    },
};

var res = await sdk.BadgePrintJob.CreateBadgePrintJobAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateBadgePrintJobRequest](../../Models/Requests/CreateBadgePrintJobRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateBadgePrintJobResponse](../../Models/Requests/CreateBadgePrintJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventBadgePrintJobs

Gets a paginated list of badge print jobs for a given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventBadgePrintJobs" method="get" path="/events/{eventId}/badge-print-jobs" -->
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

GetEventBadgePrintJobsRequest req = new GetEventBadgePrintJobsRequest() {
    EventId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "poolId eq '{UUID}' and status eq 'ASSIGNED'",
};

GetEventBadgePrintJobsResponse? res = await sdk.BadgePrintJob.GetEventBadgePrintJobsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetEventBadgePrintJobsRequest](../../Models/Requests/GetEventBadgePrintJobsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetEventBadgePrintJobsResponse](../../Models/Requests/GetEventBadgePrintJobsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBadgePrintJob

Gets a badge print job

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBadgePrintJob" method="get" path="/events/{eventId}/badge-print-jobs/{jobId}" -->
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

GetBadgePrintJobRequest req = new GetBadgePrintJobRequest() {
    EventId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    JobId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.BadgePrintJob.GetBadgePrintJobAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetBadgePrintJobRequest](../../Models/Requests/GetBadgePrintJobRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetBadgePrintJobResponse](../../Models/Requests/GetBadgePrintJobResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
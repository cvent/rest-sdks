# Emails

## Overview

Event planners use emails to invite registrants, market their events and request feedback from attendees. Use these APIs to get historical data about your emails and see relevant details like the types of emails sent, the recipient, and delivery status.

### Available Operations

* [GetBounceDetails](#getbouncedetails) - List Email Bounces
* [GetEmailsHistory](#getemailshistory) - Get Emails History Data
* [~~GetEmailStatus~~](#getemailstatus) - List Email Status :warning: **Deprecated**

## GetBounceDetails

Returns a paginated list of email bounce details in your account.

Before/after filters can be used to retrieve email bounce data up to six months in the past.
If no date filter is provided, defaults to 1 month back from the current time.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBounceDetails" method="get" path="/bounces" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

GetBounceDetailsRequest req = new GetBounceDetailsRequest() {
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "productLine eq 'EVENT'",
};

GetBounceDetailsResponse? res = await sdk.Emails.GetBounceDetailsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetBounceDetailsRequest](../../Models/Requests/GetBounceDetailsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetBounceDetailsResponse](../../Models/Requests/GetBounceDetailsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEmailsHistory

Returns the paginated list of sent emails. Default behaviour is to retrieve all emails for the account. Maximum 6 months of records can be fetched.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEmailsHistory" method="get" path="/emails" -->
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

GetEmailsHistoryRequest req = new GetEmailsHistoryRequest() {
    Before = "2021-03-25T02:30:00Z",
    After = "2021-03-26T02:30:00Z",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

GetEmailsHistoryResponse? res = await sdk.Emails.GetEmailsHistoryAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetEmailsHistoryRequest](../../Models/Requests/GetEmailsHistoryRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetEmailsHistoryResponse](../../Models/Requests/GetEmailsHistoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ~~GetEmailStatus~~

Gets the status of emails using unique email request ID that was generated as a response of [Send Email To Recipients](#tag/Campaigns/operation/sendEMarketingEmails) request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEmailStatus" method="get" path="/emails/{emailRequestId}/status" -->
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

GetEmailStatusRequest req = new GetEmailStatusRequest() {
    EmailRequestId = "2A941E55-3367-4C50-B21B-B6A7613DFB23",
};

var res = await sdk.Emails.GetEmailStatusAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetEmailStatusRequest](../../Models/Requests/GetEmailStatusRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetEmailStatusResponse](../../Models/Requests/GetEmailStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
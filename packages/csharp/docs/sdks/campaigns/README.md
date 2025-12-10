# Campaigns

## Overview

Planners use eMarketing campaigns to contact an audience, such as newsletters, press releases, or product updates. Campaign emails are used as newsletters, promotions, advertisements, or marketing messages. Use these APIs to send an email and get historical data about your campaigns.

### Available Operations

* [GetCampaigns](#getcampaigns) - List eMarketing Campaigns
* [GetEmailTemplates](#getemailtemplates) - List Email Templates
* [SendEMarketingEmails](#sendemarketingemails) - Send Email To Recipients
* [GetEmarketingEmailStatus](#getemarketingemailstatus) - List Emarketing Email Status

## GetCampaigns

Gets a list of eMarketing campaigns.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getCampaigns" method="get" path="/campaigns" -->
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

GetCampaignsRequest req = new GetCampaignsRequest() {
    Before = "2021-03-25T02:30:00Z",
    After = "2021-03-26T02:30:00Z",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "campaign.active eq '1'",
};

GetCampaignsResponse? res = await sdk.Campaigns.GetCampaignsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCampaignsRequest](../../Models/Requests/GetCampaignsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCampaignsResponse](../../Models/Requests/GetCampaignsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEmailTemplates

Gets a list of eMarketing email templates.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEmailTemplates" method="get" path="/emarketing/campaigns/{campaignId}/email-templates" -->
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

GetEmailTemplatesRequest req = new GetEmailTemplatesRequest() {
    Before = "2021-03-25T02:30:00Z",
    After = "2021-03-26T02:30:00Z",
    CampaignId = "9A641E55-3367-4C50-B21B-B6A7613DFB23",
    Filter = "emailName eq 'Invitation'",
};

var res = await sdk.Campaigns.GetEmailTemplatesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetEmailTemplatesRequest](../../Models/Requests/GetEmailTemplatesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetEmailTemplatesResponse](../../Models/Requests/GetEmailTemplatesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## SendEMarketingEmails

Sends an email to one or more eMarketing campaign recipients who are on the recipient list.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="sendEMarketingEmails" method="post" path="/emarketing/emails" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

SendEmailRequest req = new SendEmailRequest() {
    TemplateId = "12345",
    Recipients = new List<RecipientsRequestJson>() {},
};

var res = await sdk.Campaigns.SendEMarketingEmailsAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [SendEmailRequest](../../Models/Components/SendEmailRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[SendEMarketingEmailsResponse](../../Models/Requests/SendEMarketingEmailsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEmarketingEmailStatus

Gets the status of email using unique email request ID that was generated as a response of [Send Email To Recipients](#tag/Campaigns/operation/sendEMarketingEmails) request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEmarketingEmailStatus" method="get" path="/emarketing/emails/{emailRequestId}/status" -->
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

GetEmarketingEmailStatusRequest req = new GetEmarketingEmailStatusRequest() {
    EmailRequestId = "2A941E55-3367-4C50-B21B-B6A7613DFB23",
};

var res = await sdk.Campaigns.GetEmarketingEmailStatusAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetEmarketingEmailStatusRequest](../../Models/Requests/GetEmarketingEmailStatusRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetEmarketingEmailStatusResponse](../../Models/Requests/GetEmarketingEmailStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
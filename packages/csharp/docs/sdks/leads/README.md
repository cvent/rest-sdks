# Leads

## Overview

* **Leads -** Leads include leads gathered by LeadCapture, Appointments, and Inbound Leads. Use this API to get information for the lead and how it was captured.

* **Lead Qualification Question -** Custom questions created by each exhibitor to qualify a lead. Questions and answers are their own endpoints.

* **Eliterature Requests -** List of E-literature requests data sent to lead.


### Available Operations

* [GetEliteratureRequests](#geteliteraturerequests) - List E-literature Requests
* [GetLeadQualificationAnswers](#getleadqualificationanswers) - List Qualification Answers
* [GetLeads](#getleads) - List Leads
* [GetLeadsPostFiltersData](#getleadspostfiltersdata) - List Leads

## GetEliteratureRequests

Gets a paginated list of eliterature requests data

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEliteratureRequests" method="get" path="/eliterature-requests" -->
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

GetEliteratureRequestsRequest req = new GetEliteratureRequestsRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Filter = "event.id eq '{UUID}' and exhibitor.id eq '{UUID}' and lead.id eq '{UUID}'",
};

GetEliteratureRequestsResponse? res = await sdk.Leads.GetEliteratureRequestsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetEliteratureRequestsRequest](../../Models/Requests/GetEliteratureRequestsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetEliteratureRequestsResponse](../../Models/Requests/GetEliteratureRequestsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetLeadQualificationAnswers

Gets a list of answers to lead qualification questions for a given lead id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getLeadQualificationAnswers" method="get" path="/events/{id}/exhibitors/{exhibitorId}/leads/{leadId}/answers" -->
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

GetLeadQualificationAnswersRequest req = new GetLeadQualificationAnswersRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    LeadId = "cdd0d110-3a84-4bc5-a420-37c007716c73",
};

var res = await sdk.Leads.GetLeadQualificationAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetLeadQualificationAnswersRequest](../../Models/Requests/GetLeadQualificationAnswersRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetLeadQualificationAnswersResponse](../../Models/Requests/GetLeadQualificationAnswersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetLeads

Gets a paginated list of leads

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getLeads" method="get" path="/leads" -->
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

GetLeadsRequest req = new GetLeadsRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Filter = "deleted eq 'true' and event.id eq '{UUID}' and exhibitor.id eq '{UUID}'",
};

GetLeadsResponse? res = await sdk.Leads.GetLeadsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetLeadsRequest](../../Models/Requests/GetLeadsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetLeadsResponse](../../Models/Requests/GetLeadsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetLeadsPostFiltersData

Gets a paginated list of leads

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getLeadsPostFiltersData" method="post" path="/leads/filter" -->
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

GetLeadsPostFiltersDataRequest req = new GetLeadsPostFiltersDataRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Filter = new Filter() {
        FilterValue = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' AND attendee.id eq 'edf40757-3bc3-4a66-8180-93bff15b890b'",
    },
};

GetLeadsPostFiltersDataResponse? res = await sdk.Leads.GetLeadsPostFiltersDataAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetLeadsPostFiltersDataRequest](../../Models/Requests/GetLeadsPostFiltersDataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetLeadsPostFiltersDataResponse](../../Models/Requests/GetLeadsPostFiltersDataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
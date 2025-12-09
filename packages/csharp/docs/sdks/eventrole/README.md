# EventRole

## Overview

Event roles are event specific permission sets for your organization's users. Use these APIs to retrieve, create, update, and delete event role assignments to your organization's users.

### Available Operations

* [ListEventRoleAssignment](#listeventroleassignment) - List Event Role Assignments

## ListEventRoleAssignment

Gets a paginated list of event role assignments associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listEventRoleAssignment" method="get" path="/event-roles/assignments" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

ListEventRoleAssignmentRequest req = new ListEventRoleAssignmentRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Expand = new List<EventRoleExpand>() {
        EventRoleExpand.EventRole,
    },
    Filter = "event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and user.id eq '6807e044-993b-428c-aec8-7316f13c1b95'",
};

ListEventRoleAssignmentResponse? res = await sdk.EventRole.ListEventRoleAssignmentAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListEventRoleAssignmentRequest](../../Models/Requests/ListEventRoleAssignmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListEventRoleAssignmentResponse](../../Models/Requests/ListEventRoleAssignmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
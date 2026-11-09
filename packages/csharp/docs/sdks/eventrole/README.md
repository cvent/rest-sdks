# EventRole

## Overview

Event roles are event specific permission sets for your organization's users. Use these APIs to retrieve, create, update, and delete event role assignments to your organization's users.

### Available Operations

* [ListEventRoleAssignment](#listeventroleassignment) - List Event Role Assignments
* [CreateEventRoleAssignment](#createeventroleassignment) - Assign Event Role
* [DeleteEventRoleAssignment](#deleteeventroleassignment) - Unassign Event Role

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
using System;
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
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
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

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateEventRoleAssignment

Assigns an event role to an account user or a no-login user for an event, using the details in the request body.

The optional `notification` object applies to both `ACCOUNT_USER` and `NO_LOGIN_USER`. If you omit the object,
omit `sendNotification`, or set it to `false`, the service sends no notification and still returns `201`.
When `sendNotification` is `true`, the service queues a notification email to the assignee after the assignment succeeds.

For a `NO_LOGIN_USER`, the service finds the user by `id` when it is sent, or else by `email`:
- If `id` and `email` are both sent and the email does not match that user, the service returns `400`.
- If no no-login user in the account has the email, the service returns `404`.
- If more than one no-login user in the account has the email, the service returns `409`. Send `id` instead.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage: accountUserWithNotification

<!-- UsageSnippet language="csharp" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="accountUserWithNotification" -->
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

EventRoleAssignmentCreate req = new EventRoleAssignmentCreate() {
    Event = new EventRoleAssignmentCreateEvent() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    EventRole = new EventRoleAssignmentCreateEventRole() {
        Id = "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    User = EventRoleAssignmentUserUnion.CreateEventRoleAssignmentAccountUser(
        new EventRoleAssignmentAccountUser() {
            Type = EventRoleAssignmentAccountUserType.AccountUser,
            Id = "7c9e6679-7425-40de-944b-e07fc1f90ae7",
        }
    ),
    Notification = new EventRoleAssignmentNotification() {
        SendNotification = true,
    },
};

var res = await sdk.EventRole.CreateEventRoleAssignmentAsync(req);

// handle response
```
### Example Usage: accountUserWithoutNotification

<!-- UsageSnippet language="csharp" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="accountUserWithoutNotification" -->
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

EventRoleAssignmentCreate req = new EventRoleAssignmentCreate() {
    Event = new EventRoleAssignmentCreateEvent() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    EventRole = new EventRoleAssignmentCreateEventRole() {
        Id = "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    User = EventRoleAssignmentUserUnion.CreateEventRoleAssignmentAccountUser(
        new EventRoleAssignmentAccountUser() {
            Type = EventRoleAssignmentAccountUserType.AccountUser,
            Id = "7c9e6679-7425-40de-944b-e07fc1f90ae7",
        }
    ),
    Notification = new EventRoleAssignmentNotification() {
        SendNotification = false,
    },
};

var res = await sdk.EventRole.CreateEventRoleAssignmentAsync(req);

// handle response
```
### Example Usage: noLoginUserByEmail

<!-- UsageSnippet language="csharp" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="noLoginUserByEmail" -->
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

EventRoleAssignmentCreate req = new EventRoleAssignmentCreate() {
    Event = new EventRoleAssignmentCreateEvent() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    EventRole = new EventRoleAssignmentCreateEventRole() {
        Id = "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    User = EventRoleAssignmentUserUnion.CreateEventRoleAssignmentNoLoginUser(
        EventRoleAssignmentNoLoginUser.CreateIdentifiedByEmail(
            new IdentifiedByEmail() {
                Type = EventRoleAssignmentNoLoginUserType2.NoLoginUser,
                Email = "reviewer@example.com",
            }
        )
    ),
};

var res = await sdk.EventRole.CreateEventRoleAssignmentAsync(req);

// handle response
```
### Example Usage: noLoginUserByIdWithNotification

<!-- UsageSnippet language="csharp" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="noLoginUserByIdWithNotification" -->
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

EventRoleAssignmentCreate req = new EventRoleAssignmentCreate() {
    Event = new EventRoleAssignmentCreateEvent() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    EventRole = new EventRoleAssignmentCreateEventRole() {
        Id = "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    User = EventRoleAssignmentUserUnion.CreateEventRoleAssignmentNoLoginUser(
        EventRoleAssignmentNoLoginUser.CreateIdentifiedByID(
            new IdentifiedByID() {
                Type = EventRoleAssignmentNoLoginUserType1.NoLoginUser,
                Id = "9f1b2c3d-4e5f-4a6b-8c7d-0e1f2a3b4c5d",
                Email = "reviewer@example.com",
            }
        )
    ),
    Notification = new EventRoleAssignmentNotification() {
        SendNotification = true,
    },
};

var res = await sdk.EventRole.CreateEventRoleAssignmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [EventRoleAssignmentCreate](../../Models/Components/EventRoleAssignmentCreate.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateEventRoleAssignmentResponse](../../Models/Requests/CreateEventRoleAssignmentResponse.md)**

### Errors

| Error Type                                                                      | Status Code                                                                     | Content Type                                                                    |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12                                         | 400, 401, 403, 404, 409, 429                                                    | application/json                                                                |
| Cvent.SDK.Models.Errors.EventRoleAssignmentNotificationFailureResponseException | 503                                                                             | application/json                                                                |
| Cvent.SDK.Models.Errors.APIException                                            | 4XX, 5XX                                                                        | \*/\*                                                                           |

## DeleteEventRoleAssignment

Deletes an event role assignment identified by its composite assignment ID.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteEventRoleAssignment" method="delete" path="/event-roles/assignments/{assignmentId}" -->
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

DeleteEventRoleAssignmentRequest req = new DeleteEventRoleAssignmentRequest() {
    AssignmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::2b1a3bba-84b2-46f4-bddb-4b4a44442dcc::6807e044-993b-428c-aec8-7316f13c1b95",
};

var res = await sdk.EventRole.DeleteEventRoleAssignmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [DeleteEventRoleAssignmentRequest](../../Models/Requests/DeleteEventRoleAssignmentRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[DeleteEventRoleAssignmentResponse](../../Models/Requests/DeleteEventRoleAssignmentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |
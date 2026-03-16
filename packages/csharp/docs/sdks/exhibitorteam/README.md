# ExhibitorTeam

## Overview

* **Exhibitor Admin -** Exhibitor Admins are administrators that have access to the exhibitor portal. In the portal, they are able to complete pre-event tasks, manage their team, purchase LeadCapture (if applicable), and download leads. Use this API to get details for existing admins, create new admins, and update admin details.

* **Exhibitor Booth Staff -** Exhibitor booth staff is someone that manages the frontline of the exhibitor's booth onsite or virtually. Booth staff needs to be registered for the event in order to be associated with an exhibitor. Use this API to get details for the existing booth staff(s) for a specific exhibitor, associate new booth staff to the exhibitor, and delete the association of a booth staff if required.


### Available Operations

* [ListExhibitorAdmins](#listexhibitoradmins) - List Exhibitor Admins
* [PostExhibitorAdmin](#postexhibitoradmin) - Create Exhibitor Admin
* [GetExhibitorAdmin](#getexhibitoradmin) - Get Exhibitor Admin
* [UpdateExhibitorAdmin](#updateexhibitoradmin) - Update Exhibitor Admin
* [ListBoothStaff](#listboothstaff) - List Booth Staff
* [AssociateBoothStaff](#associateboothstaff) - Create Booth Staff
* [GetBoothStaff](#getboothstaff) - Get Booth Staff member
* [DeleteBoothStaff](#deleteboothstaff) - Delete Booth Staff member

## ListExhibitorAdmins

Retrieves a paginated list of exhibitor admins for an exhibitor within an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listExhibitorAdmins" method="get" path="/events/{id}/exhibitors/{exhibitorId}/admins" -->
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

ListExhibitorAdminsRequest req = new ListExhibitorAdminsRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListExhibitorAdminsResponse? res = await sdk.ExhibitorTeam.ListExhibitorAdminsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListExhibitorAdminsRequest](../../Models/Requests/ListExhibitorAdminsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListExhibitorAdminsResponse](../../Models/Requests/ListExhibitorAdminsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PostExhibitorAdmin

Creates an exhibitor admin for the given exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="postExhibitorAdmin" method="post" path="/events/{id}/exhibitors/{exhibitorId}/admins" -->
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

PostExhibitorAdminRequest req = new PostExhibitorAdminRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    ExhibitorAdminRequest = new ExhibitorAdminRequest() {
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
        FirstName = "John",
        LastName = "Eddy",
        Email = "john.eddy@test.com",
    },
};

var res = await sdk.ExhibitorTeam.PostExhibitorAdminAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PostExhibitorAdminRequest](../../Models/Requests/PostExhibitorAdminRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PostExhibitorAdminResponse](../../Models/Requests/PostExhibitorAdminResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetExhibitorAdmin

Gets the details of a single exhibitor admin, such as name or contact email.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getExhibitorAdmin" method="get" path="/events/{id}/exhibitors/{exhibitorId}/admins/{adminId}" -->
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

GetExhibitorAdminRequest req = new GetExhibitorAdminRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    AdminId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.ExhibitorTeam.GetExhibitorAdminAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetExhibitorAdminRequest](../../Models/Requests/GetExhibitorAdminRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetExhibitorAdminResponse](../../Models/Requests/GetExhibitorAdminResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExhibitorAdmin

Updates a single exhibitor admin.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExhibitorAdmin" method="put" path="/events/{id}/exhibitors/{exhibitorId}/admins/{adminId}" -->
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

UpdateExhibitorAdminRequest req = new UpdateExhibitorAdminRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    AdminId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ExhibitorAdminRequest = new ExhibitorAdminRequest() {
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
        FirstName = "John",
        LastName = "Eddy",
        Email = "john.eddy@test.com",
    },
};

var res = await sdk.ExhibitorTeam.UpdateExhibitorAdminAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateExhibitorAdminRequest](../../Models/Requests/UpdateExhibitorAdminRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateExhibitorAdminResponse](../../Models/Requests/UpdateExhibitorAdminResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListBoothStaff

Gets a list of booth staff members for a given event and exhibitor id.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listBoothStaff" method="get" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff" -->
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

ListBoothStaffRequest req = new ListBoothStaffRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListBoothStaffResponse? res = await sdk.ExhibitorTeam.ListBoothStaffAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListBoothStaffRequest](../../Models/Requests/ListBoothStaffRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListBoothStaffResponse](../../Models/Requests/ListBoothStaffResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AssociateBoothStaff

Associates a registered attendee as a booth staff to a specific exhibitor id within an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateBoothStaff" method="post" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff" -->
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

AssociateBoothStaffRequest req = new AssociateBoothStaffRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    BoothStaffRequest = new BoothStaffRequest() {
        Attendee = new AttendeeJson3() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Event = new EventJson6() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        Exhibitor = new ExhibitorJson() {
            Id = "4888db54-db22-11eb-8d19-0242ac130003",
        },
    },
};

var res = await sdk.ExhibitorTeam.AssociateBoothStaffAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AssociateBoothStaffRequest](../../Models/Requests/AssociateBoothStaffRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AssociateBoothStaffResponse](../../Models/Requests/AssociateBoothStaffResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBoothStaff

Retrieves the attendee id associated with an exhibitor booth staff member.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBoothStaff" method="get" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff/{boothstaffId}" -->
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

GetBoothStaffRequest req = new GetBoothStaffRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    BoothstaffId = "4e0f5152-515e-11ee-be56-0242ac120002",
};

var res = await sdk.ExhibitorTeam.GetBoothStaffAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetBoothStaffRequest](../../Models/Requests/GetBoothStaffRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetBoothStaffResponse](../../Models/Requests/GetBoothStaffResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteBoothStaff

Disassociate a single booth staff member from a single exhibitor.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteBoothStaff" method="delete" path="/events/{id}/exhibitors/{exhibitorId}/booth-staff/{boothstaffId}" -->
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

DeleteBoothStaffRequest req = new DeleteBoothStaffRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    ExhibitorId = "4888db54-db22-11eb-8d19-0242ac130003",
    BoothstaffId = "4e0f5152-515e-11ee-be56-0242ac120002",
};

var res = await sdk.ExhibitorTeam.DeleteBoothStaffAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [DeleteBoothStaffRequest](../../Models/Requests/DeleteBoothStaffRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[DeleteBoothStaffResponse](../../Models/Requests/DeleteBoothStaffResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
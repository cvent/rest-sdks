# Sessions

## Overview

A session is a presentation, discussion, or activity. Use these APIs to get information about your sessions and use the session ID to get further data within the event.

### Available Operations

* [GetSessionLocation](#getsessionlocation) - List Session Locations
* [AddSessionLocation](#addsessionlocation) - Add Session Location
* [CreateProgramItem](#createprogramitem) - Create Program Item
* [ListProgramItems](#listprogramitems) - List Program Items
* [FilterProgramItemDocuments](#filterprogramitemdocuments) - Filter Program Item Documents
* [ListProgramItemsPostFilters](#listprogramitemspostfilters) - List Program Items
* [UpdateProgramItem](#updateprogramitem) - Update Program Item
* [DeleteProgramItem](#deleteprogramitem) - Delete Session Program Item
* [~~GetProgramItemDocuments~~](#getprogramitemdocuments) - Get Program Item Documents :warning: **Deprecated**
* [RelateProgramItemToSessionDocument](#relateprogramitemtosessiondocument) - Add Program Item Document
* [GetProgramItemSessionDocument](#getprogramitemsessiondocument) - Get Program Item Document
* [DeleteProgramItemSessionDocument](#deleteprogramitemsessiondocument) - Delete Program Item Document
* [ListSessionsCategories](#listsessionscategories) - List Session Categories
* [CreateSessionCategory](#createsessioncategory) - Create Session Categories
* [GetSessionSegments](#getsessionsegments) - Get Session Segments
* [ListSessions](#listsessions) - List Sessions
* [CreateSession](#createsession) - Create Session
* [ListSessionsPostFilters](#listsessionspostfilters) - List Sessions
* [GetSessionById](#getsessionbyid) - Get Session
* [UpdateSession](#updatesession) - Update Session
* [DeleteSession](#deletesession) - Delete Session
* [UpdateSessionCustomFieldAnswers](#updatesessioncustomfieldanswers) - Update Custom Field Answers
* [ListSessionDocs](#listsessiondocs) - List Session Documents
* [GetSessionDoc](#getsessiondoc) - Get Session Document
* [AddSessionDoc](#addsessiondoc) - Add Document To Session
* [DeleteSessionDocument](#deletesessiondocument) - Delete Document from Session
* [ListSessionSpeakers](#listsessionspeakers) - List Session's Speakers
* [AddSpeakerToSession](#addspeakertosession) - Assign Speaker to Session
* [RemoveSpeakerFromSession](#removespeakerfromsession) - Delete Speaker From Session

## GetSessionLocation

Gets a paginated list of session locations.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSessionLocation" method="get" path="/events/{id}/session-locations" -->
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

GetSessionLocationRequest req = new GetSessionLocationRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

GetSessionLocationResponse? res = await sdk.Sessions.GetSessionLocationAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetSessionLocationRequest](../../Models/Requests/GetSessionLocationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetSessionLocationResponse](../../Models/Requests/GetSessionLocationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddSessionLocation

Add a session location to the specified event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addSessionLocation" method="post" path="/events/{id}/session-locations" -->
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

AddSessionLocationRequest req = new AddSessionLocationRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SessionLocation = new SessionLocationInput() {
        Code = "ConfA",
        Name = "Conference Room A",
    },
};

var res = await sdk.Sessions.AddSessionLocationAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [AddSessionLocationRequest](../../Models/Requests/AddSessionLocationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[AddSessionLocationResponse](../../Models/Requests/AddSessionLocationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateProgramItem

Create a session program item based on the details provided in the body of the request. A session program item is a specific part of a session's schedule, like a talk, workshop, or panel discussion. Max 25 program items per session.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createProgramItem" method="post" path="/program-items" -->
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

ProgramItemInput req = new ProgramItemInput() {
    Event = new EventLiteJson1() {
        Id = "78842378-5d83-11ee-8c99-0242ac120002",
    },
    Session = new SessionLiteJson1() {
        Id = "78842aee-5d83-11ee-8c99-0242ac120002",
    },
    Name = "Day 1 Program Item.",
    Duration = 30,
    Description = "This is a sample description of the day 1 program item.",
    RteDescription = "{\"format\":\"draftjs-nucleus\",\"version\":1,\"content\":{\"blocks\":[{\"key\":\"cubve\",\"text\":\"Program Item Description\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}}",
};

var res = await sdk.Sessions.CreateProgramItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ProgramItemInput](../../Models/Components/ProgramItemInput.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CreateProgramItemResponse](../../Models/Requests/CreateProgramItemResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListProgramItems

Gets a paginated list of session program items.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listProgramItems" method="get" path="/program-items" -->
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

ListProgramItemsRequest req = new ListProgramItemsRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "session.id in ('04ca6ae2-0dc3-487b-953e-86d6abbdf7d3', '34ca65e2-1dc3-487b-589e-839d8bbdf7d3')",
};

ListProgramItemsResponse? res = await sdk.Sessions.ListProgramItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListProgramItemsRequest](../../Models/Requests/ListProgramItemsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListProgramItemsResponse](../../Models/Requests/ListProgramItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## FilterProgramItemDocuments

Gets a paginated list of session program item documents using a filter in the body of the request.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="filterProgramItemDocuments" method="post" path="/program-items/docs/filter" -->
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

FilterProgramItemDocumentsRequest req = new FilterProgramItemDocumentsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "property eq 'value'",
    },
};

FilterProgramItemDocumentsResponse? res = await sdk.Sessions.FilterProgramItemDocumentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [FilterProgramItemDocumentsRequest](../../Models/Requests/FilterProgramItemDocumentsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[FilterProgramItemDocumentsResponse](../../Models/Requests/FilterProgramItemDocumentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListProgramItemsPostFilters

Gets a paginated list of session program items by sending a filter in the body of the request. This method will return the same data as <a href="#operation/listProgramItems">GET List Program Items</a> but allows for longer filters.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listProgramItemsPostFilters" method="post" path="/program-items/filter" -->
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

ListProgramItemsPostFiltersRequest req = new ListProgramItemsPostFiltersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Locale = "en-US",
    Filter = new Filter() {
        FilterValue = "property eq 'value'",
    },
};

ListProgramItemsPostFiltersResponse? res = await sdk.Sessions.ListProgramItemsPostFiltersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListProgramItemsPostFiltersRequest](../../Models/Requests/ListProgramItemsPostFiltersRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListProgramItemsPostFiltersResponse](../../Models/Requests/ListProgramItemsPostFiltersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateProgramItem

Updates the given session program item based on the details provided in the body of the request.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateProgramItem" method="put" path="/program-items/{programItemId}" -->
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

UpdateProgramItemRequest req = new UpdateProgramItemRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ProgramItemUpdateRequest = new ProgramItemUpdateRequest() {
        Id = "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
        Event = new EventLiteJson1() {
            Id = "78842378-5d83-11ee-8c99-0242ac120002",
        },
        Session = new SessionLiteJson1() {
            Id = "78842aee-5d83-11ee-8c99-0242ac120002",
        },
        Name = "Day 1 Program Item.",
        Duration = 30,
        Description = "This is a sample description of the day 1 program item.",
        RteDescription = "{\"format\":\"draftjs-nucleus\",\"version\":1,\"content\":{\"blocks\":[{\"key\":\"cubve\",\"text\":\"Program Item Description\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}}",
    },
};

var res = await sdk.Sessions.UpdateProgramItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateProgramItemRequest](../../Models/Requests/UpdateProgramItemRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateProgramItemResponse](../../Models/Requests/UpdateProgramItemResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteProgramItem

Delete the given session program item.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteProgramItem" method="delete" path="/program-items/{programItemId}" -->
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

DeleteProgramItemRequest req = new DeleteProgramItemRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.DeleteProgramItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteProgramItemRequest](../../Models/Requests/DeleteProgramItemRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteProgramItemResponse](../../Models/Requests/DeleteProgramItemResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ~~GetProgramItemDocuments~~

Returns a list of session documents for the specified program item ID.
**Note:** This endpoint is deprecated. use <a href="#operation/filterProgramItemDocuments">Filter Program Item Documents</a>

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getProgramItemDocuments" method="get" path="/program-items/{programItemId}/docs" -->
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

GetProgramItemDocumentsRequest req = new GetProgramItemDocumentsRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.GetProgramItemDocumentsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetProgramItemDocumentsRequest](../../Models/Requests/GetProgramItemDocumentsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetProgramItemDocumentsResponse](../../Models/Requests/GetProgramItemDocumentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## RelateProgramItemToSessionDocument

Creates a relationship between a session program item and a session document. Limit 10 session documents per session program item.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="relateProgramItemToSessionDocument" method="put" path="/program-items/{programItemId}/docs/{fileId}" -->
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

RelateProgramItemToSessionDocumentRequest req = new RelateProgramItemToSessionDocumentRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.RelateProgramItemToSessionDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [RelateProgramItemToSessionDocumentRequest](../../Models/Requests/RelateProgramItemToSessionDocumentRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |

### Response

**[RelateProgramItemToSessionDocumentResponse](../../Models/Requests/RelateProgramItemToSessionDocumentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetProgramItemSessionDocument

Returns a single program item to session document relationship for the provided IDs.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getProgramItemSessionDocument" method="get" path="/program-items/{programItemId}/docs/{fileId}" -->
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

GetProgramItemSessionDocumentRequest req = new GetProgramItemSessionDocumentRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.GetProgramItemSessionDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetProgramItemSessionDocumentRequest](../../Models/Requests/GetProgramItemSessionDocumentRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetProgramItemSessionDocumentResponse](../../Models/Requests/GetProgramItemSessionDocumentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteProgramItemSessionDocument

Deletes session program item to session document relationship based on the provided IDs.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteProgramItemSessionDocument" method="delete" path="/program-items/{programItemId}/docs/{fileId}" -->
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

DeleteProgramItemSessionDocumentRequest req = new DeleteProgramItemSessionDocumentRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.DeleteProgramItemSessionDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [DeleteProgramItemSessionDocumentRequest](../../Models/Requests/DeleteProgramItemSessionDocumentRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[DeleteProgramItemSessionDocumentResponse](../../Models/Requests/DeleteProgramItemSessionDocumentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionsCategories

Gets a paginated list of session categories.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionsCategories" method="get" path="/session-categories" -->
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

ListSessionsCategoriesRequest req = new ListSessionsCategoriesRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListSessionsCategoriesResponse? res = await sdk.Sessions.ListSessionsCategoriesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSessionsCategoriesRequest](../../Models/Requests/ListSessionsCategoriesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSessionsCategoriesResponse](../../Models/Requests/ListSessionsCategoriesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateSessionCategory

Create a session category.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createSessionCategory" method="post" path="/session-categories" -->
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

SessionCategoryInput req = new SessionCategoryInput() {
    Name = "Networking",
    Description = "During networking sessions, come meet fellow workers in your field.",
};

var res = await sdk.Sessions.CreateSessionCategoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [SessionCategoryInput](../../Models/Components/SessionCategoryInput.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CreateSessionCategoryResponse](../../Models/Requests/CreateSessionCategoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSessionSegments

Return a list of session and audience segment associations.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="GetSessionSegments" method="get" path="/session-segments" -->
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

GetSessionSegmentsRequest req = new GetSessionSegmentsRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "segment.id in ('04ca6ae2-0dc3-487b-953e-86d6abbdf7d3', '34ca65e2-1dc3-487b-589e-839d8bbdf7d3')",
};

GetSessionSegmentsResponse? res = await sdk.Sessions.GetSessionSegmentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetSessionSegmentsRequest](../../Models/Requests/GetSessionSegmentsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetSessionSegmentsResponse](../../Models/Requests/GetSessionSegmentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessions

Gets a paginated list of sessions.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessions" method="get" path="/sessions" -->
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

ListSessionsRequest req = new ListSessionsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "start:DESC,order:ASC,title:ASC",
    Locale = "en-US",
    Filter = "status eq 'active' or status eq 'closed' or event.id eq 'abc' or customField.{uuid of custom field} in ('abc','def')",
};

ListSessionsResponse? res = await sdk.Sessions.ListSessionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListSessionsRequest](../../Models/Requests/ListSessionsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListSessionsResponse](../../Models/Requests/ListSessionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateSession

Creates a single session based on the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createSession" method="post" path="/sessions" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
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

SessionInput req = new SessionInput() {
    Event = new UuidJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    Title = "Day 1 Keynote Session",
    Code = "R5NP4NJYB3D",
    Category = new IdNameJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        Name = "Sample Object name",
    },
    Type = new SessionLookup() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        Code = "MU",
        Name = "Meet up",
    },
    Location = new LocationJson2Input() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    Description = "Keynote session to kick off the event. The dynamic and energetic Dr. Smith will be speaking about the industry.",
    Start = System.DateTime.Parse("2020-02-03T13:00:00.000Z").ToUniversalTime(),
    End = System.DateTime.Parse("2020-02-07T17:00:00.000Z").ToUniversalTime(),
    Status = SessionStatusJson.Active,
    AutomaticallyOpensOn = DateOnly.Parse("2022-08-01"),
    AutomaticallyClosesOn = DateOnly.Parse("2022-08-12"),
    EnableWaitlist = false,
    WaitlistCapacity = 100,
    EnableWaitlistVirtual = true,
    Capacity = 150,
    CapacityUnlimited = false,
    CapacityVirtual = 150,
    VirtualCapacityUnlimited = false,
    WaitlistCapacityVirtual = 150,
    Featured = true,
    Group = "b0cd3bac-0565-4593-be6e-5333753a6c25",
    AdmissionItems = new List<string>() {
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    OpenForRegistration = false,
    OpenForAttendeeHub = true,
    RegistrationTypes = new List<string>() {
        "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    PresentationType = "Power Point",
    DataTagCode = "Optional Session",
    Order = 1,
    IncludedSession = true,
    Relevance = 2.3D,
};

var res = await sdk.Sessions.CreateSessionAsync(req);

// handle response
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [SessionInput](../../Models/Components/SessionInput.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreateSessionResponse](../../Models/Requests/CreateSessionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionsPostFilters

Gets a paginated list of sessions by sending a filter in the request's body. This method returns the same data as <a href="#operation/listSessions">GET List Sessions</a> but allows longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionsPostFilters" method="post" path="/sessions/filter" -->
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

ListSessionsPostFiltersRequest req = new ListSessionsPostFiltersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Locale = "en-US",
    Filter = new Filter() {
        FilterValue = "property eq 'value'",
    },
};

ListSessionsPostFiltersResponse? res = await sdk.Sessions.ListSessionsPostFiltersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSessionsPostFiltersRequest](../../Models/Requests/ListSessionsPostFiltersRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSessionsPostFiltersResponse](../../Models/Requests/ListSessionsPostFiltersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSessionById

Gets a single session based on the provided session ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSessionById" method="get" path="/sessions/{id}" -->
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

GetSessionByIdRequest req = new GetSessionByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.GetSessionByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetSessionByIdRequest](../../Models/Requests/GetSessionByIdRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetSessionByIdResponse](../../Models/Requests/GetSessionByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateSession

Updates the given session with the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateSession" method="put" path="/sessions/{id}" -->
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

UpdateSessionRequest req = new UpdateSessionRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SessionUpdate = new SessionUpdate() {
        Event = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Title = "Day 1 Keynote Session",
        Code = "R5NP4NJYB3D",
        Category = new IdNameJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            Name = "Sample Object name",
        },
        Type = new SessionUpdateLookup() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            Code = "MU",
            Name = "Meet up",
        },
        Location = new LocationJson2Input() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Description = "Keynote session to kick off the event. The dynamic and energetic Dr. Smith will be speaking about the industry.",
        Start = System.DateTime.Parse("2020-02-03T13:00:00.000Z").ToUniversalTime(),
        End = System.DateTime.Parse("2020-02-07T17:00:00.000Z").ToUniversalTime(),
        Status = SessionStatusJson.Active,
        AutomaticallyOpensOn = DateOnly.Parse("2022-08-01"),
        AutomaticallyClosesOn = DateOnly.Parse("2022-08-12"),
        EnableWaitlist = false,
        WaitlistCapacity = 100,
        EnableWaitlistVirtual = true,
        Capacity = 150,
        CapacityUnlimited = false,
        CapacityVirtual = 150,
        VirtualCapacityUnlimited = false,
        WaitlistCapacityVirtual = 150,
        Featured = true,
        Group = "b0cd3bac-0565-4593-be6e-5333753a6c25",
        AdmissionItems = new List<string>() {
            "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        OpenForRegistration = false,
        OpenForAttendeeHub = true,
        RegistrationTypes = new List<string>() {
            "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        PresentationType = "Power Point",
        DataTagCode = "Optional Session",
        Order = 1,
    },
};

var res = await sdk.Sessions.UpdateSessionAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateSessionRequest](../../Models/Requests/UpdateSessionRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateSessionResponse](../../Models/Requests/UpdateSessionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSession

Deletes a session based on the given session ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSession" method="delete" path="/sessions/{id}" -->
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

DeleteSessionRequest req = new DeleteSessionRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.DeleteSessionAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteSessionRequest](../../Models/Requests/DeleteSessionRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteSessionResponse](../../Models/Requests/DeleteSessionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateSessionCustomFieldAnswers

Updates custom field answers for a single custom field and single session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateSessionCustomFieldAnswers" method="put" path="/sessions/{id}/custom-fields/{customFieldId}/answers" -->
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

UpdateSessionCustomFieldAnswersRequest req = new UpdateSessionCustomFieldAnswersRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomField1 = new CustomField1Input() {
        Id = "5bcc98a1-7899-448a-a52d-4fcaf9af774f",
        Value = new List<string>() {
            "Choice C",
            "Choice A",
        },
        Type = CustomField1CustomFieldType.General,
    },
};

var res = await sdk.Sessions.UpdateSessionCustomFieldAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [UpdateSessionCustomFieldAnswersRequest](../../Models/Requests/UpdateSessionCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[UpdateSessionCustomFieldAnswersResponse](../../Models/Requests/UpdateSessionCustomFieldAnswersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionDocs

Gets a paginated list of document URLs for a single session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionDocs" method="get" path="/sessions/{id}/docs" -->
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

ListSessionDocsRequest req = new ListSessionDocsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "file.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

ListSessionDocsResponse? res = await sdk.Sessions.ListSessionDocsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListSessionDocsRequest](../../Models/Requests/ListSessionDocsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListSessionDocsResponse](../../Models/Requests/ListSessionDocsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSessionDoc

Get a specific document that is assigned to a specific session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSessionDoc" method="get" path="/sessions/{id}/docs/{fileId}" -->
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

GetSessionDocRequest req = new GetSessionDocRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.GetSessionDocAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetSessionDocRequest](../../Models/Requests/GetSessionDocRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetSessionDocResponse](../../Models/Requests/GetSessionDocResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddSessionDoc

Associates a given document to a session. Documents must be
<a href="#operation/uploadFile">uploaded</a> before you can associate
them.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addSessionDoc" method="put" path="/sessions/{id}/docs/{fileId}" -->
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

AddSessionDocRequest req = new AddSessionDocRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.AddSessionDocAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AddSessionDocRequest](../../Models/Requests/AddSessionDocRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[AddSessionDocResponse](../../Models/Requests/AddSessionDocResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSessionDocument

Disassociates a given document from a session. Document IDs are provided after <a href="#operation/uploadFile">file upload</a>.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSessionDocument" method="delete" path="/sessions/{id}/docs/{fileId}" -->
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

DeleteSessionDocumentRequest req = new DeleteSessionDocumentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.DeleteSessionDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteSessionDocumentRequest](../../Models/Requests/DeleteSessionDocumentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteSessionDocumentResponse](../../Models/Requests/DeleteSessionDocumentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionSpeakers

Get a paginated list of speakers and categories assigned to the provided session ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionSpeakers" method="get" path="/sessions/{id}/speakers" -->
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

ListSessionSpeakersRequest req = new ListSessionSpeakersRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListSessionSpeakersResponse? res = await sdk.Sessions.ListSessionSpeakersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListSessionSpeakersRequest](../../Models/Requests/ListSessionSpeakersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListSessionSpeakersResponse](../../Models/Requests/ListSessionSpeakersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddSpeakerToSession

Assign a given speaker to a given session based on their IDs.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addSpeakerToSession" method="put" path="/sessions/{id}/speakers/{speakerId}" -->
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

AddSpeakerToSessionRequest req = new AddSpeakerToSessionRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SpeakerId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SessionSpeakerAssignment = new SessionSpeakerAssignment() {
        SpeakerCategory = new CategoryIdJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Order = 1,
    },
};

var res = await sdk.Sessions.AddSpeakerToSessionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [AddSpeakerToSessionRequest](../../Models/Requests/AddSpeakerToSessionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[AddSpeakerToSessionResponse](../../Models/Requests/AddSpeakerToSessionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## RemoveSpeakerFromSession

Deletes a speaker from a session.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="removeSpeakerFromSession" method="delete" path="/sessions/{id}/speakers/{speakerId}" -->
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

RemoveSpeakerFromSessionRequest req = new RemoveSpeakerFromSessionRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SpeakerId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Sessions.RemoveSpeakerFromSessionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RemoveSpeakerFromSessionRequest](../../Models/Requests/RemoveSpeakerFromSessionRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RemoveSpeakerFromSessionResponse](../../Models/Requests/RemoveSpeakerFromSessionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
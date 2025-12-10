# Speakers

## Overview

Speakers are individuals presenting at your event's session(s). Use Speaker APIs to read existing speaker data, create new speakers or update existing speakers in your events.

### Available Operations

* [GetSessionProgramSpeakers](#getsessionprogramspeakers) - Get Session Program Speakers
* [ListSessionProgramSpeakersPostFilters](#listsessionprogramspeakerspostfilters) - List Session Program Speakers
* [CreateSessionProgramSpeaker](#createsessionprogramspeaker) - Add Session Program Speaker
* [GetSessionProgramSpeaker](#getsessionprogramspeaker) - Get Session Program Speaker
* [DeleteSessionProgramSpeaker](#deletesessionprogramspeaker) - Delete Session Program Speaker
* [ListSpeakersCategories](#listspeakerscategories) - List Speakers Categories
* [AddSpeakerCategory](#addspeakercategory) - Create Speaker Category
* [ListSpeakers](#listspeakers) - List Speakers
* [CreateSpeaker](#createspeaker) - Create Speaker
* [ListSpeakersPostFilter](#listspeakerspostfilter) - List Speakers
* [UpdateSpeaker](#updatespeaker) - Update Speaker
* [DeleteSpeaker](#deletespeaker) - Delete Speaker
* [ListSpeakerDocs](#listspeakerdocs) - List Speaker's Documents
* [GetSpeakerDoc](#getspeakerdoc) - Get a document for a speaker
* [AddSpeakerDoc](#addspeakerdoc) - Add Document To Speaker
* [DeleteSpeakerDocument](#deletespeakerdocument) - Delete Document From Speaker
* [DeleteSpeakerProfileImage](#deletespeakerprofileimage) - Delete Speaker Profile Picture
* [AssignSpeakerProfileImage](#assignspeakerprofileimage) - Assign Speaker Profile Picture
* [ListSpeakerSessions](#listspeakersessions) - List Speaker's Sessions

## GetSessionProgramSpeakers

Returns a paginated list of session program item and speaker associations.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSessionProgramSpeakers" method="get" path="/program-items/speakers" -->
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

GetSessionProgramSpeakersRequest req = new GetSessionProgramSpeakersRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "session.id in ('04ca6ae2-0dc3-487b-953e-86d6abbdf7d3', '34ca65e2-1dc3-487b-589e-839d8bbdf7d3')",
};

GetSessionProgramSpeakersResponse? res = await sdk.Speakers.GetSessionProgramSpeakersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetSessionProgramSpeakersRequest](../../Models/Requests/GetSessionProgramSpeakersRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetSessionProgramSpeakersResponse](../../Models/Requests/GetSessionProgramSpeakersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionProgramSpeakersPostFilters

Gets a paginated list of session program speaker by providing filters in the body of the request. This method returns the same data as <a href="#operation/getSessionProgramSpeakers">GET Session Program Speakers</a> but allows for longer filters.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionProgramSpeakersPostFilters" method="post" path="/program-items/speakers/filter" -->
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

ListSessionProgramSpeakersPostFiltersRequest req = new ListSessionProgramSpeakersPostFiltersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Locale = "en-US",
    Filter = new Filter() {
        FilterValue = "property eq 'value'",
    },
};

ListSessionProgramSpeakersPostFiltersResponse? res = await sdk.Speakers.ListSessionProgramSpeakersPostFiltersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                             | [ListSessionProgramSpeakersPostFiltersRequest](../../Models/Requests/ListSessionProgramSpeakersPostFiltersRequest.md) | :heavy_check_mark:                                                                                                    | The request object to use for the request.                                                                            |

### Response

**[ListSessionProgramSpeakersPostFiltersResponse](../../Models/Requests/ListSessionProgramSpeakersPostFiltersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateSessionProgramSpeaker

Creates a relationship between a session program item and a speaker. Limit 10 speakers per session program item.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createSessionProgramSpeaker" method="put" path="/program-items/{programItemId}/speakers/{id}" -->
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

CreateSessionProgramSpeakerRequest req = new CreateSessionProgramSpeakerRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.CreateSessionProgramSpeakerAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [CreateSessionProgramSpeakerRequest](../../Models/Requests/CreateSessionProgramSpeakerRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[CreateSessionProgramSpeakerResponse](../../Models/Requests/CreateSessionProgramSpeakerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSessionProgramSpeaker

Returns a session program speaker relationship.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSessionProgramSpeaker" method="get" path="/program-items/{programItemId}/speakers/{id}" -->
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

GetSessionProgramSpeakerRequest req = new GetSessionProgramSpeakerRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.GetSessionProgramSpeakerAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetSessionProgramSpeakerRequest](../../Models/Requests/GetSessionProgramSpeakerRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetSessionProgramSpeakerResponse](../../Models/Requests/GetSessionProgramSpeakerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSessionProgramSpeaker

Deletes session program item to speaker relationship.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSessionProgramSpeaker" method="delete" path="/program-items/{programItemId}/speakers/{id}" -->
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

DeleteSessionProgramSpeakerRequest req = new DeleteSessionProgramSpeakerRequest() {
    ProgramItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.DeleteSessionProgramSpeakerAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [DeleteSessionProgramSpeakerRequest](../../Models/Requests/DeleteSessionProgramSpeakerRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[DeleteSessionProgramSpeakerResponse](../../Models/Requests/DeleteSessionProgramSpeakerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSpeakersCategories

Gets a paginated list of speakers categories.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSpeakersCategories" method="get" path="/speaker-categories" -->
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

ListSpeakersCategoriesRequest req = new ListSpeakersCategoriesRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "active eq 'true'",
};

ListSpeakersCategoriesResponse? res = await sdk.Speakers.ListSpeakersCategoriesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSpeakersCategoriesRequest](../../Models/Requests/ListSpeakersCategoriesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSpeakersCategoriesResponse](../../Models/Requests/ListSpeakersCategoriesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddSpeakerCategory

Create a new speaker category

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addSpeakerCategory" method="post" path="/speaker-categories" -->
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

SpeakerCategory req = new SpeakerCategory() {
    Name = "Presenters",
};

var res = await sdk.Speakers.AddSpeakerCategoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [SpeakerCategory](../../Models/Components/SpeakerCategory.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[AddSpeakerCategoryResponse](../../Models/Requests/AddSpeakerCategoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSpeakers

Gets a paginated list of speakers.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSpeakers" method="get" path="/speakers" -->
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

ListSpeakersRequest req = new ListSpeakersRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "lastName:DESC,company:ASC",
    Locale = "en-US",
    Filter = "event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

ListSpeakersResponse? res = await sdk.Speakers.ListSpeakersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListSpeakersRequest](../../Models/Requests/ListSpeakersRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListSpeakersResponse](../../Models/Requests/ListSpeakersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateSpeaker

Create a single speaker based on the values provided.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createSpeaker" method="post" path="/speakers" -->
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

Speaker req = new Speaker() {
    Event = new SpeakerEvent() {},
    FirstName = "Barbra",
    LastName = "Smith",
    Code = "sbarbra",
    Email = "barbrasmith@cvent.com",
    Prefix = "Dr.",
    Designation = "PhD",
    Company = "Cvent",
    Title = "Lead Engineer",
    Category = new CategoryIdNameJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        Name = "Presenters",
    },
    Links = new ContactLinksJsonInput() {
        TwitterUrl = new LinkJson() {
            Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        FacebookUrl = new LinkJson() {
            Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
        LinkedInUrl = new LinkJson() {
            Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
        },
    },
    Visibility = false,
    Biography = "Presentation and Speaking voice expert, Barbara is a highly regarded coach and facilitator",
    InternalNote = "Barbara is multilingual",
    Relevance = 2.3D,
};

var res = await sdk.Speakers.CreateSpeakerAsync(req);

// handle response
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [Speaker](../../Models/Components/Speaker.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[CreateSpeakerResponse](../../Models/Requests/CreateSpeakerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSpeakersPostFilter

Get a paginated list of speakers by sending a filter in the body of the request. This method will return the same data as GET List Speakers but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSpeakersPostFilter" method="post" path="/speakers/filter" -->
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

ListSpeakersPostFilterRequest req = new ListSpeakersPostFilterRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "lastName:DESC,company:ASC",
    Locale = "en-US",
    Filter = new Filter() {
        FilterValue = "id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
    },
};

ListSpeakersPostFilterResponse? res = await sdk.Speakers.ListSpeakersPostFilterAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSpeakersPostFilterRequest](../../Models/Requests/ListSpeakersPostFilterRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSpeakersPostFilterResponse](../../Models/Requests/ListSpeakersPostFilterResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateSpeaker

Updates a particular speaker based on the given speaker ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateSpeaker" method="put" path="/speakers/{id}" -->
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

UpdateSpeakerRequest req = new UpdateSpeakerRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ExistingSpeaker = new ExistingSpeakerInput() {
        Event = new ExistingSpeakerEvent() {},
        FirstName = "Barbra",
        LastName = "Smith",
        Code = "sbarbra",
        Email = "barbrasmith@cvent.com",
        Prefix = "Dr.",
        Designation = "PhD",
        Company = "Cvent",
        Title = "Lead Engineer",
        Category = new CategoryIdNameJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            Name = "Presenters",
        },
        Links = new ContactLinksJsonInput() {
            TwitterUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            FacebookUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
            LinkedInUrl = new LinkJson() {
                Href = "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
            },
        },
        Visibility = false,
        Biography = "Presentation and Speaking voice expert, Barbara is a highly regarded coach and facilitator",
        InternalNote = "Barbara is multilingual",
        Relevance = 2.3D,
    },
};

var res = await sdk.Speakers.UpdateSpeakerAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateSpeakerRequest](../../Models/Requests/UpdateSpeakerRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateSpeakerResponse](../../Models/Requests/UpdateSpeakerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSpeaker

Deletes a particular speaker based on the given speaker ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSpeaker" method="delete" path="/speakers/{id}" -->
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

DeleteSpeakerRequest req = new DeleteSpeakerRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.DeleteSpeakerAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteSpeakerRequest](../../Models/Requests/DeleteSpeakerRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteSpeakerResponse](../../Models/Requests/DeleteSpeakerResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSpeakerDocs

Gets a paginated list of document URLs for a single speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSpeakerDocs" method="get" path="/speakers/{id}/docs" -->
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

ListSpeakerDocsRequest req = new ListSpeakerDocsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "file.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

ListSpeakerDocsResponse? res = await sdk.Speakers.ListSpeakerDocsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListSpeakerDocsRequest](../../Models/Requests/ListSpeakerDocsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListSpeakerDocsResponse](../../Models/Requests/ListSpeakerDocsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetSpeakerDoc

Get a specific document that is assigned to a specific speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getSpeakerDoc" method="get" path="/speakers/{id}/docs/{fileId}" -->
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

GetSpeakerDocRequest req = new GetSpeakerDocRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.GetSpeakerDocAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetSpeakerDocRequest](../../Models/Requests/GetSpeakerDocRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetSpeakerDocResponse](../../Models/Requests/GetSpeakerDocResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AddSpeakerDoc

Add a single document to a speaker with a UUID provided by <a href="#operation/uploadFile">file upload</a>.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="addSpeakerDoc" method="put" path="/speakers/{id}/docs/{fileId}" -->
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

AddSpeakerDocRequest req = new AddSpeakerDocRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.AddSpeakerDocAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AddSpeakerDocRequest](../../Models/Requests/AddSpeakerDocRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[AddSpeakerDocResponse](../../Models/Requests/AddSpeakerDocResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSpeakerDocument

Use to delete a document from a speaker with a UUID provided by <a href="#operation/uploadFile">file upload</a>.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSpeakerDocument" method="delete" path="/speakers/{id}/docs/{fileId}" -->
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

DeleteSpeakerDocumentRequest req = new DeleteSpeakerDocumentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    FileId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.DeleteSpeakerDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteSpeakerDocumentRequest](../../Models/Requests/DeleteSpeakerDocumentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteSpeakerDocumentResponse](../../Models/Requests/DeleteSpeakerDocumentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSpeakerProfileImage

Deletes the profile picture of the given speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSpeakerProfileImage" method="delete" path="/speakers/{id}/profile-images" -->
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

DeleteSpeakerProfileImageRequest req = new DeleteSpeakerProfileImageRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Speakers.DeleteSpeakerProfileImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [DeleteSpeakerProfileImageRequest](../../Models/Requests/DeleteSpeakerProfileImageRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[DeleteSpeakerProfileImageResponse](../../Models/Requests/DeleteSpeakerProfileImageResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AssignSpeakerProfileImage

Assign a profile picture to a speaker with a file UUID from <a href="#operation/uploadFile">file upload</a> endpoint. This will replace the current profile picture if one is assigned.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="assignSpeakerProfileImage" method="put" path="/speakers/{id}/profile-images" -->
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

AssignSpeakerProfileImageRequest req = new AssignSpeakerProfileImageRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    SpeakerFile = new SpeakerFileInput() {
        File = new SpeakerFileFile() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
    },
};

var res = await sdk.Speakers.AssignSpeakerProfileImageAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [AssignSpeakerProfileImageRequest](../../Models/Requests/AssignSpeakerProfileImageRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[AssignSpeakerProfileImageResponse](../../Models/Requests/AssignSpeakerProfileImageResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSpeakerSessions

Gets a paginated list of sessions assigned to a speaker.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSpeakerSessions" method="get" path="/speakers/{id}/sessions" -->
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

ListSpeakerSessionsRequest req = new ListSpeakerSessionsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListSpeakerSessionsResponse? res = await sdk.Speakers.ListSpeakerSessionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListSpeakerSessionsRequest](../../Models/Requests/ListSpeakerSessionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListSpeakerSessionsResponse](../../Models/Requests/ListSpeakerSessionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
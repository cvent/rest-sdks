# Webcasts

## Overview

Webcasts are virtual or livestreaming components of your Cvent events. Use these APIs to integrate your virtual events from outside sources into your Cvent workflows, create and delete webcasts from within Cvent, and retrieve and update webcast details.

### Available Operations

* [CreateWebcast](#createwebcast) - Create Webcast
* [ListWebcasts](#listwebcasts) - List Webcasts
* [ListAttendeeLinks](#listattendeelinks) - List Attendee Links
* [ListPlayers](#listplayers) - List Players
* [GetWebcastById](#getwebcastbyid) - Get Webcast
* [DeleteWebcast](#deletewebcast) - Delete Webcast
* [UpdateWebcast](#updatewebcast) - Update Webcast
* [CreateAttendeeLinks](#createattendeelinks) - Create Attendee Link
* [UpdateAttendeeLinks](#updateattendeelinks) - Update Attendee Link
* [~~ListWebcastAttendeeLinks~~](#listwebcastattendeelinks) - List Attendee Links :warning: **Deprecated**
* [DeleteAttendeeLink](#deleteattendeelink) - Delete Attendee Link

## CreateWebcast

Used to create a new webcast for a specific event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createWebcast" method="post" path="/webcasts" -->
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

Webcast req = new Webcast() {
    Event = new UuidJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    Session = new UuidJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    Appointment = new UuidJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    Exhibitor = new UuidJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    Format = FormatJson.PreRecorded,
    Type = WebcastTypeJson.Meeting,
    Provider = WebcastProviderJson.Zoom,
    Status = WebcastStatusJson.Started,
    PlayerType = PlayerTypeJson.CventVideoPlayer,
    SimulatedLive = false,
    RecordLiveStream = false,
    OnDemandVideo = false,
    SourceId = "kBBBAAcccdddd8U==",
    Title = "Webinar Connect Event",
    MeetingId = "123ERt",
    Links = new WebcastLinksJson() {
        Join = new WebcastLinkJson() {
            Href = "https://cvent.zoom.us/j/7566652259",
            Code = "1456ZS78",
        },
        Speaker = new WebcastLinkJson() {
            Href = "https://cvent.zoom.us/j/7566652259",
            Code = "1456ZS78",
        },
        Host = new WebcastHostLinkJson() {
            Href = "https://cvent.zoom.us/j/7566652259",
            Code = "1456ZS78",
            Key = "abcd1234",
        },
        Recording = new WebcastLinkJson() {
            Href = "https://cvent.zoom.us/j/7566652259",
            Code = "1456ZS78",
        },
    },
    Details = "This is free of cost event",
};

var res = await sdk.Webcasts.CreateWebcastAsync(req);

// handle response
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `request`                                     | [Webcast](../../Models/Components/Webcast.md) | :heavy_check_mark:                            | The request object to use for the request.    |

### Response

**[CreateWebcastResponse](../../Models/Requests/CreateWebcastResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 409, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListWebcasts

Gets a paginated list of webcasts associated with your event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listWebcasts" method="get" path="/webcasts" -->
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

ListWebcastsRequest req = new ListWebcastsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and sourceId ne 'sampleWebcastSystemId'",
};

ListWebcastsResponse? res = await sdk.Webcasts.ListWebcastsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListWebcastsRequest](../../Models/Requests/ListWebcastsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListWebcastsResponse](../../Models/Requests/ListWebcastsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAttendeeLinks

Gets a paginated list of attendee links.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAttendeeLinks" method="get" path="/webcasts/attendee-links" -->
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

ListAttendeeLinksRequest req = new ListAttendeeLinksRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and event.id eq '55ca6645-0dc3-487b-953e-86d6abbdf7d3'",
};

ListAttendeeLinksResponse? res = await sdk.Webcasts.ListAttendeeLinksAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAttendeeLinksRequest](../../Models/Requests/ListAttendeeLinksRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAttendeeLinksResponse](../../Models/Requests/ListAttendeeLinksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListPlayers

Gets a paginated list of player details associated with webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listPlayers" method="get" path="/webcasts/players" -->
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

ListPlayersRequest req = new ListPlayersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "webcast.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

ListPlayersResponse? res = await sdk.Webcasts.ListPlayersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListPlayersRequest](../../Models/Requests/ListPlayersRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListPlayersResponse](../../Models/Requests/ListPlayersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetWebcastById

Retrieve a single webcast details by ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getWebcastById" method="get" path="/webcasts/{id}" -->
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

GetWebcastByIdRequest req = new GetWebcastByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Webcasts.GetWebcastByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetWebcastByIdRequest](../../Models/Requests/GetWebcastByIdRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetWebcastByIdResponse](../../Models/Requests/GetWebcastByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteWebcast

Delete an existing webcast by ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteWebcast" method="delete" path="/webcasts/{id}" -->
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

DeleteWebcastRequest req = new DeleteWebcastRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Webcasts.DeleteWebcastAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteWebcastRequest](../../Models/Requests/DeleteWebcastRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteWebcastResponse](../../Models/Requests/DeleteWebcastResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateWebcast

Update info for an existing webcast within a Cvent event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateWebcast" method="put" path="/webcasts/{id}" -->
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

UpdateWebcastRequest req = new UpdateWebcastRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ExistingWebcast = new ExistingWebcastInput() {
        Event = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Session = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Appointment = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Exhibitor = new UuidJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Format = FormatJson.PreRecorded,
        Type = WebcastTypeJson.Meeting,
        Provider = WebcastProviderJson.Zoom,
        Status = WebcastStatusJson.Started,
        PlayerType = PlayerTypeJson.CventVideoPlayer,
        SimulatedLive = false,
        RecordLiveStream = false,
        OnDemandVideo = false,
        SourceId = "kBBBAAcccdddd8U==",
        Title = "Webinar Connect Event",
        MeetingId = "123ERt",
        Links = new WebcastLinksJson() {
            Join = new WebcastLinkJson() {
                Href = "https://cvent.zoom.us/j/7566652259",
                Code = "1456ZS78",
            },
            Speaker = new WebcastLinkJson() {
                Href = "https://cvent.zoom.us/j/7566652259",
                Code = "1456ZS78",
            },
            Host = new WebcastHostLinkJson() {
                Href = "https://cvent.zoom.us/j/7566652259",
                Code = "1456ZS78",
                Key = "abcd1234",
            },
            Recording = new WebcastLinkJson() {
                Href = "https://cvent.zoom.us/j/7566652259",
                Code = "1456ZS78",
            },
        },
        Details = "This is free of cost event",
    },
};

var res = await sdk.Webcasts.UpdateWebcastAsync(req);

// handle response
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [UpdateWebcastRequest](../../Models/Requests/UpdateWebcastRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[UpdateWebcastResponse](../../Models/Requests/UpdateWebcastResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 409, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateAttendeeLinks

Create attendee links in bulk for a given webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createAttendeeLinks" method="post" path="/webcasts/{id}/attendee-links" -->
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

CreateAttendeeLinksRequest req = new CreateAttendeeLinksRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RequestBody = new List<ZeroInput>() {},
};

var res = await sdk.Webcasts.CreateAttendeeLinksAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateAttendeeLinksRequest](../../Models/Requests/CreateAttendeeLinksRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateAttendeeLinksResponse](../../Models/Requests/CreateAttendeeLinksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateAttendeeLinks

Update data for existing attendee links in bulk for a given webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateAttendeeLinks" method="put" path="/webcasts/{id}/attendee-links" -->
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

UpdateAttendeeLinksRequest req = new UpdateAttendeeLinksRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RequestBody = new List<ExistingAttendeeLinkInput>() {},
};

var res = await sdk.Webcasts.UpdateAttendeeLinksAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateAttendeeLinksRequest](../../Models/Requests/UpdateAttendeeLinksRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateAttendeeLinksResponse](../../Models/Requests/UpdateAttendeeLinksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ~~ListWebcastAttendeeLinks~~

Gets a paginated list of attendee links in a webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listWebcastAttendeeLinks" method="get" path="/webcasts/{id}/attendee-links" -->
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

ListWebcastAttendeeLinksRequest req = new ListWebcastAttendeeLinksRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'",
};

ListWebcastAttendeeLinksResponse? res = await sdk.Webcasts.ListWebcastAttendeeLinksAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListWebcastAttendeeLinksRequest](../../Models/Requests/ListWebcastAttendeeLinksRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListWebcastAttendeeLinksResponse](../../Models/Requests/ListWebcastAttendeeLinksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteAttendeeLink

Delete attendee links for webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteAttendeeLink" method="delete" path="/webcasts/{id}/attendee-links/{attendeeLinkId}" -->
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

DeleteAttendeeLinkRequest req = new DeleteAttendeeLinkRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeLinkId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Webcasts.DeleteAttendeeLinkAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteAttendeeLinkRequest](../../Models/Requests/DeleteAttendeeLinkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteAttendeeLinkResponse](../../Models/Requests/DeleteAttendeeLinkResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
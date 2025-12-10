# Video

## Overview

Videos can be added to Cvent events with renditions at various resolutions, audio files, reactions tracks, and text tracks. Attendee viewership is tracked to get insight into durations, devices used and venue where the video is watched. Use these APIs to view and manage videos, related text tracks, and audio files. Use these APIs also to get insight into video viewership.

### Available Operations

* [ListVideos](#listvideos) - List Videos
* [GetVideoViews](#getvideoviews) - List Video Views
* [ListAudioTracks](#listaudiotracks) - List Audio Tracks
* [ListVideoRenditions](#listvideorenditions) - List Video Renditions
* [CreateTextTrack](#createtexttrack) - Create Text Track
* [ListVideoTextTracks](#listvideotexttracks) - List Text Tracks
* [UpdateTextTrack](#updatetexttrack) - Update Text Track

## ListVideos

Gets a paginated list of videos associated with your account or event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listVideos" method="get" path="/videos" -->
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

ListVideosRequest req = new ListVideosRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "events eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and source.id ne 'sampleWebcastSystemId'",
    Deleted = true,
};

ListVideosResponse? res = await sdk.Video.ListVideosAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [ListVideosRequest](../../Models/Requests/ListVideosRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[ListVideosResponse](../../Models/Requests/ListVideosResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetVideoViews

Gets a paginated list of video views

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getVideoViews" method="get" path="/videos/views" -->
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

GetVideoViewsRequest req = new GetVideoViewsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "contact.id eq '123e4567-e89b-12d3-a456-426614174000' and solution eq 'EVENTS_PLUS'",
};

GetVideoViewsResponse? res = await sdk.Video.GetVideoViewsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetVideoViewsRequest](../../Models/Requests/GetVideoViewsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetVideoViewsResponse](../../Models/Requests/GetVideoViewsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAudioTracks

Gets a list of audio tracks for a specific video ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAudioTracks" method="get" path="/videos/{videoId}/audio-tracks" -->
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

ListAudioTracksRequest req = new ListAudioTracksRequest() {
    VideoId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Video.ListAudioTracksAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListAudioTracksRequest](../../Models/Requests/ListAudioTracksRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListAudioTracksResponse](../../Models/Requests/ListAudioTracksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListVideoRenditions

Gets a list of video renditions for a specific video ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listVideoRenditions" method="get" path="/videos/{videoId}/renditions" -->
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

ListVideoRenditionsRequest req = new ListVideoRenditionsRequest() {
    VideoId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Video.ListVideoRenditionsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListVideoRenditionsRequest](../../Models/Requests/ListVideoRenditionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListVideoRenditionsResponse](../../Models/Requests/ListVideoRenditionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateTextTrack

Creates a new text track (VTT) object for a specific video. This endpoint does not directly handle the upload of VTT files but instead returns a location URL that you use to perform the upload.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createTextTrack" method="post" path="/videos/{videoId}/text-tracks" -->
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

CreateTextTrackRequest req = new CreateTextTrackRequest() {
    VideoId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    VideoTextTrack = new VideoTextTrack() {
        Video = new VideoAssetIdJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Label = "English",
        Language = "en-US",
        Kind = VideoTextTrackKindJson.Subtitles,
        Status = VideoTextTrackStatusJson.Started,
    },
};

var res = await sdk.Video.CreateTextTrackAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateTextTrackRequest](../../Models/Requests/CreateTextTrackRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateTextTrackResponse](../../Models/Requests/CreateTextTrackResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListVideoTextTracks

Gets a list of video text tracks for a specific video ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listVideoTextTracks" method="get" path="/videos/{videoId}/text-tracks" -->
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

ListVideoTextTracksRequest req = new ListVideoTextTracksRequest() {
    VideoId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Video.ListVideoTextTracksAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListVideoTextTracksRequest](../../Models/Requests/ListVideoTextTracksRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListVideoTextTracksResponse](../../Models/Requests/ListVideoTextTracksResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateTextTrack

Updates a specific video text track by ID. This is done by setting the status to Updating within the body of this call,
which will prompt the service to return a signed upload link in the returned entity.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateTextTrack" method="put" path="/videos/{videoId}/text-tracks/{textTrackId}" -->
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

UpdateTextTrackRequest req = new UpdateTextTrackRequest() {
    VideoId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    TextTrackId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ExistingVideoTextTrack = new ExistingVideoTextTrackInput() {
        Video = new VideoAssetIdJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Label = "English",
        Language = "en-US",
        Kind = VideoTextTrackKindJson.Subtitles,
        Status = VideoTextTrackStatusJson.Started,
        ErrorMessage = "Input file was empty",
    },
};

var res = await sdk.Video.UpdateTextTrackAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateTextTrackRequest](../../Models/Requests/UpdateTextTrackRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateTextTrackResponse](../../Models/Requests/UpdateTextTrackResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
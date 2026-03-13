# Video

## Overview

Videos can be added to Cvent events with renditions at various resolutions, audio files, reactions tracks, and text tracks. Attendee viewership is tracked to get insight into durations, devices used and venue where the video is watched. Use these APIs to view and manage videos, related text tracks, and audio files. Use these APIs also to get insight into video viewership.

### Available Operations

* [listVideos](#listvideos) - List Videos
* [getVideoViews](#getvideoviews) - List Video Views
* [listAudioTracks](#listaudiotracks) - List Audio Tracks
* [listVideoRenditions](#listvideorenditions) - List Video Renditions
* [createTextTrack](#createtexttrack) - Create Text Track
* [listVideoTextTracks](#listvideotexttracks) - List Text Tracks
* [updateTextTrack](#updatetexttrack) - Update Text Track

## listVideos

Gets a paginated list of videos associated with your account or event.

### Example Usage

<!-- UsageSnippet language="java" operationID="listVideos" method="get" path="/videos" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListVideosRequest;
import com.cvent.models.operations.ListVideosResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        ListVideosRequest req = ListVideosRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("events eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and source.id ne 'sampleWebcastSystemId'")
                .deleted(true)
                .build();


        sdk.video().listVideos()
                .callAsStream()
                .forEach((ListVideosResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListVideosRequest](../../models/operations/ListVideosRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListVideosResponse](../../models/operations/ListVideosResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getVideoViews

Gets a paginated list of video views

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getVideoViews" method="get" path="/videos/views" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetVideoViewsRequest;
import com.cvent.models.operations.GetVideoViewsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetVideoViewsRequest req = GetVideoViewsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("contact.id eq '123e4567-e89b-12d3-a456-426614174000' and solution eq 'EVENTS_PLUS'")
                .build();


        sdk.video().getVideoViews()
                .callAsStream()
                .forEach((GetVideoViewsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetVideoViewsRequest](../../models/operations/GetVideoViewsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetVideoViewsResponse](../../models/operations/GetVideoViewsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAudioTracks

Gets a list of audio tracks for a specific video ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="listAudioTracks" method="get" path="/videos/{videoId}/audio-tracks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAudioTracksRequest;
import com.cvent.models.operations.ListAudioTracksResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        ListAudioTracksRequest req = ListAudioTracksRequest.builder()
                .videoId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        ListAudioTracksResponse res = sdk.video().listAudioTracks()
                .request(req)
                .call();

        if (res.audioTracksResponse().isPresent()) {
            System.out.println(res.audioTracksResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAudioTracksRequest](../../models/operations/ListAudioTracksRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAudioTracksResponse](../../models/operations/ListAudioTracksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listVideoRenditions

Gets a list of video renditions for a specific video ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="listVideoRenditions" method="get" path="/videos/{videoId}/renditions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListVideoRenditionsRequest;
import com.cvent.models.operations.ListVideoRenditionsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        ListVideoRenditionsRequest req = ListVideoRenditionsRequest.builder()
                .videoId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        ListVideoRenditionsResponse res = sdk.video().listVideoRenditions()
                .request(req)
                .call();

        if (res.videoRenditionsResponse().isPresent()) {
            System.out.println(res.videoRenditionsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListVideoRenditionsRequest](../../models/operations/ListVideoRenditionsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListVideoRenditionsResponse](../../models/operations/ListVideoRenditionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createTextTrack

Creates a new text track (VTT) object for a specific video. This endpoint does not directly handle the upload of VTT files but instead returns a location URL that you use to perform the upload.

### Example Usage

<!-- UsageSnippet language="java" operationID="createTextTrack" method="post" path="/videos/{videoId}/text-tracks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateTextTrackRequest;
import com.cvent.models.operations.CreateTextTrackResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        CreateTextTrackRequest req = CreateTextTrackRequest.builder()
                .videoId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .videoTextTrack(VideoTextTrack.builder()
                    .language("en-US")
                    .kind(VideoTextTrackKindJson.SUBTITLES)
                    .video(VideoAssetIdJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .label("English")
                    .status(VideoTextTrackStatusJson.STARTED)
                    .build())
                .build();

        CreateTextTrackResponse res = sdk.video().createTextTrack()
                .request(req)
                .call();

        if (res.existingVideoTextTrack().isPresent()) {
            System.out.println(res.existingVideoTextTrack().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateTextTrackRequest](../../models/operations/CreateTextTrackRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateTextTrackResponse](../../models/operations/CreateTextTrackResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listVideoTextTracks

Gets a list of video text tracks for a specific video ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="listVideoTextTracks" method="get" path="/videos/{videoId}/text-tracks" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListVideoTextTracksRequest;
import com.cvent.models.operations.ListVideoTextTracksResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        ListVideoTextTracksRequest req = ListVideoTextTracksRequest.builder()
                .videoId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        ListVideoTextTracksResponse res = sdk.video().listVideoTextTracks()
                .request(req)
                .call();

        if (res.videoTextTracksResponse().isPresent()) {
            System.out.println(res.videoTextTracksResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListVideoTextTracksRequest](../../models/operations/ListVideoTextTracksRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListVideoTextTracksResponse](../../models/operations/ListVideoTextTracksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateTextTrack

Updates a specific video text track by ID. This is done by setting the status to Updating within the body of this call,
which will prompt the service to return a signed upload link in the returned entity.


### Example Usage

<!-- UsageSnippet language="java" operationID="updateTextTrack" method="put" path="/videos/{videoId}/text-tracks/{textTrackId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateTextTrackRequest;
import com.cvent.models.operations.UpdateTextTrackResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        UpdateTextTrackRequest req = UpdateTextTrackRequest.builder()
                .videoId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .textTrackId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .existingVideoTextTrack(ExistingVideoTextTrackInput.builder()
                    .language("en-US")
                    .kind(VideoTextTrackKindJson.SUBTITLES)
                    .status(VideoTextTrackStatusJson.STARTED)
                    .video(VideoAssetIdJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .label("English")
                    .errorMessage("Input file was empty")
                    .build())
                .build();

        UpdateTextTrackResponse res = sdk.video().updateTextTrack()
                .request(req)
                .call();

        if (res.existingVideoTextTrack().isPresent()) {
            System.out.println(res.existingVideoTextTrack().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [UpdateTextTrackRequest](../../models/operations/UpdateTextTrackRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[UpdateTextTrackResponse](../../models/operations/UpdateTextTrackResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
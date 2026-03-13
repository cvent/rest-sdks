# Webcasts

## Overview

Webcasts are virtual or livestreaming components of your Cvent events. Use these APIs to integrate your virtual events from outside sources into your Cvent workflows, create and delete webcasts from within Cvent, and retrieve and update webcast details.

### Available Operations

* [createWebcast](#createwebcast) - Create Webcast
* [listWebcasts](#listwebcasts) - List Webcasts
* [listAttendeeLinks](#listattendeelinks) - List Attendee Links
* [listPlayers](#listplayers) - List Players
* [getWebcastById](#getwebcastbyid) - Get Webcast
* [deleteWebcast](#deletewebcast) - Delete Webcast
* [updateWebcast](#updatewebcast) - Update Webcast
* [createAttendeeLinks](#createattendeelinks) - Create Attendee Link
* [updateAttendeeLinks](#updateattendeelinks) - Update Attendee Link
* [~~listWebcastAttendeeLinks~~](#listwebcastattendeelinks) - List Attendee Links :warning: **Deprecated**
* [deleteAttendeeLink](#deleteattendeelink) - Delete Attendee Link

## createWebcast

Used to create a new webcast for a specific event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createWebcast" method="post" path="/webcasts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateWebcastResponse;
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

        Webcast req = Webcast.builder()
                .event(UuidJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .session(UuidJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .appointment(UuidJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .exhibitor(UuidJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .format(FormatJson.PRE_RECORDED)
                .type(WebcastTypeJson.MEETING)
                .provider(WebcastProviderJson.ZOOM)
                .status(WebcastStatusJson.STARTED)
                .playerType(PlayerTypeJson.CVENT_VIDEO_PLAYER)
                .simulatedLive(false)
                .recordLiveStream(false)
                .onDemandVideo(false)
                .sourceId("kBBBAAcccdddd8U==")
                .title("Webinar Connect Event")
                .meetingId("123ERt")
                .links(WebcastLinksJson.builder()
                    .join(WebcastLinkJson.builder()
                        .href("https://cvent.zoom.us/j/7566652259")
                        .code("1456ZS78")
                        .build())
                    .speaker(WebcastLinkJson.builder()
                        .href("https://cvent.zoom.us/j/7566652259")
                        .code("1456ZS78")
                        .build())
                    .host(WebcastHostLinkJson.builder()
                        .href("https://cvent.zoom.us/j/7566652259")
                        .code("1456ZS78")
                        .key("abcd1234")
                        .build())
                    .recording(WebcastLinkJson.builder()
                        .href("https://cvent.zoom.us/j/7566652259")
                        .code("1456ZS78")
                        .build())
                    .build())
                .details("This is free of cost event")
                .build();

        CreateWebcastResponse res = sdk.webcasts().createWebcast()
                .request(req)
                .call();

        if (res.existingWebcast().isPresent()) {
            System.out.println(res.existingWebcast().get());
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Webcast](../../models/shared/Webcast.md)  | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[CreateWebcastResponse](../../models/operations/CreateWebcastResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 409, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listWebcasts

Gets a paginated list of webcasts associated with your event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listWebcasts" method="get" path="/webcasts" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListWebcastsRequest;
import com.cvent.models.operations.ListWebcastsResponse;
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

        ListWebcastsRequest req = ListWebcastsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and sourceId ne 'sampleWebcastSystemId'")
                .build();


        sdk.webcasts().listWebcasts()
                .callAsStream()
                .forEach((ListWebcastsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListWebcastsRequest](../../models/operations/ListWebcastsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListWebcastsResponse](../../models/operations/ListWebcastsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAttendeeLinks

Gets a paginated list of attendee links.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAttendeeLinks" method="get" path="/webcasts/attendee-links" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAttendeeLinksRequest;
import com.cvent.models.operations.ListAttendeeLinksResponse;
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

        ListAttendeeLinksRequest req = ListAttendeeLinksRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and event.id eq '55ca6645-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.webcasts().listAttendeeLinks()
                .callAsStream()
                .forEach((ListAttendeeLinksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAttendeeLinksRequest](../../models/operations/ListAttendeeLinksRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAttendeeLinksResponse](../../models/operations/ListAttendeeLinksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listPlayers

Gets a paginated list of player details associated with webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlayers" method="get" path="/webcasts/players" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListPlayersRequest;
import com.cvent.models.operations.ListPlayersResponse;
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

        ListPlayersRequest req = ListPlayersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("webcast.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.webcasts().listPlayers()
                .callAsStream()
                .forEach((ListPlayersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListPlayersRequest](../../models/operations/ListPlayersRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListPlayersResponse](../../models/operations/ListPlayersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getWebcastById

Retrieve a single webcast details by ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getWebcastById" method="get" path="/webcasts/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetWebcastByIdRequest;
import com.cvent.models.operations.GetWebcastByIdResponse;
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

        GetWebcastByIdRequest req = GetWebcastByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetWebcastByIdResponse res = sdk.webcasts().getWebcastById()
                .request(req)
                .call();

        if (res.existingWebcast().isPresent()) {
            System.out.println(res.existingWebcast().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetWebcastByIdRequest](../../models/operations/GetWebcastByIdRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetWebcastByIdResponse](../../models/operations/GetWebcastByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteWebcast

Delete an existing webcast by ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteWebcast" method="delete" path="/webcasts/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteWebcastRequest;
import com.cvent.models.operations.DeleteWebcastResponse;
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

        DeleteWebcastRequest req = DeleteWebcastRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteWebcastResponse res = sdk.webcasts().deleteWebcast()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DeleteWebcastRequest](../../models/operations/DeleteWebcastRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DeleteWebcastResponse](../../models/operations/DeleteWebcastResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateWebcast

Update info for an existing webcast within a Cvent event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateWebcast" method="put" path="/webcasts/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateWebcastRequest;
import com.cvent.models.operations.UpdateWebcastResponse;
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

        UpdateWebcastRequest req = UpdateWebcastRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .existingWebcast(ExistingWebcastInput.builder()
                    .event(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .session(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .appointment(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .exhibitor(UuidJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .format(FormatJson.PRE_RECORDED)
                    .type(WebcastTypeJson.MEETING)
                    .provider(WebcastProviderJson.ZOOM)
                    .status(WebcastStatusJson.STARTED)
                    .playerType(PlayerTypeJson.CVENT_VIDEO_PLAYER)
                    .simulatedLive(false)
                    .recordLiveStream(false)
                    .onDemandVideo(false)
                    .sourceId("kBBBAAcccdddd8U==")
                    .title("Webinar Connect Event")
                    .meetingId("123ERt")
                    .links(WebcastLinksJson.builder()
                        .join(WebcastLinkJson.builder()
                            .href("https://cvent.zoom.us/j/7566652259")
                            .code("1456ZS78")
                            .build())
                        .speaker(WebcastLinkJson.builder()
                            .href("https://cvent.zoom.us/j/7566652259")
                            .code("1456ZS78")
                            .build())
                        .host(WebcastHostLinkJson.builder()
                            .href("https://cvent.zoom.us/j/7566652259")
                            .code("1456ZS78")
                            .key("abcd1234")
                            .build())
                        .recording(WebcastLinkJson.builder()
                            .href("https://cvent.zoom.us/j/7566652259")
                            .code("1456ZS78")
                            .build())
                        .build())
                    .details("This is free of cost event")
                    .build())
                .build();

        UpdateWebcastResponse res = sdk.webcasts().updateWebcast()
                .request(req)
                .call();

        if (res.existingWebcast().isPresent()) {
            System.out.println(res.existingWebcast().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateWebcastRequest](../../models/operations/UpdateWebcastRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateWebcastResponse](../../models/operations/UpdateWebcastResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 409, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## createAttendeeLinks

Create attendee links in bulk for a given webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createAttendeeLinks" method="post" path="/webcasts/{id}/attendee-links" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateAttendeeLinksRequest;
import com.cvent.models.operations.CreateAttendeeLinksResponse;
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

        CreateAttendeeLinksRequest req = CreateAttendeeLinksRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestBody(List.of())
                .build();

        CreateAttendeeLinksResponse res = sdk.webcasts().createAttendeeLinks()
                .request(req)
                .call();

        if (res.attendeeLinkBulkResponse().isPresent()) {
            System.out.println(res.attendeeLinkBulkResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [CreateAttendeeLinksRequest](../../models/operations/CreateAttendeeLinksRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[CreateAttendeeLinksResponse](../../models/operations/CreateAttendeeLinksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateAttendeeLinks

Update data for existing attendee links in bulk for a given webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAttendeeLinks" method="put" path="/webcasts/{id}/attendee-links" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateAttendeeLinksRequest;
import com.cvent.models.operations.UpdateAttendeeLinksResponse;
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

        UpdateAttendeeLinksRequest req = UpdateAttendeeLinksRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestBody(List.of())
                .build();

        UpdateAttendeeLinksResponse res = sdk.webcasts().updateAttendeeLinks()
                .request(req)
                .call();

        if (res.attendeeLinkBulkResponse().isPresent()) {
            System.out.println(res.attendeeLinkBulkResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateAttendeeLinksRequest](../../models/operations/UpdateAttendeeLinksRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateAttendeeLinksResponse](../../models/operations/UpdateAttendeeLinksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## ~~listWebcastAttendeeLinks~~

Gets a paginated list of attendee links in a webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

### Example Usage

<!-- UsageSnippet language="java" operationID="listWebcastAttendeeLinks" method="get" path="/webcasts/{id}/attendee-links" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListWebcastAttendeeLinksRequest;
import com.cvent.models.operations.ListWebcastAttendeeLinksResponse;
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

        ListWebcastAttendeeLinksRequest req = ListWebcastAttendeeLinksRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3'")
                .build();


        sdk.webcasts().listWebcastAttendeeLinks()
                .callAsStream()
                .forEach((ListWebcastAttendeeLinksResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListWebcastAttendeeLinksRequest](../../models/operations/ListWebcastAttendeeLinksRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListWebcastAttendeeLinksResponse](../../models/operations/ListWebcastAttendeeLinksResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteAttendeeLink

Delete attendee links for webcast.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteAttendeeLink" method="delete" path="/webcasts/{id}/attendee-links/{attendeeLinkId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteAttendeeLinkRequest;
import com.cvent.models.operations.DeleteAttendeeLinkResponse;
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

        DeleteAttendeeLinkRequest req = DeleteAttendeeLinkRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeLinkId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteAttendeeLinkResponse res = sdk.webcasts().deleteAttendeeLink()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteAttendeeLinkRequest](../../models/operations/DeleteAttendeeLinkRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteAttendeeLinkResponse](../../models/operations/DeleteAttendeeLinkResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
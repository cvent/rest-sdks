# AttendeeActivities

## Overview

The Attendee Activities API gives valuable insight into your customer's experience at your Cvent event.
Now, you can get a fuller picture of your customer's journey, including onsite activities, offsite meetings,
breakout sessions, booth visits, and virtual seminars. You can use that data to compile a unified customer
profile that integrates with your external systems and data.

By gathering all this info into a single interface, the API allows you to see your customer's engagement
at every step of the journey, create engagement models, and integrate that data with your external tools.
You can use this data to understand what your customers are looking for, keep them engaged, build loyalty,
drive upsell, and increase the long-term value of your events.

Please note that attendee activities data is retained for a maximum of 2 years and is purged thereafter.

For more details on [attendee activities](https://developers.cvent.com/docs/rest-api/explanation/attendee-activities).


### Available Operations

* [listAttendeeActivities](#listattendeeactivities) - List Activities
* [createAttendeeActivity](#createattendeeactivity) - Add External Activity
* [listExternalAttendeeActivitiesMetadata](#listexternalattendeeactivitiesmetadata) - List Ext. Activities Metadata
* [createExternalAttendeeActivityMetadata](#createexternalattendeeactivitymetadata) - Add Ext. Activities Metadata
* [deleteExternalAttendeeActivityMetadata](#deleteexternalattendeeactivitymetadata) - Delete Ext Activities Metadata
* [updateExternalAttendeeActivityMetadata](#updateexternalattendeeactivitymetadata) - Update Ext Activities Metadata

## listAttendeeActivities

Gets a paginated list of attendee activities.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAttendeeActivities" method="get" path="/attendees/activities" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAttendeeActivitiesRequest;
import com.cvent.models.operations.ListAttendeeActivitiesResponse;
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

        ListAttendeeActivitiesRequest req = ListAttendeeActivitiesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("type eq 'event.registered' or type eq 'session.enrolled' and (attendee.id eq 'uuid1' or attendee.id eq 'uuid2')")
                .build();


        sdk.attendeeActivities().listAttendeeActivities()
                .callAsStream()
                .forEach((ListAttendeeActivitiesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAttendeeActivitiesRequest](../../models/operations/ListAttendeeActivitiesRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAttendeeActivitiesResponse](../../models/operations/ListAttendeeActivitiesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createAttendeeActivity

Create an external attendee activity.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createAttendeeActivity" method="post" path="/attendees/activities" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateAttendeeActivityResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

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

        ExternalActivityInput req = ExternalActivityInput.builder()
                .attendee(UuidJson.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .build())
                .event(EventActivityDetailsJsonInput.builder()
                    .id("d84855b0-eeda-41c4-8e7a-53e80364cb95")
                    .build())
                .name("Registered for Event")
                .type(ExternalActivityTypeJson.EVENT_EXTERNAL)
                .data(ExternalActivityDataJson.of(ExternalActivityDataJsonEventExternal.builder()
                    .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                    .externalActivityDate(OffsetDateTime.parse("2019-08-24T14:15:22Z"))
                    .additionalFields(Map.ofEntries(
                        Map.entry("venue", "tokyo"),
                        Map.entry("submitted", "true")))
                    .build()))
                .build();

        CreateAttendeeActivityResponse res = sdk.attendeeActivities().createAttendeeActivity()
                .request(req)
                .call();

        if (res.externalActivity().isPresent()) {
            System.out.println(res.externalActivity().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ExternalActivityInput](../../models/shared/ExternalActivityInput.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateAttendeeActivityResponse](../../models/operations/CreateAttendeeActivityResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listExternalAttendeeActivitiesMetadata

Gets a paginated list of external attendee activities metadata.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listExternalAttendeeActivitiesMetadata" method="get" path="/attendees/activities/external/metadata" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListExternalAttendeeActivitiesMetadataRequest;
import com.cvent.models.operations.ListExternalAttendeeActivitiesMetadataResponse;
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

        ListExternalAttendeeActivitiesMetadataRequest req = ListExternalAttendeeActivitiesMetadataRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq 'd94aff58-175d-41a5-9612-64e71202f8c3' and 'type eq 'event.external' and name ne 'social.media' and created ge '2021-03-15T09:33:13.750Z' and lastModified le '2021-03-15T09:33:13.750Z'")
                .build();


        sdk.attendeeActivities().listExternalAttendeeActivitiesMetadata()
                .callAsStream()
                .forEach((ListExternalAttendeeActivitiesMetadataResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [ListExternalAttendeeActivitiesMetadataRequest](../../models/operations/ListExternalAttendeeActivitiesMetadataRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[ListExternalAttendeeActivitiesMetadataResponse](../../models/operations/ListExternalAttendeeActivitiesMetadataResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createExternalAttendeeActivityMetadata

Creates external attendee activity metadata.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createExternalAttendeeActivityMetadata" method="post" path="/attendees/activities/external/metadata" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateExternalAttendeeActivityMetadataResponse;
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

        ExternalActivityMetadataInput req = ExternalActivityMetadataInput.builder()
                .type(ExternalActivityTypeJson.EVENT_EXTERNAL)
                .name("social.media")
                .description("This external activity contains data of social activities for an attendee.")
                .fields(List.of(
                    ExternalActivitiesAdditionalFieldsMetadataJson.builder()
                        .name("facebook_social.media")
                        .description("Contains data for facebook social media activity.")
                        .build()))
                .build();

        CreateExternalAttendeeActivityMetadataResponse res = sdk.attendeeActivities().createExternalAttendeeActivityMetadata()
                .request(req)
                .call();

        if (res.externalActivityMetadata().isPresent()) {
            System.out.println(res.externalActivityMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ExternalActivityMetadataInput](../../models/shared/ExternalActivityMetadataInput.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[CreateExternalAttendeeActivityMetadataResponse](../../models/operations/CreateExternalAttendeeActivityMetadataResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteExternalAttendeeActivityMetadata

Deletes external attendee activity metadata.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteExternalAttendeeActivityMetadata" method="delete" path="/attendees/activities/external/metadata/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteExternalAttendeeActivityMetadataRequest;
import com.cvent.models.operations.DeleteExternalAttendeeActivityMetadataResponse;
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

        DeleteExternalAttendeeActivityMetadataRequest req = DeleteExternalAttendeeActivityMetadataRequest.builder()
                .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                .build();

        DeleteExternalAttendeeActivityMetadataResponse res = sdk.attendeeActivities().deleteExternalAttendeeActivityMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [DeleteExternalAttendeeActivityMetadataRequest](../../models/operations/DeleteExternalAttendeeActivityMetadataRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[DeleteExternalAttendeeActivityMetadataResponse](../../models/operations/DeleteExternalAttendeeActivityMetadataResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateExternalAttendeeActivityMetadata

Update external attendee activity metadata.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateExternalAttendeeActivityMetadata" method="put" path="/attendees/activities/external/metadata/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateExternalAttendeeActivityMetadataRequest;
import com.cvent.models.operations.UpdateExternalAttendeeActivityMetadataResponse;
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

        UpdateExternalAttendeeActivityMetadataRequest req = UpdateExternalAttendeeActivityMetadataRequest.builder()
                .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                .externalActivityMetadata(ExternalActivityMetadataInput.builder()
                    .type(ExternalActivityTypeJson.EVENT_EXTERNAL)
                    .name("social.media")
                    .description("This external activity contains data of social activities for an attendee.")
                    .fields(List.of(
                        ExternalActivitiesAdditionalFieldsMetadataJson.builder()
                            .name("facebook_social.media")
                            .description("Contains data for facebook social media activity.")
                            .build()))
                    .build())
                .build();

        UpdateExternalAttendeeActivityMetadataResponse res = sdk.attendeeActivities().updateExternalAttendeeActivityMetadata()
                .request(req)
                .call();

        if (res.externalActivityMetadata().isPresent()) {
            System.out.println(res.externalActivityMetadata().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [UpdateExternalAttendeeActivityMetadataRequest](../../models/operations/UpdateExternalAttendeeActivityMetadataRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[UpdateExternalAttendeeActivityMetadataResponse](../../models/operations/UpdateExternalAttendeeActivityMetadataResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
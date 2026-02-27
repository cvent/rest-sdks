# AudienceSegments

## Overview

Audience Segments allow planners to segment their attendees into groups and
better manage the attendee experience based on their defined segments. Audience
Segments APIs will enable you to get, create, and update segment information.
These APIs will also allow you to get and update attendees associated with an
audience segment.


### Available Operations

* [disassociateAttendeeFromAudienceSegments](#disassociateattendeefromaudiencesegments) - Delete Attendee Associations
* [createAudienceSegment](#createaudiencesegment) - Create Audience Segment
* [listAudienceSegments](#listaudiencesegments) - List Audience Segments
* [listAudienceSegmentsPostFilter](#listaudiencesegmentspostfilter) - List Audience Segments
* [getAudienceSegmentById](#getaudiencesegmentbyid) - Get Audience Segment
* [updateAudienceSegment](#updateaudiencesegment) - Update Audience Segment
* [deleteAudienceSegment](#deleteaudiencesegment) - Delete Audience Segment
* [listSegmentAssociatedAttendees](#listsegmentassociatedattendees) - List Associated Attendees
* [associateAttendeeToSegment](#associateattendeetosegment) - Associate Attendee to Segment
* [disassociateAttendeeFromAudienceSegment](#disassociateattendeefromaudiencesegment) - Disassociate Attendee

## disassociateAttendeeFromAudienceSegments

disassociate an attendee from all audience segments

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateAttendeeFromAudienceSegments" method="delete" path="/attendees/{attendeeId}/audience-segments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DisassociateAttendeeFromAudienceSegmentsRequest;
import com.cvent.models.operations.DisassociateAttendeeFromAudienceSegmentsResponse;
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

        DisassociateAttendeeFromAudienceSegmentsRequest req = DisassociateAttendeeFromAudienceSegmentsRequest.builder()
                .attendeeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DisassociateAttendeeFromAudienceSegmentsResponse res = sdk.audienceSegments().disassociateAttendeeFromAudienceSegments()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [DisassociateAttendeeFromAudienceSegmentsRequest](../../models/operations/DisassociateAttendeeFromAudienceSegmentsRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[DisassociateAttendeeFromAudienceSegmentsResponse](../../models/operations/DisassociateAttendeeFromAudienceSegmentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404               | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createAudienceSegment

Creates an audience segment in the given event based on the details supplied in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createAudienceSegment" method="post" path="/audience-segments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.errors.SegmentsErrorResponse;
import com.cvent.models.operations.CreateAudienceSegmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SegmentsErrorResponse, ErrorResponse, Exception {

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

        AudienceSegmentCreate req = AudienceSegmentCreate.builder()
                .name("VIP Attendees")
                .event(EventJson2.builder()
                    .id("103097a4-143d-11e5-9f99-d0a637ee0032")
                    .build())
                .description("A group of VIP attendees.")
                .build();

        CreateAudienceSegmentResponse res = sdk.audienceSegments().createAudienceSegment()
                .request(req)
                .call();

        if (res.existingAudienceSegment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AudienceSegmentCreate](../../models/shared/AudienceSegmentCreate.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateAudienceSegmentResponse](../../models/operations/CreateAudienceSegmentResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/SegmentsErrorResponse | 400                                 | application/json                    |
| models/errors/ErrorResponse         | 401, 403, 422, 429                  | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## listAudienceSegments

Gets a paginated list of audience segments for your account. By default,
the results include all segments present, at the account level, unless you specify
otherwise using the filter query parameter.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAudienceSegments" method="get" path="/audience-segments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAudienceSegmentsRequest;
import com.cvent.models.operations.ListAudienceSegmentsResponse;
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

        ListAudienceSegmentsRequest req = ListAudienceSegmentsRequest.builder()
                .filter("event.id eq '103097a4-143d-11e5-9f99-d0a637ee0032' and id in ('313097a4-143d-11e5-9f99-d0a637ee0897','423097a4-143d-11e5-9f99-d0a637ee0897') and deleted eq 'false' and creationType eq 'MANUAL'")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("lastModifiedBy:DESC")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .build();


        sdk.audienceSegments().listAudienceSegments()
                .callAsStream()
                .forEach((ListAudienceSegmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAudienceSegmentsRequest](../../models/operations/ListAudienceSegmentsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAudienceSegmentsResponse](../../models/operations/ListAudienceSegmentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAudienceSegmentsPostFilter

Gets a paginated list of audience segments for an account by sending a filter
in the body of the request. By default, the results include all
audience segments at the account level unless you specify otherwise in the filter. This
method returns the same data as
[GET List Audience Segments](#operation/listAudienceSegments) but
allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAudienceSegmentsPostFilter" method="post" path="/audience-segments/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAudienceSegmentsPostFilterRequest;
import com.cvent.models.operations.ListAudienceSegmentsPostFilterResponse;
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

        ListAudienceSegmentsPostFilterRequest req = ListAudienceSegmentsPostFilterRequest.builder()
                .filter(Filter.builder()
                    .filter("event.id eq '103097a4-143d-11e5-9f99-d0a637ee0032' and id in ('313097a4-143d-11e5-9f99-d0a637ee0897', '423097a4-143d-11e5-9f99-d0a637ee0897') and deleted eq 'false' and creationType eq 'MANUAL'")
                    .build())
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("lastModifiedBy:DESC")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .build();


        sdk.audienceSegments().listAudienceSegmentsPostFilter()
                .callAsStream()
                .forEach((ListAudienceSegmentsPostFilterResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ListAudienceSegmentsPostFilterRequest](../../models/operations/ListAudienceSegmentsPostFilterRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[ListAudienceSegmentsPostFilterResponse](../../models/operations/ListAudienceSegmentsPostFilterResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAudienceSegmentById

Gets an audience segment based on the given ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAudienceSegmentById" method="get" path="/audience-segments/{audienceSegmentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAudienceSegmentByIdRequest;
import com.cvent.models.operations.GetAudienceSegmentByIdResponse;
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

        GetAudienceSegmentByIdRequest req = GetAudienceSegmentByIdRequest.builder()
                .audienceSegmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetAudienceSegmentByIdResponse res = sdk.audienceSegments().getAudienceSegmentById()
                .request(req)
                .call();

        if (res.audienceSegmentResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetAudienceSegmentByIdRequest](../../models/operations/GetAudienceSegmentByIdRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetAudienceSegmentByIdResponse](../../models/operations/GetAudienceSegmentByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateAudienceSegment

Updates the given audience segment based on the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAudienceSegment" method="put" path="/audience-segments/{audienceSegmentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateAudienceSegmentRequest;
import com.cvent.models.operations.UpdateAudienceSegmentResponse;
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

        UpdateAudienceSegmentRequest req = UpdateAudienceSegmentRequest.builder()
                .audienceSegmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .audienceSegment(AudienceSegment.builder()
                    .name("VIP Attendees")
                    .event(EventJson2.builder()
                        .id("103097a4-143d-11e5-9f99-d0a637ee0032")
                        .build())
                    .description("A group of VIP attendees.")
                    .build())
                .build();

        UpdateAudienceSegmentResponse res = sdk.audienceSegments().updateAudienceSegment()
                .request(req)
                .call();

        if (res.existingAudienceSegment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateAudienceSegmentRequest](../../models/operations/UpdateAudienceSegmentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateAudienceSegmentResponse](../../models/operations/UpdateAudienceSegmentResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 422, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## deleteAudienceSegment

Deletes the given audience segment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteAudienceSegment" method="delete" path="/audience-segments/{audienceSegmentId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteAudienceSegmentRequest;
import com.cvent.models.operations.DeleteAudienceSegmentResponse;
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

        DeleteAudienceSegmentRequest req = DeleteAudienceSegmentRequest.builder()
                .audienceSegmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteAudienceSegmentResponse res = sdk.audienceSegments().deleteAudienceSegment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [DeleteAudienceSegmentRequest](../../models/operations/DeleteAudienceSegmentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[DeleteAudienceSegmentResponse](../../models/operations/DeleteAudienceSegmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSegmentAssociatedAttendees

Gets a paginated list of attendees associated or disassociated to/from an audience segment. Use the `filter` query parameter to return only associated or only disassociated attendees.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSegmentAssociatedAttendees" method="get" path="/audience-segments/{audienceSegmentId}/attendees" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSegmentAssociatedAttendeesRequest;
import com.cvent.models.operations.ListSegmentAssociatedAttendeesResponse;
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

        ListSegmentAssociatedAttendeesRequest req = ListSegmentAssociatedAttendeesRequest.builder()
                .audienceSegmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .filter("disassociated eq 'false'")
                .includeDisassociated(true)
                .build();


        sdk.audienceSegments().listSegmentAssociatedAttendees()
                .callAsStream()
                .forEach((ListSegmentAssociatedAttendeesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [ListSegmentAssociatedAttendeesRequest](../../models/operations/ListSegmentAssociatedAttendeesRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[ListSegmentAssociatedAttendeesResponse](../../models/operations/ListSegmentAssociatedAttendeesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## associateAttendeeToSegment

Associates an attendee to a given audience segment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="associateAttendeeToSegment" method="put" path="/audience-segments/{audienceSegmentId}/attendees/{attendeeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.errors.SegmentsErrorResponse;
import com.cvent.models.operations.AssociateAttendeeToSegmentRequest;
import com.cvent.models.operations.AssociateAttendeeToSegmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws SegmentsErrorResponse, ErrorResponse, Exception {

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

        AssociateAttendeeToSegmentRequest req = AssociateAttendeeToSegmentRequest.builder()
                .audienceSegmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AssociateAttendeeToSegmentResponse res = sdk.audienceSegments().associateAttendeeToSegment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [AssociateAttendeeToSegmentRequest](../../models/operations/AssociateAttendeeToSegmentRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[AssociateAttendeeToSegmentResponse](../../models/operations/AssociateAttendeeToSegmentResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/SegmentsErrorResponse | 400                                 | application/json                    |
| models/errors/ErrorResponse         | 401, 403, 404, 422, 429             | application/json                    |
| models/errors/APIException          | 4XX, 5XX                            | \*/\*                               |

## disassociateAttendeeFromAudienceSegment

Disassociate an attendee from an audience segment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateAttendeeFromAudienceSegment" method="delete" path="/audience-segments/{audienceSegmentId}/attendees/{attendeeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DisassociateAttendeeFromAudienceSegmentRequest;
import com.cvent.models.operations.DisassociateAttendeeFromAudienceSegmentResponse;
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

        DisassociateAttendeeFromAudienceSegmentRequest req = DisassociateAttendeeFromAudienceSegmentRequest.builder()
                .audienceSegmentId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DisassociateAttendeeFromAudienceSegmentResponse res = sdk.audienceSegments().disassociateAttendeeFromAudienceSegment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [DisassociateAttendeeFromAudienceSegmentRequest](../../models/operations/DisassociateAttendeeFromAudienceSegmentRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |

### Response

**[DisassociateAttendeeFromAudienceSegmentResponse](../../models/operations/DisassociateAttendeeFromAudienceSegmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
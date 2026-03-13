# Attendees

## Overview

The Attendee entity primarily refers to the person throughout the lifecycle of an event including registration, enrollment into sessions, and participation. Once contacts are added to events, an Attendee entity is created. This API allows you to read attendee data and add new attendees to your Cvent events.

### Available Operations

* [listDurations](#listdurations) - List Attendance Duration
* [createAttendee](#createattendee) - Add Attendees
* [listAttendees](#listattendees) - List Attendees
* [listAttendeesPostFilter](#listattendeespostfilter) - List Attendees
* [getAttendeeById](#getattendeebyid) - Get Attendee
* [updateAttendee](#updateattendee) - Update Attendee
* [updateAttendeeSubscriptionStatus](#updateattendeesubscriptionstatus) - Update Email Subscription
* [updateInternalInfoAnswers](#updateinternalinfoanswers) - Update Internal Information
* [postBadge](#postbadge) - Create Badge
* [getBadge](#getbadge) - Get Badge
* [getBadgesPostFilters](#getbadgespostfilters) - Get Badges
* [updateBadge](#updatebadge) - Update Badge

## listDurations

Gets a paginated list of durations attendees were engaged (in person or virtually) in a session, appointment or watching a video.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listDurations" method="get" path="/attendance-durations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListDurationsRequest;
import com.cvent.models.operations.ListDurationsResponse;
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

        ListDurationsRequest req = ListDurationsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("start:DESC,title:ASC")
                .filter("firstSeen gt '2020-02-07T12:00:00.000Z' and session.id =  '0e2f583e-62ae-40d8-9b5c-b8e67a6ba1ab'")
                .build();


        sdk.attendees().listDurations()
                .callAsStream()
                .forEach((ListDurationsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListDurationsRequest](../../models/operations/ListDurationsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListDurationsResponse](../../models/operations/ListDurationsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createAttendee

Adds given contacts to an event as attendees, either inviting them or registering them directly.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createAttendee" method="post" path="/attendees" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateAttendeeResponse;
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

        List<AttendeeAddJson> req = List.of(
                AttendeeAddJson.builder()
                    .event(AttendeeAddJsonEvent.builder()
                        .id("0a955598-376e-43d4-a796-91d6d5f41e3f")
                        .build())
                    .contact(AttendeeAddJsonContact.builder()
                        .id("ea66a709-2a93-4fa0-8b83-cf4f62df9dc3")
                        .build())
                    .invitationList(AttendeeAddJsonInvitationList.builder()
                        .id("06da38f9-12da-4cb6-a581-7a5954f8e0e2")
                        .build())
                    .referenceId("refid-marketingwebsite")
                    .note("Would like to sit near the front of the room for sessions.")
                    .administrator(AttendeeAddJsonAdministrator.builder()
                        .id("7949c335-b5b2-46cf-8f5d-f6b21795df51")
                        .build())
                    .admissionItem(AttendeeAddJsonAdmissionItem.builder()
                        .id("7949c335-b5b2-46cf-8f5d-f6b21795df51")
                        .build())
                    .visibility(AttendeeVisibilityJson.PRIVATE)
                    .answers(List.of(
                        AttendeeAnswerJson.builder()
                            .question(AttendeeAnswerJsonQuestion.builder()
                                .id("60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a")
                                .build())
                            .value(List.of(
                                "1234"))
                            .build()))
                    .sendEmail(false)
                    .status(AttendeeAddStatusJson.ACCEPTED)
                    .guest(true)
                    .invitedBy(AttendeeInvitedByJson.PLANNER_INVITED)
                    .responseMethod(AttendeeResponseMethodJson.SELF_RESPONDED)
                    .build());

        CreateAttendeeResponse res = sdk.attendees().createAttendee()
                .request(req)
                .call();

        if (res.attendeeAddBulkResponse().isPresent()) {
            System.out.println(res.attendeeAddBulkResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [List<AttendeeAddJson>](../../models//.md) | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[CreateAttendeeResponse](../../models/operations/CreateAttendeeResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAttendees

Gets a paginated list of attendees in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAttendees" method="get" path="/attendees" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAttendeesRequest;
import com.cvent.models.operations.ListAttendeesResponse;
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

        ListAttendeesRequest req = ListAttendeesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .expand(List.of(
                    Expand.ANSWERS_QUESTION,
                    Expand.REGISTRATION_TYPE))
                .sort("contact.company:DESC,contact.title:ASC")
                .filter("contact.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or checkedIn eq 'true'")
                .build();


        sdk.attendees().listAttendees()
                .callAsStream()
                .forEach((ListAttendeesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListAttendeesRequest](../../models/operations/ListAttendeesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListAttendeesResponse](../../models/operations/ListAttendeesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAttendeesPostFilter

Gets a paginated list of attendees by sending a filter in the body of the request. This method will return the same data as  [GET List Attendees](#operation/listAttendees) but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAttendeesPostFilter" method="post" path="/attendees/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAttendeesPostFilterRequest;
import com.cvent.models.operations.ListAttendeesPostFilterResponse;
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

        ListAttendeesPostFilterRequest req = ListAttendeesPostFilterRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .expand(List.of(
                    Expand.ANSWERS_QUESTION,
                    Expand.REGISTRATION_TYPE))
                .sort("contact.company:DESC,contact.title:ASC")
                .filter(Filter.builder()
                    .filter("property eq 'value'")
                    .build())
                .build();


        sdk.attendees().listAttendeesPostFilter()
                .callAsStream()
                .forEach((ListAttendeesPostFilterResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAttendeesPostFilterRequest](../../models/operations/ListAttendeesPostFilterRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAttendeesPostFilterResponse](../../models/operations/ListAttendeesPostFilterResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAttendeeById

Gets a single attendee based on their ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAttendeeById" method="get" path="/attendees/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAttendeeByIdRequest;
import com.cvent.models.operations.GetAttendeeByIdResponse;
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

        GetAttendeeByIdRequest req = GetAttendeeByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .expand(List.of(
                    Expand.ANSWERS_QUESTION,
                    Expand.REGISTRATION_TYPE))
                .build();

        GetAttendeeByIdResponse res = sdk.attendees().getAttendeeById()
                .request(req)
                .call();

        if (res.attendee().isPresent()) {
            System.out.println(res.attendee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetAttendeeByIdRequest](../../models/operations/GetAttendeeByIdRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetAttendeeByIdResponse](../../models/operations/GetAttendeeByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateAttendee

Updates a single attendee based on their ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAttendee" method="put" path="/attendees/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateAttendeeRequest;
import com.cvent.models.operations.UpdateAttendeeResponse;
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

        UpdateAttendeeRequest req = UpdateAttendeeRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeUpdate(AttendeeUpdate.builder()
                    .event(AttendeeUpdateEvent.builder()
                        .id("0a955598-376e-43d4-a796-91d6d5f41e3f")
                        .build())
                    .contact(AttendeeUpdateContact.builder()
                        .id("ea66a709-2a93-4fa0-8b83-cf4f62df9dc3")
                        .build())
                    .invitationList(AttendeeUpdateInvitationList.builder()
                        .id("06da38f9-12da-4cb6-a581-7a5954f8e0e2")
                        .build())
                    .referenceId("refid-marketingwebsite")
                    .note("Would like to sit near the front of the room for sessions.")
                    .administrator(AttendeeUpdateAdministrator.builder()
                        .id("7949c335-b5b2-46cf-8f5d-f6b21795df51")
                        .build())
                    .admissionItem(AttendeeUpdateAdmissionItem.builder()
                        .id("7949c335-b5b2-46cf-8f5d-f6b21795df51")
                        .build())
                    .visibility(AttendeeVisibilityJson.PRIVATE)
                    .answers(List.of(
                        AttendeeAnswerJson.builder()
                            .question(AttendeeAnswerJsonQuestion.builder()
                                .id("60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a")
                                .build())
                            .value(List.of(
                                "1234"))
                            .build()))
                    .sendEmail(false)
                    .status(AttendeeUpdateStatusJson.ACCEPTED)
                    .build())
                .build();

        UpdateAttendeeResponse res = sdk.attendees().updateAttendee()
                .request(req)
                .call();

        if (res.attendee().isPresent()) {
            System.out.println(res.attendee().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateAttendeeRequest](../../models/operations/UpdateAttendeeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdateAttendeeResponse](../../models/operations/UpdateAttendeeResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateAttendeeSubscriptionStatus

Updates an attendee's email subscription status for a specific event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAttendeeSubscriptionStatus" method="put" path="/attendees/{id}/email-subscriptions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateAttendeeSubscriptionStatusRequest;
import com.cvent.models.operations.UpdateAttendeeSubscriptionStatusResponse;
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

        UpdateAttendeeSubscriptionStatusRequest req = UpdateAttendeeSubscriptionStatusRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeSubscriptionRequest(AttendeeSubscriptionRequest.builder()
                    .unsubscribed(true)
                    .build())
                .build();

        UpdateAttendeeSubscriptionStatusResponse res = sdk.attendees().updateAttendeeSubscriptionStatus()
                .request(req)
                .call();

        if (res.attendeeSubscriptionResponse().isPresent()) {
            System.out.println(res.attendeeSubscriptionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [UpdateAttendeeSubscriptionStatusRequest](../../models/operations/UpdateAttendeeSubscriptionStatusRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[UpdateAttendeeSubscriptionStatusResponse](../../models/operations/UpdateAttendeeSubscriptionStatusResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateInternalInfoAnswers

Update internal information answers for an attendee. Use either question code or id to identify which question's answers are being updated.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateInternalInfoAnswers" method="put" path="/attendees/{id}/internal-information-questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateInternalInfoAnswersRequest;
import com.cvent.models.operations.UpdateInternalInfoAnswersResponse;
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

        UpdateInternalInfoAnswersRequest req = UpdateInternalInfoAnswersRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeInternalInfo(AttendeeInternalInfo.builder()
                    .question(AttendeeInternalInfoQuestion.builder()
                        .id("adcc4376-4560-4fb3-8594-2fdbb637c07c")
                        .code("DIETARY")
                        .build())
                    .value(List.of(
                        "1234"))
                    .build())
                .build();

        UpdateInternalInfoAnswersResponse res = sdk.attendees().updateInternalInfoAnswers()
                .request(req)
                .call();

        if (res.attendeeInternalInfo().isPresent()) {
            System.out.println(res.attendeeInternalInfo().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [UpdateInternalInfoAnswersRequest](../../models/operations/UpdateInternalInfoAnswersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[UpdateInternalInfoAnswersResponse](../../models/operations/UpdateInternalInfoAnswersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## postBadge

Create a badge for an attendee associated with an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="postBadge" method="post" path="/events/{id}/badges" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PostBadgeRequest;
import com.cvent.models.operations.PostBadgeResponse;
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

        PostBadgeRequest req = PostBadgeRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .badge(BadgeInput.builder()
                    .id("abc123")
                    .status(BadgeStatusJson.ACTIVE)
                    .type(BadgeTypeJson.EPC)
                    .attendee(AttendeeJson3.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .event(EventJson6.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .build())
                .build();

        PostBadgeResponse res = sdk.attendees().postBadge()
                .request(req)
                .call();

        if (res.badge().isPresent()) {
            System.out.println(res.badge().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [PostBadgeRequest](../../models/operations/PostBadgeRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[PostBadgeResponse](../../models/operations/PostBadgeResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBadge

Retrieves a list of third-party badge associations for attendees within the event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBadge" method="get" path="/events/{id}/badges" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBadgeRequest;
import com.cvent.models.operations.GetBadgeResponse;
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

        GetBadgeRequest req = GetBadgeRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '{string}' and attendee.id eq '{UUID}'")
                .build();


        sdk.attendees().getBadge()
                .callAsStream()
                .forEach((GetBadgeResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetBadgeRequest](../../models/operations/GetBadgeRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetBadgeResponse](../../models/operations/GetBadgeResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getBadgesPostFilters

Gets a paginated list of Badges by sending a filter in the body of the request. This method will return the same data as the getBadge but allows for longer filters.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getBadgesPostFilters" method="post" path="/events/{id}/badges/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetBadgesPostFiltersRequest;
import com.cvent.models.operations.GetBadgesPostFiltersResponse;
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

        GetBadgesPostFiltersRequest req = GetBadgesPostFiltersRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' AND attendee.id eq 'edf40757-3bc3-4a66-8180-93bff15b890b'")
                    .build())
                .build();


        sdk.attendees().getBadgesPostFilters()
                .callAsStream()
                .forEach((GetBadgesPostFiltersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetBadgesPostFiltersRequest](../../models/operations/GetBadgesPostFiltersRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetBadgesPostFiltersResponse](../../models/operations/GetBadgesPostFiltersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateBadge

Update a badge for an attendee associated with an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateBadge" method="put" path="/events/{id}/badges/{badgeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateBadgeRequest;
import com.cvent.models.operations.UpdateBadgeResponse;
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

        UpdateBadgeRequest req = UpdateBadgeRequest.builder()
                .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                .badgeId("abc123")
                .badge(BadgeInput.builder()
                    .id("abc123")
                    .status(BadgeStatusJson.ACTIVE)
                    .type(BadgeTypeJson.EPC)
                    .attendee(AttendeeJson3.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .event(EventJson6.builder()
                        .id("3db28cfc-db22-11eb-8d19-0242ac130003")
                        .build())
                    .build())
                .build();

        UpdateBadgeResponse res = sdk.attendees().updateBadge()
                .request(req)
                .call();

        if (res.badge().isPresent()) {
            System.out.println(res.badge().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [UpdateBadgeRequest](../../models/operations/UpdateBadgeRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[UpdateBadgeResponse](../../models/operations/UpdateBadgeResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
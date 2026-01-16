# Events

## Overview

Events are used to collect registrations and allow attendees to select their schedule. Use these APIs to get information about your events and use the event ID to get further details about the event, such as Attendees and Sessions.

### Available Operations

* [listAdmissionItems](#listadmissionitems) - List Admission Items
* [listAdmissionItemsPostFilters](#listadmissionitemspostfilters) - List Admission Items
* [getEventQuestions](#geteventquestions) - List Event Questions
* [getChoicesForQuestion](#getchoicesforquestion) - Get Question Choices
* [getEvents](#getevents) - List Events
* [createEventAsync](#createeventasync) - Create Event Async
* [getEventAsyncStatus](#geteventasyncstatus) - Get Event Async Status
* [getEventCopyStatus](#geteventcopystatus) - Get Event Copy Status
* [sendEventEmails](#sendeventemails) - Send Email To Attendees
* [getEventEmailStatus](#geteventemailstatus) - List Event Email Status
* [getEventsPostFilters](#geteventspostfilters) - List Events
* [getEventById](#geteventbyid) - Get Event
* [updateEvent](#updateevent) - Update Event
* [eventCheckIn](#eventcheckin) - Event Check-In
* [deleteEventCheckIn](#deleteeventcheckin) - Remove Check-In
* [copyEvent](#copyevent) - Copy Event
* [answerEventCustomField](#answereventcustomfield) - Event Custom Field Answers
* [listDonationItems](#listdonationitems) - List Donation Items
* [listDonationItemsPostFilter](#listdonationitemspostfilter) - List Donation Items
* [listEventEmails](#listeventemails) - List Event Emails
* [listFeeItems](#listfeeitems) - List Fee Items
* [getInvitationList](#getinvitationlist) - List Invitation Lists
* [listMembershipItems](#listmembershipitems) - List Membership Items
* [getOrders](#getorders) - List Orders
* [getOrderItems](#getorderitems) - List Order Items
* [associateDiscountCodeToOrderItem](#associatediscountcodetoorderitem) - Assign Discount to Order Item
* [listQuantityItems](#listquantityitems) - List Quantity Items
* [listQuantityItemsPostFilter](#listquantityitemspostfilter) - List Quantity Items
* [listRegistrationPaths](#listregistrationpaths) - List Registration Paths
* [listRegistrationTypes](#listregistrationtypes) - List Registration Types
* [updateRegistrationType](#updateregistrationtype) - Update Event Registration Type
* [getTransactions](#gettransactions) - List Transactions
* [postTransactions](#posttransactions) - Create Transactions
* [getTransactionItems](#gettransactionitems) - List Transaction Items
* [listEventUserGroups](#listeventusergroups) - List Event User Groups
* [associateEventUserGroup](#associateeventusergroup) - Associate User Group to Event
* [disassociateEventUserGroup](#disassociateeventusergroup) - Disassociate Group from Event
* [updateQuantityItemRegistrationForAttendee](#updatequantityitemregistrationforattendee) - Update Quantity Item
* [listSessionsAttendance](#listsessionsattendance) - Session Attendance
* [listSessionsEnrollment](#listsessionsenrollment) - List Session Registrants
* [listSessionsEnrollmentPostFilter](#listsessionsenrollmentpostfilter) - List Session Registrants
* [deleteSessionAttendance](#deletesessionattendance) - Del Session Check-in
* [sessionCheckIn](#sessioncheckin) - Session Check-In
* [updateSessionCheckIn](#updatesessioncheckin) - Update Session Check-In
* [createSessionEnrollment](#createsessionenrollment) - Create Session Registration
* [deleteSessionEnrollment](#deletesessionenrollment) - Delete Session Registration

## listAdmissionItems

Gets a paginated list of admission items.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdmissionItems" method="get" path="/admission-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAdmissionItemsRequest;
import com.cvent.models.operations.ListAdmissionItemsResponse;
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

        ListAdmissionItemsRequest req = ListAdmissionItemsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'abc' or name eq 'admission' or id eq 'abc'")
                .build();


        sdk.events().listAdmissionItems()
                .callAsStream()
                .forEach((ListAdmissionItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAdmissionItemsRequest](../../models/operations/ListAdmissionItemsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAdmissionItemsResponse](../../models/operations/ListAdmissionItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAdmissionItemsPostFilters

Gets a paginated list of admission items by sending a filter in the body of the request. This method will return the same data as [GET List Admission Items](#operation/listAdmissionItems) but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAdmissionItemsPostFilters" method="post" path="/admission-items/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAdmissionItemsPostFiltersRequest;
import com.cvent.models.operations.ListAdmissionItemsPostFiltersResponse;
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

        ListAdmissionItemsPostFiltersRequest req = ListAdmissionItemsPostFiltersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("event.id eq 'abc' or name eq 'admission' or id eq 'abc'")
                    .build())
                .build();


        sdk.events().listAdmissionItemsPostFilters()
                .callAsStream()
                .forEach((ListAdmissionItemsPostFiltersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListAdmissionItemsPostFiltersRequest](../../models/operations/ListAdmissionItemsPostFiltersRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ListAdmissionItemsPostFiltersResponse](../../models/operations/ListAdmissionItemsPostFiltersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventQuestions

Gets a paginated list of event questions.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventQuestions" method="get" path="/event-questions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventQuestionsRequest;
import com.cvent.models.operations.GetEventQuestionsResponse;
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

        GetEventQuestionsRequest req = GetEventQuestionsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("code eq 'Code162' or tag  eq 'Primary Questions'")
                .build();


        sdk.events().getEventQuestions()
                .callAsStream()
                .forEach((GetEventQuestionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetEventQuestionsRequest](../../models/operations/GetEventQuestionsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetEventQuestionsResponse](../../models/operations/GetEventQuestionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getChoicesForQuestion

Gets all the choices for a given event question.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getChoicesForQuestion" method="get" path="/event-questions/{questionId}/choices" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetChoicesForQuestionRequest;
import com.cvent.models.operations.GetChoicesForQuestionResponse;
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

        GetChoicesForQuestionRequest req = GetChoicesForQuestionRequest.builder()
                .questionId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("text eq 'Choice A'")
                .build();


        sdk.events().getChoicesForQuestion()
                .callAsStream()
                .forEach((GetChoicesForQuestionResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetChoicesForQuestionRequest](../../models/operations/GetChoicesForQuestionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetChoicesForQuestionResponse](../../models/operations/GetChoicesForQuestionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEvents

Gets a paginated list of events.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEvents" method="get" path="/events" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventsRequest;
import com.cvent.models.operations.GetEventsResponse;
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

        GetEventsRequest req = GetEventsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("start:DESC")
                .filter("status eq 'Accepted' or status eq 'Pending' and (id eq 'abc' or id eq 'def')")
                .build();


        sdk.events().getEvents()
                .callAsStream()
                .forEach((GetEventsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetEventsRequest](../../models/operations/GetEventsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetEventsResponse](../../models/operations/GetEventsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createEventAsync

Creates an event using the details supplied in the request body. Check the
[Get Event Async Status](#operation/getEventAsyncStatus) to determine when the
event is ready.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createEventAsync" method="post" path="/events/async" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateEventAsyncResponse;
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

        EventInput req = EventInput.builder()
                .title("Cvent Connect 2020")
                .format(EventFormatJson.VIRTUAL)
                .timezone("America/New_York")
                .languages(List.of(
                    "en-US"))
                .planners(List.of(
                    PlannerJson2Input.builder()
                        .prefix("Dr.")
                        .firstName("Henry")
                        .lastName("Smith")
                        .company("Cvent Inc")
                        .title("Event Planner")
                        .email("hsmith@example.com")
                        .build()))
                .type(EventTypeJson1.CONFERENCE)
                .description("Cvent annual user conference.")
                .start(OffsetDateTime.parse("2020-02-03T13:00:00.000Z"))
                .end(OffsetDateTime.parse("2020-02-07T17:00:00.000Z"))
                .venues(List.of(
                    VenueJsonInput.builder()
                        .name("Capital Convention Center")
                        .address(VenueAddressJsonInput.builder()
                            .address1("Cvent Inc.")
                            .address2("4001 West Parmer Lane")
                            .address3("PO Box 123")
                            .city("Austin")
                            .countryCode("US")
                            .postalCode("78727")
                            .regionCode("TX")
                            .build())
                        .build()))
                .note("This event will need some coordination with external systems.")
                .build();

        CreateEventAsyncResponse res = sdk.events().createEventAsync()
                .request(req)
                .call();

        if (res.eventAsyncResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [EventInput](../../models/shared/EventInput.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[CreateEventAsyncResponse](../../models/operations/CreateEventAsyncResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventAsyncStatus

Gets the event creation status of the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventAsyncStatus" method="get" path="/events/async/{eventCreationId}/status" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventAsyncStatusRequest;
import com.cvent.models.operations.GetEventAsyncStatusResponse;
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

        GetEventAsyncStatusRequest req = GetEventAsyncStatusRequest.builder()
                .eventCreationId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetEventAsyncStatusResponse res = sdk.events().getEventAsyncStatus()
                .request(req)
                .call();

        if (res.eventAsyncStatus().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetEventAsyncStatusRequest](../../models/operations/GetEventAsyncStatusRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetEventAsyncStatusResponse](../../models/operations/GetEventAsyncStatusResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventCopyStatus

Gets the event copy status of the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventCopyStatus" method="get" path="/events/copy/{eventCopyId}/status" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventCopyStatusRequest;
import com.cvent.models.operations.GetEventCopyStatusResponse;
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

        GetEventCopyStatusRequest req = GetEventCopyStatusRequest.builder()
                .eventCopyId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetEventCopyStatusResponse res = sdk.events().getEventCopyStatus()
                .request(req)
                .call();

        if (res.eventAsyncStatus().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetEventCopyStatusRequest](../../models/operations/GetEventCopyStatusRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetEventCopyStatusResponse](../../models/operations/GetEventCopyStatusResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## sendEventEmails

Sends an email to one or more event attendees who are on the invitation list.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="sendEventEmails" method="post" path="/events/emails" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.SendEventEmailsResponse;
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

        SendEmailEventRequest req = SendEmailEventRequest.builder()
                .event(EventJson10.builder()
                    .id("a150f1ee-6c54-4b01-90e6-d701748f0851")
                    .build())
                .email(EmailJson2.builder()
                    .id("a150f1ee-6c54-4b01-90e6-d701748f0851")
                    .build())
                .resendToPreviousRecipients(true)
                .attendees(List.of(
                    "9A641E55-3367-4C50-B21B-B6A7613DFB23"))
                .build();

        SendEventEmailsResponse res = sdk.events().sendEventEmails()
                .request(req)
                .call();

        if (res.sendEmailEventResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [SendEmailEventRequest](../../models/shared/SendEmailEventRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[SendEventEmailsResponse](../../models/operations/SendEventEmailsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventEmailStatus

Gets the status of email using unique email request ID that was generated as a response of [Send Email To Attendees](#tag/Events/operation/sendEventEmails) request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventEmailStatus" method="get" path="/events/emails/{emailRequestId}/status" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventEmailStatusRequest;
import com.cvent.models.operations.GetEventEmailStatusResponse;
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

        GetEventEmailStatusRequest req = GetEventEmailStatusRequest.builder()
                .emailRequestId("2A941E55-3367-4C50-B21B-B6A7613DFB23")
                .build();

        GetEventEmailStatusResponse res = sdk.events().getEventEmailStatus()
                .request(req)
                .call();

        if (res.sendEmailEventResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetEventEmailStatusRequest](../../models/operations/GetEventEmailStatusRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetEventEmailStatusResponse](../../models/operations/GetEventEmailStatusResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventsPostFilters

Gets a paginated list of events by sending a filter in the body of the request. This method will return the same data as [GET List Events](#operation/getEvents) but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventsPostFilters" method="post" path="/events/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventsPostFiltersRequest;
import com.cvent.models.operations.GetEventsPostFiltersResponse;
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

        GetEventsPostFiltersRequest req = GetEventsPostFiltersRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("start:DESC")
                .filter(Filter.builder()
                    .filter("status eq 'Accepted' or status eq 'Pending' and (id eq 'abc' or id eq 'def')")
                    .build())
                .build();


        sdk.events().getEventsPostFilters()
                .callAsStream()
                .forEach((GetEventsPostFiltersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetEventsPostFiltersRequest](../../models/operations/GetEventsPostFiltersRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetEventsPostFiltersResponse](../../models/operations/GetEventsPostFiltersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getEventById

Gets a single event based on the provided event ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getEventById" method="get" path="/events/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetEventByIdRequest;
import com.cvent.models.operations.GetEventByIdResponse;
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

        GetEventByIdRequest req = GetEventByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetEventByIdResponse res = sdk.events().getEventById()
                .request(req)
                .call();

        if (res.event().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetEventByIdRequest](../../models/operations/GetEventByIdRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetEventByIdResponse](../../models/operations/GetEventByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateEvent

Updates the information for a single event based on the details provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateEvent" method="put" path="/events/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateEventRequest;
import com.cvent.models.operations.UpdateEventResponse;
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

        UpdateEventRequest req = UpdateEventRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .eventUpdate(EventUpdateInput.builder()
                    .title("Cvent Connect 2020")
                    .format(EventFormatJson.VIRTUAL)
                    .timezone("America/New_York")
                    .languages(List.of(
                        "en-US"))
                    .planners(List.of())
                    .type(EventTypeJson1.CONFERENCE)
                    .description("Cvent annual user conference.")
                    .start(OffsetDateTime.parse("2020-02-03T13:00:00.000Z"))
                    .end(OffsetDateTime.parse("2020-02-07T17:00:00.000Z"))
                    .closeAfter(OffsetDateTime.parse("2020-02-01T23:59:00.000Z"))
                    .archiveAfter(OffsetDateTime.parse("2020-05-07T12:00:00.000Z"))
                    .venues(List.of(
                        VenueJsonInput.builder()
                            .name("Capital Convention Center")
                            .address(VenueAddressJsonInput.builder()
                                .address1("Cvent Inc.")
                                .address2("4001 West Parmer Lane")
                                .address3("PO Box 123")
                                .city("Austin")
                                .countryCode("US")
                                .postalCode("78727")
                                .regionCode("TX")
                                .build())
                            .build()))
                    .note("This event will need some coordination with external systems.")
                    .capacity(50L)
                    .build())
                .build();

        UpdateEventResponse res = sdk.events().updateEvent()
                .request(req)
                .call();

        if (res.eventUpdate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [UpdateEventRequest](../../models/operations/UpdateEventRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[UpdateEventResponse](../../models/operations/UpdateEventResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## eventCheckIn

Check-in attendees to an event based on the attendee IDs provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="eventCheckIn" method="post" path="/events/{id}/check-in" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.EventCheckInRequest;
import com.cvent.models.operations.EventCheckInResponse;
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

        EventCheckInRequest req = EventCheckInRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestBody(List.of())
                .build();

        EventCheckInResponse res = sdk.events().eventCheckIn()
                .request(req)
                .call();

        if (res.attendeeAddBulkResponseEvent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [EventCheckInRequest](../../models/operations/EventCheckInRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[EventCheckInResponse](../../models/operations/EventCheckInResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteEventCheckIn

Deletes the event check-in of attendee.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteEventCheckIn" method="delete" path="/events/{id}/check-in/{attendeeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteEventCheckInRequest;
import com.cvent.models.operations.DeleteEventCheckInResponse;
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

        DeleteEventCheckInRequest req = DeleteEventCheckInRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteEventCheckInResponse res = sdk.events().deleteEventCheckIn()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteEventCheckInRequest](../../models/operations/DeleteEventCheckInRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteEventCheckInResponse](../../models/operations/DeleteEventCheckInResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## copyEvent

Copies the event details provided in the request body. Supports either creating a new event using the
copied data, or inserting the copied data to an existing event.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="copyEvent" method="post" path="/events/{id}/copy" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CopyEventRequest;
import com.cvent.models.operations.CopyEventResponse;
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

        CopyEventRequest req = CopyEventRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .eventCopy(EventCopy.builder()
                    .event(EventCopyTargetJson.builder()
                        .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                        .build())
                    .registration(RegistrationEventCopyOverride.builder()
                        .build())
                    .planning(PlanningEventCopyOverride.builder()
                        .build())
                    .agenda(AgendaEventCopyOverride.builder()
                        .build())
                    .travel(TravelEventCopyOverride.builder()
                        .build())
                    .surveys(SurveysEventCopyOverride.builder()
                        .build())
                    .speakers(SpeakersEventCopyOverride.builder()
                        .build())
                    .exhibitors(ExhibitorsEventCopyOverride.builder()
                        .build())
                    .build())
                .build();

        CopyEventResponse res = sdk.events().copyEvent()
                .request(req)
                .call();

        if (res.eventAsyncResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [CopyEventRequest](../../models/operations/CopyEventRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CopyEventResponse](../../models/operations/CopyEventResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## answerEventCustomField

Answer a single custom field for an event. Event custom fields are used to store extra 
information about an event, such as the event type or event region.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="answerEventCustomField" method="put" path="/events/{id}/custom-fields/{customFieldId}/answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AnswerEventCustomFieldRequest;
import com.cvent.models.operations.AnswerEventCustomFieldResponse;
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

        AnswerEventCustomFieldRequest req = AnswerEventCustomFieldRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customFieldId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .customField(CustomFieldInput.builder()
                    .id("8daec569-a328-48c3-b205-1fc913fc7c81")
                    .value(List.of(
                        "Choice C",
                        "Choice A"))
                    .type(CustomFieldCustomFieldType.GENERAL)
                    .build())
                .build();

        AnswerEventCustomFieldResponse res = sdk.events().answerEventCustomField()
                .request(req)
                .call();

        if (res.customField().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AnswerEventCustomFieldRequest](../../models/operations/AnswerEventCustomFieldRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AnswerEventCustomFieldResponse](../../models/operations/AnswerEventCustomFieldResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listDonationItems

Gets a paginated list of donation items. Donation items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="java" operationID="listDonationItems" method="get" path="/events/{id}/donation-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListDonationItemsRequest;
import com.cvent.models.operations.ListDonationItemsResponse;
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

        ListDonationItemsRequest req = ListDonationItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and registrationTypes in ('1b01ae34-6970-41f2-a4e8-b4f39185dc28')")
                .build();


        sdk.events().listDonationItems()
                .callAsStream()
                .forEach((ListDonationItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListDonationItemsRequest](../../models/operations/ListDonationItemsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListDonationItemsResponse](../../models/operations/ListDonationItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listDonationItemsPostFilter

Gets a paginated list of donation items by sending a filter in the body of the request. Donation items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="java" operationID="listDonationItemsPostFilter" method="post" path="/events/{id}/donation-items/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListDonationItemsPostFilterRequest;
import com.cvent.models.operations.ListDonationItemsPostFilterResponse;
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

        ListDonationItemsPostFilterRequest req = ListDonationItemsPostFilterRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16')")
                    .build())
                .build();


        sdk.events().listDonationItemsPostFilter()
                .callAsStream()
                .forEach((ListDonationItemsPostFilterResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListDonationItemsPostFilterRequest](../../models/operations/ListDonationItemsPostFilterRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListDonationItemsPostFilterResponse](../../models/operations/ListDonationItemsPostFilterResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listEventEmails

Gets a paginated list of emails for a given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listEventEmails" method="get" path="/events/{id}/emails" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListEventEmailsRequest;
import com.cvent.models.operations.ListEventEmailsResponse;
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

        ListEventEmailsRequest req = ListEventEmailsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq 'a150f1ee-6c54-4b01-90e6-d701748f0851'")
                .build();


        sdk.events().listEventEmails()
                .callAsStream()
                .forEach((ListEventEmailsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListEventEmailsRequest](../../models/operations/ListEventEmailsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListEventEmailsResponse](../../models/operations/ListEventEmailsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listFeeItems

Gets a paginated list of fee items associated with the event.


### Example Usage

<!-- UsageSnippet language="java" operationID="listFeeItems" method="get" path="/events/{id}/fee-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListFeeItemsRequest;
import com.cvent.models.operations.ListFeeItemsResponse;
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

        ListFeeItemsRequest req = ListFeeItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or product.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d6'")
                .build();


        sdk.events().listFeeItems()
                .callAsStream()
                .forEach((ListFeeItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListFeeItemsRequest](../../models/operations/ListFeeItemsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListFeeItemsResponse](../../models/operations/ListFeeItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getInvitationList

Gets a paginated list of invitation lists for a given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getInvitationList" method="get" path="/events/{id}/invitation-lists" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetInvitationListRequest;
import com.cvent.models.operations.GetInvitationListResponse;
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

        GetInvitationListRequest req = GetInvitationListRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq 'a150f1ee-6c54-4b01-90e6-d701748f0851'")
                .build();


        sdk.events().getInvitationList()
                .callAsStream()
                .forEach((GetInvitationListResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetInvitationListRequest](../../models/operations/GetInvitationListRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetInvitationListResponse](../../models/operations/GetInvitationListResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listMembershipItems

Gets a paginated list of membership items. [Membership items](https://support.cvent.com/s/communityarticle/Setting-Up-Memberships) are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items) that can be purchased during registration.


### Example Usage

<!-- UsageSnippet language="java" operationID="listMembershipItems" method="get" path="/events/{id}/membership-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListMembershipItemsRequest;
import com.cvent.models.operations.ListMembershipItemsResponse;
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

        ListMembershipItemsRequest req = ListMembershipItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and registrationTypes in ('1b01ae34-6970-41f2-a4e8-b4f39185dc28')")
                .build();


        sdk.events().listMembershipItems()
                .callAsStream()
                .forEach((ListMembershipItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListMembershipItemsRequest](../../models/operations/ListMembershipItemsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListMembershipItemsResponse](../../models/operations/ListMembershipItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getOrders

Gets a paginated list of Orders in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getOrders" method="get" path="/events/{id}/orders" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetOrdersRequest;
import com.cvent.models.operations.GetOrdersResponse;
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

        GetOrdersRequest req = GetOrdersRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("attendee.id eq '78b3d72a-1851-46f4-a837-5f8613f4db83' AND (type eq 'Online Charge' OR type eq 'Online Refund')")
                .build();


        sdk.events().getOrders()
                .callAsStream()
                .forEach((GetOrdersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetOrdersRequest](../../models/operations/GetOrdersRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetOrdersResponse](../../models/operations/GetOrdersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getOrderItems

Gets a paginated list of Order items in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getOrderItems" method="get" path="/events/{id}/orders/items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetOrderItemsRequest;
import com.cvent.models.operations.GetOrderItemsResponse;
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

        GetOrderItemsRequest req = GetOrderItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("attendee.id eq '78b3d72a-1851-46f4-a837-5f8613f4db83' AND (product.id eq '65322e75-076f-4070-a6e6-3315c581728d' OR product.id eq 'e1874067-a5ed-4111-ac8a-63de9aa18929')")
                .build();


        sdk.events().getOrderItems()
                .callAsStream()
                .forEach((GetOrderItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetOrderItemsRequest](../../models/operations/GetOrderItemsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetOrderItemsResponse](../../models/operations/GetOrderItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## associateDiscountCodeToOrderItem

Assigns a discount code to an order item based on the given IDs.

### Example Usage

<!-- UsageSnippet language="java" operationID="associateDiscountCodeToOrderItem" method="put" path="/events/{id}/orders/{orderId}/items/{orderItemId}/discounts/{discountCode}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AssociateDiscountCodeToOrderItemRequest;
import com.cvent.models.operations.AssociateDiscountCodeToOrderItemResponse;
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

        AssociateDiscountCodeToOrderItemRequest req = AssociateDiscountCodeToOrderItemRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .orderId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .orderItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .discountCode("HALF_OFF")
                .orderItemAssociateDiscount(OrderItemAssociateDiscount.builder()
                    .event(EventJson.builder()
                        .id("4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56")
                        .build())
                    .order(OrderJson.builder()
                        .id("6c0e8d1f-8fd6-4ebe-977a-602b4a1f9c43")
                        .build())
                    .item(OrderItemJson0.builder()
                        .id("6c0e8d1f-8fd6-4ebe-977a-602b4a1f9c43")
                        .build())
                    .amountOrdered(15.35)
                    .build())
                .build();

        AssociateDiscountCodeToOrderItemResponse res = sdk.events().associateDiscountCodeToOrderItem()
                .request(req)
                .call();

        if (res.orderItemResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [AssociateDiscountCodeToOrderItemRequest](../../models/operations/AssociateDiscountCodeToOrderItemRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[AssociateDiscountCodeToOrderItemResponse](../../models/operations/AssociateDiscountCodeToOrderItemResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listQuantityItems

Gets a paginated list of quantity items. Quantity items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="java" operationID="listQuantityItems" method="get" path="/events/{id}/quantity-items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListQuantityItemsRequest;
import com.cvent.models.operations.ListQuantityItemsResponse;
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

        ListQuantityItemsRequest req = ListQuantityItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and registrationTypes in ('1b01ae34-6970-41f2-a4e8-b4f39185dc28')")
                .build();


        sdk.events().listQuantityItems()
                .callAsStream()
                .forEach((ListQuantityItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListQuantityItemsRequest](../../models/operations/ListQuantityItemsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListQuantityItemsResponse](../../models/operations/ListQuantityItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listQuantityItemsPostFilter

Gets a paginated list of quantity items by sending a filter in the body of the request. Quantity items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="java" operationID="listQuantityItemsPostFilter" method="post" path="/events/{id}/quantity-items/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListQuantityItemsPostFilterRequest;
import com.cvent.models.operations.ListQuantityItemsPostFilterResponse;
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

        ListQuantityItemsPostFilterRequest req = ListQuantityItemsPostFilterRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16')")
                    .build())
                .build();


        sdk.events().listQuantityItemsPostFilter()
                .callAsStream()
                .forEach((ListQuantityItemsPostFilterResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [ListQuantityItemsPostFilterRequest](../../models/operations/ListQuantityItemsPostFilterRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[ListQuantityItemsPostFilterResponse](../../models/operations/ListQuantityItemsPostFilterResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listRegistrationPaths

Gets a paginated list of registration paths.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listRegistrationPaths" method="get" path="/events/{id}/registration-paths" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListRegistrationPathsRequest;
import com.cvent.models.operations.ListRegistrationPathsResponse;
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

        ListRegistrationPathsRequest req = ListRegistrationPathsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .locale("en-US")
                .build();


        sdk.events().listRegistrationPaths()
                .callAsStream()
                .forEach((ListRegistrationPathsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListRegistrationPathsRequest](../../models/operations/ListRegistrationPathsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListRegistrationPathsResponse](../../models/operations/ListRegistrationPathsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listRegistrationTypes

Gets a paginated list of registration types.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listRegistrationTypes" method="get" path="/events/{id}/registration-types" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListRegistrationTypesRequest;
import com.cvent.models.operations.ListRegistrationTypesResponse;
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

        ListRegistrationTypesRequest req = ListRegistrationTypesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.events().listRegistrationTypes()
                .callAsStream()
                .forEach((ListRegistrationTypesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListRegistrationTypesRequest](../../models/operations/ListRegistrationTypesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListRegistrationTypesResponse](../../models/operations/ListRegistrationTypesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateRegistrationType

Updates an attendee's registration type in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRegistrationType" method="put" path="/events/{id}/registration-types/{registrationTypeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateRegistrationTypeRequest;
import com.cvent.models.operations.UpdateRegistrationTypeResponse;
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

        UpdateRegistrationTypeRequest req = UpdateRegistrationTypeRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .registrationTypeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .registrationTypeUpdate(RegistrationTypeUpdateInput.builder()
                    .openForRegistration(true)
                    .automaticOpenDate(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                    .automaticEndDate(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                    .capacity(CapacityJson1Input.builder()
                        .total(100L)
                        .build())
                    .build())
                .build();

        UpdateRegistrationTypeResponse res = sdk.events().updateRegistrationType()
                .request(req)
                .call();

        if (res.registrationTypeUpdate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UpdateRegistrationTypeRequest](../../models/operations/UpdateRegistrationTypeRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[UpdateRegistrationTypeResponse](../../models/operations/UpdateRegistrationTypeResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTransactions

Gets a paginated list of Transactions in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getTransactions" method="get" path="/events/{id}/transactions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTransactionsRequest;
import com.cvent.models.operations.GetTransactionsResponse;
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

        GetTransactionsRequest req = GetTransactionsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("attendee.id eq 'f4af0b94-4427-46f8-bea0-b06af2a0af80' AND (paymentType eq 'Online Charge' OR paymentType eq 'Online Refund')")
                .build();


        sdk.events().getTransactions()
                .callAsStream()
                .forEach((GetTransactionsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTransactionsRequest](../../models/operations/GetTransactionsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetTransactionsResponse](../../models/operations/GetTransactionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## postTransactions

Create offline transactions for an order in your event. Offline transactions can be any digital or physical transactions performed outside Cvent. Valid transaction types for this method include Offline Charge and Offline Refund.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="postTransactions" method="post" path="/events/{id}/transactions" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.PostTransactionsRequest;
import com.cvent.models.operations.PostTransactionsResponse;
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

        PostTransactionsRequest req = PostTransactionsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .createTransactionRequest(CreateTransactionRequestInput.builder()
                    .paymentType(PaymentTypeCreateJson.OFFLINE_CHARGE)
                    .paymentMethod(PaymentMethodJson.MASTERCARD)
                    .date(OffsetDateTime.parse("2018-01-13T02:00:00Z"))
                    .event(EventJson.builder()
                        .id("4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56")
                        .build())
                    .attendee(AttendeeJson.builder()
                        .id("5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43")
                        .build())
                    .batchNumber("112021-0017")
                    .referenceNumber("112021-0017")
                    .amount(15.25)
                    .paymentNote("Payment notes")
                    .transactionItems(List.of(
                        TransactionItemCreateJsonInput.builder()
                            .product(ProductOrderItemJsonInput.builder()
                                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                                .build())
                            .amount(15.25)
                            .build()))
                    .build())
                .build();

        PostTransactionsResponse res = sdk.events().postTransactions()
                .request(req)
                .call();

        if (res.createTransactionRequest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PostTransactionsRequest](../../models/operations/PostTransactionsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PostTransactionsResponse](../../models/operations/PostTransactionsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getTransactionItems

Gets a paginated list of Transaction items in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getTransactionItems" method="get" path="/events/{id}/transactions/items" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetTransactionItemsRequest;
import com.cvent.models.operations.GetTransactionItemsResponse;
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

        GetTransactionItemsRequest req = GetTransactionItemsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("attendee.id eq '78b3d72a-1851-46f4-a837-5f8613f4db83' AND (transaction.id eq '82da8c60-24f4-47d0-b6e2-429b18a4bb7c' OR transaction.id eq '034bb884-05de-4818-b9f9-5144495d5495')")
                .build();


        sdk.events().getTransactionItems()
                .callAsStream()
                .forEach((GetTransactionItemsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetTransactionItemsRequest](../../models/operations/GetTransactionItemsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetTransactionItemsResponse](../../models/operations/GetTransactionItemsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listEventUserGroups

Gets a paginated list of user groups associated with an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listEventUserGroups" method="get" path="/events/{id}/user-groups" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListEventUserGroupsRequest;
import com.cvent.models.operations.ListEventUserGroupsResponse;
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

        ListEventUserGroupsRequest req = ListEventUserGroupsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.events().listEventUserGroups()
                .callAsStream()
                .forEach((ListEventUserGroupsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListEventUserGroupsRequest](../../models/operations/ListEventUserGroupsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListEventUserGroupsResponse](../../models/operations/ListEventUserGroupsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## associateEventUserGroup

Associates (adds) a user group to an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="associateEventUserGroup" method="put" path="/events/{id}/user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.AssociateEventUserGroupRequest;
import com.cvent.models.operations.AssociateEventUserGroupResponse;
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

        AssociateEventUserGroupRequest req = AssociateEventUserGroupRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .userGroupId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        AssociateEventUserGroupResponse res = sdk.events().associateEventUserGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [AssociateEventUserGroupRequest](../../models/operations/AssociateEventUserGroupRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[AssociateEventUserGroupResponse](../../models/operations/AssociateEventUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## disassociateEventUserGroup

Disassociates (removes) a single user group from an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="disassociateEventUserGroup" method="delete" path="/events/{id}/user-groups/{userGroupId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DisassociateEventUserGroupRequest;
import com.cvent.models.operations.DisassociateEventUserGroupResponse;
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

        DisassociateEventUserGroupRequest req = DisassociateEventUserGroupRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .userGroupId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DisassociateEventUserGroupResponse res = sdk.events().disassociateEventUserGroup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [DisassociateEventUserGroupRequest](../../models/operations/DisassociateEventUserGroupRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[DisassociateEventUserGroupResponse](../../models/operations/DisassociateEventUserGroupResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateQuantityItemRegistrationForAttendee

Update a specific [quantity item](https://support.cvent.com/s/communityarticle/Creating-Quantity-Items) for an attendee's registration based on the details supplied in the body of the request.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateQuantityItemRegistrationForAttendee" method="put" path="/quantity-items/{quantityItemId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateQuantityItemRegistrationForAttendeeRequest;
import com.cvent.models.operations.UpdateQuantityItemRegistrationForAttendeeResponse;
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

        UpdateQuantityItemRegistrationForAttendeeRequest req = UpdateQuantityItemRegistrationForAttendeeRequest.builder()
                .quantityItemId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .quantityItemUpdate(QuantityItemUpdate.builder()
                    .id("8163c74e-18c6-401a-a710-ae0f485bf059")
                    .attendee(QuantityItemUpdateAttendee.builder()
                        .id("9463c74e-18c6-401a-a710-ae0f485bf059")
                        .build())
                    .updatedQuantity(5L)
                    .sendEmail(false)
                    .build())
                .build();

        UpdateQuantityItemRegistrationForAttendeeResponse res = sdk.events().updateQuantityItemRegistrationForAttendee()
                .request(req)
                .call();

        if (res.quantityItemUpdate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                       | Type                                                                                                                            | Required                                                                                                                        | Description                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                       | [UpdateQuantityItemRegistrationForAttendeeRequest](../../models/operations/UpdateQuantityItemRegistrationForAttendeeRequest.md) | :heavy_check_mark:                                                                                                              | The request object to use for the request.                                                                                      |

### Response

**[UpdateQuantityItemRegistrationForAttendeeResponse](../../models/operations/UpdateQuantityItemRegistrationForAttendeeResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionsAttendance

Get a paginated list of session attendance.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionsAttendance" method="get" path="/sessions/attendance" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionsAttendanceRequest;
import com.cvent.models.operations.ListSessionsAttendanceResponse;
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

        ListSessionsAttendanceRequest req = ListSessionsAttendanceRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c::2ffa56d9-9f60-4b8c-8b3b-3451de21293c'")
                .build();


        sdk.events().listSessionsAttendance()
                .callAsStream()
                .forEach((ListSessionsAttendanceResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSessionsAttendanceRequest](../../models/operations/ListSessionsAttendanceRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSessionsAttendanceResponse](../../models/operations/ListSessionsAttendanceResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionsEnrollment

Gets registrant data for sessions. The returned data depends on the individual session type.
- **Optional Sessions:** Provides a paginated list of attendees registered for the session.
- **Included Session:** Provides a paginated list of attendees who have participated or marked as no-shows. It does not list all registered attendees.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionsEnrollment" method="get" path="/sessions/enrollment" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionsEnrollmentRequest;
import com.cvent.models.operations.ListSessionsEnrollmentResponse;
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

        ListSessionsEnrollmentRequest req = ListSessionsEnrollmentRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c::2ffa56d9-9f60-4b8c-8b3b-3451de21293c'")
                .build();


        sdk.events().listSessionsEnrollment()
                .callAsStream()
                .forEach((ListSessionsEnrollmentResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListSessionsEnrollmentRequest](../../models/operations/ListSessionsEnrollmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListSessionsEnrollmentResponse](../../models/operations/ListSessionsEnrollmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listSessionsEnrollmentPostFilter

Gets registrant data for sessions. The returned data depends on the individual session type.   - **Optional Sessions:** Provides a paginated list of attendees registered for the session.   - **Included Session:** Provides a paginated list of attendees who have participated or been
  marked as no-shows. It does not list all registered attendees.

This method will return the same data as [GET List Session Registrants](#operation/listSessionsEnrollment)  but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessionsEnrollmentPostFilter" method="post" path="/sessions/enrollment/filter" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListSessionsEnrollmentPostFilterRequest;
import com.cvent.models.operations.ListSessionsEnrollmentPostFilterResponse;
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

        ListSessionsEnrollmentPostFilterRequest req = ListSessionsEnrollmentPostFilterRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter(Filter.builder()
                    .filter("id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c::2ffa56d9-9f60-4b8c-8b3b-3451de21293c'")
                    .build())
                .build();


        sdk.events().listSessionsEnrollmentPostFilter()
                .callAsStream()
                .forEach((ListSessionsEnrollmentPostFilterResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [ListSessionsEnrollmentPostFilterRequest](../../models/operations/ListSessionsEnrollmentPostFilterRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[ListSessionsEnrollmentPostFilterResponse](../../models/operations/ListSessionsEnrollmentPostFilterResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSessionAttendance

Deletes the attendance of an attendee in a session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSessionAttendance" method="delete" path="/sessions/{id}/attendance/{attendeeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSessionAttendanceRequest;
import com.cvent.models.operations.DeleteSessionAttendanceResponse;
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

        DeleteSessionAttendanceRequest req = DeleteSessionAttendanceRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSessionAttendanceResponse res = sdk.events().deleteSessionAttendance()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [DeleteSessionAttendanceRequest](../../models/operations/DeleteSessionAttendanceRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[DeleteSessionAttendanceResponse](../../models/operations/DeleteSessionAttendanceResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## sessionCheckIn

Check-in attendees to a session based on the attendee IDs provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="sessionCheckIn" method="post" path="/sessions/{id}/check-in" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.SessionCheckInRequest;
import com.cvent.models.operations.SessionCheckInResponse;
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

        SessionCheckInRequest req = SessionCheckInRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestBody(List.of())
                .build();

        SessionCheckInResponse res = sdk.events().sessionCheckIn()
                .request(req)
                .call();

        if (res.attendeeAddBulkResponse1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [SessionCheckInRequest](../../models/operations/SessionCheckInRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[SessionCheckInResponse](../../models/operations/SessionCheckInResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateSessionCheckIn

Update check-in details of attendees in a session based on the attendee IDs provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateSessionCheckIn" method="put" path="/sessions/{id}/check-in" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateSessionCheckInRequest;
import com.cvent.models.operations.UpdateSessionCheckInResponse;
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

        UpdateSessionCheckInRequest req = UpdateSessionCheckInRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .requestBody(List.of())
                .build();

        UpdateSessionCheckInResponse res = sdk.events().updateSessionCheckIn()
                .request(req)
                .call();

        if (res.attendeeAddBulkResponse1().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateSessionCheckInRequest](../../models/operations/UpdateSessionCheckInRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateSessionCheckInResponse](../../models/operations/UpdateSessionCheckInResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createSessionEnrollment

Register an attendee in the given session. Requires the modify registration widget to be
present on the event's registration path. See the following
[article](https://support.cvent.com/s/communityarticle/Modifying-Registrations#modifyown) for
more information.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createSessionEnrollment" method="post" path="/sessions/{id}/enrollment/{attendeeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateSessionEnrollmentRequest;
import com.cvent.models.operations.CreateSessionEnrollmentResponse;
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

        CreateSessionEnrollmentRequest req = CreateSessionEnrollmentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        CreateSessionEnrollmentResponse res = sdk.events().createSessionEnrollment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CreateSessionEnrollmentRequest](../../models/operations/CreateSessionEnrollmentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateSessionEnrollmentResponse](../../models/operations/CreateSessionEnrollmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## deleteSessionEnrollment

Unregister an attendee from a session. Requires the modify registration widget
to be present on the event's registration path. See the following
[article](https://support.cvent.com/s/communityarticle/Modifying-Registrations#modifyown)
for more information.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSessionEnrollment" method="delete" path="/sessions/{id}/enrollment/{attendeeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.DeleteSessionEnrollmentRequest;
import com.cvent.models.operations.DeleteSessionEnrollmentResponse;
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

        DeleteSessionEnrollmentRequest req = DeleteSessionEnrollmentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .attendeeId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        DeleteSessionEnrollmentResponse res = sdk.events().deleteSessionEnrollment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [DeleteSessionEnrollmentRequest](../../models/operations/DeleteSessionEnrollmentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[DeleteSessionEnrollmentResponse](../../models/operations/DeleteSessionEnrollmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
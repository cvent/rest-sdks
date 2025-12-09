# Appointments

## Overview

An appointment is a meeting scheduled between two or more parties. These APIs allow you to get
 information about your Cvent Appointments: appointment attendees, their interests, and availabilities.


* **Appointment Events** - Appointment events help planners facilitate meetings between attendees. Attendees express their interest and availability to schedule appointments. Use this API to get information about appointments and appointment attendees.

* **Appointment Attendees** - Appointment attendees are meeting participants. They can be attendees of either events or appointment events. Get information about these participants or use their appointment attendee ID to get their availabilities and interests.

* **Availability** - Appointment availabilities describe an appointment attendees' preference in meeting dates and times. Availability information is only available for *Planner Coordinated Appointments*.

* **Interests** - Appointment interests describe appointment attendees' preferences in meeting with another organization or individual. Interest information is only available for *Planner Coordinated Appointments*.
* **Available Times** - Available times lists time ranges available  for appointments scheduling.
* **Locations** - Locations lists details of all locations created for  scheduling appointments.
* **Appointment Types** - Appointment Types lists details of different  appointment types created.


### Available Operations

* [listAppointmentAttendees](#listappointmentattendees) - List Appt Attendees
* [getAppointmentAttendeeById](#getappointmentattendeebyid) - Get Appt Attendee
* [listAvailability](#listavailability) - List Availability
* [getAvailabilityById](#getavailabilitybyid) - Get Availability
* [listAppointmentEvents](#listappointmentevents) - List Appt Events
* [getAppointmentEventById](#getappointmenteventbyid) - Get Appt Event
* [listAvailableTimes](#listavailabletimes) - List Available Times
* [listAppointmentTypes](#listappointmenttypes) - List Appointment Types
* [createAppointment](#createappointment) - Create Appointment
* [updateAppointment](#updateappointment) - Update Appointments
* [cancelAppointment](#cancelappointment) - Cancel Appointment
* [listLocations](#listlocations) - List Locations
* [listMeetingInterests](#listmeetinginterests) - List Interests
* [getMeetingInterestById](#getmeetinginterestbyid) - Get Interest
* [listAppointments](#listappointments) - List Appointments
* [getAppointmentById](#getappointmentbyid) - Get Appointment

## listAppointmentAttendees

Gets a paginated list of appointment attendees.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAppointmentAttendees" method="get" path="/appointment-attendees" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAppointmentAttendeesRequest;
import com.cvent.models.operations.ListAppointmentAttendeesResponse;
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

        ListAppointmentAttendeesRequest req = ListAppointmentAttendeesRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("appointmentEvent.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71' and contact.id eq 'da561161-8e80-4c70-9663-750cbc2045f6' and deleted eq 'false'")
                .build();


        sdk.appointments().listAppointmentAttendees()
                .callAsStream()
                .forEach((ListAppointmentAttendeesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [ListAppointmentAttendeesRequest](../../models/operations/ListAppointmentAttendeesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[ListAppointmentAttendeesResponse](../../models/operations/ListAppointmentAttendeesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAppointmentAttendeeById

Gets a single appointment attendee by their ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAppointmentAttendeeById" method="get" path="/appointment-attendees/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAppointmentAttendeeByIdRequest;
import com.cvent.models.operations.GetAppointmentAttendeeByIdResponse;
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

        GetAppointmentAttendeeByIdRequest req = GetAppointmentAttendeeByIdRequest.builder()
                .id("0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715")
                .build();

        GetAppointmentAttendeeByIdResponse res = sdk.appointments().getAppointmentAttendeeById()
                .request(req)
                .call();

        if (res.appointmentAttendee().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetAppointmentAttendeeByIdRequest](../../models/operations/GetAppointmentAttendeeByIdRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetAppointmentAttendeeByIdResponse](../../models/operations/GetAppointmentAttendeeByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAvailability

Gets a paginated list of appointment availability times.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAvailability" method="get" path="/appointment-availability-times" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAvailabilityRequest;
import com.cvent.models.operations.ListAvailabilityResponse;
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

        ListAvailabilityRequest req = ListAvailabilityRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("appointmentEvent.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71'")
                .build();


        sdk.appointments().listAvailability()
                .callAsStream()
                .forEach((ListAvailabilityResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAvailabilityRequest](../../models/operations/ListAvailabilityRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAvailabilityResponse](../../models/operations/ListAvailabilityResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAvailabilityById

Get a single appointment availability time by its ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAvailabilityById" method="get" path="/appointment-availability-times/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAvailabilityByIdRequest;
import com.cvent.models.operations.GetAvailabilityByIdResponse;
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

        GetAvailabilityByIdRequest req = GetAvailabilityByIdRequest.builder()
                .id("da8b035b-428b-4069-b25b-92afbcf514b3::2d8234f1-55df-483c-abe3-7e2cb98f8275")
                .build();

        GetAvailabilityByIdResponse res = sdk.appointments().getAvailabilityById()
                .request(req)
                .call();

        if (res.appointmentAvailability().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAvailabilityByIdRequest](../../models/operations/GetAvailabilityByIdRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAvailabilityByIdResponse](../../models/operations/GetAvailabilityByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404               | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAppointmentEvents

Gets a paginated list of appointment events.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAppointmentEvents" method="get" path="/appointment-events" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAppointmentEventsRequest;
import com.cvent.models.operations.ListAppointmentEventsResponse;
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

        ListAppointmentEventsRequest req = ListAppointmentEventsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("event.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71'")
                .build();


        sdk.appointments().listAppointmentEvents()
                .callAsStream()
                .forEach((ListAppointmentEventsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAppointmentEventsRequest](../../models/operations/ListAppointmentEventsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAppointmentEventsResponse](../../models/operations/ListAppointmentEventsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAppointmentEventById

Gets a single appointment event by its ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAppointmentEventById" method="get" path="/appointment-events/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAppointmentEventByIdRequest;
import com.cvent.models.operations.GetAppointmentEventByIdResponse;
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

        GetAppointmentEventByIdRequest req = GetAppointmentEventByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetAppointmentEventByIdResponse res = sdk.appointments().getAppointmentEventById()
                .request(req)
                .call();

        if (res.appointmentEvent().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetAppointmentEventByIdRequest](../../models/operations/GetAppointmentEventByIdRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetAppointmentEventByIdResponse](../../models/operations/GetAppointmentEventByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAvailableTimes

Gets a paginated list of times and locations available for scheduling appointments in a particular appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAvailableTimes" method="get" path="/appointment-events/{id}/appointment-available-times" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAvailableTimesRequest;
import com.cvent.models.operations.ListAvailableTimesResponse;
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

        ListAvailableTimesRequest req = ListAvailableTimesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("appointmentType.id eq '2925dd1c-7b02-4e34-8881-18f2360b50a7'")
                .build();


        sdk.appointments().listAvailableTimes()
                .callAsStream()
                .forEach((ListAvailableTimesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListAvailableTimesRequest](../../models/operations/ListAvailableTimesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListAvailableTimesResponse](../../models/operations/ListAvailableTimesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAppointmentTypes

Gets a paginated list of appointment types for an appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAppointmentTypes" method="get" path="/appointment-events/{id}/appointment-types" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAppointmentTypesRequest;
import com.cvent.models.operations.ListAppointmentTypesResponse;
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

        ListAppointmentTypesRequest req = ListAppointmentTypesRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.appointments().listAppointmentTypes()
                .callAsStream()
                .forEach((ListAppointmentTypesResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAppointmentTypesRequest](../../models/operations/ListAppointmentTypesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAppointmentTypesResponse](../../models/operations/ListAppointmentTypesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createAppointment

Creates an appointment in a given appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="createAppointment" method="post" path="/appointment-events/{id}/appointments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateAppointmentRequest;
import com.cvent.models.operations.CreateAppointmentResponse;
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

        CreateAppointmentRequest req = CreateAppointmentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .createAppointmentRequest(com.cvent.models.components.CreateAppointmentRequest.builder()
                    .subject("Meeting with Cvent")
                    .startTime(OffsetDateTime.parse("2017-01-01T15:20:00Z"))
                    .endTime(OffsetDateTime.parse("2030-01-01T15:30:00Z"))
                    .hosts(List.of(
                        UuidJson.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .build()))
                    .appointmentTypeId("b53dc938-8121-4af1-a5e2-d9f3f4fcd574")
                    .description("A private meeting to discuss sales opportunities.")
                    .location("fa896667-5998-46dc-ac06-6be8e053ef4e")
                    .customLocationName("Coffee Shop")
                    .attendees(List.of(
                        UuidJson.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .build()))
                    .code("APPT-0001")
                    .autoAccept(true)
                    .build())
                .build();

        CreateAppointmentResponse res = sdk.appointments().createAppointment()
                .request(req)
                .call();

        if (res.appointment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateAppointmentRequest](../../models/operations/CreateAppointmentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateAppointmentResponse](../../models/operations/CreateAppointmentResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 422, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## updateAppointment

Updates an appointment based on the given ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="updateAppointment" method="put" path="/appointment-events/{id}/appointments/{apptId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateAppointmentRequest;
import com.cvent.models.operations.UpdateAppointmentResponse;
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

        UpdateAppointmentRequest req = UpdateAppointmentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .apptId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .updateAppointmentRequest(com.cvent.models.components.UpdateAppointmentRequest.builder()
                    .subject("Meeting with Cvent")
                    .startTime(OffsetDateTime.parse("2017-01-01T15:20:00Z"))
                    .endTime(OffsetDateTime.parse("2030-01-01T15:30:00Z"))
                    .hosts(List.of(
                        UuidJson.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .build()))
                    .id("a3d77c44-bb4b-41dd-9c37-18230cc66ce4")
                    .description("A private meeting to discuss sales opportunities.")
                    .location("fa896667-5998-46dc-ac06-6be8e053ef4e")
                    .customLocationName("Coffee Shop")
                    .attendees(List.of(
                        UuidJson.builder()
                            .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                            .build()))
                    .build())
                .build();

        UpdateAppointmentResponse res = sdk.appointments().updateAppointment()
                .request(req)
                .call();

        if (res.appointment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateAppointmentRequest](../../models/operations/UpdateAppointmentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateAppointmentResponse](../../models/operations/UpdateAppointmentResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse  | 400, 401, 403, 404, 422, 429 | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## cancelAppointment

Cancels an appointment with the given appointment ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelAppointment" method="delete" path="/appointment-events/{id}/appointments/{apptId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CancelAppointmentRequest;
import com.cvent.models.operations.CancelAppointmentResponse;
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

        CancelAppointmentRequest req = CancelAppointmentRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .apptId("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        CancelAppointmentResponse res = sdk.appointments().cancelAppointment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CancelAppointmentRequest](../../models/operations/CancelAppointmentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CancelAppointmentResponse](../../models/operations/CancelAppointmentResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listLocations

Gets a paginated list of appointment locations in a particular appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listLocations" method="get" path="/appointment-events/{id}/locations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListLocationsRequest;
import com.cvent.models.operations.ListLocationsResponse;
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

        ListLocationsRequest req = ListLocationsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();


        sdk.appointments().listLocations()
                .callAsStream()
                .forEach((ListLocationsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListLocationsRequest](../../models/operations/ListLocationsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListLocationsResponse](../../models/operations/ListLocationsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listMeetingInterests

Gets a paginated list of appointment meeting interests.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listMeetingInterests" method="get" path="/appointment-meeting-interests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListMeetingInterestsRequest;
import com.cvent.models.operations.ListMeetingInterestsResponse;
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

        ListMeetingInterestsRequest req = ListMeetingInterestsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("appointmentEvent.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71'")
                .build();


        sdk.appointments().listMeetingInterests()
                .callAsStream()
                .forEach((ListMeetingInterestsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListMeetingInterestsRequest](../../models/operations/ListMeetingInterestsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListMeetingInterestsResponse](../../models/operations/ListMeetingInterestsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403               | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getMeetingInterestById

Gets a single attendee's meeting interests in a particular appointment event by their interest ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getMeetingInterestById" method="get" path="/appointment-meeting-interests/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetMeetingInterestByIdRequest;
import com.cvent.models.operations.GetMeetingInterestByIdResponse;
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

        GetMeetingInterestByIdRequest req = GetMeetingInterestByIdRequest.builder()
                .id("0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715")
                .build();

        GetMeetingInterestByIdResponse res = sdk.appointments().getMeetingInterestById()
                .request(req)
                .call();

        if (res.attendeeAppointmentMeetingInterest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetMeetingInterestByIdRequest](../../models/operations/GetMeetingInterestByIdRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetMeetingInterestByIdResponse](../../models/operations/GetMeetingInterestByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404               | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## listAppointments

Gets a paginated list of appointments.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="listAppointments" method="get" path="/appointments" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ListAppointmentsRequest;
import com.cvent.models.operations.ListAppointmentsResponse;
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

        ListAppointmentsRequest req = ListAppointmentsRequest.builder()
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("appointmentEvent.id eq 'ad0ea301-1203-4fee-a7d2-54165ba14e2d'")
                .build();


        sdk.appointments().listAppointments()
                .callAsStream()
                .forEach((ListAppointmentsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListAppointmentsRequest](../../models/operations/ListAppointmentsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListAppointmentsResponse](../../models/operations/ListAppointmentsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403               | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAppointmentById

Gets a single appointment by its ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="getAppointmentById" method="get" path="/appointments/{id}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAppointmentByIdRequest;
import com.cvent.models.operations.GetAppointmentByIdResponse;
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

        GetAppointmentByIdRequest req = GetAppointmentByIdRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .build();

        GetAppointmentByIdResponse res = sdk.appointments().getAppointmentById()
                .request(req)
                .call();

        if (res.appointment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAppointmentByIdRequest](../../models/operations/GetAppointmentByIdRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAppointmentByIdResponse](../../models/operations/GetAppointmentByIdResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404               | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
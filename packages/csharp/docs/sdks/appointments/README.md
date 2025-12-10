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

* [ListAppointmentAttendees](#listappointmentattendees) - List Appt Attendees
* [GetAppointmentAttendeeById](#getappointmentattendeebyid) - Get Appt Attendee
* [ListAvailability](#listavailability) - List Availability
* [GetAvailabilityById](#getavailabilitybyid) - Get Availability
* [ListAppointmentEvents](#listappointmentevents) - List Appt Events
* [GetAppointmentEventById](#getappointmenteventbyid) - Get Appt Event
* [ListAvailableTimes](#listavailabletimes) - List Available Times
* [ListAppointmentTypes](#listappointmenttypes) - List Appointment Types
* [CreateAppointment](#createappointment) - Create Appointment
* [UpdateAppointment](#updateappointment) - Update Appointments
* [CancelAppointment](#cancelappointment) - Cancel Appointment
* [ListLocations](#listlocations) - List Locations
* [ListMeetingInterests](#listmeetinginterests) - List Interests
* [GetMeetingInterestById](#getmeetinginterestbyid) - Get Interest
* [ListAppointments](#listappointments) - List Appointments
* [GetAppointmentById](#getappointmentbyid) - Get Appointment

## ListAppointmentAttendees

Gets a paginated list of appointment attendees.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAppointmentAttendees" method="get" path="/appointment-attendees" -->
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

ListAppointmentAttendeesRequest req = new ListAppointmentAttendeesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "appointmentEvent.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71' and contact.id eq 'da561161-8e80-4c70-9663-750cbc2045f6' and deleted eq 'false'",
};

ListAppointmentAttendeesResponse? res = await sdk.Appointments.ListAppointmentAttendeesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListAppointmentAttendeesRequest](../../Models/Requests/ListAppointmentAttendeesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListAppointmentAttendeesResponse](../../Models/Requests/ListAppointmentAttendeesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAppointmentAttendeeById

Gets a single appointment attendee by their ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAppointmentAttendeeById" method="get" path="/appointment-attendees/{id}" -->
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

GetAppointmentAttendeeByIdRequest req = new GetAppointmentAttendeeByIdRequest() {
    Id = "0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715",
};

var res = await sdk.Appointments.GetAppointmentAttendeeByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAppointmentAttendeeByIdRequest](../../Models/Requests/GetAppointmentAttendeeByIdRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAppointmentAttendeeByIdResponse](../../Models/Requests/GetAppointmentAttendeeByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAvailability

Gets a paginated list of appointment availability times.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAvailability" method="get" path="/appointment-availability-times" -->
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

ListAvailabilityRequest req = new ListAvailabilityRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "appointmentEvent.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71'",
};

ListAvailabilityResponse? res = await sdk.Appointments.ListAvailabilityAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAvailabilityRequest](../../Models/Requests/ListAvailabilityRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAvailabilityResponse](../../Models/Requests/ListAvailabilityResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAvailabilityById

Get a single appointment availability time by its ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAvailabilityById" method="get" path="/appointment-availability-times/{id}" -->
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

GetAvailabilityByIdRequest req = new GetAvailabilityByIdRequest() {
    Id = "da8b035b-428b-4069-b25b-92afbcf514b3::2d8234f1-55df-483c-abe3-7e2cb98f8275",
};

var res = await sdk.Appointments.GetAvailabilityByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAvailabilityByIdRequest](../../Models/Requests/GetAvailabilityByIdRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAvailabilityByIdResponse](../../Models/Requests/GetAvailabilityByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404                         | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAppointmentEvents

Gets a paginated list of appointment events.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAppointmentEvents" method="get" path="/appointment-events" -->
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

ListAppointmentEventsRequest req = new ListAppointmentEventsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71'",
};

ListAppointmentEventsResponse? res = await sdk.Appointments.ListAppointmentEventsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListAppointmentEventsRequest](../../Models/Requests/ListAppointmentEventsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListAppointmentEventsResponse](../../Models/Requests/ListAppointmentEventsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAppointmentEventById

Gets a single appointment event by its ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAppointmentEventById" method="get" path="/appointment-events/{id}" -->
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

GetAppointmentEventByIdRequest req = new GetAppointmentEventByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Appointments.GetAppointmentEventByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetAppointmentEventByIdRequest](../../Models/Requests/GetAppointmentEventByIdRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetAppointmentEventByIdResponse](../../Models/Requests/GetAppointmentEventByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAvailableTimes

Gets a paginated list of times and locations available for scheduling appointments in a particular appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAvailableTimes" method="get" path="/appointment-events/{id}/appointment-available-times" -->
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

ListAvailableTimesRequest req = new ListAvailableTimesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "appointmentType.id eq '2925dd1c-7b02-4e34-8881-18f2360b50a7'",
};

ListAvailableTimesResponse? res = await sdk.Appointments.ListAvailableTimesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAvailableTimesRequest](../../Models/Requests/ListAvailableTimesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAvailableTimesResponse](../../Models/Requests/ListAvailableTimesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAppointmentTypes

Gets a paginated list of appointment types for an appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAppointmentTypes" method="get" path="/appointment-events/{id}/appointment-types" -->
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

ListAppointmentTypesRequest req = new ListAppointmentTypesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListAppointmentTypesResponse? res = await sdk.Appointments.ListAppointmentTypesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListAppointmentTypesRequest](../../Models/Requests/ListAppointmentTypesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListAppointmentTypesResponse](../../Models/Requests/ListAppointmentTypesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateAppointment

Creates an appointment in a given appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createAppointment" method="post" path="/appointment-events/{id}/appointments" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

Models.Requests.CreateAppointmentRequest req = new Cvent.SDK.Models.Requests.CreateAppointmentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CreateAppointmentRequestValue = new Cvent.SDK.Models.Components.CreateAppointmentRequest() {
        Subject = "Meeting with Cvent",
        Description = "A private meeting to discuss sales opportunities.",
        StartTime = System.DateTime.Parse("2017-01-01T15:20:00Z"),
        EndTime = System.DateTime.Parse("2030-01-01T15:30:00Z"),
        Location = "fa896667-5998-46dc-ac06-6be8e053ef4e",
        CustomLocationName = "Coffee Shop",
        Hosts = new List<UuidJson>() {
            new UuidJson() {
                Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            },
        },
        Attendees = new List<UuidJson>() {
            new UuidJson() {
                Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            },
        },
        Code = "APPT-0001",
        AppointmentTypeId = "b53dc938-8121-4af1-a5e2-d9f3f4fcd574",
        AutoAccept = true,
    },
};

var res = await sdk.Appointments.CreateAppointmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [Models.Requests.CreateAppointmentRequest](../../Models/Requests/CreateAppointmentRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CreateAppointmentResponse](../../Models/Requests/CreateAppointmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 422, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateAppointment

Updates an appointment based on the given ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateAppointment" method="put" path="/appointment-events/{id}/appointments/{apptId}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

Models.Requests.UpdateAppointmentRequest req = new Cvent.SDK.Models.Requests.UpdateAppointmentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ApptId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    UpdateAppointmentRequestValue = new Cvent.SDK.Models.Components.UpdateAppointmentRequest() {
        Subject = "Meeting with Cvent",
        Description = "A private meeting to discuss sales opportunities.",
        StartTime = System.DateTime.Parse("2017-01-01T15:20:00Z"),
        EndTime = System.DateTime.Parse("2030-01-01T15:30:00Z"),
        Location = "fa896667-5998-46dc-ac06-6be8e053ef4e",
        CustomLocationName = "Coffee Shop",
        Hosts = new List<UuidJson>() {
            new UuidJson() {
                Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            },
        },
        Attendees = new List<UuidJson>() {
            new UuidJson() {
                Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            },
        },
        Id = "a3d77c44-bb4b-41dd-9c37-18230cc66ce4",
    },
};

var res = await sdk.Appointments.UpdateAppointmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [Models.Requests.UpdateAppointmentRequest](../../Models/Requests/UpdateAppointmentRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateAppointmentResponse](../../Models/Requests/UpdateAppointmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 422, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CancelAppointment

Cancels an appointment with the given appointment ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="cancelAppointment" method="delete" path="/appointment-events/{id}/appointments/{apptId}" -->
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

CancelAppointmentRequest req = new CancelAppointmentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    ApptId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Appointments.CancelAppointmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CancelAppointmentRequest](../../Models/Requests/CancelAppointmentRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CancelAppointmentResponse](../../Models/Requests/CancelAppointmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListLocations

Gets a paginated list of appointment locations in a particular appointment event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listLocations" method="get" path="/appointment-events/{id}/locations" -->
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

ListLocationsRequest req = new ListLocationsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListLocationsResponse? res = await sdk.Appointments.ListLocationsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListLocationsRequest](../../Models/Requests/ListLocationsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListLocationsResponse](../../Models/Requests/ListLocationsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListMeetingInterests

Gets a paginated list of appointment meeting interests.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listMeetingInterests" method="get" path="/appointment-meeting-interests" -->
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

ListMeetingInterestsRequest req = new ListMeetingInterestsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "appointmentEvent.id eq 'd165ad63-4bec-449d-aa9e-054fc7fcbb71'",
};

ListMeetingInterestsResponse? res = await sdk.Appointments.ListMeetingInterestsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListMeetingInterestsRequest](../../Models/Requests/ListMeetingInterestsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListMeetingInterestsResponse](../../Models/Requests/ListMeetingInterestsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403                         | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetMeetingInterestById

Gets a single attendee's meeting interests in a particular appointment event by their interest ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getMeetingInterestById" method="get" path="/appointment-meeting-interests/{id}" -->
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

GetMeetingInterestByIdRequest req = new GetMeetingInterestByIdRequest() {
    Id = "0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715",
};

var res = await sdk.Appointments.GetMeetingInterestByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetMeetingInterestByIdRequest](../../Models/Requests/GetMeetingInterestByIdRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetMeetingInterestByIdResponse](../../Models/Requests/GetMeetingInterestByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404                         | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAppointments

Gets a paginated list of appointments.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAppointments" method="get" path="/appointments" -->
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

ListAppointmentsRequest req = new ListAppointmentsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "appointmentEvent.id eq 'ad0ea301-1203-4fee-a7d2-54165ba14e2d'",
};

ListAppointmentsResponse? res = await sdk.Appointments.ListAppointmentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListAppointmentsRequest](../../Models/Requests/ListAppointmentsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListAppointmentsResponse](../../Models/Requests/ListAppointmentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403                         | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAppointmentById

Gets a single appointment by its ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAppointmentById" method="get" path="/appointments/{id}" -->
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

GetAppointmentByIdRequest req = new GetAppointmentByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Appointments.GetAppointmentByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAppointmentByIdRequest](../../Models/Requests/GetAppointmentByIdRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAppointmentByIdResponse](../../Models/Requests/GetAppointmentByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404                         | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
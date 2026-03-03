# Events

## Overview

Events are used to collect registrations and allow attendees to select their schedule. Use these APIs to get information about your events and use the event ID to get further details about the event, such as Attendees and Sessions.

### Available Operations

* [ListAdmissionItems](#listadmissionitems) - List Admission Items
* [ListAdmissionItemsPostFilters](#listadmissionitemspostfilters) - List Admission Items
* [GetEventQuestions](#geteventquestions) - List Event Questions
* [GetChoicesForQuestion](#getchoicesforquestion) - Get Question Choices
* [GetEvents](#getevents) - List Events
* [CreateEventAsync](#createeventasync) - Create Event Async
* [GetEventAsyncStatus](#geteventasyncstatus) - Get Event Async Status
* [GetEventCopyStatus](#geteventcopystatus) - Get Event Copy Status
* [SendEventEmails](#sendeventemails) - Send Email To Attendees
* [GetEventEmailStatus](#geteventemailstatus) - List Event Email Status
* [GetEventsPostFilters](#geteventspostfilters) - List Events
* [GetEventById](#geteventbyid) - Get Event
* [UpdateEvent](#updateevent) - Update Event
* [EventCheckIn](#eventcheckin) - Event Check-In
* [DeleteEventCheckIn](#deleteeventcheckin) - Remove Check-In
* [CopyEvent](#copyevent) - Copy Event
* [AnswerEventCustomField](#answereventcustomfield) - Event Custom Field Answers
* [ListDonationItems](#listdonationitems) - List Donation Items
* [ListDonationItemsPostFilter](#listdonationitemspostfilter) - List Donation Items
* [ListEventEmails](#listeventemails) - List Event Emails
* [ListFeeItems](#listfeeitems) - List Fee Items
* [GetInvitationList](#getinvitationlist) - List Invitation Lists
* [ListMembershipItems](#listmembershipitems) - List Membership Items
* [GetOrders](#getorders) - List Orders
* [GetOrderItems](#getorderitems) - List Order Items
* [AssociateDiscountCodeToOrderItem](#associatediscountcodetoorderitem) - Assign Discount to Order Item
* [ListQuantityItems](#listquantityitems) - List Quantity Items
* [ListQuantityItemsPostFilter](#listquantityitemspostfilter) - List Quantity Items
* [ListRegistrationPaths](#listregistrationpaths) - List Registration Paths
* [ListRegistrationTypes](#listregistrationtypes) - List Registration Types
* [UpdateRegistrationType](#updateregistrationtype) - Update Event Registration Type
* [GetTransactions](#gettransactions) - List Transactions
* [PostTransactions](#posttransactions) - Create Transactions
* [GetTransactionItems](#gettransactionitems) - List Transaction Items
* [ListEventUserGroups](#listeventusergroups) - List Event User Groups
* [AssociateEventUserGroup](#associateeventusergroup) - Associate User Group to Event
* [DisassociateEventUserGroup](#disassociateeventusergroup) - Disassociate Group from Event
* [UpdateQuantityItemRegistrationForAttendee](#updatequantityitemregistrationforattendee) - Update Quantity Item
* [ListSessionsAttendance](#listsessionsattendance) - Session Attendance
* [ListSessionsEnrollment](#listsessionsenrollment) - List Session Registrants
* [ListSessionsEnrollmentPostFilter](#listsessionsenrollmentpostfilter) - List Session Registrants
* [DeleteSessionAttendance](#deletesessionattendance) - Del Session Check-in
* [SessionCheckIn](#sessioncheckin) - Session Check-In
* [UpdateSessionCheckIn](#updatesessioncheckin) - Update Session Check-In
* [CreateSessionEnrollment](#createsessionenrollment) - Create Session Registration
* [DeleteSessionEnrollment](#deletesessionenrollment) - Delete Session Registration

## ListAdmissionItems

Gets a paginated list of admission items.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAdmissionItems" method="get" path="/admission-items" -->
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

ListAdmissionItemsRequest req = new ListAdmissionItemsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "event.id eq 'abc' or name eq 'admission' or id eq 'abc'",
};

ListAdmissionItemsResponse? res = await sdk.Events.ListAdmissionItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListAdmissionItemsRequest](../../Models/Requests/ListAdmissionItemsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListAdmissionItemsResponse](../../Models/Requests/ListAdmissionItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAdmissionItemsPostFilters

Gets a paginated list of admission items by sending a filter in the body of the request. This method will return the same data as [GET List Admission Items](#operation/listAdmissionItems) but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAdmissionItemsPostFilters" method="post" path="/admission-items/filter" -->
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

ListAdmissionItemsPostFiltersRequest req = new ListAdmissionItemsPostFiltersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "event.id eq 'abc' or name eq 'admission' or id eq 'abc'",
    },
};

ListAdmissionItemsPostFiltersResponse? res = await sdk.Events.ListAdmissionItemsPostFiltersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [ListAdmissionItemsPostFiltersRequest](../../Models/Requests/ListAdmissionItemsPostFiltersRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[ListAdmissionItemsPostFiltersResponse](../../Models/Requests/ListAdmissionItemsPostFiltersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventQuestions

Gets a paginated list of event questions.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventQuestions" method="get" path="/event-questions" -->
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

GetEventQuestionsRequest req = new GetEventQuestionsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "code eq 'Code162' or tag  eq 'Primary Questions'",
};

GetEventQuestionsResponse? res = await sdk.Events.GetEventQuestionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetEventQuestionsRequest](../../Models/Requests/GetEventQuestionsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetEventQuestionsResponse](../../Models/Requests/GetEventQuestionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetChoicesForQuestion

Gets all the choices for a given event question.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getChoicesForQuestion" method="get" path="/event-questions/{questionId}/choices" -->
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

GetChoicesForQuestionRequest req = new GetChoicesForQuestionRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    QuestionId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Filter = "text eq 'Choice A'",
};

GetChoicesForQuestionResponse? res = await sdk.Events.GetChoicesForQuestionAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetChoicesForQuestionRequest](../../Models/Requests/GetChoicesForQuestionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetChoicesForQuestionResponse](../../Models/Requests/GetChoicesForQuestionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEvents

Gets a paginated list of events.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEvents" method="get" path="/events" -->
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

GetEventsRequest req = new GetEventsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "start:DESC",
    Filter = "status eq 'Accepted' or status eq 'Pending' and (id eq 'abc' or id eq 'def')",
};

GetEventsResponse? res = await sdk.Events.GetEventsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetEventsRequest](../../Models/Requests/GetEventsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetEventsResponse](../../Models/Requests/GetEventsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateEventAsync

Creates an event using the details supplied in the request body. Check the
[Get Event Async Status](#operation/getEventAsyncStatus) to determine when the
event is ready.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createEventAsync" method="post" path="/events/async" -->
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

EventInput req = new EventInput() {
    Title = "Cvent Connect 2020",
    Format = EventFormatJson.Virtual,
    Description = "Cvent annual user conference.",
    Start = System.DateTime.Parse("2020-02-03T13:00:00.000Z").ToUniversalTime(),
    End = System.DateTime.Parse("2020-02-07T17:00:00.000Z").ToUniversalTime(),
    Timezone = "America/New_York",
    Venues = new List<VenueJsonInput>() {
        new VenueJsonInput() {
            Name = "Capital Convention Center",
            Address = new VenueAddressJsonInput() {
                Address1 = "Cvent Inc.",
                Address2 = "4001 West Parmer Lane",
                Address3 = "PO Box 123",
                City = "Austin",
                CountryCode = "US",
                PostalCode = "78727",
                RegionCode = "TX",
            },
        },
    },
    Note = "This event will need some coordination with external systems.",
    Languages = new List<string>() {
        "en-US",
    },
    Planners = new List<PlannerJson2Input>() {
        new PlannerJson2Input() {
            Prefix = "Dr.",
            FirstName = "Henry",
            LastName = "Smith",
            Company = "Cvent Inc",
            Title = "Event Planner",
            Email = "hsmith@example.com",
        },
    },
    Type = EventTypeJson1.Conference,
};

var res = await sdk.Events.CreateEventAsyncAsync(req);

// handle response
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `request`                                           | [EventInput](../../Models/Components/EventInput.md) | :heavy_check_mark:                                  | The request object to use for the request.          |

### Response

**[CreateEventAsyncResponse](../../Models/Requests/CreateEventAsyncResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventAsyncStatus

Gets the event creation status of the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventAsyncStatus" method="get" path="/events/async/{eventCreationId}/status" -->
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

GetEventAsyncStatusRequest req = new GetEventAsyncStatusRequest() {
    EventCreationId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.GetEventAsyncStatusAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetEventAsyncStatusRequest](../../Models/Requests/GetEventAsyncStatusRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetEventAsyncStatusResponse](../../Models/Requests/GetEventAsyncStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventCopyStatus

Gets the event copy status of the given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventCopyStatus" method="get" path="/events/copy/{eventCopyId}/status" -->
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

GetEventCopyStatusRequest req = new GetEventCopyStatusRequest() {
    EventCopyId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.GetEventCopyStatusAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetEventCopyStatusRequest](../../Models/Requests/GetEventCopyStatusRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetEventCopyStatusResponse](../../Models/Requests/GetEventCopyStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## SendEventEmails

Sends an email to one or more event attendees who are on the invitation list.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="sendEventEmails" method="post" path="/events/emails" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using System.Collections.Generic;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

SendEmailEventRequest req = new SendEmailEventRequest() {
    Event = new EventJson10() {
        Id = "a150f1ee-6c54-4b01-90e6-d701748f0851",
    },
    Email = new EmailJson2() {
        Id = "a150f1ee-6c54-4b01-90e6-d701748f0851",
    },
    ResendToPreviousRecipients = true,
    Attendees = new List<string>() {
        "9A641E55-3367-4C50-B21B-B6A7613DFB23",
    },
};

var res = await sdk.Events.SendEventEmailsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [SendEmailEventRequest](../../Models/Components/SendEmailEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[SendEventEmailsResponse](../../Models/Requests/SendEventEmailsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventEmailStatus

Gets the status of email using unique email request ID that was generated as a response of [Send Email To Attendees](#tag/Events/operation/sendEventEmails) request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventEmailStatus" method="get" path="/events/emails/{emailRequestId}/status" -->
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

GetEventEmailStatusRequest req = new GetEventEmailStatusRequest() {
    EmailRequestId = "2A941E55-3367-4C50-B21B-B6A7613DFB23",
};

var res = await sdk.Events.GetEventEmailStatusAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetEventEmailStatusRequest](../../Models/Requests/GetEventEmailStatusRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetEventEmailStatusResponse](../../Models/Requests/GetEventEmailStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventsPostFilters

Gets a paginated list of events by sending a filter in the body of the request. This method will return the same data as [GET List Events](#operation/getEvents) but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventsPostFilters" method="post" path="/events/filter" -->
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

GetEventsPostFiltersRequest req = new GetEventsPostFiltersRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "start:DESC",
    Filter = new Filter() {
        FilterValue = "status eq 'Accepted' or status eq 'Pending' and (id eq 'abc' or id eq 'def')",
    },
};

GetEventsPostFiltersResponse? res = await sdk.Events.GetEventsPostFiltersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetEventsPostFiltersRequest](../../Models/Requests/GetEventsPostFiltersRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetEventsPostFiltersResponse](../../Models/Requests/GetEventsPostFiltersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetEventById

Gets a single event based on the provided event ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getEventById" method="get" path="/events/{id}" -->
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

GetEventByIdRequest req = new GetEventByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.GetEventByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetEventByIdRequest](../../Models/Requests/GetEventByIdRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetEventByIdResponse](../../Models/Requests/GetEventByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateEvent

Updates the information for a single event based on the details provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateEvent" method="put" path="/events/{id}" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
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

UpdateEventRequest req = new UpdateEventRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    EventUpdate = new EventUpdateInput() {
        Title = "Cvent Connect 2020",
        Format = EventFormatJson.Virtual,
        Description = "Cvent annual user conference.",
        Start = System.DateTime.Parse("2020-02-03T13:00:00.000Z").ToUniversalTime(),
        End = System.DateTime.Parse("2020-02-07T17:00:00.000Z").ToUniversalTime(),
        CloseAfter = System.DateTime.Parse("2020-02-01T23:59:00.000Z").ToUniversalTime(),
        ArchiveAfter = System.DateTime.Parse("2020-05-07T12:00:00.000Z").ToUniversalTime(),
        Timezone = "America/New_York",
        Venues = new List<VenueJsonInput>() {
            new VenueJsonInput() {
                Name = "Capital Convention Center",
                Address = new VenueAddressJsonInput() {
                    Address1 = "Cvent Inc.",
                    Address2 = "4001 West Parmer Lane",
                    Address3 = "PO Box 123",
                    City = "Austin",
                    CountryCode = "US",
                    PostalCode = "78727",
                    RegionCode = "TX",
                },
            },
        },
        Note = "This event will need some coordination with external systems.",
        Languages = new List<string>() {
            "en-US",
        },
        Capacity = 50,
        Planners = new List<PlannerJson2Input>() {},
        Type = EventTypeJson1.Conference,
    },
};

var res = await sdk.Events.UpdateEventAsync(req);

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [UpdateEventRequest](../../Models/Requests/UpdateEventRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[UpdateEventResponse](../../Models/Requests/UpdateEventResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## EventCheckIn

Check-in attendees to an event based on the attendee IDs provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="eventCheckIn" method="post" path="/events/{id}/check-in" -->
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

EventCheckInRequest req = new EventCheckInRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RequestBody = new List<CheckinJson>() {},
};

var res = await sdk.Events.EventCheckInAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [EventCheckInRequest](../../Models/Requests/EventCheckInRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[EventCheckInResponse](../../Models/Requests/EventCheckInResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteEventCheckIn

Deletes the event check-in of attendee.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteEventCheckIn" method="delete" path="/events/{id}/check-in/{attendeeId}" -->
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

DeleteEventCheckInRequest req = new DeleteEventCheckInRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.DeleteEventCheckInAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteEventCheckInRequest](../../Models/Requests/DeleteEventCheckInRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteEventCheckInResponse](../../Models/Requests/DeleteEventCheckInResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CopyEvent

Copies the event details provided in the request body. Supports either creating a new event using the
copied data, or inserting the copied data to an existing event.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="copyEvent" method="post" path="/events/{id}/copy" -->
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

CopyEventRequest req = new CopyEventRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    EventCopy = new EventCopy() {
        Event = new EventCopyTargetJson() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Registration = new RegistrationEventCopyOverride() {},
        Planning = new PlanningEventCopyOverride() {},
        Agenda = new AgendaEventCopyOverride() {},
        Travel = new TravelEventCopyOverride() {},
        Surveys = new SurveysEventCopyOverride() {},
        Speakers = new SpeakersEventCopyOverride() {},
        Exhibitors = new ExhibitorsEventCopyOverride() {},
    },
};

var res = await sdk.Events.CopyEventAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [CopyEventRequest](../../Models/Requests/CopyEventRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[CopyEventResponse](../../Models/Requests/CopyEventResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AnswerEventCustomField

Answer a single custom field for an event. Event custom fields are used to store extra 
information about an event, such as the event type or event region.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="answerEventCustomField" method="put" path="/events/{id}/custom-fields/{customFieldId}/answers" -->
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

AnswerEventCustomFieldRequest req = new AnswerEventCustomFieldRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomFieldId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomField = new CustomFieldInput() {
        Id = "8daec569-a328-48c3-b205-1fc913fc7c81",
        Type = CustomFieldCustomFieldType.General,
        Value = new List<string>() {
            "Choice C",
            "Choice A",
        },
    },
};

var res = await sdk.Events.AnswerEventCustomFieldAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [AnswerEventCustomFieldRequest](../../Models/Requests/AnswerEventCustomFieldRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AnswerEventCustomFieldResponse](../../Models/Requests/AnswerEventCustomFieldResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListDonationItems

Gets a paginated list of donation items. Donation items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listDonationItems" method="get" path="/events/{id}/donation-items" -->
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

ListDonationItemsRequest req = new ListDonationItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and registrationTypes in ('1b01ae34-6970-41f2-a4e8-b4f39185dc28')",
};

ListDonationItemsResponse? res = await sdk.Events.ListDonationItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListDonationItemsRequest](../../Models/Requests/ListDonationItemsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListDonationItemsResponse](../../Models/Requests/ListDonationItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListDonationItemsPostFilter

Gets a paginated list of donation items by sending a filter in the body of the request. Donation items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listDonationItemsPostFilter" method="post" path="/events/{id}/donation-items/filter" -->
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

ListDonationItemsPostFilterRequest req = new ListDonationItemsPostFilterRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16')",
    },
};

ListDonationItemsPostFilterResponse? res = await sdk.Events.ListDonationItemsPostFilterAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListDonationItemsPostFilterRequest](../../Models/Requests/ListDonationItemsPostFilterRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListDonationItemsPostFilterResponse](../../Models/Requests/ListDonationItemsPostFilterResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListEventEmails

Gets a paginated list of emails for a given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listEventEmails" method="get" path="/events/{id}/emails" -->
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

ListEventEmailsRequest req = new ListEventEmailsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq 'a150f1ee-6c54-4b01-90e6-d701748f0851'",
};

ListEventEmailsResponse? res = await sdk.Events.ListEventEmailsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ListEventEmailsRequest](../../Models/Requests/ListEventEmailsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ListEventEmailsResponse](../../Models/Requests/ListEventEmailsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListFeeItems

Gets a paginated list of fee items associated with the event.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listFeeItems" method="get" path="/events/{id}/fee-items" -->
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

ListFeeItemsRequest req = new ListFeeItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or product.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d6'",
};

ListFeeItemsResponse? res = await sdk.Events.ListFeeItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListFeeItemsRequest](../../Models/Requests/ListFeeItemsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListFeeItemsResponse](../../Models/Requests/ListFeeItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetInvitationList

Gets a paginated list of invitation lists for a given event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getInvitationList" method="get" path="/events/{id}/invitation-lists" -->
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

GetInvitationListRequest req = new GetInvitationListRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq 'a150f1ee-6c54-4b01-90e6-d701748f0851'",
};

GetInvitationListResponse? res = await sdk.Events.GetInvitationListAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetInvitationListRequest](../../Models/Requests/GetInvitationListRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetInvitationListResponse](../../Models/Requests/GetInvitationListResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListMembershipItems

Gets a paginated list of membership items. [Membership items](https://support.cvent.com/s/communityarticle/Setting-Up-Memberships) are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items) that can be purchased during registration.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listMembershipItems" method="get" path="/events/{id}/membership-items" -->
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

ListMembershipItemsRequest req = new ListMembershipItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and registrationTypes in ('1b01ae34-6970-41f2-a4e8-b4f39185dc28')",
};

ListMembershipItemsResponse? res = await sdk.Events.ListMembershipItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListMembershipItemsRequest](../../Models/Requests/ListMembershipItemsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListMembershipItemsResponse](../../Models/Requests/ListMembershipItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetOrders

Gets a paginated list of Orders in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getOrders" method="get" path="/events/{id}/orders" -->
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

GetOrdersRequest req = new GetOrdersRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "attendee.id eq '78b3d72a-1851-46f4-a837-5f8613f4db83' AND (type eq 'Online Charge' OR type eq 'Online Refund')",
};

GetOrdersResponse? res = await sdk.Events.GetOrdersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetOrdersRequest](../../Models/Requests/GetOrdersRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetOrdersResponse](../../Models/Requests/GetOrdersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetOrderItems

Gets a paginated list of Order items in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getOrderItems" method="get" path="/events/{id}/orders/items" -->
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

GetOrderItemsRequest req = new GetOrderItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "attendee.id eq '78b3d72a-1851-46f4-a837-5f8613f4db83' AND (product.id eq '65322e75-076f-4070-a6e6-3315c581728d' OR product.id eq 'e1874067-a5ed-4111-ac8a-63de9aa18929')",
};

GetOrderItemsResponse? res = await sdk.Events.GetOrderItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetOrderItemsRequest](../../Models/Requests/GetOrderItemsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetOrderItemsResponse](../../Models/Requests/GetOrderItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AssociateDiscountCodeToOrderItem

Assigns a discount code to an order item based on the given IDs.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateDiscountCodeToOrderItem" method="put" path="/events/{id}/orders/{orderId}/items/{orderItemId}/discounts/{discountCode}" -->
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

AssociateDiscountCodeToOrderItemRequest req = new AssociateDiscountCodeToOrderItemRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    OrderId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    OrderItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    DiscountCode = "HALF_OFF",
    OrderItemAssociateDiscount = new OrderItemAssociateDiscount() {
        Event = new EventJson() {
            Id = "4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56",
        },
        Order = new OrderJson() {
            Id = "6c0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
        },
        Item = new OrderItemJson0() {
            Id = "6c0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
        },
        AmountOrdered = 15.35D,
    },
};

var res = await sdk.Events.AssociateDiscountCodeToOrderItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [AssociateDiscountCodeToOrderItemRequest](../../Models/Requests/AssociateDiscountCodeToOrderItemRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[AssociateDiscountCodeToOrderItemResponse](../../Models/Requests/AssociateDiscountCodeToOrderItemResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListQuantityItems

Gets a paginated list of quantity items. Quantity items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listQuantityItems" method="get" path="/events/{id}/quantity-items" -->
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

ListQuantityItemsRequest req = new ListQuantityItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16') and registrationTypes in ('1b01ae34-6970-41f2-a4e8-b4f39185dc28')",
};

ListQuantityItemsResponse? res = await sdk.Events.ListQuantityItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListQuantityItemsRequest](../../Models/Requests/ListQuantityItemsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListQuantityItemsResponse](../../Models/Requests/ListQuantityItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListQuantityItemsPostFilter

Gets a paginated list of quantity items by sending a filter in the body of the request. Quantity items are a type of [optional item](https://support.cvent.com/s/communityarticle/Understanding-Agenda-Items).


### Example Usage

<!-- UsageSnippet language="csharp" operationID="listQuantityItemsPostFilter" method="post" path="/events/{id}/quantity-items/filter" -->
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

ListQuantityItemsPostFilterRequest req = new ListQuantityItemsPostFilterRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "id in ('1b01ae34-6970-41f2-a4e8-b4f39185dc15', '1b01ae34-6970-41f2-a4e8-b4f39185dc16')",
    },
};

ListQuantityItemsPostFilterResponse? res = await sdk.Events.ListQuantityItemsPostFilterAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [ListQuantityItemsPostFilterRequest](../../Models/Requests/ListQuantityItemsPostFilterRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[ListQuantityItemsPostFilterResponse](../../Models/Requests/ListQuantityItemsPostFilterResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListRegistrationPaths

Gets a paginated list of registration paths.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRegistrationPaths" method="get" path="/events/{id}/registration-paths" -->
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

ListRegistrationPathsRequest req = new ListRegistrationPathsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Locale = "en-US",
};

ListRegistrationPathsResponse? res = await sdk.Events.ListRegistrationPathsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListRegistrationPathsRequest](../../Models/Requests/ListRegistrationPathsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListRegistrationPathsResponse](../../Models/Requests/ListRegistrationPathsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListRegistrationTypes

Gets a paginated list of registration types.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRegistrationTypes" method="get" path="/events/{id}/registration-types" -->
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

ListRegistrationTypesRequest req = new ListRegistrationTypesRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListRegistrationTypesResponse? res = await sdk.Events.ListRegistrationTypesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListRegistrationTypesRequest](../../Models/Requests/ListRegistrationTypesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListRegistrationTypesResponse](../../Models/Requests/ListRegistrationTypesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateRegistrationType

Updates an attendee's registration type in an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRegistrationType" method="put" path="/events/{id}/registration-types/{registrationTypeId}" -->
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

UpdateRegistrationTypeRequest req = new UpdateRegistrationTypeRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RegistrationTypeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RegistrationTypeUpdate = new RegistrationTypeUpdateInput() {
        OpenForRegistration = true,
        AutomaticOpenDate = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
        AutomaticEndDate = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
        Capacity = new CapacityJson1Input() {
            Total = 100,
        },
    },
};

var res = await sdk.Events.UpdateRegistrationTypeAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateRegistrationTypeRequest](../../Models/Requests/UpdateRegistrationTypeRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateRegistrationTypeResponse](../../Models/Requests/UpdateRegistrationTypeResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetTransactions

Gets a paginated list of Transactions in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTransactions" method="get" path="/events/{id}/transactions" -->
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

GetTransactionsRequest req = new GetTransactionsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "attendee.id eq 'f4af0b94-4427-46f8-bea0-b06af2a0af80' AND (paymentType eq 'Online Charge' OR paymentType eq 'Online Refund')",
};

GetTransactionsResponse? res = await sdk.Events.GetTransactionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTransactionsRequest](../../Models/Requests/GetTransactionsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTransactionsResponse](../../Models/Requests/GetTransactionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PostTransactions

Create offline transactions for an order in your event. Offline transactions can be any digital or physical transactions performed outside Cvent. Valid transaction types for this method include Offline Charge and Offline Refund.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="postTransactions" method="post" path="/events/{id}/transactions" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;
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

PostTransactionsRequest req = new PostTransactionsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CreateTransactionResponse = new CreateTransactionResponseInput() {
        Event = new EventJson() {
            Id = "4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56",
        },
        Attendee = new AttendeeJson() {
            Id = "5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
        },
        PaymentType = PaymentTypeCreateJson.OfflineCharge,
        PaymentMethod = PaymentMethodJson.Mastercard,
        Date = System.DateTime.Parse("2018-01-13T02:00:00Z").ToUniversalTime(),
        BatchNumber = "112021-0017",
        ReferenceNumber = "112021-0017",
        Amount = 15.25D,
        PaymentNote = "Payment notes",
        TransactionItems = new List<TransactionItemCreateJsonInput>() {
            new TransactionItemCreateJsonInput() {
                Product = new ProductOrderItemJsonInput() {
                    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
                },
                Amount = 15.25D,
            },
        },
    },
};

var res = await sdk.Events.PostTransactionsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [PostTransactionsRequest](../../Models/Requests/PostTransactionsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[PostTransactionsResponse](../../Models/Requests/PostTransactionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetTransactionItems

Gets a paginated list of Transaction items in event

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getTransactionItems" method="get" path="/events/{id}/transactions/items" -->
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

GetTransactionItemsRequest req = new GetTransactionItemsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "attendee.id eq '78b3d72a-1851-46f4-a837-5f8613f4db83' AND (transaction.id eq '82da8c60-24f4-47d0-b6e2-429b18a4bb7c' OR transaction.id eq '034bb884-05de-4818-b9f9-5144495d5495')",
};

GetTransactionItemsResponse? res = await sdk.Events.GetTransactionItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetTransactionItemsRequest](../../Models/Requests/GetTransactionItemsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetTransactionItemsResponse](../../Models/Requests/GetTransactionItemsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListEventUserGroups

Gets a paginated list of user groups associated with an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listEventUserGroups" method="get" path="/events/{id}/user-groups" -->
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

ListEventUserGroupsRequest req = new ListEventUserGroupsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListEventUserGroupsResponse? res = await sdk.Events.ListEventUserGroupsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListEventUserGroupsRequest](../../Models/Requests/ListEventUserGroupsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListEventUserGroupsResponse](../../Models/Requests/ListEventUserGroupsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AssociateEventUserGroup

Associates (adds) a user group to an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateEventUserGroup" method="put" path="/events/{id}/user-groups/{userGroupId}" -->
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

AssociateEventUserGroupRequest req = new AssociateEventUserGroupRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    UserGroupId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.AssociateEventUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [AssociateEventUserGroupRequest](../../Models/Requests/AssociateEventUserGroupRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[AssociateEventUserGroupResponse](../../Models/Requests/AssociateEventUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DisassociateEventUserGroup

Disassociates (removes) a single user group from an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateEventUserGroup" method="delete" path="/events/{id}/user-groups/{userGroupId}" -->
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

DisassociateEventUserGroupRequest req = new DisassociateEventUserGroupRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    UserGroupId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.DisassociateEventUserGroupAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [DisassociateEventUserGroupRequest](../../Models/Requests/DisassociateEventUserGroupRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[DisassociateEventUserGroupResponse](../../Models/Requests/DisassociateEventUserGroupResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateQuantityItemRegistrationForAttendee

Update a specific [quantity item](https://support.cvent.com/s/communityarticle/Creating-Quantity-Items) for an attendee's registration based on the details supplied in the body of the request.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateQuantityItemRegistrationForAttendee" method="put" path="/quantity-items/{quantityItemId}" -->
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

UpdateQuantityItemRegistrationForAttendeeRequest req = new UpdateQuantityItemRegistrationForAttendeeRequest() {
    QuantityItemId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    QuantityItemUpdate = new QuantityItemUpdate() {
        Id = "8163c74e-18c6-401a-a710-ae0f485bf059",
        Attendee = new QuantityItemUpdateAttendee() {
            Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
        },
        UpdatedQuantity = 5,
        SendEmail = false,
    },
};

var res = await sdk.Events.UpdateQuantityItemRegistrationForAttendeeAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [UpdateQuantityItemRegistrationForAttendeeRequest](../../Models/Requests/UpdateQuantityItemRegistrationForAttendeeRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[UpdateQuantityItemRegistrationForAttendeeResponse](../../Models/Requests/UpdateQuantityItemRegistrationForAttendeeResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionsAttendance

Get a paginated list of session attendance.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionsAttendance" method="get" path="/sessions/attendance" -->
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

ListSessionsAttendanceRequest req = new ListSessionsAttendanceRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c::2ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
};

ListSessionsAttendanceResponse? res = await sdk.Events.ListSessionsAttendanceAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSessionsAttendanceRequest](../../Models/Requests/ListSessionsAttendanceRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSessionsAttendanceResponse](../../Models/Requests/ListSessionsAttendanceResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionsEnrollment

Gets registrant data for sessions. The returned data depends on the individual session type.
- **Optional Sessions:** Provides a paginated list of attendees registered for the session.
- **Included Session:** Provides a paginated list of attendees who have participated or marked as no-shows. It does not list all registered attendees.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionsEnrollment" method="get" path="/sessions/enrollment" -->
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

ListSessionsEnrollmentRequest req = new ListSessionsEnrollmentRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c::2ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
};

ListSessionsEnrollmentResponse? res = await sdk.Events.ListSessionsEnrollmentAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListSessionsEnrollmentRequest](../../Models/Requests/ListSessionsEnrollmentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListSessionsEnrollmentResponse](../../Models/Requests/ListSessionsEnrollmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSessionsEnrollmentPostFilter

Gets registrant data for sessions. The returned data depends on the individual session type.   - **Optional Sessions:** Provides a paginated list of attendees registered for the session.   - **Included Session:** Provides a paginated list of attendees who have participated or been
  marked as no-shows. It does not list all registered attendees.

This method will return the same data as [GET List Session Registrants](#operation/listSessionsEnrollment)  but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSessionsEnrollmentPostFilter" method="post" path="/sessions/enrollment/filter" -->
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

ListSessionsEnrollmentPostFilterRequest req = new ListSessionsEnrollmentPostFilterRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "id eq '1ffa56d9-9f60-4b8c-8b3b-3451de21293c::2ffa56d9-9f60-4b8c-8b3b-3451de21293c'",
    },
};

ListSessionsEnrollmentPostFilterResponse? res = await sdk.Events.ListSessionsEnrollmentPostFilterAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [ListSessionsEnrollmentPostFilterRequest](../../Models/Requests/ListSessionsEnrollmentPostFilterRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[ListSessionsEnrollmentPostFilterResponse](../../Models/Requests/ListSessionsEnrollmentPostFilterResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSessionAttendance

Deletes the attendance of an attendee in a session.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSessionAttendance" method="delete" path="/sessions/{id}/attendance/{attendeeId}" -->
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

DeleteSessionAttendanceRequest req = new DeleteSessionAttendanceRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.DeleteSessionAttendanceAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteSessionAttendanceRequest](../../Models/Requests/DeleteSessionAttendanceRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteSessionAttendanceResponse](../../Models/Requests/DeleteSessionAttendanceResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## SessionCheckIn

Check-in attendees to a session based on the attendee IDs provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="sessionCheckIn" method="post" path="/sessions/{id}/check-in" -->
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

SessionCheckInRequest req = new SessionCheckInRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RequestBody = new List<SessionCheckinCreateJson>() {},
};

var res = await sdk.Events.SessionCheckInAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [SessionCheckInRequest](../../Models/Requests/SessionCheckInRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[SessionCheckInResponse](../../Models/Requests/SessionCheckInResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateSessionCheckIn

Update check-in details of attendees in a session based on the attendee IDs provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateSessionCheckIn" method="put" path="/sessions/{id}/check-in" -->
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

UpdateSessionCheckInRequest req = new UpdateSessionCheckInRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RequestBody = new List<SessionCheckinBaseJson>() {},
};

var res = await sdk.Events.UpdateSessionCheckInAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateSessionCheckInRequest](../../Models/Requests/UpdateSessionCheckInRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateSessionCheckInResponse](../../Models/Requests/UpdateSessionCheckInResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateSessionEnrollment

Register an attendee in the given session. Requires the modify registration widget to be
present on the event's registration path. See the following
[article](https://support.cvent.com/s/communityarticle/Modifying-Registrations#modifyown) for
more information.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createSessionEnrollment" method="post" path="/sessions/{id}/enrollment/{attendeeId}" -->
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

CreateSessionEnrollmentRequest req = new CreateSessionEnrollmentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.CreateSessionEnrollmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CreateSessionEnrollmentRequest](../../Models/Requests/CreateSessionEnrollmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateSessionEnrollmentResponse](../../Models/Requests/CreateSessionEnrollmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteSessionEnrollment

Unregister an attendee from a session. Requires the modify registration widget
to be present on the event's registration path. See the following
[article](https://support.cvent.com/s/communityarticle/Modifying-Registrations#modifyown)
for more information.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteSessionEnrollment" method="delete" path="/sessions/{id}/enrollment/{attendeeId}" -->
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

DeleteSessionEnrollmentRequest req = new DeleteSessionEnrollmentRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.Events.DeleteSessionEnrollmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [DeleteSessionEnrollmentRequest](../../Models/Requests/DeleteSessionEnrollmentRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[DeleteSessionEnrollmentResponse](../../Models/Requests/DeleteSessionEnrollmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
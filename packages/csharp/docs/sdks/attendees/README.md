# Attendees

## Overview

The Attendee entity primarily refers to the person throughout the lifecycle of an event including registration, enrollment into sessions, and participation. Once contacts are added to events, an Attendee entity is created. This API allows you to read attendee data and add new attendees to your Cvent events.

### Available Operations

* [ListDurations](#listdurations) - List Attendance Duration
* [CreateAttendee](#createattendee) - Add Attendees
* [ListAttendees](#listattendees) - List Attendees
* [ListAttendeesPostFilter](#listattendeespostfilter) - List Attendees
* [GetAttendeeById](#getattendeebyid) - Get Attendee
* [UpdateAttendee](#updateattendee) - Update Attendee
* [UpdateAttendeeSubscriptionStatus](#updateattendeesubscriptionstatus) - Update Email Subscription
* [UpdateInternalInfoAnswers](#updateinternalinfoanswers) - Update Internal Information
* [PostBadge](#postbadge) - Create Badge
* [GetBadge](#getbadge) - Get Badge
* [GetBadgesPostFilters](#getbadgespostfilters) - Get Badges
* [UpdateBadge](#updatebadge) - Update Badge

## ListDurations

Gets a paginated list of durations attendees were engaged (in person or virtually) in a session, appointment or watching a video.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listDurations" method="get" path="/attendance-durations" -->
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

ListDurationsRequest req = new ListDurationsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "start:DESC,title:ASC",
    Filter = "firstSeen gt '2020-02-07T12:00:00.000Z' and session.id =  '0e2f583e-62ae-40d8-9b5c-b8e67a6ba1ab'",
};

ListDurationsResponse? res = await sdk.Attendees.ListDurationsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListDurationsRequest](../../Models/Requests/ListDurationsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListDurationsResponse](../../Models/Requests/ListDurationsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateAttendee

Adds given contacts to an event as attendees, either inviting them or registering them directly.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createAttendee" method="post" path="/attendees" -->
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

List<AttendeeAddJson> req = new List<AttendeeAddJson>() {
    new AttendeeAddJson() {
        Event = new AttendeeAddJsonEvent() {
            Id = "0a955598-376e-43d4-a796-91d6d5f41e3f",
        },
        Contact = new AttendeeAddJsonContact() {
            Id = "ea66a709-2a93-4fa0-8b83-cf4f62df9dc3",
        },
        InvitationList = new AttendeeAddJsonInvitationList() {
            Id = "06da38f9-12da-4cb6-a581-7a5954f8e0e2",
        },
        ReferenceId = "refid-marketingwebsite",
        Note = "Would like to sit near the front of the room for sessions.",
        Administrator = new AttendeeAddJsonAdministrator() {
            Id = "7949c335-b5b2-46cf-8f5d-f6b21795df51",
        },
        AdmissionItem = new AttendeeAddJsonAdmissionItem() {
            Id = "7949c335-b5b2-46cf-8f5d-f6b21795df51",
        },
        Visibility = AttendeeVisibilityJson.Private,
        Answers = new List<AttendeeAnswerJson>() {
            new AttendeeAnswerJson() {
                Question = new AttendeeAnswerJsonQuestion() {
                    Id = "60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a",
                },
                Value = new List<string>() {
                    "1234",
                },
            },
        },
        SendEmail = false,
        Status = AttendeeAddStatusJson.Accepted,
        Guest = true,
        InvitedBy = AttendeeInvitedByJson.PlannerInvited,
        ResponseMethod = AttendeeResponseMethodJson.SelfResponded,
    },
};

var res = await sdk.Attendees.CreateAttendeeAsync(req);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | List<[AttendeeAddJson](../../Models/Components/AttendeeAddJson.md)> | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateAttendeeResponse](../../Models/Requests/CreateAttendeeResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAttendees

Gets a paginated list of attendees in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAttendees" method="get" path="/attendees" -->
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

ListAttendeesRequest req = new ListAttendeesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Expand = new List<Expand>() {
        Expand.AnswersQuestion,
        Expand.RegistrationType,
    },
    Sort = "contact.company:DESC,contact.title:ASC",
    Filter = "contact.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' or checkedIn eq 'true'",
};

ListAttendeesResponse? res = await sdk.Attendees.ListAttendeesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListAttendeesRequest](../../Models/Requests/ListAttendeesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListAttendeesResponse](../../Models/Requests/ListAttendeesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAttendeesPostFilter

Gets a paginated list of attendees by sending a filter in the body of the request. This method will return the same data as  [GET List Attendees](#operation/listAttendees) but allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAttendeesPostFilter" method="post" path="/attendees/filter" -->
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

ListAttendeesPostFilterRequest req = new ListAttendeesPostFilterRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Expand = new List<Expand>() {
        Expand.AnswersQuestion,
        Expand.RegistrationType,
    },
    Sort = "contact.company:DESC,contact.title:ASC",
    Filter = new Filter() {
        FilterValue = "property eq 'value'",
    },
};

ListAttendeesPostFilterResponse? res = await sdk.Attendees.ListAttendeesPostFilterAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListAttendeesPostFilterRequest](../../Models/Requests/ListAttendeesPostFilterRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListAttendeesPostFilterResponse](../../Models/Requests/ListAttendeesPostFilterResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAttendeeById

Gets a single attendee based on their ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAttendeeById" method="get" path="/attendees/{id}" -->
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

GetAttendeeByIdRequest req = new GetAttendeeByIdRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Expand = new List<Expand>() {
        Expand.AnswersQuestion,
        Expand.RegistrationType,
    },
};

var res = await sdk.Attendees.GetAttendeeByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAttendeeByIdRequest](../../Models/Requests/GetAttendeeByIdRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAttendeeByIdResponse](../../Models/Requests/GetAttendeeByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateAttendee

Updates a single attendee based on their ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateAttendee" method="put" path="/attendees/{id}" -->
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

UpdateAttendeeRequest req = new UpdateAttendeeRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeUpdate = new AttendeeUpdate() {
        Event = new AttendeeUpdateEvent() {
            Id = "0a955598-376e-43d4-a796-91d6d5f41e3f",
        },
        Contact = new AttendeeUpdateContact() {
            Id = "ea66a709-2a93-4fa0-8b83-cf4f62df9dc3",
        },
        InvitationList = new AttendeeUpdateInvitationList() {
            Id = "06da38f9-12da-4cb6-a581-7a5954f8e0e2",
        },
        ReferenceId = "refid-marketingwebsite",
        Note = "Would like to sit near the front of the room for sessions.",
        Administrator = new AttendeeUpdateAdministrator() {
            Id = "7949c335-b5b2-46cf-8f5d-f6b21795df51",
        },
        AdmissionItem = new AttendeeUpdateAdmissionItem() {
            Id = "7949c335-b5b2-46cf-8f5d-f6b21795df51",
        },
        Visibility = AttendeeVisibilityJson.Private,
        Answers = new List<AttendeeAnswerJson>() {
            new AttendeeAnswerJson() {
                Question = new AttendeeAnswerJsonQuestion() {
                    Id = "60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a",
                },
                Value = new List<string>() {
                    "1234",
                },
            },
        },
        SendEmail = false,
        Status = AttendeeUpdateStatusJson.Accepted,
    },
};

var res = await sdk.Attendees.UpdateAttendeeAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [UpdateAttendeeRequest](../../Models/Requests/UpdateAttendeeRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[UpdateAttendeeResponse](../../Models/Requests/UpdateAttendeeResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateAttendeeSubscriptionStatus

Updates an attendee's email subscription status for a specific event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateAttendeeSubscriptionStatus" method="put" path="/attendees/{id}/email-subscriptions" -->
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

UpdateAttendeeSubscriptionStatusRequest req = new UpdateAttendeeSubscriptionStatusRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeSubscriptionRequest = new AttendeeSubscriptionRequest() {
        Unsubscribed = true,
    },
};

var res = await sdk.Attendees.UpdateAttendeeSubscriptionStatusAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [UpdateAttendeeSubscriptionStatusRequest](../../Models/Requests/UpdateAttendeeSubscriptionStatusRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[UpdateAttendeeSubscriptionStatusResponse](../../Models/Requests/UpdateAttendeeSubscriptionStatusResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateInternalInfoAnswers

Update internal information answers for an attendee. Use either question code or id to identify which question's answers are being updated.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateInternalInfoAnswers" method="put" path="/attendees/{id}/internal-information-questions" -->
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

UpdateInternalInfoAnswersRequest req = new UpdateInternalInfoAnswersRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeInternalInfo = new AttendeeInternalInfo() {
        Question = new AttendeeInternalInfoQuestion() {
            Id = "adcc4376-4560-4fb3-8594-2fdbb637c07c",
            Code = "DIETARY",
        },
        Value = new List<string>() {
            "1234",
        },
    },
};

var res = await sdk.Attendees.UpdateInternalInfoAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateInternalInfoAnswersRequest](../../Models/Requests/UpdateInternalInfoAnswersRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateInternalInfoAnswersResponse](../../Models/Requests/UpdateInternalInfoAnswersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## PostBadge

Create a badge for an attendee associated with an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="postBadge" method="post" path="/events/{id}/badges" -->
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

PostBadgeRequest req = new PostBadgeRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    Badge = new BadgeInput() {
        Id = "abc123",
        Status = BadgeStatusJson.Active,
        Type = BadgeTypeJson.Epc,
        Attendee = new AttendeeJson3() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Event = new EventJson6() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
    },
};

var res = await sdk.Attendees.PostBadgeAsync(req);

// handle response
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [PostBadgeRequest](../../Models/Requests/PostBadgeRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[PostBadgeResponse](../../Models/Requests/PostBadgeResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBadge

Retrieves a list of third-party badge associations for attendees within the event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBadge" method="get" path="/events/{id}/badges" -->
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

GetBadgeRequest req = new GetBadgeRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq '{string}' and attendee.id eq '{UUID}'",
};

GetBadgeResponse? res = await sdk.Attendees.GetBadgeAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetBadgeRequest](../../Models/Requests/GetBadgeRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetBadgeResponse](../../Models/Requests/GetBadgeResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetBadgesPostFilters

Gets a paginated list of Badges by sending a filter in the body of the request. This method will return the same data as the getBadge but allows for longer filters.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getBadgesPostFilters" method="post" path="/events/{id}/badges/filter" -->
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

GetBadgesPostFiltersRequest req = new GetBadgesPostFiltersRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = new Filter() {
        FilterValue = "id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' AND attendee.id eq 'edf40757-3bc3-4a66-8180-93bff15b890b'",
    },
};

GetBadgesPostFiltersResponse? res = await sdk.Attendees.GetBadgesPostFiltersAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetBadgesPostFiltersRequest](../../Models/Requests/GetBadgesPostFiltersRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetBadgesPostFiltersResponse](../../Models/Requests/GetBadgesPostFiltersResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateBadge

Update a badge for an attendee associated with an event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateBadge" method="put" path="/events/{id}/badges/{badgeId}" -->
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

UpdateBadgeRequest req = new UpdateBadgeRequest() {
    Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
    BadgeId = "abc123",
    Badge = new BadgeInput() {
        Id = "abc123",
        Status = BadgeStatusJson.Active,
        Type = BadgeTypeJson.Epc,
        Attendee = new AttendeeJson3() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        Event = new EventJson6() {
            Id = "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
    },
};

var res = await sdk.Attendees.UpdateBadgeAsync(req);

// handle response
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [UpdateBadgeRequest](../../Models/Requests/UpdateBadgeRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[UpdateBadgeResponse](../../Models/Requests/UpdateBadgeResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
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

* [ListAttendeeActivities](#listattendeeactivities) - List Activities
* [CreateAttendeeActivity](#createattendeeactivity) - Add External Activity
* [ListExternalAttendeeActivitiesMetadata](#listexternalattendeeactivitiesmetadata) - List Ext. Activities Metadata
* [CreateExternalAttendeeActivityMetadata](#createexternalattendeeactivitymetadata) - Add Ext. Activities Metadata
* [DeleteExternalAttendeeActivityMetadata](#deleteexternalattendeeactivitymetadata) - Delete Ext Activities Metadata
* [UpdateExternalAttendeeActivityMetadata](#updateexternalattendeeactivitymetadata) - Update Ext Activities Metadata

## ListAttendeeActivities

Gets a paginated list of attendee activities.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAttendeeActivities" method="get" path="/attendees/activities" -->
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

ListAttendeeActivitiesRequest req = new ListAttendeeActivitiesRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "type eq 'event.registered' or type eq 'session.enrolled' and (attendee.id eq 'uuid1' or attendee.id eq 'uuid2')",
};

ListAttendeeActivitiesResponse? res = await sdk.AttendeeActivities.ListAttendeeActivitiesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [ListAttendeeActivitiesRequest](../../Models/Requests/ListAttendeeActivitiesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[ListAttendeeActivitiesResponse](../../Models/Requests/ListAttendeeActivitiesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateAttendeeActivity

Create an external attendee activity.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createAttendeeActivity" method="post" path="/attendees/activities" -->
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

ExternalActivityInput req = new ExternalActivityInput() {
    Attendee = new UuidJson() {
        Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    Event = new EventActivityDetailsJsonInput() {
        Id = "d84855b0-eeda-41c4-8e7a-53e80364cb95",
    },
    Name = "Registered for Event",
    Type = ExternalActivityTypeJson.EventExternal,
    Data = ExternalActivityDataJson.CreateExternalActivityDataJsonEventExternal(
        new ExternalActivityDataJsonEventExternal() {
            Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            ExternalActivityDate = System.DateTime.Parse("2019-08-24T14:15:22Z").ToUniversalTime(),
            AdditionalFields = new Dictionary<string, string>() {
                { "venue", "tokyo" },
                { "submitted", "true" },
            },
        }
    ),
};

var res = await sdk.AttendeeActivities.CreateAttendeeActivityAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ExternalActivityInput](../../Models/Components/ExternalActivityInput.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateAttendeeActivityResponse](../../Models/Requests/CreateAttendeeActivityResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListExternalAttendeeActivitiesMetadata

Gets a paginated list of external attendee activities metadata.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listExternalAttendeeActivitiesMetadata" method="get" path="/attendees/activities/external/metadata" -->
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

ListExternalAttendeeActivitiesMetadataRequest req = new ListExternalAttendeeActivitiesMetadataRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id eq 'd94aff58-175d-41a5-9612-64e71202f8c3' and 'type eq 'event.external' and name ne 'social.media' and created ge '2021-03-15T09:33:13.750Z' and lastModified le '2021-03-15T09:33:13.750Z'",
};

ListExternalAttendeeActivitiesMetadataResponse? res = await sdk.AttendeeActivities.ListExternalAttendeeActivitiesMetadataAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [ListExternalAttendeeActivitiesMetadataRequest](../../Models/Requests/ListExternalAttendeeActivitiesMetadataRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |

### Response

**[ListExternalAttendeeActivitiesMetadataResponse](../../Models/Requests/ListExternalAttendeeActivitiesMetadataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateExternalAttendeeActivityMetadata

Creates external attendee activity metadata.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createExternalAttendeeActivityMetadata" method="post" path="/attendees/activities/external/metadata" -->
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

ExternalActivityMetadataInput req = new ExternalActivityMetadataInput() {
    Type = ExternalActivityTypeJson.EventExternal,
    Name = "social.media",
    Description = "This external activity contains data of social activities for an attendee.",
    Fields = new List<ExternalActivitiesAdditionalFieldsMetadataJson>() {
        new ExternalActivitiesAdditionalFieldsMetadataJson() {
            Name = "facebook_social.media",
            Description = "Contains data for facebook social media activity.",
        },
    },
};

var res = await sdk.AttendeeActivities.CreateExternalAttendeeActivityMetadataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ExternalActivityMetadataInput](../../Models/Components/ExternalActivityMetadataInput.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateExternalAttendeeActivityMetadataResponse](../../Models/Requests/CreateExternalAttendeeActivityMetadataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteExternalAttendeeActivityMetadata

Deletes external attendee activity metadata.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteExternalAttendeeActivityMetadata" method="delete" path="/attendees/activities/external/metadata/{id}" -->
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

DeleteExternalAttendeeActivityMetadataRequest req = new DeleteExternalAttendeeActivityMetadataRequest() {
    Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
};

var res = await sdk.AttendeeActivities.DeleteExternalAttendeeActivityMetadataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [DeleteExternalAttendeeActivityMetadataRequest](../../Models/Requests/DeleteExternalAttendeeActivityMetadataRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |

### Response

**[DeleteExternalAttendeeActivityMetadataResponse](../../Models/Requests/DeleteExternalAttendeeActivityMetadataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateExternalAttendeeActivityMetadata

Update external attendee activity metadata.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateExternalAttendeeActivityMetadata" method="put" path="/attendees/activities/external/metadata/{id}" -->
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

UpdateExternalAttendeeActivityMetadataRequest req = new UpdateExternalAttendeeActivityMetadataRequest() {
    Id = "9463c74e-18c6-401a-a710-ae0f485bf059",
    ExternalActivityMetadata = new ExternalActivityMetadataInput() {
        Type = ExternalActivityTypeJson.EventExternal,
        Name = "social.media",
        Description = "This external activity contains data of social activities for an attendee.",
        Fields = new List<ExternalActivitiesAdditionalFieldsMetadataJson>() {
            new ExternalActivitiesAdditionalFieldsMetadataJson() {
                Name = "facebook_social.media",
                Description = "Contains data for facebook social media activity.",
            },
        },
    },
};

var res = await sdk.AttendeeActivities.UpdateExternalAttendeeActivityMetadataAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                               | [UpdateExternalAttendeeActivityMetadataRequest](../../Models/Requests/UpdateExternalAttendeeActivityMetadataRequest.md) | :heavy_check_mark:                                                                                                      | The request object to use for the request.                                                                              |

### Response

**[UpdateExternalAttendeeActivityMetadataResponse](../../Models/Requests/UpdateExternalAttendeeActivityMetadataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
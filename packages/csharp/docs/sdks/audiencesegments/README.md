# AudienceSegments

## Overview

Audience Segments allow planners to segment their attendees into groups and
better manage the attendee experience based on their defined segments. Audience
Segments APIs will enable you to get, create, and update segment information.
These APIs will also allow you to get and update attendees associated with an
audience segment.


### Available Operations

* [DisassociateAttendeeFromAudienceSegments](#disassociateattendeefromaudiencesegments) - Delete Attendee Associations
* [CreateAudienceSegment](#createaudiencesegment) - Create Audience Segment
* [ListAudienceSegments](#listaudiencesegments) - List Audience Segments
* [ListAudienceSegmentsPostFilter](#listaudiencesegmentspostfilter) - List Audience Segments
* [GetAudienceSegmentById](#getaudiencesegmentbyid) - Get Audience Segment
* [UpdateAudienceSegment](#updateaudiencesegment) - Update Audience Segment
* [DeleteAudienceSegment](#deleteaudiencesegment) - Delete Audience Segment
* [ListSegmentAssociatedAttendees](#listsegmentassociatedattendees) - List Associated Attendees
* [AssociateAttendeeToSegment](#associateattendeetosegment) - Associate Attendee to Segment
* [DisassociateAttendeeFromAudienceSegment](#disassociateattendeefromaudiencesegment) - Disassociate Attendee

## DisassociateAttendeeFromAudienceSegments

disassociate an attendee from all audience segments

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateAttendeeFromAudienceSegments" method="delete" path="/attendees/{attendeeId}/audience-segments" -->
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

DisassociateAttendeeFromAudienceSegmentsRequest req = new DisassociateAttendeeFromAudienceSegmentsRequest() {
    AttendeeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.AudienceSegments.DisassociateAttendeeFromAudienceSegmentsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                   | Type                                                                                                                        | Required                                                                                                                    | Description                                                                                                                 |
| --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                   | [DisassociateAttendeeFromAudienceSegmentsRequest](../../Models/Requests/DisassociateAttendeeFromAudienceSegmentsRequest.md) | :heavy_check_mark:                                                                                                          | The request object to use for the request.                                                                                  |

### Response

**[DisassociateAttendeeFromAudienceSegmentsResponse](../../Models/Requests/DisassociateAttendeeFromAudienceSegmentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404                         | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateAudienceSegment

Creates an audience segment in the given event based on the details supplied in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createAudienceSegment" method="post" path="/audience-segments" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

AudienceSegmentCreate req = new AudienceSegmentCreate() {
    Event = new EventJson3() {
        Id = "103097a4-143d-11e5-9f99-d0a637ee0032",
    },
    Name = "VIP Attendees",
    Description = "A group of VIP attendees.",
};

var res = await sdk.AudienceSegments.CreateAudienceSegmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [AudienceSegmentCreate](../../Models/Components/AudienceSegmentCreate.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateAudienceSegmentResponse](../../Models/Requests/CreateAudienceSegmentResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| Cvent.SDK.Models.Errors.SegmentsErrorResponse | 400                                           | application/json                              |
| Cvent.SDK.Models.Errors.ErrorResponse         | 401, 403, 422, 429                            | application/json                              |
| Cvent.SDK.Models.Errors.APIException          | 4XX, 5XX                                      | \*/\*                                         |

## ListAudienceSegments

Gets a paginated list of audience segments for your account. By default,
the results include all segments present, at the account level, unless you specify
otherwise using the filter query parameter.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAudienceSegments" method="get" path="/audience-segments" -->
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

ListAudienceSegmentsRequest req = new ListAudienceSegmentsRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "lastModifiedBy:DESC",
    Filter = "event.id eq '103097a4-143d-11e5-9f99-d0a637ee0032' and id in ('313097a4-143d-11e5-9f99-d0a637ee0897','423097a4-143d-11e5-9f99-d0a637ee0897') and deleted eq 'false' and creationType eq 'MANUAL'",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
};

ListAudienceSegmentsResponse? res = await sdk.AudienceSegments.ListAudienceSegmentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListAudienceSegmentsRequest](../../Models/Requests/ListAudienceSegmentsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListAudienceSegmentsResponse](../../Models/Requests/ListAudienceSegmentsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListAudienceSegmentsPostFilter

Gets a paginated list of audience segments for an account by sending a filter
in the body of the request. By default, the results include all
audience segments at the account level unless you specify otherwise in the filter. This
method returns the same data as
[GET List Audience Segments](#operation/listAudienceSegments) but
allows for longer filters.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listAudienceSegmentsPostFilter" method="post" path="/audience-segments/filter" -->
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

ListAudienceSegmentsPostFilterRequest req = new ListAudienceSegmentsPostFilterRequest() {
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "lastModifiedBy:DESC",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Filter = new Filter() {
        FilterValue = "event.id eq '103097a4-143d-11e5-9f99-d0a637ee0032' and id in ('313097a4-143d-11e5-9f99-d0a637ee0897', '423097a4-143d-11e5-9f99-d0a637ee0897') and deleted eq 'false' and creationType eq 'MANUAL'",
    },
};

ListAudienceSegmentsPostFilterResponse? res = await sdk.AudienceSegments.ListAudienceSegmentsPostFilterAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListAudienceSegmentsPostFilterRequest](../../Models/Requests/ListAudienceSegmentsPostFilterRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ListAudienceSegmentsPostFilterResponse](../../Models/Requests/ListAudienceSegmentsPostFilterResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAudienceSegmentById

Gets an audience segment based on the given ID.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAudienceSegmentById" method="get" path="/audience-segments/{audienceSegmentId}" -->
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

GetAudienceSegmentByIdRequest req = new GetAudienceSegmentByIdRequest() {
    AudienceSegmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.AudienceSegments.GetAudienceSegmentByIdAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAudienceSegmentByIdRequest](../../Models/Requests/GetAudienceSegmentByIdRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAudienceSegmentByIdResponse](../../Models/Requests/GetAudienceSegmentByIdResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateAudienceSegment

Updates the given audience segment based on the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateAudienceSegment" method="put" path="/audience-segments/{audienceSegmentId}" -->
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

UpdateAudienceSegmentRequest req = new UpdateAudienceSegmentRequest() {
    AudienceSegmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AudienceSegment = new AudienceSegment() {
        Event = new EventJson3() {
            Id = "103097a4-143d-11e5-9f99-d0a637ee0032",
        },
        Name = "VIP Attendees",
        Description = "A group of VIP attendees.",
    },
};

var res = await sdk.AudienceSegments.UpdateAudienceSegmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateAudienceSegmentRequest](../../Models/Requests/UpdateAudienceSegmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateAudienceSegmentResponse](../../Models/Requests/UpdateAudienceSegmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 422, 429          | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## DeleteAudienceSegment

Deletes the given audience segment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteAudienceSegment" method="delete" path="/audience-segments/{audienceSegmentId}" -->
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

DeleteAudienceSegmentRequest req = new DeleteAudienceSegmentRequest() {
    AudienceSegmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.AudienceSegments.DeleteAudienceSegmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteAudienceSegmentRequest](../../Models/Requests/DeleteAudienceSegmentRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteAudienceSegmentResponse](../../Models/Requests/DeleteAudienceSegmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## ListSegmentAssociatedAttendees

Gets a paginated list of attendees associated or disassociated to/from an audience segment. Use the `filter` query parameter to return only associated or only disassociated attendees.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listSegmentAssociatedAttendees" method="get" path="/audience-segments/{audienceSegmentId}/attendees" -->
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

ListSegmentAssociatedAttendeesRequest req = new ListSegmentAssociatedAttendeesRequest() {
    AudienceSegmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    After = System.DateTime.Parse("2017-01-02T02:00:00Z").ToUniversalTime(),
    Filter = "disassociated eq 'false'",
    IncludeDisassociated = true,
};

ListSegmentAssociatedAttendeesResponse? res = await sdk.AudienceSegments.ListSegmentAssociatedAttendeesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [ListSegmentAssociatedAttendeesRequest](../../Models/Requests/ListSegmentAssociatedAttendeesRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[ListSegmentAssociatedAttendeesResponse](../../Models/Requests/ListSegmentAssociatedAttendeesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## AssociateAttendeeToSegment

Associates an attendee to a given audience segment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateAttendeeToSegment" method="put" path="/audience-segments/{audienceSegmentId}/attendees/{attendeeId}" -->
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

AssociateAttendeeToSegmentRequest req = new AssociateAttendeeToSegmentRequest() {
    AudienceSegmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.AudienceSegments.AssociateAttendeeToSegmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [AssociateAttendeeToSegmentRequest](../../Models/Requests/AssociateAttendeeToSegmentRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[AssociateAttendeeToSegmentResponse](../../Models/Requests/AssociateAttendeeToSegmentResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| Cvent.SDK.Models.Errors.SegmentsErrorResponse | 400                                           | application/json                              |
| Cvent.SDK.Models.Errors.ErrorResponse         | 401, 403, 404, 422, 429                       | application/json                              |
| Cvent.SDK.Models.Errors.APIException          | 4XX, 5XX                                      | \*/\*                                         |

## DisassociateAttendeeFromAudienceSegment

Disassociate an attendee from an audience segment.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateAttendeeFromAudienceSegment" method="delete" path="/audience-segments/{audienceSegmentId}/attendees/{attendeeId}" -->
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

DisassociateAttendeeFromAudienceSegmentRequest req = new DisassociateAttendeeFromAudienceSegmentRequest() {
    AudienceSegmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttendeeId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.AudienceSegments.DisassociateAttendeeFromAudienceSegmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                                 | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                 | [DisassociateAttendeeFromAudienceSegmentRequest](../../Models/Requests/DisassociateAttendeeFromAudienceSegmentRequest.md) | :heavy_check_mark:                                                                                                        | The request object to use for the request.                                                                                |

### Response

**[DisassociateAttendeeFromAudienceSegmentResponse](../../Models/Requests/DisassociateAttendeeFromAudienceSegmentResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
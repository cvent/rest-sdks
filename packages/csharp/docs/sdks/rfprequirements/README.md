# RFPRequirements

## Overview

RFP requirements APIs for managing RFP-specific requirements including guest rooms, meeting rooms, custom questions, custom fields, and attachments (CRUD operations).

### Available Operations

* [ListRfpAgendaItems](#listrfpagendaitems) - List RFP Agenda Items
* [CreateRfpAgendaItem](#createrfpagendaitem) - Create RFP Agenda Item
* [ListRfpAgendaItemSchedules](#listrfpagendaitemschedules) - List RFP Agenda Item Schedules
* [GetRfpAgendaItem](#getrfpagendaitem) - Get RFP Agenda Item
* [UpdateRfpAgendaItem](#updaterfpagendaitem) - Update RFP Agenda Item
* [DeleteRfpAgendaItem](#deleterfpagendaitem) - Delete RFP Agenda Item
* [ListRfpAttachments](#listrfpattachments) - List RFP Attachments
* [CreateRfpAttachment](#createrfpattachment) - Create RFP Attachment
* [GetRfpAttachment](#getrfpattachment) - Get RFP Attachment
* [DeleteRfpAttachment](#deleterfpattachment) - Delete RFP Attachment
* [ListRfpCustomFields](#listrfpcustomfields) - List RFP Custom Field Answers
* [GetRfpCustomFieldAnswers](#getrfpcustomfieldanswers) - Get RFP Custom Field Answers
* [UpdateRfpCustomFieldAnswers](#updaterfpcustomfieldanswers) - Update Custom Field Answers
* [GetRfpGuestRooms](#getrfpguestrooms) - Get RFP Guest Rooms
* [UpdateRfpGuestRooms](#updaterfpguestrooms) - Update RFP Guest Rooms
* [ListRfpInternalDocuments](#listrfpinternaldocuments) - List RFP Internal Documents
* [GetRfpInternalDocument](#getrfpinternaldocument) - Get RFP Internal Document
* [AssociateRfpInternalDocument](#associaterfpinternaldocument) - Associate Internal Document
* [DisassociateRfpInternalDocument](#disassociaterfpinternaldocument) - Disassociate Internal Document
* [ListRfpQuestions](#listrfpquestions) - List RFP Questions
* [CreateRfpQuestion](#createrfpquestion) - Create RFP Question
* [GetRfpQuestion](#getrfpquestion) - Get RFP Question
* [UpdateRfpQuestion](#updaterfpquestion) - Update RFP Question
* [DeleteRfpQuestion](#deleterfpquestion) - Delete RFP Question

## ListRfpAgendaItems

Returns a paginated list of agenda items associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpAgendaItems" method="get" path="/rfps/{rfpId}/agenda-items" -->
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

ListRfpAgendaItemsRequest req = new ListRfpAgendaItemsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')",
};

ListRfpAgendaItemsResponse? res = await sdk.RFPRequirements.ListRfpAgendaItemsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListRfpAgendaItemsRequest](../../Models/Requests/ListRfpAgendaItemsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListRfpAgendaItemsResponse](../../Models/Requests/ListRfpAgendaItemsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateRfpAgendaItem

Creates a new agenda item for the specified RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createRfpAgendaItem" method="post" path="/rfps/{rfpId}/agenda-items" -->
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

CreateRfpAgendaItemRequest req = new CreateRfpAgendaItemRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RfpAgendaItemRequest = new RfpAgendaItemRequest() {
        Name = "Agenda Item 1",
        Note = "This is a sample comment for this agenda item.",
        StartTime = "10:00:00",
        EndTime = "10:30:00",
        RoomSize = 1000,
        AttendeeCount = 10000,
        RoomInfoRequired = false,
        TwentyFourHourHold = true,
        LocatedAtPrimaryEventVenue = false,
        Number = 5,
        Schedules = new List<RfpAgendaItemScheduleInput>() {
            new RfpAgendaItemScheduleInput() {
                DayNumber = 1,
            },
        },
    },
};

var res = await sdk.RFPRequirements.CreateRfpAgendaItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateRfpAgendaItemRequest](../../Models/Requests/CreateRfpAgendaItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateRfpAgendaItemResponse](../../Models/Requests/CreateRfpAgendaItemResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListRfpAgendaItemSchedules

Returns a paginated list of the schedules of the agenda items of an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpAgendaItemSchedules" method="get" path="/rfps/{rfpId}/agenda-items/schedules" -->
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

ListRfpAgendaItemSchedulesRequest req = new ListRfpAgendaItemSchedulesRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListRfpAgendaItemSchedulesResponse? res = await sdk.RFPRequirements.ListRfpAgendaItemSchedulesAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [ListRfpAgendaItemSchedulesRequest](../../Models/Requests/ListRfpAgendaItemSchedulesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[ListRfpAgendaItemSchedulesResponse](../../Models/Requests/ListRfpAgendaItemSchedulesResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpAgendaItem

Returns details of a specific agenda item associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpAgendaItem" method="get" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
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

GetRfpAgendaItemRequest req = new GetRfpAgendaItemRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AgendaItemId = "f56a51a4-84b0-46c9-a612-716dc95a1c96",
};

var res = await sdk.RFPRequirements.GetRfpAgendaItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRfpAgendaItemRequest](../../Models/Requests/GetRfpAgendaItemRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRfpAgendaItemResponse](../../Models/Requests/GetRfpAgendaItemResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateRfpAgendaItem

Updates an existing agenda item for the specified RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRfpAgendaItem" method="put" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
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

UpdateRfpAgendaItemRequest req = new UpdateRfpAgendaItemRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AgendaItemId = "f56a51a4-84b0-46c9-a612-716dc95a1c96",
    RfpAgendaItem = new RfpAgendaItemInput() {
        Name = "Agenda Item 1",
        Note = "This is a sample comment for this agenda item.",
        StartTime = "10:00:00",
        EndTime = "10:30:00",
        RoomSize = 1000,
        AttendeeCount = 10000,
        RoomInfoRequired = false,
        TwentyFourHourHold = true,
        LocatedAtPrimaryEventVenue = false,
        Number = 5,
        Schedules = new List<RfpAgendaItemScheduleInput>() {
            new RfpAgendaItemScheduleInput() {
                DayNumber = 1,
            },
        },
        Id = "9290ddfb-cc91-4cc3-9b3f-5ee5caba486b",
    },
};

var res = await sdk.RFPRequirements.UpdateRfpAgendaItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateRfpAgendaItemRequest](../../Models/Requests/UpdateRfpAgendaItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateRfpAgendaItemResponse](../../Models/Requests/UpdateRfpAgendaItemResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteRfpAgendaItem

Deletes an existing agenda item from the specified RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteRfpAgendaItem" method="delete" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
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

DeleteRfpAgendaItemRequest req = new DeleteRfpAgendaItemRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AgendaItemId = "f56a51a4-84b0-46c9-a612-716dc95a1c96",
};

var res = await sdk.RFPRequirements.DeleteRfpAgendaItemAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteRfpAgendaItemRequest](../../Models/Requests/DeleteRfpAgendaItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteRfpAgendaItemResponse](../../Models/Requests/DeleteRfpAgendaItemResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListRfpAttachments

Returns a paginated list of [attachments](#tag/RFP-Requirements) added to an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpAttachments" method="get" path="/rfps/{rfpId}/attachments" -->
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

ListRfpAttachmentsRequest req = new ListRfpAttachmentsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "supplierSpecific eq 'false' or supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac','f56a51a4-84b0-46c9-a612-716dc95a1c96') AND sendInEmail eq 'false'",
};

ListRfpAttachmentsResponse? res = await sdk.RFPRequirements.ListRfpAttachmentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ListRfpAttachmentsRequest](../../Models/Requests/ListRfpAttachmentsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ListRfpAttachmentsResponse](../../Models/Requests/ListRfpAttachmentsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateRfpAttachment

Creates a new attachment on the specified RFP by copying an existing file. The file must be uploaded with [Upload File](#tag/File-Management/operation/uploadFile) before it can be copied.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createRfpAttachment" method="post" path="/rfps/{rfpId}/attachments" -->
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

CreateRfpAttachmentRequest req = new CreateRfpAttachmentRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RfpAttachmentRequest = new RfpAttachmentRequest() {
        File = new ReferenceToFile() {
            Id = "94a18afa-30ad-407e-87c2-526e1e871a82",
        },
    },
};

var res = await sdk.RFPRequirements.CreateRfpAttachmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateRfpAttachmentRequest](../../Models/Requests/CreateRfpAttachmentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateRfpAttachmentResponse](../../Models/Requests/CreateRfpAttachmentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpAttachment

Returns details of a specific attachment added on an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpAttachment" method="get" path="/rfps/{rfpId}/attachments/{attachmentId}" -->
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

GetRfpAttachmentRequest req = new GetRfpAttachmentRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttachmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.GetRfpAttachmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRfpAttachmentRequest](../../Models/Requests/GetRfpAttachmentRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRfpAttachmentResponse](../../Models/Requests/GetRfpAttachmentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteRfpAttachment

Deletes the specified attachment from an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteRfpAttachment" method="delete" path="/rfps/{rfpId}/attachments/{attachmentId}" -->
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

DeleteRfpAttachmentRequest req = new DeleteRfpAttachmentRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    AttachmentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.DeleteRfpAttachmentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteRfpAttachmentRequest](../../Models/Requests/DeleteRfpAttachmentRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteRfpAttachmentResponse](../../Models/Requests/DeleteRfpAttachmentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListRfpCustomFields

Returns a paginated list of answers for each custom field associated with a given RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpCustomFields" method="get" path="/rfps/{rfpId}/custom-fields/answers" -->
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

ListRfpCustomFieldsRequest req = new ListRfpCustomFieldsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Expand = new List<CustomFieldExpand>() {
        CustomFieldExpand.CustomField,
    },
};

ListRfpCustomFieldsResponse? res = await sdk.RFPRequirements.ListRfpCustomFieldsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ListRfpCustomFieldsRequest](../../Models/Requests/ListRfpCustomFieldsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ListRfpCustomFieldsResponse](../../Models/Requests/ListRfpCustomFieldsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpCustomFieldAnswers

Returns details of answers specific to a custom field associated to an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpCustomFieldAnswers" method="get" path="/rfps/{rfpId}/custom-fields/{customFieldId}/answers" -->
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

GetRfpCustomFieldAnswersRequest req = new GetRfpCustomFieldAnswersRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomFieldId = "8cbcdb70-e2d0-46c2-8b3f-006e545394a7",
    Expand = new List<CustomFieldExpand>() {
        CustomFieldExpand.CustomField,
    },
};

var res = await sdk.RFPRequirements.GetRfpCustomFieldAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetRfpCustomFieldAnswersRequest](../../Models/Requests/GetRfpCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetRfpCustomFieldAnswersResponse](../../Models/Requests/GetRfpCustomFieldAnswersResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateRfpCustomFieldAnswers

Updates the answers to a custom field of an RFP. Create the custom field at the account level with [Create Custom Field](#tag/Custom-Fields/operation/createCustomField) before you update its answers.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRfpCustomFieldAnswers" method="put" path="/rfps/{rfpId}/custom-fields/{customFieldId}/answers" -->
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

UpdateRfpCustomFieldAnswersRequest req = new UpdateRfpCustomFieldAnswersRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    CustomFieldId = "8cbcdb70-e2d0-46c2-8b3f-006e545394a7",
    Expand = new List<CustomFieldExpand>() {
        CustomFieldExpand.CustomField,
    },
    CustomFieldAnswers = new CustomFieldAnswers() {
        CustomField = new ExpandableCustomObject() {
            Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        Answers = new List<string>() {
            "Choice 1",
        },
    },
};

var res = await sdk.RFPRequirements.UpdateRfpCustomFieldAnswersAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [UpdateRfpCustomFieldAnswersRequest](../../Models/Requests/UpdateRfpCustomFieldAnswersRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[UpdateRfpCustomFieldAnswersResponse](../../Models/Requests/UpdateRfpCustomFieldAnswersResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpGuestRooms

Returns guest room requirements associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpGuestRooms" method="get" path="/rfps/{rfpId}/guest-rooms" -->
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

GetRfpGuestRoomsRequest req = new GetRfpGuestRoomsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.GetRfpGuestRoomsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRfpGuestRoomsRequest](../../Models/Requests/GetRfpGuestRoomsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRfpGuestRoomsResponse](../../Models/Requests/GetRfpGuestRoomsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateRfpGuestRooms

Updates guest room requirements associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRfpGuestRooms" method="put" path="/rfps/{rfpId}/guest-rooms" -->
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

UpdateRfpGuestRoomsRequest req = new UpdateRfpGuestRoomsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RfpGuestRooms = new RfpGuestRoomsInput() {
        Occupancies = new List<GuestRoomOccupancyPerRoomType>() {
            new GuestRoomOccupancyPerRoomType() {
                Occupancy = GuestRoomOccupancy.Single,
                Type = GuestRoomType.Double,
            },
        },
        CheckInDate = DateOnly.Parse("2025-10-13"),
        RoomBlocks = new List<RoomBlockInput>() {
            new RoomBlockInput() {
                DayNumber = 3,
                Details = new List<RoomBlockDetails>() {
                    new RoomBlockDetails() {
                        Quantity = 24,
                        Type = GuestRoomType.Double,
                    },
                },
            },
        },
        AdditionalInformation = "2 Executive suites are mandatory.",
    },
};

var res = await sdk.RFPRequirements.UpdateRfpGuestRoomsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateRfpGuestRoomsRequest](../../Models/Requests/UpdateRfpGuestRoomsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateRfpGuestRoomsResponse](../../Models/Requests/UpdateRfpGuestRoomsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListRfpInternalDocuments

Returns a paginated list of [internal documents](#tag/RFP-Requirements) added to an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpInternalDocuments" method="get" path="/rfps/{rfpId}/internal-documents" -->
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

ListRfpInternalDocumentsRequest req = new ListRfpInternalDocumentsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')",
};

ListRfpInternalDocumentsResponse? res = await sdk.RFPRequirements.ListRfpInternalDocumentsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ListRfpInternalDocumentsRequest](../../Models/Requests/ListRfpInternalDocumentsRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[ListRfpInternalDocumentsResponse](../../Models/Requests/ListRfpInternalDocumentsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpInternalDocument

Returns details of an internal document associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpInternalDocument" method="get" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
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

GetRfpInternalDocumentRequest req = new GetRfpInternalDocumentRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    DocumentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.GetRfpInternalDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetRfpInternalDocumentRequest](../../Models/Requests/GetRfpInternalDocumentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetRfpInternalDocumentResponse](../../Models/Requests/GetRfpInternalDocumentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## AssociateRfpInternalDocument

Associates a single document with an RFP. The `documentId` path parameter is the file ID that [Upload File](#tag/File-Management/operation/uploadFile) returns. A document with the same name or ID should not already exist.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="associateRfpInternalDocument" method="put" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
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

AssociateRfpInternalDocumentRequest req = new AssociateRfpInternalDocumentRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    DocumentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.AssociateRfpInternalDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [AssociateRfpInternalDocumentRequest](../../Models/Requests/AssociateRfpInternalDocumentRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[AssociateRfpInternalDocumentResponse](../../Models/Requests/AssociateRfpInternalDocumentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DisassociateRfpInternalDocument

Disassociates an internal document from an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="disassociateRfpInternalDocument" method="delete" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
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

DisassociateRfpInternalDocumentRequest req = new DisassociateRfpInternalDocumentRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    DocumentId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.DisassociateRfpInternalDocumentAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [DisassociateRfpInternalDocumentRequest](../../Models/Requests/DisassociateRfpInternalDocumentRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[DisassociateRfpInternalDocumentResponse](../../Models/Requests/DisassociateRfpInternalDocumentResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## ListRfpQuestions

Returns a paginated list of standard and custom questions associated with the given RFP. Does not include answer details.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpQuestions" method="get" path="/rfps/{rfpId}/questions" -->
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

ListRfpQuestionsRequest req = new ListRfpQuestionsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

ListRfpQuestionsResponse? res = await sdk.RFPRequirements.ListRfpQuestionsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListRfpQuestionsRequest](../../Models/Requests/ListRfpQuestionsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListRfpQuestionsResponse](../../Models/Requests/ListRfpQuestionsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateRfpQuestion

Creates a new question for the specified RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createRfpQuestion" method="post" path="/rfps/{rfpId}/questions" -->
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

CreateRfpQuestionRequest req = new CreateRfpQuestionRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RfpQuestion = new RfpQuestionInput() {
        Text = "Are you spending any significant time offsite and need transportation?",
        ShortText = "Needs offsite transportation?",
        HtmlText = "Question Html",
        Code = "4l6x",
        Type = QuestionType.SingleChoice,
        Choices = new List<ChoiceInput>() {
            new ChoiceInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
                Label = "Choice A",
            },
        },
        Categories = new List<CategoryInput>() {
            new CategoryInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
                Required = true,
            },
        },
        SubCategories = new List<TextFieldInput>() {
            new TextFieldInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
            },
        },
        NotApplicableAnswer = new AdditionalChoice() {
            Text = "Dietary Restriction - Other",
            ShortText = "Dietary Preference - Other Allergies",
        },
        OtherAnswer = new AdditionalChoice() {
            Text = "Dietary Restriction - Other",
            ShortText = "Dietary Preference - Other Allergies",
        },
        Comments = "Comments Text",
        Required = true,
        Fields = new List<FieldInput>() {
            new FieldInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
                Choices = new List<ChoiceInput>() {
                    new ChoiceInput() {
                        Text = "Are you spending any significant time offsite and need transportation?",
                        ShortText = "Needs offsite transportation?",
                        Label = "Choice A",
                    },
                },
                NotApplicableAnswer = new AdditionalChoice() {
                    Text = "Dietary Restriction - Other",
                    ShortText = "Dietary Preference - Other Allergies",
                },
                OtherAnswer = new AdditionalChoice() {
                    Text = "Dietary Restriction - Other",
                    ShortText = "Dietary Preference - Other Allergies",
                },
                Required = true,
            },
        },
        MaxScore = 20D,
        TotalSum = 45,
        MinSelection = 1,
        MaxSelection = 3,
        MinDate = DateOnly.Parse("2020-01-01"),
        MaxDate = DateOnly.Parse("2020-12-31"),
        ShowDateSelector = true,
        ShowCurrentDate = true,
        UnitLabel = "miles",
        MinLength = 5,
        MaxLength = 100,
        CustomAnswerFormat = new CustomAnswerFormat() {
            Id = 104,
        },
        SupplierTypes = new List<SupplierType>() {
            SupplierType.Cvb,
            SupplierType.Hotel,
        },
        ClassificationType = QuestionClassificationType.GuestRoom,
        Order = 1,
        StandardQuestion = new StandardQuestion() {
            Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
    },
};

var res = await sdk.RFPRequirements.CreateRfpQuestionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateRfpQuestionRequest](../../Models/Requests/CreateRfpQuestionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateRfpQuestionResponse](../../Models/Requests/CreateRfpQuestionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpQuestion

Returns the details of a specific question associated with an RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpQuestion" method="get" path="/rfps/{rfpId}/questions/{questionId}" -->
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

GetRfpQuestionRequest req = new GetRfpQuestionRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    QuestionId = "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.GetRfpQuestionAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetRfpQuestionRequest](../../Models/Requests/GetRfpQuestionRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetRfpQuestionResponse](../../Models/Requests/GetRfpQuestionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateRfpQuestion

Updates an existing question for the specified RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRfpQuestion" method="put" path="/rfps/{rfpId}/questions/{questionId}" -->
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

UpdateRfpQuestionRequest req = new UpdateRfpQuestionRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    QuestionId = "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RfpQuestion = new RfpQuestionInput() {
        Text = "Are you spending any significant time offsite and need transportation?",
        ShortText = "Needs offsite transportation?",
        HtmlText = "Question Html",
        Code = "4l6x",
        Type = QuestionType.SingleChoice,
        Choices = new List<ChoiceInput>() {
            new ChoiceInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
                Label = "Choice A",
            },
        },
        Categories = new List<CategoryInput>() {
            new CategoryInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
                Required = true,
            },
        },
        SubCategories = new List<TextFieldInput>() {
            new TextFieldInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
            },
        },
        NotApplicableAnswer = new AdditionalChoice() {
            Text = "Dietary Restriction - Other",
            ShortText = "Dietary Preference - Other Allergies",
        },
        OtherAnswer = new AdditionalChoice() {
            Text = "Dietary Restriction - Other",
            ShortText = "Dietary Preference - Other Allergies",
        },
        Comments = "Comments Text",
        Required = true,
        Fields = new List<FieldInput>() {
            new FieldInput() {
                Text = "Are you spending any significant time offsite and need transportation?",
                ShortText = "Needs offsite transportation?",
                Choices = new List<ChoiceInput>() {
                    new ChoiceInput() {
                        Text = "Are you spending any significant time offsite and need transportation?",
                        ShortText = "Needs offsite transportation?",
                        Label = "Choice A",
                    },
                },
                NotApplicableAnswer = new AdditionalChoice() {
                    Text = "Dietary Restriction - Other",
                    ShortText = "Dietary Preference - Other Allergies",
                },
                OtherAnswer = new AdditionalChoice() {
                    Text = "Dietary Restriction - Other",
                    ShortText = "Dietary Preference - Other Allergies",
                },
                Required = true,
            },
        },
        MaxScore = 20D,
        TotalSum = 45,
        MinSelection = 1,
        MaxSelection = 3,
        MinDate = DateOnly.Parse("2020-01-01"),
        MaxDate = DateOnly.Parse("2020-12-31"),
        ShowDateSelector = true,
        ShowCurrentDate = true,
        UnitLabel = "miles",
        MinLength = 5,
        MaxLength = 100,
        CustomAnswerFormat = new CustomAnswerFormat() {
            Id = 104,
        },
        SupplierTypes = new List<SupplierType>() {
            SupplierType.Cvb,
            SupplierType.Hotel,
        },
        ClassificationType = QuestionClassificationType.MeetingRoom,
        Order = 1,
        StandardQuestion = new StandardQuestion() {
            Id = "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
    },
};

var res = await sdk.RFPRequirements.UpdateRfpQuestionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UpdateRfpQuestionRequest](../../Models/Requests/UpdateRfpQuestionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateRfpQuestionResponse](../../Models/Requests/UpdateRfpQuestionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteRfpQuestion

Deletes an existing question from the specified RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteRfpQuestion" method="delete" path="/rfps/{rfpId}/questions/{questionId}" -->
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

DeleteRfpQuestionRequest req = new DeleteRfpQuestionRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    QuestionId = "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPRequirements.DeleteRfpQuestionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteRfpQuestionRequest](../../Models/Requests/DeleteRfpQuestionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteRfpQuestionResponse](../../Models/Requests/DeleteRfpQuestionResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |
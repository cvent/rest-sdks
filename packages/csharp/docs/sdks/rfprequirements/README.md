# RFPRequirements

## Overview

RFP requirements APIs for managing RFP-specific requirements including guest rooms, meeting rooms, custom questions, custom fields, and attachments (CRUD operations).

### Available Operations

* [ListRfpAgendaItems](#listrfpagendaitems) - List RFP Agenda Items
* [ListRfpAgendaItemSchedules](#listrfpagendaitemschedules) - List RFP Agenda Item Schedules
* [ListRfpAttachments](#listrfpattachments) - List RFP Attachments
* [ListRfpCustomFields](#listrfpcustomfields) - List RFP Custom Fields Answers
* [GetRfpGuestRooms](#getrfpguestrooms) - Get RFP Guest Rooms
* [ListRfpInternalDocuments](#listrfpinternaldocuments) - List RFP Internal Documents
* [ListRfpQuestions](#listrfpquestions) - List RFP Questions

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

## ListRfpAgendaItemSchedules

Returns paginated list of schedules for agenda items added on an RFP.

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

## ListRfpAttachments

Returns paginated list of [attachments](#tag/RFP-Requirements) added on an RFP.

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

## ListRfpInternalDocuments

Returns paginated list of [internal documents](#tag/RFP-Requirements) added on an RFP.

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
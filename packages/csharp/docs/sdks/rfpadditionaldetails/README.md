# RFPAdditionalDetails

## Overview

RFP additional details APIs for managing past event references and other miscellaneous RFP operations.

### Available Operations

* [ListRfpPastEvents](#listrfppastevents) - List RFP Past Events
* [CreateRfpPastEvent](#createrfppastevent) - Create RFP Past Event
* [GetRfpPastEvent](#getrfppastevent) - Get RFP Past Event
* [UpdateRfpPastEvent](#updaterfppastevent) - Update RFP Past Event
* [DeleteRfpPastEvent](#deleterfppastevent) - Delete RFP Past Event

## ListRfpPastEvents

Retrieves a list of past events associated with an RFP. These can be non-Cvent events.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="listRfpPastEvents" method="get" path="/rfps/{rfpId}/past-events" -->
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

ListRfpPastEventsRequest req = new ListRfpPastEventsRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

var res = await sdk.RFPAdditionalDetails.ListRfpPastEventsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListRfpPastEventsRequest](../../Models/Requests/ListRfpPastEventsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListRfpPastEventsResponse](../../Models/Requests/ListRfpPastEventsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## CreateRfpPastEvent

Adds a past event that is similar to the event associated with the specified RFP. An RFP can have at most 3 past events.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createRfpPastEvent" method="post" path="/rfps/{rfpId}/past-events" -->
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

CreateRfpPastEventRequest req = new CreateRfpPastEventRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    RfpPastEventRequest = new RfpPastEventRequest() {
        VenueName = "Delta Inn by Supreme Hotels",
        City = "New Delhi",
        StateProvince = "US-AL",
        Date = "First week of January 2024",
        AttendeeCount = 500,
        GuestRoomsPickedUp = 500,
        GuestRoomsBlocked = 500,
        FoodBeverageSpend = "3,000 dollars",
        Notes = "This was the 25th event hosted by Alpha Planners.",
    },
};

var res = await sdk.RFPAdditionalDetails.CreateRfpPastEventAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CreateRfpPastEventRequest](../../Models/Requests/CreateRfpPastEventRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CreateRfpPastEventResponse](../../Models/Requests/CreateRfpPastEventResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetRfpPastEvent

Returns details of a past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRfpPastEvent" method="get" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
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

GetRfpPastEventRequest req = new GetRfpPastEventRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PastEventId = "f56a51a4-84b0-46c9-a612-716dc95a1c96",
};

var res = await sdk.RFPAdditionalDetails.GetRfpPastEventAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRfpPastEventRequest](../../Models/Requests/GetRfpPastEventRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRfpPastEventResponse](../../Models/Requests/GetRfpPastEventResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateRfpPastEvent

Updates a past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateRfpPastEvent" method="put" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
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

UpdateRfpPastEventRequest req = new UpdateRfpPastEventRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PastEventId = "f56a51a4-84b0-46c9-a612-716dc95a1c96",
    RfpPastEvent = new RfpPastEvent() {
        VenueName = "Delta Inn by Supreme Hotels",
        City = "New Delhi",
        StateProvince = "US-AL",
        Date = "First week of January 2024",
        AttendeeCount = 500,
        GuestRoomsPickedUp = 500,
        GuestRoomsBlocked = 500,
        FoodBeverageSpend = "3,000 dollars",
        Notes = "This was the 25th event hosted by Alpha Planners.",
        Id = "db6a6dd9-3284-4936-bd7d-5242494acb03",
    },
};

var res = await sdk.RFPAdditionalDetails.UpdateRfpPastEventAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateRfpPastEventRequest](../../Models/Requests/UpdateRfpPastEventRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateRfpPastEventResponse](../../Models/Requests/UpdateRfpPastEventResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## DeleteRfpPastEvent

Deletes the past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="deleteRfpPastEvent" method="delete" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
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

DeleteRfpPastEventRequest req = new DeleteRfpPastEventRequest() {
    RfpId = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    PastEventId = "f56a51a4-84b0-46c9-a612-716dc95a1c96",
};

var res = await sdk.RFPAdditionalDetails.DeleteRfpPastEventAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [DeleteRfpPastEventRequest](../../Models/Requests/DeleteRfpPastEventRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[DeleteRfpPastEventResponse](../../Models/Requests/DeleteRfpPastEventResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |
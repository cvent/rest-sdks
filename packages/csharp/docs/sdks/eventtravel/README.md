# EventTravel

## Overview

Event travel lets planners capture air & hotel requests from attendees and track air actuals and hotel reservations at your event. Use these endpoints to retrieve your air, hotel and housing reservation request data from your events. **Housing Reservation Request** - An association between an attendee's information in a registration event and a Cvent Passkey event. Also known as a Passkey bridge.

### Available Operations

* [GetAirActualDetail](#getairactualdetail) - Get Air Actual
* [GetAirRequests](#getairrequests) - Get Air Requests
* [GetHotelRequests](#gethotelrequests) - Get Hotel Requests
* [GetHousingReservationRequests](#gethousingreservationrequests) - Get Housing Requests

## GetAirActualDetail

Get attendee air actual details for an event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAirActualDetail" method="get" path="/events/{id}/event-travel/air-actuals" -->
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

GetAirActualDetailRequest req = new GetAirActualDetailRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Expand = new List<ExpandAirActualQuestionAnswer>() {
        ExpandAirActualQuestionAnswer.AirActualDetailsAirActualAnswersQuestion,
    },
    Sort = "airActualDetails.name:DESC,airActualDetails.lastModified:ASC",
    Filter = "(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

GetAirActualDetailResponse? res = await sdk.EventTravel.GetAirActualDetailAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAirActualDetailRequest](../../Models/Requests/GetAirActualDetailRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAirActualDetailResponse](../../Models/Requests/GetAirActualDetailResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetAirRequests

Get attendee air request details for an event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getAirRequests" method="get" path="/events/{id}/event-travel/air-requests" -->
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

GetAirRequestsRequest req = new GetAirRequestsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Sort = "airRequestDetails.requesterFirstName:DESC,airRequestDetails.requesterLastName:ASC",
    Filter = "(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    Expand = new List<ExpandAirRequestQuestionAnswer>() {
        ExpandAirRequestQuestionAnswer.AirRequestDetailsAirRequestAnswersQuestion,
    },
};

GetAirRequestsResponse? res = await sdk.EventTravel.GetAirRequestsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetAirRequestsRequest](../../Models/Requests/GetAirRequestsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetAirRequestsResponse](../../Models/Requests/GetAirRequestsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHotelRequests

Get attendee hotel requests for an event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHotelRequests" method="get" path="/events/{id}/event-travel/hotel-requests" -->
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

GetHotelRequestsRequest req = new GetHotelRequestsRequest() {
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Expand = new List<ExpandHotelRequestQuestionAnswer>() {
        ExpandHotelRequestQuestionAnswer.HotelRequestDetailsHotelRequestAnswersQuestion,
    },
    Sort = "hotelRequestDetails.requesterFirstName:DESC,hotelRequestDetails.requesterLastName:ASC",
    Filter = "(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')",
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};

GetHotelRequestsResponse? res = await sdk.EventTravel.GetHotelRequestsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetHotelRequestsRequest](../../Models/Requests/GetHotelRequestsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetHotelRequestsResponse](../../Models/Requests/GetHotelRequestsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingReservationRequests

Get attendee housing reservation request details for an event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingReservationRequests" method="get" path="/events/{id}/event-travel/housing-reservation-requests" -->
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

GetHousingReservationRequestsRequest req = new GetHousingReservationRequestsRequest() {
    Id = "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')",
};

GetHousingReservationRequestsResponse? res = await sdk.EventTravel.GetHousingReservationRequestsAsync(req);

while(res != null)
{
    // handle items

    res = await res.Next!();
}
```

### Parameters

| Parameter                                                                                             | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `request`                                                                                             | [GetHousingReservationRequestsRequest](../../Models/Requests/GetHousingReservationRequestsRequest.md) | :heavy_check_mark:                                                                                    | The request object to use for the request.                                                            |

### Response

**[GetHousingReservationRequestsResponse](../../Models/Requests/GetHousingReservationRequestsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
# HousingHotels

## Overview

APIs for managing hotel-related operations.

### Available Operations

* [UpdateHotelRoomRates](#updatehotelroomrates) - Update Hotel Room Rates

## UpdateHotelRoomRates

Updates the given hotel's room rate details based on data in the request body.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateHotelRoomRates" method="put" path="/housing-hotels/{hotelCode}/rooms/{roomCode}/rates" -->
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

UpdateHotelRoomRatesRequest req = new UpdateHotelRoomRatesRequest() {
    HotelCode = "HOTELCODE",
    RoomCode = "VLR",
    HotelRoomRatesRequest = new HotelRoomRatesRequest() {
        RateCode = "VIPRATE",
        StartDate = DateOnly.Parse("2025-03-25"),
        EndDate = DateOnly.Parse("2025-03-25"),
        RoomRate = 150D,
    },
};

var res = await sdk.HousingHotels.UpdateHotelRoomRatesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHotelRoomRatesRequest](../../Models/Requests/UpdateHotelRoomRatesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHotelRoomRatesResponse](../../Models/Requests/UpdateHotelRoomRatesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
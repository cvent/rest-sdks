# Housing

## Overview

RegLink APIs allow you to exchange data with Cvent Passkey events and hotel reservation-booking engines.
Generally, there are four primary categories of functionality that RegLink APIs support:
  * **Sync Registrants.** Allow individual registrant information to be sent to Cvent Passkey, streamlining the hotel reservation process for attendees. Attendees can then be directed to Passkey post-registration and reserve a hotel room without re-entering their data again. This is done with the reservation request endpoint.
  * **Fetch Rooms.** The ability for an external system to fetch Passkey event details and hotel room availability based on various criteria.
  * **Fetch Reservations.** The ability for an external system to fetch detailed reservation information for individual registrants. This is done with the Reservation endpoint and the Callback system.
  * **Manage Reservations.** The ability for an external system to create, modify or cancel a registrant's hotel reservation directly or indirectly.

If you need authentication credentials or have any questions regarding the RegLink APIs, contact the [Cvent Passkey Integrations Team](https://web.cvent.com/survey/c6a60a30-d981-4ae8-af28-686af0eeb9b7/welcome).

* **Passkey.** A software solution allowing your invitees to book room reservations directly with hotels.
* **Housing Event.** An Passkey event where invitees will be able to register and book rooms.
* **Reservation Request.** Represents a request to book rooms in the housing event.
* **RegLink.** A feature that links Passkey events to your registration events, enabling you to sync data between the two events.
* **Callback.** [Passkey's callback system](/docs/passkey/REST/callbacks) allows for a push notification to be sent to your system when a reservation is created, modified or cancelled.


### Available Operations

* [CreateConnection](#createconnection) - Create Connection
* [GetHousingEventsSummaries](#gethousingeventssummaries) - Get Housing Events Summaries
* [GetHousingEventInfo](#gethousingeventinfo) - Get Housing Event Info
* [GetHousingEventHotels](#gethousingeventhotels) - Get Housing Event Hotels
* [GetHousingEventHotel](#gethousingeventhotel) - Get Housing Event Hotel
* [GetHousingEventHotelAvailability](#gethousingeventhotelavailability) - Get Event Hotel Availability
* [GetHousingEventRoomTypes](#gethousingeventroomtypes) - Get Housing Event Room Types
* [GetRoomTypeDetails](#getroomtypedetails) - Get Room Type Details
* [GetRoomTypeInventory](#getroomtypeinventory) - Get Room Type Inventory
* [GetHousingEventInventory](#gethousingeventinventory) - Get Housing Event Inventory
* [GetHousingEventReservations](#gethousingeventreservations) - Get Housing Event Reservations
* [CreateReservationRequest](#createreservationrequest) - Create Reservation Request
* [GetReservationRequest](#getreservationrequest) - Get Reservation Request
* [UpdateReservationRequest](#updatereservationrequest) - Update Reservation Request
* [CancelReservationRequest](#cancelreservationrequest) - Cancel Reservation Request
* [LinkReservation](#linkreservation) - Link Reservation
* [UnlinkReservation](#unlinkreservation) - Unlink Reservation
* [CreateReservation](#createreservation) - Create Reservation
* [GetReservation](#getreservation) - Get Reservation
* [CancelReservation](#cancelreservation) - Cancel Reservation
* [UpdateReservationSync](#updatereservationsync) - Update Reservation

## CreateConnection

Create a connection between an integration partner and an event using an access code provided by the Passkey event owner. This connection (manually or using this API) is required to authorize ANY other API calls for the event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createConnection" method="post" path="/connections" -->
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

CreateConnectionRequest req = new CreateConnectionRequest() {
    CventAccessCode = "<value>",
};

var res = await sdk.Housing.CreateConnectionAsync(req);

// handle response
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateConnectionRequest](../../Models/Requests/CreateConnectionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateConnectionResponse](../../Models/Requests/CreateConnectionResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventsSummaries

Gets a paginated list of summary information for your individual housing events.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventsSummaries" method="get" path="/housing-events/summaries" -->
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

GetHousingEventsSummariesRequest req = new GetHousingEventsSummariesRequest() {
    Limit = 10,
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "(start ge '2027-01-11T05:00:00.000Z' and end le '2027-01-15T05:00:00.000Z') or (end eq '2027-02-01T05:00:00.000Z')",
};

var res = await sdk.Housing.GetHousingEventsSummariesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetHousingEventsSummariesRequest](../../Models/Requests/GetHousingEventsSummariesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetHousingEventsSummariesResponse](../../Models/Requests/GetHousingEventsSummariesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventInfo

Retrieves housing event details based on the given housing event ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventInfo" method="get" path="/housing-events/{housingEventId}" -->
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

GetHousingEventInfoRequest req = new GetHousingEventInfoRequest() {
    HousingEventId = 35325345,
};

var res = await sdk.Housing.GetHousingEventInfoAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetHousingEventInfoRequest](../../Models/Requests/GetHousingEventInfoRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetHousingEventInfoResponse](../../Models/Requests/GetHousingEventInfoResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventHotels

Get list of hotels for the given housing event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventHotels" method="get" path="/housing-events/{housingEventId}/hotels" -->
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

GetHousingEventHotelsRequest req = new GetHousingEventHotelsRequest() {
    HousingEventId = 35325345,
    Limit = 10,
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Locale = "en-US",
};

var res = await sdk.Housing.GetHousingEventHotelsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetHousingEventHotelsRequest](../../Models/Requests/GetHousingEventHotelsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetHousingEventHotelsResponse](../../Models/Requests/GetHousingEventHotelsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventHotel

Gets a single hotel's details in a housing event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventHotel" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}" -->
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

GetHousingEventHotelRequest req = new GetHousingEventHotelRequest() {
    HousingEventId = 35325345,
    HotelId = 454345,
    Locale = "en-US",
};

var res = await sdk.Housing.GetHousingEventHotelAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetHousingEventHotelRequest](../../Models/Requests/GetHousingEventHotelRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetHousingEventHotelResponse](../../Models/Requests/GetHousingEventHotelResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventHotelAvailability

Get a filterable list of available room nights for a particular hotel and housing event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventHotelAvailability" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/available-nights" -->
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

GetHousingEventHotelAvailabilityRequest req = new GetHousingEventHotelAvailabilityRequest() {
    HousingEventId = 35325345,
    HotelId = 454345,
    Filter = "attendeeType.codes eq 'PEWATT0524317' and (date ge '2023-01-12' and date le '2023-01-15')",
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
};

var res = await sdk.Housing.GetHousingEventHotelAvailabilityAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [GetHousingEventHotelAvailabilityRequest](../../Models/Requests/GetHousingEventHotelAvailabilityRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[GetHousingEventHotelAvailabilityResponse](../../Models/Requests/GetHousingEventHotelAvailabilityResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventRoomTypes

Get a filterable list of room types for a given hotel in a housing event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventRoomTypes" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types" -->
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

GetHousingEventRoomTypesRequest req = new GetHousingEventRoomTypesRequest() {
    HousingEventId = 35325345,
    HotelId = 454345,
    Limit = 10,
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "attendeeTypes.id eq 10345 or attendeeTypes.codes eq 'PEWATT0524317'",
    Locale = "en-US",
};

var res = await sdk.Housing.GetHousingEventRoomTypesAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetHousingEventRoomTypesRequest](../../Models/Requests/GetHousingEventRoomTypesRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetHousingEventRoomTypesResponse](../../Models/Requests/GetHousingEventRoomTypesResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetRoomTypeDetails

Get a room type's details for the given housing event, hotel and room type.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRoomTypeDetails" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types/{roomTypeId}" -->
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

GetRoomTypeDetailsRequest req = new GetRoomTypeDetailsRequest() {
    HousingEventId = 35325345,
    HotelId = 454345,
    RoomTypeId = 4,
    Locale = "en-US",
};

var res = await sdk.Housing.GetRoomTypeDetailsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetRoomTypeDetailsRequest](../../Models/Requests/GetRoomTypeDetailsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetRoomTypeDetailsResponse](../../Models/Requests/GetRoomTypeDetailsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetRoomTypeInventory

Gets a list of room type inventory details (by date) for the given housing event, hotel and room type.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getRoomTypeInventory" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types/{roomTypeId}/inventory" -->
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

GetRoomTypeInventoryRequest req = new GetRoomTypeInventoryRequest() {
    HousingEventId = 35325345,
    HotelId = 454345,
    RoomTypeId = 4,
    Limit = 10,
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')",
};

var res = await sdk.Housing.GetRoomTypeInventoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetRoomTypeInventoryRequest](../../Models/Requests/GetRoomTypeInventoryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetRoomTypeInventoryResponse](../../Models/Requests/GetRoomTypeInventoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventInventory

Gets a list (sorted by date) of housing event inventory details for the given housing event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventInventory" method="get" path="/housing-events/{housingEventId}/inventory" -->
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

GetHousingEventInventoryRequest req = new GetHousingEventInventoryRequest() {
    HousingEventId = 35325345,
    Limit = 10,
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')",
};

var res = await sdk.Housing.GetHousingEventInventoryAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetHousingEventInventoryRequest](../../Models/Requests/GetHousingEventInventoryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetHousingEventInventoryResponse](../../Models/Requests/GetHousingEventInventoryResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetHousingEventReservations

Get list of reservation details for the given housing event.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getHousingEventReservations" method="get" path="/housing-events/{housingEventId}/reservations" -->
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

GetHousingEventReservationsRequest req = new GetHousingEventReservationsRequest() {
    HousingEventId = 35325345,
    After = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Before = System.DateTime.Parse("2017-01-02T02:00:00Z"),
    Limit = 10,
    Token = "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    Filter = "attendeeType.id eq 10345 and hotel.id eq 11355",
};

var res = await sdk.Housing.GetHousingEventReservationsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetHousingEventReservationsRequest](../../Models/Requests/GetHousingEventReservationsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetHousingEventReservationsResponse](../../Models/Requests/GetHousingEventReservationsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateReservationRequest

Creates a reservation request from guest details. A reservation request represents a registration and stores guest details. Reservations booked with the guest-specific “bookingSite” URL in the response will pre-populate guest data and link the new reservation to the reservation request for tracking.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createReservationRequest" method="post" path="/reservation-requests" -->
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

ReservationRequestInput req = new ReservationRequestInput() {
    SourceId = "Ext ack number",
    AttendeeTypeCode = "MVFBES0320484",
    Locale = "es-DO",
    HousingEvent = new HousingEventIdJson() {
        Id = 69121314,
    },
    AttendeeType = new AttendeeTypeIdJson() {
        Id = 34549966,
    },
    RoomType = new RoomTypeIdJson() {
        Id = 11549984,
    },
    Hotel = new HotelIdJson() {
        Id = 49543342,
    },
    SendAcknowledgement = true,
    SplitFolio = false,
    RedirectURL = "https://cvent.com",
    Guests = new List<GuestJson>() {},
    CustomFields = new CustomFieldsJson() {
        CustomField1 = "CustomField1",
        CustomField2 = "CustomField2",
        CustomField3 = "CustomField3",
        CustomField4 = "CustomField4",
        CustomField5 = "CustomField5",
        CustomField6 = "CustomField6",
    },
    Accessible = false,
    SpecialRequest = "Double bed",
    RewardProgram = new RewardProgramJson() {
        Id = 10000,
        Name = "Test name",
    },
    MembershipId = "1154example",
    TravelDetails = new TravelDetailsJson() {
        Arrival = new TravelDepartureArrivalJson() {
            Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
            Carrier = "JBU",
            CarrierNumber = "12345",
        },
        Departure = new TravelDepartureArrivalJson() {
            Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
            Carrier = "JBU",
            CarrierNumber = "12345",
        },
        AdditionalInformation = "Additional Information",
    },
};

var res = await sdk.Housing.CreateReservationRequestAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ReservationRequestInput](../../Models/Components/ReservationRequestInput.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateReservationRequestResponse](../../Models/Requests/CreateReservationRequestResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetReservationRequest

Returns reservation request details for a given reservation ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getReservationRequest" method="get" path="/reservation-requests/{reservationRequestsId}" -->
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

GetReservationRequestRequest req = new GetReservationRequestRequest() {
    ReservationRequestsId = "D6A63423-G796",
};

var res = await sdk.Housing.GetReservationRequestAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetReservationRequestRequest](../../Models/Requests/GetReservationRequestRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetReservationRequestResponse](../../Models/Requests/GetReservationRequestResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateReservationRequest

Update a reservation request using the given reservation ID. If the reservation has been booked, changes to the reservation request do not affect the linked reservation.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateReservationRequest" method="put" path="/reservation-requests/{reservationRequestsId}" -->
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

UpdateReservationRequestRequest req = new UpdateReservationRequestRequest() {
    ReservationRequestsId = "D6A63423-G796",
    ExistingReservationRequest = new ExistingReservationRequestInput() {
        SourceId = "Ext ack number",
        AttendeeTypeCode = "MVFBES0320484",
        Locale = "es-DO",
        HousingEvent = new HousingEventIdJson() {
            Id = 69121314,
        },
        AttendeeType = new AttendeeTypeIdJson() {
            Id = 34549966,
        },
        RoomType = new RoomTypeIdJson() {
            Id = 11549984,
        },
        Hotel = new HotelIdJson() {
            Id = 49543342,
        },
        SendAcknowledgement = true,
        SplitFolio = false,
        RedirectURL = "https://cvent.com",
        Guests = new List<GuestJson>() {
            new GuestJson() {
                Arrival = DateOnly.Parse("2020-03-05"),
                Departure = DateOnly.Parse("2020-03-07"),
                FirstName = "Gustav",
                LastName = "Schultz",
                MiddleName = "Al",
                Title = "Dr.",
                Position = "manager",
                Company = "Test Inc",
                HomeFax = "9785674321",
                Email = "guest@cvent.com",
                HomePhone = "(231)-213-1222",
                WorkPhone = "(231)-213-1222",
                HomeAddress = new AddressJson3() {
                    Address1 = "West St. 1",
                    Address2 = "Apt. 16",
                    City = "Austin",
                    Region = "Texas",
                    RegionCode = "TX",
                    PostalCode = "23452AB",
                    Country = "United States of America",
                    CountryCode = "US",
                },
                PaymentInfo = new PaymentInfoJson() {
                    FullName = "Gustav Schultz",
                    Address = new AddressJson3() {
                        Address1 = "West St. 1",
                        Address2 = "Apt. 16",
                        City = "Austin",
                        Region = "Texas",
                        RegionCode = "TX",
                        PostalCode = "23452AB",
                        Country = "United States of America",
                        CountryCode = "US",
                    },
                    Phone = "(231)213-1222",
                    Other = new OtherPaymentJson() {
                        Amount = 0,
                        PaymentDate = DateOnly.Parse("2021-12-31"),
                        ReferenceItem = "Reference Item",
                        CheckNumber = "Check Num",
                        Received = false,
                        Note = "No Comment",
                    },
                },
            },
        },
        CustomFields = new CustomFieldsJson() {
            CustomField1 = "CustomField1",
            CustomField2 = "CustomField2",
            CustomField3 = "CustomField3",
            CustomField4 = "CustomField4",
            CustomField5 = "CustomField5",
            CustomField6 = "CustomField6",
        },
        Accessible = false,
        SpecialRequest = "Double bed",
        RewardProgram = new RewardProgramJson() {
            Id = 10000,
            Name = "Test name",
        },
        MembershipId = "1154example",
        TravelDetails = new TravelDetailsJson() {
            Arrival = new TravelDepartureArrivalJson() {
                Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
                Carrier = "JBU",
                CarrierNumber = "12345",
            },
            Departure = new TravelDepartureArrivalJson() {
                Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
                Carrier = "JBU",
                CarrierNumber = "12345",
            },
            AdditionalInformation = "Additional Information",
        },
        Id = "D6A63423-G796",
    },
};

var res = await sdk.Housing.UpdateReservationRequestAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [UpdateReservationRequestRequest](../../Models/Requests/UpdateReservationRequestRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[UpdateReservationRequestResponse](../../Models/Requests/UpdateReservationRequestResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CancelReservationRequest

Update the status of a reservation request to cancelled. If the reservation has already been booked, any changes made to the reservation request will not affect the linked reservation.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="cancelReservationRequest" method="delete" path="/reservation-requests/{reservationRequestsId}" -->
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

CancelReservationRequestRequest req = new CancelReservationRequestRequest() {
    ReservationRequestsId = "D6A63423-G796",
};

var res = await sdk.Housing.CancelReservationRequestAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [CancelReservationRequestRequest](../../Models/Requests/CancelReservationRequestRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CancelReservationRequestResponse](../../Models/Requests/CancelReservationRequestResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## LinkReservation

Link an existing reservation to a reservation request. Commonly used when associating a reservation created outside the normal booking flow (such as a guest calling the hotel).

### Example Usage

<!-- UsageSnippet language="csharp" operationID="linkReservation" method="post" path="/reservation-requests/{reservationRequestsId}/reservations/{reservationId}" -->
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

LinkReservationRequest req = new LinkReservationRequest() {
    ReservationRequestsId = "D6A63423-G796",
    ReservationId = "327S856H",
};

var res = await sdk.Housing.LinkReservationAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [LinkReservationRequest](../../Models/Requests/LinkReservationRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[LinkReservationResponse](../../Models/Requests/LinkReservationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UnlinkReservation

Unlink reservation from reservation request. Commonly used for removing a cancelled reservation from a reservation request so that a new reservation can be linked in its place.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="unlinkReservation" method="delete" path="/reservation-requests/{reservationRequestsId}/reservations/{reservationId}" -->
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

UnlinkReservationRequest req = new UnlinkReservationRequest() {
    ReservationRequestsId = "D6A63423-G796",
    ReservationId = "327S856H",
};

var res = await sdk.Housing.UnlinkReservationAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [UnlinkReservationRequest](../../Models/Requests/UnlinkReservationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UnlinkReservationResponse](../../Models/Requests/UnlinkReservationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CreateReservation

Create a hotel reservation in a housing event based on the details provided in the request body.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="createReservation" method="post" path="/reservations" -->
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

NewReservation req = new NewReservation() {
    AttendeeType = new AttendeeTypeIdJson() {
        Id = 34549966,
    },
    RoomType = new RoomInfoJsonInput() {
        Id = 11549984,
    },
    SplitFolio = false,
    NumberOfAdults = 2,
    NumberOfChildren = 1,
    Guests = new List<ReservationGuestJsonInput>() {},
    CustomFields = new CustomFieldsJson() {
        CustomField1 = "CustomField1",
        CustomField2 = "CustomField2",
        CustomField3 = "CustomField3",
        CustomField4 = "CustomField4",
        CustomField5 = "CustomField5",
        CustomField6 = "CustomField6",
    },
    Accessible = false,
    SpecialRequest = "Double bed",
    RewardProgram = new RewardProgramJson() {
        Id = 10000,
        Name = "Test name",
    },
    MembershipId = "1154example",
    TravelDetails = new TravelDetailsJson() {
        Arrival = new TravelDepartureArrivalJson() {
            Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
            Carrier = "JBU",
            CarrierNumber = "12345",
        },
        Departure = new TravelDepartureArrivalJson() {
            Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
            Carrier = "JBU",
            CarrierNumber = "12345",
        },
        AdditionalInformation = "Additional Information",
    },
    HousingEvent = new NewReservationHousingEventId() {
        Id = 69121314,
    },
    Hotel = new HotelId() {
        Id = 49543342,
    },
    Modifiers = new Modifiers() {
        AllowWaitList = true,
    },
};

var res = await sdk.Housing.CreateReservationAsync(req);

// handle response
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [NewReservation](../../Models/Components/NewReservation.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[CreateReservationResponse](../../Models/Requests/CreateReservationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## GetReservation

Get reservation details for the given reservation ID. Commonly used in response to [passkey callbacks](/docs/passkey/REST/callbacks). 

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getReservation" method="get" path="/reservations/{reservationId}" -->
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

GetReservationRequest req = new GetReservationRequest() {
    ReservationId = "327S856H",
};

var res = await sdk.Housing.GetReservationAsync(req);

// handle response
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetReservationRequest](../../Models/Requests/GetReservationRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetReservationResponse](../../Models/Requests/GetReservationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## CancelReservation

Cancel reservation for given reservation ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="cancelReservation" method="delete" path="/reservations/{reservationId}" -->
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

CancelReservationRequest req = new CancelReservationRequest() {
    ReservationId = "327S856H",
};

var res = await sdk.Housing.CancelReservationAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CancelReservationRequest](../../Models/Requests/CancelReservationRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CancelReservationResponse](../../Models/Requests/CancelReservationResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 401, 403, 404, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |

## UpdateReservationSync

Updates an existing reservation for given reservation ID.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateReservationSync" method="put" path="/reservations/{reservationId}" -->
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

UpdateReservationSyncRequest req = new UpdateReservationSyncRequest() {
    ReservationId = "327S856H",
    NewReservation = new NewReservation() {
        AttendeeType = new AttendeeTypeIdJson() {
            Id = 34549966,
        },
        RoomType = new RoomInfoJsonInput() {
            Id = 11549984,
        },
        SplitFolio = false,
        NumberOfAdults = 2,
        NumberOfChildren = 1,
        Guests = new List<ReservationGuestJsonInput>() {},
        CustomFields = new CustomFieldsJson() {
            CustomField1 = "CustomField1",
            CustomField2 = "CustomField2",
            CustomField3 = "CustomField3",
            CustomField4 = "CustomField4",
            CustomField5 = "CustomField5",
            CustomField6 = "CustomField6",
        },
        Accessible = false,
        SpecialRequest = "Double bed",
        RewardProgram = new RewardProgramJson() {
            Id = 10000,
            Name = "Test name",
        },
        MembershipId = "1154example",
        TravelDetails = new TravelDetailsJson() {
            Arrival = new TravelDepartureArrivalJson() {
                Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
                Carrier = "JBU",
                CarrierNumber = "12345",
            },
            Departure = new TravelDepartureArrivalJson() {
                Time = System.DateTime.Parse("2024-12-01T00:00:00Z"),
                Carrier = "JBU",
                CarrierNumber = "12345",
            },
            AdditionalInformation = "Additional Information",
        },
        HousingEvent = new NewReservationHousingEventId() {
            Id = 69121314,
        },
        Hotel = new HotelId() {
            Id = 49543342,
        },
        Modifiers = new Modifiers() {
            AllowWaitList = true,
        },
    },
};

var res = await sdk.Housing.UpdateReservationSyncAsync(req);

// handle response
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateReservationSyncRequest](../../Models/Requests/UpdateReservationSyncRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateReservationSyncResponse](../../Models/Requests/UpdateReservationSyncResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 404, 429               | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
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

* [createConnection](#createconnection) - Create Connection
* [getHousingEventsSummaries](#gethousingeventssummaries) - Get Housing Events Summaries
* [getHousingEventInfo](#gethousingeventinfo) - Get Housing Event Info
* [getHousingEventHotels](#gethousingeventhotels) - Get Housing Event Hotels
* [getHousingEventHotel](#gethousingeventhotel) - Get Housing Event Hotel
* [getHousingEventHotelAvailability](#gethousingeventhotelavailability) - Get Event Hotel Availability
* [getHousingEventRoomTypes](#gethousingeventroomtypes) - Get Housing Event Room Types
* [getRoomTypeDetails](#getroomtypedetails) - Get Room Type Details
* [getRoomTypeInventory](#getroomtypeinventory) - Get Room Type Inventory
* [getHousingEventInventory](#gethousingeventinventory) - Get Housing Event Inventory
* [getHousingEventReservations](#gethousingeventreservations) - Get Housing Event Reservations
* [createReservationRequest](#createreservationrequest) - Create Reservation Request
* [getReservationRequest](#getreservationrequest) - Get Reservation Request
* [updateReservationRequest](#updatereservationrequest) - Update Reservation Request
* [cancelReservationRequest](#cancelreservationrequest) - Cancel Reservation Request
* [linkReservation](#linkreservation) - Link Reservation
* [unlinkReservation](#unlinkreservation) - Unlink Reservation
* [createReservation](#createreservation) - Create Reservation
* [getReservation](#getreservation) - Get Reservation
* [cancelReservation](#cancelreservation) - Cancel Reservation
* [updateReservationSync](#updatereservationsync) - Update Reservation

## createConnection

Create a connection between an integration partner and an event using an access code provided by the Passkey event owner. This connection (manually or using this API) is required to authorize ANY other API calls for the event.

### Example Usage

<!-- UsageSnippet language="java" operationID="createConnection" method="post" path="/connections" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateConnectionRequest;
import com.cvent.models.operations.CreateConnectionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        CreateConnectionRequest req = CreateConnectionRequest.builder()
                .cventAccessCode("<value>")
                .build();

        CreateConnectionResponse res = sdk.housing().createConnection()
                .request(req)
                .call();

        if (res.connectionResponse().isPresent()) {
            System.out.println(res.connectionResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateConnectionRequest](../../models/operations/CreateConnectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateConnectionResponse](../../models/operations/CreateConnectionResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventsSummaries

Gets a paginated list of summary information for your individual housing events.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventsSummaries" method="get" path="/housing-events/summaries" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventsSummariesRequest;
import com.cvent.models.operations.GetHousingEventsSummariesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventsSummariesRequest req = GetHousingEventsSummariesRequest.builder()
                .limit(10L)
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("(start ge '2027-01-11T05:00:00.000Z' and end le '2027-01-15T05:00:00.000Z') or (end eq '2027-02-01T05:00:00.000Z')")
                .build();

        GetHousingEventsSummariesResponse res = sdk.housing().getHousingEventsSummaries()
                .request(req)
                .call();

        if (res.housingEventSummaryList().isPresent()) {
            System.out.println(res.housingEventSummaryList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetHousingEventsSummariesRequest](../../models/operations/GetHousingEventsSummariesRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetHousingEventsSummariesResponse](../../models/operations/GetHousingEventsSummariesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventInfo

Retrieves housing event details based on the given housing event ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventInfo" method="get" path="/housing-events/{housingEventId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventInfoRequest;
import com.cvent.models.operations.GetHousingEventInfoResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventInfoRequest req = GetHousingEventInfoRequest.builder()
                .housingEventId(35325345L)
                .build();

        GetHousingEventInfoResponse res = sdk.housing().getHousingEventInfo()
                .request(req)
                .call();

        if (res.housingEvent().isPresent()) {
            System.out.println(res.housingEvent().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetHousingEventInfoRequest](../../models/operations/GetHousingEventInfoRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetHousingEventInfoResponse](../../models/operations/GetHousingEventInfoResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventHotels

Get list of hotels for the given housing event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventHotels" method="get" path="/housing-events/{housingEventId}/hotels" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventHotelsRequest;
import com.cvent.models.operations.GetHousingEventHotelsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventHotelsRequest req = GetHousingEventHotelsRequest.builder()
                .housingEventId(35325345L)
                .limit(10L)
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .locale("en-US")
                .build();

        GetHousingEventHotelsResponse res = sdk.housing().getHousingEventHotels()
                .request(req)
                .call();

        if (res.housingEventHotelsList().isPresent()) {
            System.out.println(res.housingEventHotelsList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetHousingEventHotelsRequest](../../models/operations/GetHousingEventHotelsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetHousingEventHotelsResponse](../../models/operations/GetHousingEventHotelsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventHotel

Gets a single hotel's details in a housing event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventHotel" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventHotelRequest;
import com.cvent.models.operations.GetHousingEventHotelResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventHotelRequest req = GetHousingEventHotelRequest.builder()
                .housingEventId(35325345L)
                .hotelId(454345L)
                .locale("en-US")
                .build();

        GetHousingEventHotelResponse res = sdk.housing().getHousingEventHotel()
                .request(req)
                .call();

        if (res.housingEventHotel().isPresent()) {
            System.out.println(res.housingEventHotel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetHousingEventHotelRequest](../../models/operations/GetHousingEventHotelRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetHousingEventHotelResponse](../../models/operations/GetHousingEventHotelResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventHotelAvailability

Get a filterable list of available room nights for a particular hotel and housing event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventHotelAvailability" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/available-nights" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventHotelAvailabilityRequest;
import com.cvent.models.operations.GetHousingEventHotelAvailabilityResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventHotelAvailabilityRequest req = GetHousingEventHotelAvailabilityRequest.builder()
                .housingEventId(35325345L)
                .hotelId(454345L)
                .filter("attendeeType.codes eq 'PEWATT0524317' and (date ge '2023-01-12' and date le '2023-01-15')")
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .build();

        GetHousingEventHotelAvailabilityResponse res = sdk.housing().getHousingEventHotelAvailability()
                .request(req)
                .call();

        if (res.availableNights().isPresent()) {
            System.out.println(res.availableNights().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                     | [GetHousingEventHotelAvailabilityRequest](../../models/operations/GetHousingEventHotelAvailabilityRequest.md) | :heavy_check_mark:                                                                                            | The request object to use for the request.                                                                    |

### Response

**[GetHousingEventHotelAvailabilityResponse](../../models/operations/GetHousingEventHotelAvailabilityResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventRoomTypes

Get a filterable list of room types for a given hotel in a housing event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventRoomTypes" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventRoomTypesRequest;
import com.cvent.models.operations.GetHousingEventRoomTypesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventRoomTypesRequest req = GetHousingEventRoomTypesRequest.builder()
                .housingEventId(35325345L)
                .hotelId(454345L)
                .limit(10L)
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("attendeeTypes.id eq 10345 or attendeeTypes.codes eq 'PEWATT0524317'")
                .locale("en-US")
                .build();

        GetHousingEventRoomTypesResponse res = sdk.housing().getHousingEventRoomTypes()
                .request(req)
                .call();

        if (res.housingEventRoomTypesList().isPresent()) {
            System.out.println(res.housingEventRoomTypesList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetHousingEventRoomTypesRequest](../../models/operations/GetHousingEventRoomTypesRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetHousingEventRoomTypesResponse](../../models/operations/GetHousingEventRoomTypesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getRoomTypeDetails

Get a room type's details for the given housing event, hotel and room type.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRoomTypeDetails" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types/{roomTypeId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetRoomTypeDetailsRequest;
import com.cvent.models.operations.GetRoomTypeDetailsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetRoomTypeDetailsRequest req = GetRoomTypeDetailsRequest.builder()
                .housingEventId(35325345L)
                .hotelId(454345L)
                .roomTypeId(4L)
                .locale("en-US")
                .build();

        GetRoomTypeDetailsResponse res = sdk.housing().getRoomTypeDetails()
                .request(req)
                .call();

        if (res.roomTypeDetails().isPresent()) {
            System.out.println(res.roomTypeDetails().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetRoomTypeDetailsRequest](../../models/operations/GetRoomTypeDetailsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetRoomTypeDetailsResponse](../../models/operations/GetRoomTypeDetailsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getRoomTypeInventory

Gets a list of room type inventory details (by date) for the given housing event, hotel and room type.

### Example Usage

<!-- UsageSnippet language="java" operationID="getRoomTypeInventory" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types/{roomTypeId}/inventory" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetRoomTypeInventoryRequest;
import com.cvent.models.operations.GetRoomTypeInventoryResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetRoomTypeInventoryRequest req = GetRoomTypeInventoryRequest.builder()
                .housingEventId(35325345L)
                .hotelId(454345L)
                .roomTypeId(4L)
                .limit(10L)
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')")
                .build();

        GetRoomTypeInventoryResponse res = sdk.housing().getRoomTypeInventory()
                .request(req)
                .call();

        if (res.inventoryDetailsList().isPresent()) {
            System.out.println(res.inventoryDetailsList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetRoomTypeInventoryRequest](../../models/operations/GetRoomTypeInventoryRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetRoomTypeInventoryResponse](../../models/operations/GetRoomTypeInventoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventInventory

Gets a list (sorted by date) of housing event inventory details for the given housing event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventInventory" method="get" path="/housing-events/{housingEventId}/inventory" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventInventoryRequest;
import com.cvent.models.operations.GetHousingEventInventoryResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventInventoryRequest req = GetHousingEventInventoryRequest.builder()
                .housingEventId(35325345L)
                .limit(10L)
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')")
                .build();

        GetHousingEventInventoryResponse res = sdk.housing().getHousingEventInventory()
                .request(req)
                .call();

        if (res.inventoryDetailsList().isPresent()) {
            System.out.println(res.inventoryDetailsList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetHousingEventInventoryRequest](../../models/operations/GetHousingEventInventoryRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetHousingEventInventoryResponse](../../models/operations/GetHousingEventInventoryResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingEventReservations

Get list of reservation details for the given housing event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingEventReservations" method="get" path="/housing-events/{housingEventId}/reservations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingEventReservationsRequest;
import com.cvent.models.operations.GetHousingEventReservationsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetHousingEventReservationsRequest req = GetHousingEventReservationsRequest.builder()
                .housingEventId(35325345L)
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .limit(10L)
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("attendeeType.id eq 10345 and hotel.id eq 11355")
                .build();

        GetHousingEventReservationsResponse res = sdk.housing().getHousingEventReservations()
                .request(req)
                .call();

        if (res.reservationsPaginatedResponse().isPresent()) {
            System.out.println(res.reservationsPaginatedResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetHousingEventReservationsRequest](../../models/operations/GetHousingEventReservationsRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetHousingEventReservationsResponse](../../models/operations/GetHousingEventReservationsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createReservationRequest

Creates a reservation request from guest details. A reservation request represents a registration and stores guest details. Reservations booked with the guest-specific “bookingSite” URL in the response will pre-populate guest data and link the new reservation to the reservation request for tracking.

### Example Usage

<!-- UsageSnippet language="java" operationID="createReservationRequest" method="post" path="/reservation-requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateReservationRequestResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        ReservationRequestInput req = ReservationRequestInput.builder()
                .housingEvent(HousingEventIdJson.builder()
                    .id(69121314L)
                    .build())
                .guests(List.of())
                .sourceId("Ext ack number")
                .attendeeTypeCode("MVFBES0320484")
                .locale("es-DO")
                .attendeeType(AttendeeTypeIdJson.builder()
                    .id(34549966L)
                    .build())
                .roomType(RoomTypeIdJson.builder()
                    .id(11549984L)
                    .build())
                .hotel(HotelIdJson.builder()
                    .id(49543342L)
                    .build())
                .sendAcknowledgement(true)
                .splitFolio(false)
                .redirectURL("https://cvent.com")
                .customFields(CustomFieldsJson.builder()
                    .customField1("CustomField1")
                    .customField2("CustomField2")
                    .customField3("CustomField3")
                    .customField4("CustomField4")
                    .customField5("CustomField5")
                    .customField6("CustomField6")
                    .build())
                .accessible(false)
                .specialRequest("Double bed")
                .rewardProgram(RewardProgramJson.builder()
                    .id(10000L)
                    .name("Test name")
                    .build())
                .membershipId("1154example")
                .travelDetails(TravelDetailsJson.builder()
                    .arrival(TravelDepartureArrivalJson.builder()
                        .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                        .carrier("JBU")
                        .carrierNumber("12345")
                        .build())
                    .departure(TravelDepartureArrivalJson.builder()
                        .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                        .carrier("JBU")
                        .carrierNumber("12345")
                        .build())
                    .additionalInformation("Additional Information")
                    .build())
                .build();

        CreateReservationRequestResponse res = sdk.housing().createReservationRequest()
                .request(req)
                .call();

        if (res.existingReservationRequest().isPresent()) {
            System.out.println(res.existingReservationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ReservationRequestInput](../../models/shared/ReservationRequestInput.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreateReservationRequestResponse](../../models/operations/CreateReservationRequestResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getReservationRequest

Returns reservation request details for a given reservation ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getReservationRequest" method="get" path="/reservation-requests/{reservationRequestsId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetReservationRequestRequest;
import com.cvent.models.operations.GetReservationRequestResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetReservationRequestRequest req = GetReservationRequestRequest.builder()
                .reservationRequestsId("D6A63423-G796")
                .build();

        GetReservationRequestResponse res = sdk.housing().getReservationRequest()
                .request(req)
                .call();

        if (res.existingReservationRequest().isPresent()) {
            System.out.println(res.existingReservationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetReservationRequestRequest](../../models/operations/GetReservationRequestRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetReservationRequestResponse](../../models/operations/GetReservationRequestResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateReservationRequest

Update a reservation request using the given reservation ID. If the reservation has been booked, changes to the reservation request do not affect the linked reservation.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateReservationRequest" method="put" path="/reservation-requests/{reservationRequestsId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateReservationRequestRequest;
import com.cvent.models.operations.UpdateReservationRequestResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        UpdateReservationRequestRequest req = UpdateReservationRequestRequest.builder()
                .reservationRequestsId("D6A63423-G796")
                .existingReservationRequest(ExistingReservationRequestInput.builder()
                    .housingEvent(HousingEventIdJson.builder()
                        .id(69121314L)
                        .build())
                    .guests(List.of(
                        GuestJson.builder()
                            .lastName("Schultz")
                            .arrival(LocalDate.parse("2020-03-05"))
                            .departure(LocalDate.parse("2020-03-07"))
                            .firstName("Gustav")
                            .middleName("Al")
                            .title("Dr.")
                            .position("manager")
                            .company("Test Inc")
                            .homeFax("9785674321")
                            .email("guest@cvent.com")
                            .homePhone("(231)-213-1222")
                            .workPhone("(231)-213-1222")
                            .homeAddress(AddressJson3.builder()
                                .address1("West St. 1")
                                .address2("Apt. 16")
                                .city("Austin")
                                .region("Texas")
                                .regionCode("TX")
                                .postalCode("23452AB")
                                .country("United States of America")
                                .countryCode("US")
                                .build())
                            .paymentInfo(PaymentInfoJson.builder()
                                .fullName("Gustav Schultz")
                                .address(AddressJson3.builder()
                                    .address1("West St. 1")
                                    .address2("Apt. 16")
                                    .city("Austin")
                                    .region("Texas")
                                    .regionCode("TX")
                                    .postalCode("23452AB")
                                    .country("United States of America")
                                    .countryCode("US")
                                    .build())
                                .phone("(231)213-1222")
                                .other(OtherPaymentJson.builder()
                                    .amount(0L)
                                    .paymentDate(LocalDate.parse("2021-12-31"))
                                    .referenceItem("Reference Item")
                                    .checkNumber("Check Num")
                                    .received(false)
                                    .note("No Comment")
                                    .build())
                                .build())
                            .build()))
                    .id("D6A63423-G796")
                    .sourceId("Ext ack number")
                    .attendeeTypeCode("MVFBES0320484")
                    .locale("es-DO")
                    .attendeeType(AttendeeTypeIdJson.builder()
                        .id(34549966L)
                        .build())
                    .roomType(RoomTypeIdJson.builder()
                        .id(11549984L)
                        .build())
                    .hotel(HotelIdJson.builder()
                        .id(49543342L)
                        .build())
                    .sendAcknowledgement(true)
                    .splitFolio(false)
                    .redirectURL("https://cvent.com")
                    .customFields(CustomFieldsJson.builder()
                        .customField1("CustomField1")
                        .customField2("CustomField2")
                        .customField3("CustomField3")
                        .customField4("CustomField4")
                        .customField5("CustomField5")
                        .customField6("CustomField6")
                        .build())
                    .accessible(false)
                    .specialRequest("Double bed")
                    .rewardProgram(RewardProgramJson.builder()
                        .id(10000L)
                        .name("Test name")
                        .build())
                    .membershipId("1154example")
                    .travelDetails(TravelDetailsJson.builder()
                        .arrival(TravelDepartureArrivalJson.builder()
                            .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                            .carrier("JBU")
                            .carrierNumber("12345")
                            .build())
                        .departure(TravelDepartureArrivalJson.builder()
                            .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                            .carrier("JBU")
                            .carrierNumber("12345")
                            .build())
                        .additionalInformation("Additional Information")
                        .build())
                    .build())
                .build();

        UpdateReservationRequestResponse res = sdk.housing().updateReservationRequest()
                .request(req)
                .call();

        if (res.existingReservationRequest().isPresent()) {
            System.out.println(res.existingReservationRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [UpdateReservationRequestRequest](../../models/operations/UpdateReservationRequestRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[UpdateReservationRequestResponse](../../models/operations/UpdateReservationRequestResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## cancelReservationRequest

Update the status of a reservation request to cancelled. If the reservation has already been booked, any changes made to the reservation request will not affect the linked reservation.

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelReservationRequest" method="delete" path="/reservation-requests/{reservationRequestsId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CancelReservationRequestRequest;
import com.cvent.models.operations.CancelReservationRequestResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        CancelReservationRequestRequest req = CancelReservationRequestRequest.builder()
                .reservationRequestsId("D6A63423-G796")
                .build();

        CancelReservationRequestResponse res = sdk.housing().cancelReservationRequest()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [CancelReservationRequestRequest](../../models/operations/CancelReservationRequestRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[CancelReservationRequestResponse](../../models/operations/CancelReservationRequestResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## linkReservation

Link an existing reservation to a reservation request. Commonly used when associating a reservation created outside the normal booking flow (such as a guest calling the hotel).

### Example Usage

<!-- UsageSnippet language="java" operationID="linkReservation" method="post" path="/reservation-requests/{reservationRequestsId}/reservations/{reservationId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.LinkReservationRequest;
import com.cvent.models.operations.LinkReservationResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        LinkReservationRequest req = LinkReservationRequest.builder()
                .reservationRequestsId("D6A63423-G796")
                .reservationId("327S856H")
                .build();

        LinkReservationResponse res = sdk.housing().linkReservation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [LinkReservationRequest](../../models/operations/LinkReservationRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[LinkReservationResponse](../../models/operations/LinkReservationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## unlinkReservation

Unlink reservation from reservation request. Commonly used for removing a cancelled reservation from a reservation request so that a new reservation can be linked in its place.

### Example Usage

<!-- UsageSnippet language="java" operationID="unlinkReservation" method="delete" path="/reservation-requests/{reservationRequestsId}/reservations/{reservationId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UnlinkReservationRequest;
import com.cvent.models.operations.UnlinkReservationResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        UnlinkReservationRequest req = UnlinkReservationRequest.builder()
                .reservationRequestsId("D6A63423-G796")
                .reservationId("327S856H")
                .build();

        UnlinkReservationResponse res = sdk.housing().unlinkReservation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UnlinkReservationRequest](../../models/operations/UnlinkReservationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UnlinkReservationResponse](../../models/operations/UnlinkReservationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## createReservation

Create a hotel reservation in a housing event based on the details provided in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="createReservation" method="post" path="/reservations" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CreateReservationResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        NewReservation req = NewReservation.builder()
                .attendeeType(AttendeeTypeIdJson.builder()
                    .id(34549966L)
                    .build())
                .roomType(RoomInfoJsonInput.builder()
                    .id(11549984L)
                    .build())
                .numberOfAdults(2L)
                .guests(List.of())
                .housingEvent(NewReservationHousingEventId.builder()
                    .id(69121314L)
                    .build())
                .hotel(HotelId.builder()
                    .id(49543342L)
                    .build())
                .splitFolio(false)
                .numberOfChildren(1L)
                .customFields(CustomFieldsJson.builder()
                    .customField1("CustomField1")
                    .customField2("CustomField2")
                    .customField3("CustomField3")
                    .customField4("CustomField4")
                    .customField5("CustomField5")
                    .customField6("CustomField6")
                    .build())
                .accessible(false)
                .specialRequest("Double bed")
                .rewardProgram(RewardProgramJson.builder()
                    .id(10000L)
                    .name("Test name")
                    .build())
                .membershipId("1154example")
                .travelDetails(TravelDetailsJson.builder()
                    .arrival(TravelDepartureArrivalJson.builder()
                        .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                        .carrier("JBU")
                        .carrierNumber("12345")
                        .build())
                    .departure(TravelDepartureArrivalJson.builder()
                        .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                        .carrier("JBU")
                        .carrierNumber("12345")
                        .build())
                    .additionalInformation("Additional Information")
                    .build())
                .modifiers(Modifiers.builder()
                    .allowWaitList(true)
                    .build())
                .build();

        CreateReservationResponse res = sdk.housing().createReservation()
                .request(req)
                .call();

        if (res.existingReservation().isPresent()) {
            System.out.println(res.existingReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [NewReservation](../../models/shared/NewReservation.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[CreateReservationResponse](../../models/operations/CreateReservationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getReservation

Get reservation details for the given reservation ID. Commonly used in response to [passkey callbacks](/docs/passkey/REST/callbacks). 

### Example Usage

<!-- UsageSnippet language="java" operationID="getReservation" method="get" path="/reservations/{reservationId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetReservationRequest;
import com.cvent.models.operations.GetReservationResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        GetReservationRequest req = GetReservationRequest.builder()
                .reservationId("327S856H")
                .build();

        GetReservationResponse res = sdk.housing().getReservation()
                .request(req)
                .call();

        if (res.existingReservation().isPresent()) {
            System.out.println(res.existingReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetReservationRequest](../../models/operations/GetReservationRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetReservationResponse](../../models/operations/GetReservationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## cancelReservation

Cancel reservation for given reservation ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelReservation" method="delete" path="/reservations/{reservationId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.CancelReservationRequest;
import com.cvent.models.operations.CancelReservationResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        CancelReservationRequest req = CancelReservationRequest.builder()
                .reservationId("327S856H")
                .build();

        CancelReservationResponse res = sdk.housing().cancelReservation()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [CancelReservationRequest](../../models/operations/CancelReservationRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[CancelReservationResponse](../../models/operations/CancelReservationResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401, 403, 404, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## updateReservationSync

Updates an existing reservation for given reservation ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateReservationSync" method="put" path="/reservations/{reservationId}" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateReservationSyncRequest;
import com.cvent.models.operations.UpdateReservationSyncResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        UpdateReservationSyncRequest req = UpdateReservationSyncRequest.builder()
                .reservationId("327S856H")
                .newReservation(NewReservation.builder()
                    .attendeeType(AttendeeTypeIdJson.builder()
                        .id(34549966L)
                        .build())
                    .roomType(RoomInfoJsonInput.builder()
                        .id(11549984L)
                        .build())
                    .numberOfAdults(2L)
                    .guests(List.of())
                    .housingEvent(NewReservationHousingEventId.builder()
                        .id(69121314L)
                        .build())
                    .hotel(HotelId.builder()
                        .id(49543342L)
                        .build())
                    .splitFolio(false)
                    .numberOfChildren(1L)
                    .customFields(CustomFieldsJson.builder()
                        .customField1("CustomField1")
                        .customField2("CustomField2")
                        .customField3("CustomField3")
                        .customField4("CustomField4")
                        .customField5("CustomField5")
                        .customField6("CustomField6")
                        .build())
                    .accessible(false)
                    .specialRequest("Double bed")
                    .rewardProgram(RewardProgramJson.builder()
                        .id(10000L)
                        .name("Test name")
                        .build())
                    .membershipId("1154example")
                    .travelDetails(TravelDetailsJson.builder()
                        .arrival(TravelDepartureArrivalJson.builder()
                            .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                            .carrier("JBU")
                            .carrierNumber("12345")
                            .build())
                        .departure(TravelDepartureArrivalJson.builder()
                            .time(OffsetDateTime.parse("2024-12-01T00:00:00Z"))
                            .carrier("JBU")
                            .carrierNumber("12345")
                            .build())
                        .additionalInformation("Additional Information")
                        .build())
                    .modifiers(Modifiers.builder()
                        .allowWaitList(true)
                        .build())
                    .build())
                .build();

        UpdateReservationSyncResponse res = sdk.housing().updateReservationSync()
                .request(req)
                .call();

        if (res.existingReservation().isPresent()) {
            System.out.println(res.existingReservation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [UpdateReservationSyncRequest](../../models/operations/UpdateReservationSyncRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[UpdateReservationSyncResponse](../../models/operations/UpdateReservationSyncResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
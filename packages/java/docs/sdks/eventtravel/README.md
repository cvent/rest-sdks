# EventTravel

## Overview

Event travel lets planners capture air & hotel requests from attendees and track air actuals, hotel reservations and alternate travel answers at your event. Use these endpoints to retrieve your air, hotel, housing reservation request and alternate travel answers data from your events. **Housing Reservation Request** - An association between an attendee's information in a registration event and a Cvent Passkey event. Also known as a Passkey bridge.

### Available Operations

* [getAirActualDetail](#getairactualdetail) - Get Air Actual
* [getAirRequests](#getairrequests) - Get Air Requests
* [getAlternateTravelAnswers](#getalternatetravelanswers) - Get Alternate Travel Answers
* [getHotelRequests](#gethotelrequests) - Get Hotel Requests
* [getHousingReservationRequests](#gethousingreservationrequests) - Get Housing Requests

## getAirActualDetail

Get attendee air actual details for an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAirActualDetail" method="get" path="/events/{id}/event-travel/air-actuals" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAirActualDetailRequest;
import com.cvent.models.operations.GetAirActualDetailResponse;
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

        GetAirActualDetailRequest req = GetAirActualDetailRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .expand(List.of(
                    ExpandAirActualQuestionAnswer.AIR_ACTUAL_DETAILS_AIR_ACTUAL_ANSWERS_QUESTION))
                .sort("airActualDetails.name:DESC,airActualDetails.lastModified:ASC")
                .filter("(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')")
                .build();


        sdk.eventTravel().getAirActualDetail()
                .callAsStream()
                .forEach((GetAirActualDetailResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAirActualDetailRequest](../../models/operations/GetAirActualDetailRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAirActualDetailResponse](../../models/operations/GetAirActualDetailResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAirRequests

Get attendee air request details for an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAirRequests" method="get" path="/events/{id}/event-travel/air-requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAirRequestsRequest;
import com.cvent.models.operations.GetAirRequestsResponse;
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

        GetAirRequestsRequest req = GetAirRequestsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .sort("airRequestDetails.requesterFirstName:DESC,airRequestDetails.requesterLastName:ASC")
                .filter("(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')")
                .expand(List.of(
                    ExpandAirRequestQuestionAnswer.AIR_REQUEST_DETAILS_AIR_REQUEST_ANSWERS_QUESTION))
                .build();


        sdk.eventTravel().getAirRequests()
                .callAsStream()
                .forEach((GetAirRequestsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAirRequestsRequest](../../models/operations/GetAirRequestsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetAirRequestsResponse](../../models/operations/GetAirRequestsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getAlternateTravelAnswers

Get alternate travel answers submitted by attendees who opt out of air or hotel bookings for an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAlternateTravelAnswers" method="get" path="/events/{id}/event-travel/alternate-answers" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetAlternateTravelAnswersRequest;
import com.cvent.models.operations.GetAlternateTravelAnswersResponse;
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

        GetAlternateTravelAnswersRequest req = GetAlternateTravelAnswersRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')")
                .build();


        sdk.eventTravel().getAlternateTravelAnswers()
                .callAsStream()
                .forEach((GetAlternateTravelAnswersResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetAlternateTravelAnswersRequest](../../models/operations/GetAlternateTravelAnswersRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetAlternateTravelAnswersResponse](../../models/operations/GetAlternateTravelAnswersResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHotelRequests

Get attendee hotel requests for an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHotelRequests" method="get" path="/events/{id}/event-travel/hotel-requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHotelRequestsRequest;
import com.cvent.models.operations.GetHotelRequestsResponse;
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

        GetHotelRequestsRequest req = GetHotelRequestsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .expand(List.of(
                    ExpandHotelRequestQuestionAnswer.HOTEL_REQUEST_DETAILS_HOTEL_REQUEST_ANSWERS_QUESTION))
                .sort("hotelRequestDetails.requesterFirstName:DESC,hotelRequestDetails.requesterLastName:ASC")
                .filter("(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')")
                .build();


        sdk.eventTravel().getHotelRequests()
                .callAsStream()
                .forEach((GetHotelRequestsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetHotelRequestsRequest](../../models/operations/GetHotelRequestsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetHotelRequestsResponse](../../models/operations/GetHotelRequestsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## getHousingReservationRequests

Get attendee housing reservation request details for an event.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHousingReservationRequests" method="get" path="/events/{id}/event-travel/housing-reservation-requests" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.GetHousingReservationRequestsRequest;
import com.cvent.models.operations.GetHousingReservationRequestsResponse;
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

        GetHousingReservationRequestsRequest req = GetHousingReservationRequestsRequest.builder()
                .id("04ca6ae2-0dc3-487b-953e-86d6abbdf7d3")
                .after(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .before(OffsetDateTime.parse("2017-01-02T02:00:00Z"))
                .token("0e28af57-511f-47ab-ae46-46cd1ca51a1a")
                .filter("(attendee.id eq '76f2b9e2-fcce-4d93-be29-a008b76a050c') OR (attendee.id eq '16322408-bae8-4b29-a559-702d2023e13a')")
                .build();


        sdk.eventTravel().getHousingReservationRequests()
                .callAsStream()
                .forEach((GetHousingReservationRequestsResponse item) -> {
                   // handle page
                });

    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [GetHousingReservationRequestsRequest](../../models/operations/GetHousingReservationRequestsRequest.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |

### Response

**[GetHousingReservationRequestsResponse](../../models/operations/GetHousingReservationRequestsResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
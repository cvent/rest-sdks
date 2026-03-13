# HousingHotels

## Overview

APIs for managing hotel-related operations.

### Available Operations

* [updateHotelRoomRates](#updatehotelroomrates) - Update Hotel Room Rates

## updateHotelRoomRates

Updates the given hotel's room rate details based on data in the request body.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHotelRoomRates" method="put" path="/housing-hotels/{hotelCode}/rooms/{roomCode}/rates" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.UpdateHotelRoomRatesRequest;
import com.cvent.models.operations.UpdateHotelRoomRatesResponse;
import java.lang.Exception;
import java.time.LocalDate;
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

        UpdateHotelRoomRatesRequest req = UpdateHotelRoomRatesRequest.builder()
                .hotelCode("HOTELCODE")
                .roomCode("VLR")
                .hotelRoomRatesRequest(HotelRoomRatesRequest.builder()
                    .startDate(LocalDate.parse("2025-03-25"))
                    .endDate(LocalDate.parse("2025-03-25"))
                    .roomRate(150d)
                    .rateCode("VIPRATE")
                    .build())
                .build();

        UpdateHotelRoomRatesResponse res = sdk.housingHotels().updateHotelRoomRates()
                .request(req)
                .call();

        if (res.hotelRoomRatesResponse().isPresent()) {
            System.out.println(res.hotelRoomRatesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateHotelRoomRatesRequest](../../models/operations/UpdateHotelRoomRatesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[UpdateHotelRoomRatesResponse](../../models/operations/UpdateHotelRoomRatesResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404, 429     | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
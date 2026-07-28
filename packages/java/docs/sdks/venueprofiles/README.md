# VenueProfiles

## Overview

Manage venue profile details including type, contact information, address, and other venue properties.

### Available Operations

* [updateVenueDetails](#updatevenuedetails) - Update Venue Details
* [patchVenueDetails](#patchvenuedetails) - Patch Venue Details
* [getVenueDetailsOverview](#getvenuedetailsoverview) - Get Venue Details Overview
* [updateVenueFacility](#updatevenuefacility) - Update Venue Facility
* [patchVenueFacility](#patchvenuefacility) - Patch Venue Facility

## updateVenueDetails

Update venue details for the specified venue, replacing the existing venue details data.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateVenueDetails" method="put" path="/venues/{venueId}/details" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.UpdateVenueDetailsRequest;
import com.cvent.models.operations.UpdateVenueDetailsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        UpdateVenueDetailsRequest req = UpdateVenueDetailsRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .existingVenueDetails(ExistingVenueDetailsInput.builder()
                    .type(VenueType.HOTEL)
                    .mainPhoneNumber("+1-703-555-0100")
                    .mainFaxNumber("+1-703-555-0101")
                    .address(AddressInfo.builder()
                        .city("Vienna")
                        .country(Country.LA)
                        .streetAddress1("1234 Trap Road")
                        .streetAddress2("Suite 100")
                        .zipPostalCode("22182")
                        .directions("Take I-66 West to Exit 67, then follow signs to Trap Road.")
                        .build())
                    .timeZone("America/New_York")
                    .brand("Quality Hotels")
                    .chainScale(ChainScale.UPSCALE_CHAINS)
                    .salesPhoneNumber("+1-703-555-0102")
                    .salesFaxNumber("+1-703-555-0103")
                    .tollFreeNumber("1-800-555-0100")
                    .websiteAddress("https://www.example-hotel.com")
                    .openingDate("Spring 2025")
                    .description("A modern conference venue in downtown.")
                    .additionalInformation("Free parking available on-site.")
                    .cancellationPolicy("Full refund if cancelled 48 hours before event.")
                    .locationTypes(List.of(
                        LocationType.SUBURBAN))
                    .build())
                .build();

        UpdateVenueDetailsResponse res = sdk.venueProfiles().updateVenueDetails()
                .request(req)
                .call();

        if (res.existingVenueDetails().isPresent()) {
            System.out.println(res.existingVenueDetails().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateVenueDetailsRequest](../../models/operations/UpdateVenueDetailsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateVenueDetailsResponse](../../models/operations/UpdateVenueDetailsResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 400, 401, 403, 404, 429      | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## patchVenueDetails

Partially updates the specified venue's details using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- If any part of the patch fails, the entire request will fail.

**Array Handling:**
- Arrays (`locationTypes`) are treated as **full replacements**, not partial updates.
- If an array property is not included in the payload, no updates are made to that field.
- If an empty array is sent, it replaces the existing array with an empty array.


### Example Usage

<!-- UsageSnippet language="java" operationID="patchVenueDetails" method="patch" path="/venues/{venueId}/details" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.PatchVenueDetailsRequest;
import com.cvent.models.operations.PatchVenueDetailsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        PatchVenueDetailsRequest req = PatchVenueDetailsRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueDetailsPatch(VenueDetailsPatch.builder()
                    .type(VenueType.HOTEL)
                    .timeZone("America/New_York")
                    .brand("Quality Hotels")
                    .chainScale(VenueDetailsPatchChainScale.UPSCALE_CHAINS)
                    .mainPhoneNumber("+1-703-555-0100")
                    .mainFaxNumber("+1-703-555-0101")
                    .salesPhoneNumber("+1-703-555-0102")
                    .salesFaxNumber("+1-703-555-0103")
                    .tollFreeNumber("1-800-555-0100")
                    .websiteAddress("https://www.example-hotel.com")
                    .openingDate("Spring 2025")
                    .description("A premier conference and event venue in the heart of Northern Virginia.")
                    .additionalInformation("Complimentary parking available for all event attendees.")
                    .cancellationPolicy("48-hour cancellation policy applies for all event bookings.")
                    .locationTypes(List.of(
                        LocationType.SUBURBAN))
                    .address(VenueDetailsPatchAddress.builder()
                        .streetAddress1("1234 Trap Road")
                        .streetAddress2("Suite 100")
                        .city("Vienna")
                        .zipPostalCode("22182")
                        .directions("Take I-66 West to Exit 67, then follow signs to Trap Road.")
                        .build())
                    .build())
                .build();

        PatchVenueDetailsResponse res = sdk.venueProfiles().patchVenueDetails()
                .request(req)
                .call();

        if (res.venueDetailsPatch().isPresent()) {
            System.out.println(res.venueDetailsPatch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchVenueDetailsRequest](../../models/operations/PatchVenueDetailsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchVenueDetailsResponse](../../models/operations/PatchVenueDetailsResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 400, 401, 403, 404, 429      | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## getVenueDetailsOverview

Retrieve an overview of venue details for the specified venue.

### Example Usage

<!-- UsageSnippet language="java" operationID="getVenueDetailsOverview" method="get" path="/venues/{venueId}/details/overview" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.GetVenueDetailsOverviewRequest;
import com.cvent.models.operations.GetVenueDetailsOverviewResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        GetVenueDetailsOverviewRequest req = GetVenueDetailsOverviewRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .build();

        GetVenueDetailsOverviewResponse res = sdk.venueProfiles().getVenueDetailsOverview()
                .request(req)
                .call();

        if (res.venueDetailsOverview().isPresent()) {
            System.out.println(res.venueDetailsOverview().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetVenueDetailsOverviewRequest](../../models/operations/GetVenueDetailsOverviewRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetVenueDetailsOverviewResponse](../../models/operations/GetVenueDetailsOverviewResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 401, 403, 404, 429           | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## updateVenueFacility

Update the facility information for the specified venue, replacing all existing values with those provided in the request body.

Field applicability varies by venue type:
- Most facility information fields do not apply to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="java" operationID="updateVenueFacility" method="put" path="/venues/{venueId}/facility" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.UpdateVenueFacilityRequest;
import com.cvent.models.operations.UpdateVenueFacilityResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        UpdateVenueFacilityRequest req = UpdateVenueFacilityRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .existingVenueFacility(ExistingVenueFacilityInput.builder()
                    .numberOfMeetingRooms(25L)
                    .space(ExistingVenueFacilitySpace.builder()
                        .totalMeetingRoomSpace(50000L)
                        .totalExhibitSpace(75000L)
                        .build())
                    .sleeping(ExistingVenueFacilitySleeping.builder()
                        .totalRooms(350L)
                        .suites(20L)
                        .singleRooms(200L)
                        .doubleRooms(130L)
                        .build())
                    .singleRate(ExistingVenueFacilitySingleRate.builder()
                        .low(129.99)
                        .high(249.99)
                        .build())
                    .doubleRate(ExistingVenueFacilityDoubleRate.builder()
                        .low(149.99)
                        .high(299.99)
                        .build())
                    .taxRate(8.5)
                    .occupancyRate(75.5)
                    .yearBuilt(1998L)
                    .yearRenovated(2021L)
                    .proximityFromAirport(ExistingVenueFacilityProximityFromAirport.builder()
                        .distance(12.5)
                        .build())
                    .restrictions("No outside food or beverage permitted. Music must end by 11 PM.")
                    .maximumCapacity(ExistingVenueFacilityMaximumCapacity.builder()
                        .seated(500L)
                        .standing(800L)
                        .build())
                    .build())
                .build();

        UpdateVenueFacilityResponse res = sdk.venueProfiles().updateVenueFacility()
                .request(req)
                .call();

        if (res.existingVenueFacility().isPresent()) {
            System.out.println(res.existingVenueFacility().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateVenueFacilityRequest](../../models/operations/UpdateVenueFacilityRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateVenueFacilityResponse](../../models/operations/UpdateVenueFacilityResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 400, 401, 403, 404, 429      | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |

## patchVenueFacility

Partially update the facility information for the specified venue using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- If any part of the patch fails, the entire request will fail.
- `proximityFromAirport.unit` is required when `proximityFromAirport.distance` is provided.

Field applicability varies by venue type:
- Most facility information fields do not apply to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="java" operationID="patchVenueFacility" method="patch" path="/venues/{venueId}/facility" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.*;
import com.cvent.models.errors.ErrorResponse1;
import com.cvent.models.operations.PatchVenueFacilityRequest;
import com.cvent.models.operations.PatchVenueFacilityResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse1, Exception {

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

        PatchVenueFacilityRequest req = PatchVenueFacilityRequest.builder()
                .venueId("6bb0e2db-861f-46e3-a923-eb4d959ffa00")
                .venueFacilityPatch(VenueFacilityPatch.builder()
                    .numberOfMeetingRooms(25L)
                    .space(VenueFacilityPatchSpace.builder()
                        .totalMeetingRoomSpace(50000L)
                        .totalExhibitSpace(75000L)
                        .build())
                    .sleeping(VenueFacilityPatchSleeping.builder()
                        .totalRooms(350L)
                        .suites(20L)
                        .singleRooms(200L)
                        .doubleRooms(130L)
                        .build())
                    .singleRate(VenueFacilityPatchSingleRate.builder()
                        .low(129.99)
                        .high(249.99)
                        .build())
                    .doubleRate(VenueFacilityPatchDoubleRate.builder()
                        .low(149.99)
                        .high(299.99)
                        .build())
                    .taxRate(8.5)
                    .occupancyRate(75.5)
                    .yearBuilt(1998L)
                    .yearRenovated(2021L)
                    .proximityFromAirport(VenueFacilityPatchProximityFromAirport.builder()
                        .distance(12.5)
                        .build())
                    .restrictions("No outside food or beverage permitted. Music must end by 11 PM.")
                    .maximumCapacity(VenueFacilityPatchMaximumCapacity.builder()
                        .seated(500L)
                        .standing(800L)
                        .build())
                    .build())
                .build();

        PatchVenueFacilityResponse res = sdk.venueProfiles().patchVenueFacility()
                .request(req)
                .call();

        if (res.venueFacilityPatch().isPresent()) {
            System.out.println(res.venueFacilityPatch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [PatchVenueFacilityRequest](../../models/operations/PatchVenueFacilityRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[PatchVenueFacilityResponse](../../models/operations/PatchVenueFacilityResponse.md)**

### Errors

| Error Type                   | Status Code                  | Content Type                 |
| ---------------------------- | ---------------------------- | ---------------------------- |
| models/errors/ErrorResponse1 | 400, 401, 403, 404, 429      | application/json             |
| models/errors/APIException   | 4XX, 5XX                     | \*/\*                        |
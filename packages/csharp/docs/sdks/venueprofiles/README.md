# VenueProfiles

## Overview

Manage venue profile details including type, contact information, address, and other venue properties.

### Available Operations

* [UpdateVenueDetails](#updatevenuedetails) - Update Venue Details
* [PatchVenueDetails](#patchvenuedetails) - Patch Venue Details
* [GetVenueDetailsOverview](#getvenuedetailsoverview) - Get Venue Details Overview
* [UpdateVenueFacility](#updatevenuefacility) - Update Venue Facility
* [PatchVenueFacility](#patchvenuefacility) - Patch Venue Facility

## UpdateVenueDetails

Update venue details for the specified venue, replacing the existing venue details data.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateVenueDetails" method="put" path="/venues/{venueId}/details" -->
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

UpdateVenueDetailsRequest req = new UpdateVenueDetailsRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    ExistingVenueDetails = new ExistingVenueDetailsInput() {
        Type = VenueType.Hotel,
        TimeZone = "America/New_York",
        Brand = "Quality Hotels",
        ChainScale = ChainScale.UpscaleChains,
        MainPhoneNumber = "+1-703-555-0100",
        MainFaxNumber = "+1-703-555-0101",
        SalesPhoneNumber = "+1-703-555-0102",
        SalesFaxNumber = "+1-703-555-0103",
        TollFreeNumber = "1-800-555-0100",
        WebsiteAddress = "https://www.example-hotel.com",
        OpeningDate = "Spring 2025",
        Description = "A modern conference venue in downtown.",
        AdditionalInformation = "Free parking available on-site.",
        CancellationPolicy = "Full refund if cancelled 48 hours before event.",
        LocationTypes = new List<LocationType>() {
            LocationType.Suburban,
        },
        Address = new AddressInfo() {
            StreetAddress1 = "1234 Trap Road",
            StreetAddress2 = "Suite 100",
            City = "Vienna",
            ZipPostalCode = "22182",
            Country = Country.La,
            Directions = "Take I-66 West to Exit 67, then follow signs to Trap Road.",
        },
    },
};

var res = await sdk.VenueProfiles.UpdateVenueDetailsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateVenueDetailsRequest](../../Models/Requests/UpdateVenueDetailsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateVenueDetailsResponse](../../Models/Requests/UpdateVenueDetailsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## PatchVenueDetails

Partially updates the specified venue's details using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- If any part of the patch fails, the entire request will fail.

**Array Handling:**
- Arrays (`locationTypes`) are treated as **full replacements**, not partial updates.
- If an array property is not included in the payload, no updates are made to that field.
- If an empty array is sent, it replaces the existing array with an empty array.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="patchVenueDetails" method="patch" path="/venues/{venueId}/details" -->
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

PatchVenueDetailsRequest req = new PatchVenueDetailsRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueDetailsPatch = new VenueDetailsPatch() {
        Type = VenueType.Hotel,
        TimeZone = "America/New_York",
        Brand = "Quality Hotels",
        ChainScale = VenueDetailsPatchChainScale.UpscaleChains,
        MainPhoneNumber = "+1-703-555-0100",
        MainFaxNumber = "+1-703-555-0101",
        SalesPhoneNumber = "+1-703-555-0102",
        SalesFaxNumber = "+1-703-555-0103",
        TollFreeNumber = "1-800-555-0100",
        WebsiteAddress = "https://www.example-hotel.com",
        OpeningDate = "Spring 2025",
        Description = "A premier conference and event venue in the heart of Northern Virginia.",
        AdditionalInformation = "Complimentary parking available for all event attendees.",
        CancellationPolicy = "48-hour cancellation policy applies for all event bookings.",
        LocationTypes = new List<LocationType>() {
            LocationType.Suburban,
        },
        Address = new VenueDetailsPatchAddress() {
            StreetAddress1 = "1234 Trap Road",
            StreetAddress2 = "Suite 100",
            City = "Vienna",
            ZipPostalCode = "22182",
            Directions = "Take I-66 West to Exit 67, then follow signs to Trap Road.",
        },
    },
};

var res = await sdk.VenueProfiles.PatchVenueDetailsAsync(req);

// handle response
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [PatchVenueDetailsRequest](../../Models/Requests/PatchVenueDetailsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[PatchVenueDetailsResponse](../../Models/Requests/PatchVenueDetailsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## GetVenueDetailsOverview

Retrieve an overview of venue details for the specified venue.

### Example Usage

<!-- UsageSnippet language="csharp" operationID="getVenueDetailsOverview" method="get" path="/venues/{venueId}/details/overview" -->
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

GetVenueDetailsOverviewRequest req = new GetVenueDetailsOverviewRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
};

var res = await sdk.VenueProfiles.GetVenueDetailsOverviewAsync(req);

// handle response
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetVenueDetailsOverviewRequest](../../Models/Requests/GetVenueDetailsOverviewRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetVenueDetailsOverviewResponse](../../Models/Requests/GetVenueDetailsOverviewResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 401, 403, 404, 429                      | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## UpdateVenueFacility

Update the facility information for the specified venue, replacing all existing values with those provided in the request body.

Field applicability varies by venue type:
- Most facility information fields do not apply to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="updateVenueFacility" method="put" path="/venues/{venueId}/facility" -->
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

UpdateVenueFacilityRequest req = new UpdateVenueFacilityRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    ExistingVenueFacility = new ExistingVenueFacilityInput() {
        NumberOfMeetingRooms = 25,
        Space = new ExistingVenueFacilitySpace() {
            TotalMeetingRoomSpace = 50000,
            TotalExhibitSpace = 75000,
        },
        Sleeping = new ExistingVenueFacilitySleeping() {
            TotalRooms = 350,
            Suites = 20,
            SingleRooms = 200,
            DoubleRooms = 130,
        },
        SingleRate = new ExistingVenueFacilitySingleRate() {
            Low = 129.99D,
            High = 249.99D,
        },
        DoubleRate = new ExistingVenueFacilityDoubleRate() {
            Low = 149.99D,
            High = 299.99D,
        },
        TaxRate = 8.5D,
        OccupancyRate = 75.5D,
        YearBuilt = 1998,
        YearRenovated = 2021,
        ProximityFromAirport = new ExistingVenueFacilityProximityFromAirport() {
            Distance = 12.5D,
        },
        Restrictions = "No outside food or beverage permitted. Music must end by 11 PM.",
        MaximumCapacity = new ExistingVenueFacilityMaximumCapacity() {
            Seated = 500,
            Standing = 800,
        },
    },
};

var res = await sdk.VenueProfiles.UpdateVenueFacilityAsync(req);

// handle response
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [UpdateVenueFacilityRequest](../../Models/Requests/UpdateVenueFacilityRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[UpdateVenueFacilityResponse](../../Models/Requests/UpdateVenueFacilityResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |

## PatchVenueFacility

Partially update the facility information for the specified venue using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- If any part of the patch fails, the entire request will fail.
- `proximityFromAirport.unit` is required when `proximityFromAirport.distance` is provided.

Field applicability varies by venue type:
- Most facility information fields do not apply to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="patchVenueFacility" method="patch" path="/venues/{venueId}/facility" -->
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

PatchVenueFacilityRequest req = new PatchVenueFacilityRequest() {
    VenueId = "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    VenueFacilityPatch = new VenueFacilityPatch() {
        NumberOfMeetingRooms = 25,
        Space = new VenueFacilityPatchSpace() {
            TotalMeetingRoomSpace = 50000,
            TotalExhibitSpace = 75000,
        },
        Sleeping = new VenueFacilityPatchSleeping() {
            TotalRooms = 350,
            Suites = 20,
            SingleRooms = 200,
            DoubleRooms = 130,
        },
        SingleRate = new VenueFacilityPatchSingleRate() {
            Low = 129.99D,
            High = 249.99D,
        },
        DoubleRate = new VenueFacilityPatchDoubleRate() {
            Low = 149.99D,
            High = 299.99D,
        },
        TaxRate = 8.5D,
        OccupancyRate = 75.5D,
        YearBuilt = 1998,
        YearRenovated = 2021,
        ProximityFromAirport = new VenueFacilityPatchProximityFromAirport() {
            Distance = 12.5D,
        },
        Restrictions = "No outside food or beverage permitted. Music must end by 11 PM.",
        MaximumCapacity = new VenueFacilityPatchMaximumCapacity() {
            Seated = 500,
            Standing = 800,
        },
    },
};

var res = await sdk.VenueProfiles.PatchVenueFacilityAsync(req);

// handle response
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [PatchVenueFacilityRequest](../../Models/Requests/PatchVenueFacilityRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[PatchVenueFacilityResponse](../../Models/Requests/PatchVenueFacilityResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse12 | 400, 401, 403, 404, 429                 | application/json                        |
| Cvent.SDK.Models.Errors.APIException    | 4XX, 5XX                                | \*/\*                                   |
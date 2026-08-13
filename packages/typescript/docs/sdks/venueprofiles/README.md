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

<!-- UsageSnippet language="typescript" operationID="updateVenueDetails" method="put" path="/venues/{venueId}/details" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.venueProfiles.updateVenueDetails({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    existingVenueDetails: {
      type: "HOTEL",
      timeZone: "America/New_York",
      brand: "Quality Hotels",
      chainScale: "UPSCALE_CHAINS",
      mainPhoneNumber: "+1-703-555-0100",
      mainFaxNumber: "+1-703-555-0101",
      salesPhoneNumber: "+1-703-555-0102",
      salesFaxNumber: "+1-703-555-0103",
      tollFreeNumber: "1-800-555-0100",
      websiteAddress: "https://www.example-hotel.com",
      openingDate: "Spring 2025",
      description: "A modern conference venue in downtown.",
      additionalInformation: "Free parking available on-site.",
      cancellationPolicy: "Full refund if cancelled 48 hours before event.",
      locationTypes: [
        "SUBURBAN",
      ],
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
        country: "LA",
        directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
      },
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueProfilesUpdateVenueDetails } from "@cvent/sdk/funcs/venueProfilesUpdateVenueDetails.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await venueProfilesUpdateVenueDetails(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    existingVenueDetails: {
      type: "HOTEL",
      timeZone: "America/New_York",
      brand: "Quality Hotels",
      chainScale: "UPSCALE_CHAINS",
      mainPhoneNumber: "+1-703-555-0100",
      mainFaxNumber: "+1-703-555-0101",
      salesPhoneNumber: "+1-703-555-0102",
      salesFaxNumber: "+1-703-555-0103",
      tollFreeNumber: "1-800-555-0100",
      websiteAddress: "https://www.example-hotel.com",
      openingDate: "Spring 2025",
      description: "A modern conference venue in downtown.",
      additionalInformation: "Free parking available on-site.",
      cancellationPolicy: "Full refund if cancelled 48 hours before event.",
      locationTypes: [
        "SUBURBAN",
      ],
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
        country: "LA",
        directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueProfilesUpdateVenueDetails failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateVenueDetailsRequest](../../models/operations/updatevenuedetailsrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingVenueDetails](../../models/components/existingvenuedetails.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse11  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

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

<!-- UsageSnippet language="typescript" operationID="patchVenueDetails" method="patch" path="/venues/{venueId}/details" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.venueProfiles.patchVenueDetails({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    venueDetailsPatch: {
      type: "HOTEL",
      timeZone: "America/New_York",
      brand: "Quality Hotels",
      chainScale: "UPSCALE_CHAINS",
      mainPhoneNumber: "+1-703-555-0100",
      mainFaxNumber: "+1-703-555-0101",
      salesPhoneNumber: "+1-703-555-0102",
      salesFaxNumber: "+1-703-555-0103",
      tollFreeNumber: "1-800-555-0100",
      websiteAddress: "https://www.example-hotel.com",
      openingDate: "Spring 2025",
      description: "A premier conference and event venue in the heart of Northern Virginia.",
      additionalInformation: "Complimentary parking available for all event attendees.",
      cancellationPolicy: "48-hour cancellation policy applies for all event bookings.",
      locationTypes: [
        "SUBURBAN",
      ],
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
        directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
      },
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueProfilesPatchVenueDetails } from "@cvent/sdk/funcs/venueProfilesPatchVenueDetails.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await venueProfilesPatchVenueDetails(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    venueDetailsPatch: {
      type: "HOTEL",
      timeZone: "America/New_York",
      brand: "Quality Hotels",
      chainScale: "UPSCALE_CHAINS",
      mainPhoneNumber: "+1-703-555-0100",
      mainFaxNumber: "+1-703-555-0101",
      salesPhoneNumber: "+1-703-555-0102",
      salesFaxNumber: "+1-703-555-0103",
      tollFreeNumber: "1-800-555-0100",
      websiteAddress: "https://www.example-hotel.com",
      openingDate: "Spring 2025",
      description: "A premier conference and event venue in the heart of Northern Virginia.",
      additionalInformation: "Complimentary parking available for all event attendees.",
      cancellationPolicy: "48-hour cancellation policy applies for all event bookings.",
      locationTypes: [
        "SUBURBAN",
      ],
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
        directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueProfilesPatchVenueDetails failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PatchVenueDetailsRequest](../../models/operations/patchvenuedetailsrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.VenueDetailsPatch](../../models/components/venuedetailspatch.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse11  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getVenueDetailsOverview

Retrieve an overview of venue details for the specified venue.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getVenueDetailsOverview" method="get" path="/venues/{venueId}/details/overview" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.venueProfiles.getVenueDetailsOverview({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueProfilesGetVenueDetailsOverview } from "@cvent/sdk/funcs/venueProfilesGetVenueDetailsOverview.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await venueProfilesGetVenueDetailsOverview(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueProfilesGetVenueDetailsOverview failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetVenueDetailsOverviewRequest](../../models/operations/getvenuedetailsoverviewrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.VenueDetailsOverview](../../models/components/venuedetailsoverview.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse11 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## updateVenueFacility

Update the facility information for the specified venue, replacing all existing values with those provided in the request body.

Field applicability varies by venue type:
- Most facility information fields do not apply to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateVenueFacility" method="put" path="/venues/{venueId}/facility" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.venueProfiles.updateVenueFacility({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    existingVenueFacility: {
      numberOfMeetingRooms: 25,
      space: {
        totalMeetingRoomSpace: 50000,
        totalExhibitSpace: 75000,
      },
      sleeping: {
        totalRooms: 350,
        suites: 20,
        singleRooms: 200,
        doubleRooms: 130,
      },
      singleRate: {
        low: 129.99,
        high: 249.99,
      },
      doubleRate: {
        low: 149.99,
        high: 299.99,
      },
      taxRate: 8.5,
      occupancyRate: 75.5,
      yearBuilt: 1998,
      yearRenovated: 2021,
      proximityFromAirport: {
        distance: 12.5,
      },
      restrictions: "No outside food or beverage permitted. Music must end by 11 PM.",
      maximumCapacity: {
        seated: 500,
        standing: 800,
      },
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueProfilesUpdateVenueFacility } from "@cvent/sdk/funcs/venueProfilesUpdateVenueFacility.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await venueProfilesUpdateVenueFacility(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    existingVenueFacility: {
      numberOfMeetingRooms: 25,
      space: {
        totalMeetingRoomSpace: 50000,
        totalExhibitSpace: 75000,
      },
      sleeping: {
        totalRooms: 350,
        suites: 20,
        singleRooms: 200,
        doubleRooms: 130,
      },
      singleRate: {
        low: 129.99,
        high: 249.99,
      },
      doubleRate: {
        low: 149.99,
        high: 299.99,
      },
      taxRate: 8.5,
      occupancyRate: 75.5,
      yearBuilt: 1998,
      yearRenovated: 2021,
      proximityFromAirport: {
        distance: 12.5,
      },
      restrictions: "No outside food or beverage permitted. Music must end by 11 PM.",
      maximumCapacity: {
        seated: 500,
        standing: 800,
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueProfilesUpdateVenueFacility failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateVenueFacilityRequest](../../models/operations/updatevenuefacilityrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingVenueFacility](../../models/components/existingvenuefacility.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse11  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## patchVenueFacility

Partially update the facility information for the specified venue using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- If any part of the patch fails, the entire request will fail.
- `proximityFromAirport.unit` is required when `proximityFromAirport.distance` is provided.

Field applicability varies by venue type:
- Most facility information fields do not apply to CVB/DMC or Restaurant venues.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="patchVenueFacility" method="patch" path="/venues/{venueId}/facility" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const result = await cventSDK.venueProfiles.patchVenueFacility({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    venueFacilityPatch: {
      numberOfMeetingRooms: 25,
      space: {
        totalMeetingRoomSpace: 50000,
        totalExhibitSpace: 75000,
      },
      sleeping: {
        totalRooms: 350,
        suites: 20,
        singleRooms: 200,
        doubleRooms: 130,
      },
      singleRate: {
        low: 129.99,
        high: 249.99,
      },
      doubleRate: {
        low: 149.99,
        high: 299.99,
      },
      taxRate: 8.5,
      occupancyRate: 75.5,
      yearBuilt: 1998,
      yearRenovated: 2021,
      proximityFromAirport: {
        distance: 12.5,
      },
      restrictions: "No outside food or beverage permitted. Music must end by 11 PM.",
      maximumCapacity: {
        seated: 500,
        standing: 800,
      },
    },
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueProfilesPatchVenueFacility } from "@cvent/sdk/funcs/venueProfilesPatchVenueFacility.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore({
  security: {
    oAuth2ClientCredentials: {
      clientID: process.env["CVENTSDK_CLIENT_ID"] ?? "",
      clientSecret: process.env["CVENTSDK_CLIENT_SECRET"] ?? "",
      tokenURL: process.env["CVENTSDK_TOKEN_URL"] ?? "",
      scopes: process.env["CVENTSDK_SCOPES"] ?? "",
    },
  },
});

async function run() {
  const res = await venueProfilesPatchVenueFacility(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    venueFacilityPatch: {
      numberOfMeetingRooms: 25,
      space: {
        totalMeetingRoomSpace: 50000,
        totalExhibitSpace: 75000,
      },
      sleeping: {
        totalRooms: 350,
        suites: 20,
        singleRooms: 200,
        doubleRooms: 130,
      },
      singleRate: {
        low: 129.99,
        high: 249.99,
      },
      doubleRate: {
        low: 149.99,
        high: 299.99,
      },
      taxRate: 8.5,
      occupancyRate: 75.5,
      yearBuilt: 1998,
      yearRenovated: 2021,
      proximityFromAirport: {
        distance: 12.5,
      },
      restrictions: "No outside food or beverage permitted. Music must end by 11 PM.",
      maximumCapacity: {
        seated: 500,
        standing: 800,
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueProfilesPatchVenueFacility failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PatchVenueFacilityRequest](../../models/operations/patchvenuefacilityrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.VenueFacilityPatch](../../models/components/venuefacilitypatch.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse11  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |
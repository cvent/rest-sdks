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

<!-- UsageSnippet language="typescript" operationID="createConnection" method="post" path="/connections" -->
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
  const result = await cventSDK.housing.createConnection({
    cventAccessCode: "<value>",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingCreateConnection } from "@cvent/sdk/funcs/housingCreateConnection.js";

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
  const res = await housingCreateConnection(cventSDK, {
    cventAccessCode: "<value>",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingCreateConnection failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateConnectionRequest](../../models/operations/createconnectionrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ConnectionResponse](../../models/components/connectionresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getHousingEventsSummaries

Gets a paginated list of summary information for your individual housing events.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventsSummaries" method="get" path="/housing-events/summaries" -->
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
  const result = await cventSDK.housing.getHousingEventsSummaries({
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "(start ge '2027-01-11T05:00:00.000Z' and end le '2027-01-15T05:00:00.000Z') or (end eq '2027-02-01T05:00:00.000Z')",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventsSummaries } from "@cvent/sdk/funcs/housingGetHousingEventsSummaries.js";

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
  const res = await housingGetHousingEventsSummaries(cventSDK, {
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "(start ge '2027-01-11T05:00:00.000Z' and end le '2027-01-15T05:00:00.000Z') or (end eq '2027-02-01T05:00:00.000Z')",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventsSummaries failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventsSummariesRequest](../../models/operations/gethousingeventssummariesrequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.HousingEventSummaryList](../../models/components/housingeventsummarylist.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getHousingEventInfo

Retrieves housing event details based on the given housing event ID.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventInfo" method="get" path="/housing-events/{housingEventId}" -->
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
  const result = await cventSDK.housing.getHousingEventInfo({
    housingEventId: 35325345,
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventInfo } from "@cvent/sdk/funcs/housingGetHousingEventInfo.js";

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
  const res = await housingGetHousingEventInfo(cventSDK, {
    housingEventId: 35325345,
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventInfo failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventInfoRequest](../../models/operations/gethousingeventinforequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.HousingEvent](../../models/components/housingevent.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getHousingEventHotels

Get list of hotels for the given housing event.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventHotels" method="get" path="/housing-events/{housingEventId}/hotels" -->
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
  const result = await cventSDK.housing.getHousingEventHotels({
    housingEventId: 35325345,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    locale: "en-US",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventHotels } from "@cvent/sdk/funcs/housingGetHousingEventHotels.js";

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
  const res = await housingGetHousingEventHotels(cventSDK, {
    housingEventId: 35325345,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    locale: "en-US",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventHotels failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventHotelsRequest](../../models/operations/gethousingeventhotelsrequest.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.HousingEventHotelsList](../../models/components/housingeventhotelslist.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getHousingEventHotel

Gets a single hotel's details in a housing event.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventHotel" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}" -->
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
  const result = await cventSDK.housing.getHousingEventHotel({
    housingEventId: 35325345,
    hotelId: 454345,
    locale: "en-US",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventHotel } from "@cvent/sdk/funcs/housingGetHousingEventHotel.js";

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
  const res = await housingGetHousingEventHotel(cventSDK, {
    housingEventId: 35325345,
    hotelId: 454345,
    locale: "en-US",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventHotel failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventHotelRequest](../../models/operations/gethousingeventhotelrequest.md)                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.HousingEventHotel](../../models/components/housingeventhotel.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getHousingEventHotelAvailability

Get a filterable list of available room nights for a particular hotel and housing event.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventHotelAvailability" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/available-nights" -->
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
  const result = await cventSDK.housing.getHousingEventHotelAvailability({
    housingEventId: 35325345,
    hotelId: 454345,
    filter: "attendeeType.codes eq 'PEWATT0524317' and (date ge '2023-01-12' and date le '2023-01-15')",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventHotelAvailability } from "@cvent/sdk/funcs/housingGetHousingEventHotelAvailability.js";

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
  const res = await housingGetHousingEventHotelAvailability(cventSDK, {
    housingEventId: 35325345,
    hotelId: 454345,
    filter: "attendeeType.codes eq 'PEWATT0524317' and (date ge '2023-01-12' and date le '2023-01-15')",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventHotelAvailability failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventHotelAvailabilityRequest](../../models/operations/gethousingeventhotelavailabilityrequest.md)                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.AvailableNights](../../models/components/availablenights.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getHousingEventRoomTypes

Get a filterable list of room types for a given hotel in a housing event.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventRoomTypes" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types" -->
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
  const result = await cventSDK.housing.getHousingEventRoomTypes({
    housingEventId: 35325345,
    hotelId: 454345,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "attendeeTypes.id eq 10345 or attendeeTypes.codes eq 'PEWATT0524317'",
    locale: "en-US",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventRoomTypes } from "@cvent/sdk/funcs/housingGetHousingEventRoomTypes.js";

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
  const res = await housingGetHousingEventRoomTypes(cventSDK, {
    housingEventId: 35325345,
    hotelId: 454345,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "attendeeTypes.id eq 10345 or attendeeTypes.codes eq 'PEWATT0524317'",
    locale: "en-US",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventRoomTypes failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventRoomTypesRequest](../../models/operations/gethousingeventroomtypesrequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.HousingEventRoomTypesList](../../models/components/housingeventroomtypeslist.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRoomTypeDetails

Get a room type's details for the given housing event, hotel and room type.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRoomTypeDetails" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types/{roomTypeId}" -->
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
  const result = await cventSDK.housing.getRoomTypeDetails({
    housingEventId: 35325345,
    hotelId: 454345,
    roomTypeId: 4,
    locale: "en-US",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetRoomTypeDetails } from "@cvent/sdk/funcs/housingGetRoomTypeDetails.js";

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
  const res = await housingGetRoomTypeDetails(cventSDK, {
    housingEventId: 35325345,
    hotelId: 454345,
    roomTypeId: 4,
    locale: "en-US",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetRoomTypeDetails failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRoomTypeDetailsRequest](../../models/operations/getroomtypedetailsrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RoomTypeDetails](../../models/components/roomtypedetails.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRoomTypeInventory

Gets a list of room type inventory details (by date) for the given housing event, hotel and room type.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRoomTypeInventory" method="get" path="/housing-events/{housingEventId}/hotels/{hotelId}/room-types/{roomTypeId}/inventory" -->
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
  const result = await cventSDK.housing.getRoomTypeInventory({
    housingEventId: 35325345,
    hotelId: 454345,
    roomTypeId: 4,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetRoomTypeInventory } from "@cvent/sdk/funcs/housingGetRoomTypeInventory.js";

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
  const res = await housingGetRoomTypeInventory(cventSDK, {
    housingEventId: 35325345,
    hotelId: 454345,
    roomTypeId: 4,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetRoomTypeInventory failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRoomTypeInventoryRequest](../../models/operations/getroomtypeinventoryrequest.md)                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.InventoryDetailsList](../../models/components/inventorydetailslist.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getHousingEventInventory

Gets a list (sorted by date) of housing event inventory details for the given housing event.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventInventory" method="get" path="/housing-events/{housingEventId}/inventory" -->
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
  const result = await cventSDK.housing.getHousingEventInventory({
    housingEventId: 35325345,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventInventory } from "@cvent/sdk/funcs/housingGetHousingEventInventory.js";

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
  const res = await housingGetHousingEventInventory(cventSDK, {
    housingEventId: 35325345,
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "(date ge '2023-01-12' and date le '2023-01-15') or (date eq '2023-02-01')",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventInventory failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventInventoryRequest](../../models/operations/gethousingeventinventoryrequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.InventoryDetailsList](../../models/components/inventorydetailslist.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getHousingEventReservations

Get list of reservation details for the given housing event.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getHousingEventReservations" method="get" path="/housing-events/{housingEventId}/reservations" -->
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
  const result = await cventSDK.housing.getHousingEventReservations({
    housingEventId: 35325345,
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "attendeeType.id eq 10345 and hotel.id eq 11355",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetHousingEventReservations } from "@cvent/sdk/funcs/housingGetHousingEventReservations.js";

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
  const res = await housingGetHousingEventReservations(cventSDK, {
    housingEventId: 35325345,
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    limit: 10,
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "attendeeType.id eq 10345 and hotel.id eq 11355",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetHousingEventReservations failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetHousingEventReservationsRequest](../../models/operations/gethousingeventreservationsrequest.md)                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ReservationsPaginatedResponse](../../models/components/reservationspaginatedresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createReservationRequest

Creates a reservation request from guest details. A reservation request represents a registration and stores guest details. Reservations booked with the guest-specific “bookingSite” URL in the response will pre-populate guest data and link the new reservation to the reservation request for tracking.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createReservationRequest" method="post" path="/reservation-requests" -->
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
  const result = await cventSDK.housing.createReservationRequest({
    sourceId: "Ext ack number",
    attendeeTypeCode: "MVFBES0320484",
    locale: "es-DO",
    housingEvent: {
      id: 69121314,
    },
    attendeeType: {
      id: 34549966,
    },
    roomType: {
      id: 11549984,
    },
    hotel: {
      id: 49543342,
    },
    sendAcknowledgement: true,
    splitFolio: false,
    redirectURL: "https://cvent.com",
    guests: [],
    customFields: {
      customField1: "CustomField1",
      customField2: "CustomField2",
      customField3: "CustomField3",
      customField4: "CustomField4",
      customField5: "CustomField5",
      customField6: "CustomField6",
    },
    accessible: false,
    specialRequest: "Double bed",
    rewardProgram: {
      id: 10000,
      name: "Test name",
    },
    membershipId: "1154example",
    travelDetails: {
      arrival: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      departure: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      additionalInformation: "Additional Information",
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
import { housingCreateReservationRequest } from "@cvent/sdk/funcs/housingCreateReservationRequest.js";

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
  const res = await housingCreateReservationRequest(cventSDK, {
    sourceId: "Ext ack number",
    attendeeTypeCode: "MVFBES0320484",
    locale: "es-DO",
    housingEvent: {
      id: 69121314,
    },
    attendeeType: {
      id: 34549966,
    },
    roomType: {
      id: 11549984,
    },
    hotel: {
      id: 49543342,
    },
    sendAcknowledgement: true,
    splitFolio: false,
    redirectURL: "https://cvent.com",
    guests: [],
    customFields: {
      customField1: "CustomField1",
      customField2: "CustomField2",
      customField3: "CustomField3",
      customField4: "CustomField4",
      customField5: "CustomField5",
      customField6: "CustomField6",
    },
    accessible: false,
    specialRequest: "Double bed",
    rewardProgram: {
      id: 10000,
      name: "Test name",
    },
    membershipId: "1154example",
    travelDetails: {
      arrival: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      departure: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      additionalInformation: "Additional Information",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingCreateReservationRequest failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.ReservationRequestInput](../../models/components/reservationrequestinput.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingReservationRequest](../../models/components/existingreservationrequest.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getReservationRequest

Returns reservation request details for a given reservation ID.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getReservationRequest" method="get" path="/reservation-requests/{reservationRequestsId}" -->
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
  const result = await cventSDK.housing.getReservationRequest({
    reservationRequestsId: "D6A63423-G796",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetReservationRequest } from "@cvent/sdk/funcs/housingGetReservationRequest.js";

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
  const res = await housingGetReservationRequest(cventSDK, {
    reservationRequestsId: "D6A63423-G796",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetReservationRequest failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetReservationRequestRequest](../../models/operations/getreservationrequestrequest.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingReservationRequest](../../models/components/existingreservationrequest.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateReservationRequest

Update a reservation request using the given reservation ID. If the reservation has been booked, changes to the reservation request do not affect the linked reservation.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateReservationRequest" method="put" path="/reservation-requests/{reservationRequestsId}" -->
```typescript
import { CventSDK } from "@cvent/sdk";
import { RFCDate } from "@cvent/sdk/types";

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
  const result = await cventSDK.housing.updateReservationRequest({
    reservationRequestsId: "D6A63423-G796",
    existingReservationRequest: {
      sourceId: "Ext ack number",
      attendeeTypeCode: "MVFBES0320484",
      locale: "es-DO",
      housingEvent: {
        id: 69121314,
      },
      attendeeType: {
        id: 34549966,
      },
      roomType: {
        id: 11549984,
      },
      hotel: {
        id: 49543342,
      },
      sendAcknowledgement: true,
      splitFolio: false,
      redirectURL: "https://cvent.com",
      guests: [
        {
          arrival: new RFCDate("2020-03-05"),
          departure: new RFCDate("2020-03-07"),
          firstName: "Gustav",
          lastName: "Schultz",
          middleName: "Al",
          title: "Dr.",
          position: "manager",
          company: "Test Inc",
          homeFax: "9785674321",
          email: "guest@cvent.com",
          homePhone: "(231)-213-1222",
          workPhone: "(231)-213-1222",
          homeAddress: {
            address1: "West St. 1",
            address2: "Apt. 16",
            city: "Austin",
            region: "Texas",
            regionCode: "TX",
            postalCode: "23452AB",
            country: "United States of America",
            countryCode: "US",
          },
          paymentInfo: {
            fullName: "Gustav Schultz",
            address: {
              address1: "West St. 1",
              address2: "Apt. 16",
              city: "Austin",
              region: "Texas",
              regionCode: "TX",
              postalCode: "23452AB",
              country: "United States of America",
              countryCode: "US",
            },
            phone: "(231)213-1222",
            other: {
              amount: 0,
              paymentDate: new RFCDate("2021-12-31"),
              referenceItem: "Reference Item",
              checkNumber: "Check Num",
              received: false,
              note: "No Comment",
            },
          },
        },
      ],
      customFields: {
        customField1: "CustomField1",
        customField2: "CustomField2",
        customField3: "CustomField3",
        customField4: "CustomField4",
        customField5: "CustomField5",
        customField6: "CustomField6",
      },
      accessible: false,
      specialRequest: "Double bed",
      rewardProgram: {
        id: 10000,
        name: "Test name",
      },
      membershipId: "1154example",
      travelDetails: {
        arrival: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        departure: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        additionalInformation: "Additional Information",
      },
      id: "D6A63423-G796",
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
import { housingUpdateReservationRequest } from "@cvent/sdk/funcs/housingUpdateReservationRequest.js";
import { RFCDate } from "@cvent/sdk/types";

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
  const res = await housingUpdateReservationRequest(cventSDK, {
    reservationRequestsId: "D6A63423-G796",
    existingReservationRequest: {
      sourceId: "Ext ack number",
      attendeeTypeCode: "MVFBES0320484",
      locale: "es-DO",
      housingEvent: {
        id: 69121314,
      },
      attendeeType: {
        id: 34549966,
      },
      roomType: {
        id: 11549984,
      },
      hotel: {
        id: 49543342,
      },
      sendAcknowledgement: true,
      splitFolio: false,
      redirectURL: "https://cvent.com",
      guests: [
        {
          arrival: new RFCDate("2020-03-05"),
          departure: new RFCDate("2020-03-07"),
          firstName: "Gustav",
          lastName: "Schultz",
          middleName: "Al",
          title: "Dr.",
          position: "manager",
          company: "Test Inc",
          homeFax: "9785674321",
          email: "guest@cvent.com",
          homePhone: "(231)-213-1222",
          workPhone: "(231)-213-1222",
          homeAddress: {
            address1: "West St. 1",
            address2: "Apt. 16",
            city: "Austin",
            region: "Texas",
            regionCode: "TX",
            postalCode: "23452AB",
            country: "United States of America",
            countryCode: "US",
          },
          paymentInfo: {
            fullName: "Gustav Schultz",
            address: {
              address1: "West St. 1",
              address2: "Apt. 16",
              city: "Austin",
              region: "Texas",
              regionCode: "TX",
              postalCode: "23452AB",
              country: "United States of America",
              countryCode: "US",
            },
            phone: "(231)213-1222",
            other: {
              amount: 0,
              paymentDate: new RFCDate("2021-12-31"),
              referenceItem: "Reference Item",
              checkNumber: "Check Num",
              received: false,
              note: "No Comment",
            },
          },
        },
      ],
      customFields: {
        customField1: "CustomField1",
        customField2: "CustomField2",
        customField3: "CustomField3",
        customField4: "CustomField4",
        customField5: "CustomField5",
        customField6: "CustomField6",
      },
      accessible: false,
      specialRequest: "Double bed",
      rewardProgram: {
        id: 10000,
        name: "Test name",
      },
      membershipId: "1154example",
      travelDetails: {
        arrival: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        departure: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        additionalInformation: "Additional Information",
      },
      id: "D6A63423-G796",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingUpdateReservationRequest failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateReservationRequestRequest](../../models/operations/updatereservationrequestrequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingReservationRequest](../../models/components/existingreservationrequest.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## cancelReservationRequest

Update the status of a reservation request to cancelled. If the reservation has already been booked, any changes made to the reservation request will not affect the linked reservation.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="cancelReservationRequest" method="delete" path="/reservation-requests/{reservationRequestsId}" -->
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
  await cventSDK.housing.cancelReservationRequest({
    reservationRequestsId: "D6A63423-G796",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingCancelReservationRequest } from "@cvent/sdk/funcs/housingCancelReservationRequest.js";

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
  const res = await housingCancelReservationRequest(cventSDK, {
    reservationRequestsId: "D6A63423-G796",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("housingCancelReservationRequest failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CancelReservationRequestRequest](../../models/operations/cancelreservationrequestrequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## linkReservation

Link an existing reservation to a reservation request. Commonly used when associating a reservation created outside the normal booking flow (such as a guest calling the hotel).

### Example Usage

<!-- UsageSnippet language="typescript" operationID="linkReservation" method="post" path="/reservation-requests/{reservationRequestsId}/reservations/{reservationId}" -->
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
  await cventSDK.housing.linkReservation({
    reservationRequestsId: "D6A63423-G796",
    reservationId: "327S856H",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingLinkReservation } from "@cvent/sdk/funcs/housingLinkReservation.js";

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
  const res = await housingLinkReservation(cventSDK, {
    reservationRequestsId: "D6A63423-G796",
    reservationId: "327S856H",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("housingLinkReservation failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.LinkReservationRequest](../../models/operations/linkreservationrequest.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## unlinkReservation

Unlink reservation from reservation request. Commonly used for removing a cancelled reservation from a reservation request so that a new reservation can be linked in its place.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="unlinkReservation" method="delete" path="/reservation-requests/{reservationRequestsId}/reservations/{reservationId}" -->
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
  await cventSDK.housing.unlinkReservation({
    reservationRequestsId: "D6A63423-G796",
    reservationId: "327S856H",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingUnlinkReservation } from "@cvent/sdk/funcs/housingUnlinkReservation.js";

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
  const res = await housingUnlinkReservation(cventSDK, {
    reservationRequestsId: "D6A63423-G796",
    reservationId: "327S856H",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("housingUnlinkReservation failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UnlinkReservationRequest](../../models/operations/unlinkreservationrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createReservation

Create a hotel reservation in a housing event based on the details provided in the request body.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createReservation" method="post" path="/reservations" -->
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
  const result = await cventSDK.housing.createReservation({
    attendeeType: {
      id: 34549966,
    },
    roomType: {
      id: 11549984,
    },
    splitFolio: false,
    numberOfAdults: 2,
    numberOfChildren: 1,
    guests: [],
    customFields: {
      customField1: "CustomField1",
      customField2: "CustomField2",
      customField3: "CustomField3",
      customField4: "CustomField4",
      customField5: "CustomField5",
      customField6: "CustomField6",
    },
    accessible: false,
    specialRequest: "Double bed",
    rewardProgram: {
      id: 10000,
      name: "Test name",
    },
    membershipId: "1154example",
    travelDetails: {
      arrival: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      departure: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      additionalInformation: "Additional Information",
    },
    housingEvent: {
      id: 69121314,
    },
    hotel: {
      id: 49543342,
    },
    modifiers: {
      allowWaitList: true,
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
import { housingCreateReservation } from "@cvent/sdk/funcs/housingCreateReservation.js";

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
  const res = await housingCreateReservation(cventSDK, {
    attendeeType: {
      id: 34549966,
    },
    roomType: {
      id: 11549984,
    },
    splitFolio: false,
    numberOfAdults: 2,
    numberOfChildren: 1,
    guests: [],
    customFields: {
      customField1: "CustomField1",
      customField2: "CustomField2",
      customField3: "CustomField3",
      customField4: "CustomField4",
      customField5: "CustomField5",
      customField6: "CustomField6",
    },
    accessible: false,
    specialRequest: "Double bed",
    rewardProgram: {
      id: 10000,
      name: "Test name",
    },
    membershipId: "1154example",
    travelDetails: {
      arrival: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      departure: {
        time: new Date("2024-12-01T00:00:00Z"),
        carrier: "JBU",
        carrierNumber: "12345",
      },
      additionalInformation: "Additional Information",
    },
    housingEvent: {
      id: 69121314,
    },
    hotel: {
      id: 49543342,
    },
    modifiers: {
      allowWaitList: true,
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingCreateReservation failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.NewReservation](../../models/components/newreservation.md)                                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingReservation](../../models/components/existingreservation.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## getReservation

Get reservation details for the given reservation ID. Commonly used in response to [passkey callbacks](/docs/passkey/REST/callbacks). 

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getReservation" method="get" path="/reservations/{reservationId}" -->
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
  const result = await cventSDK.housing.getReservation({
    reservationId: "327S856H",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingGetReservation } from "@cvent/sdk/funcs/housingGetReservation.js";

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
  const res = await housingGetReservation(cventSDK, {
    reservationId: "327S856H",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingGetReservation failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetReservationRequest](../../models/operations/getreservationrequest.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingReservation](../../models/components/existingreservation.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## cancelReservation

Cancel reservation for given reservation ID.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="cancelReservation" method="delete" path="/reservations/{reservationId}" -->
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
  await cventSDK.housing.cancelReservation({
    reservationId: "327S856H",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { housingCancelReservation } from "@cvent/sdk/funcs/housingCancelReservation.js";

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
  const res = await housingCancelReservation(cventSDK, {
    reservationId: "327S856H",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("housingCancelReservation failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CancelReservationRequest](../../models/operations/cancelreservationrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 401, 403, 404, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |

## updateReservationSync

Updates an existing reservation for given reservation ID.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateReservationSync" method="put" path="/reservations/{reservationId}" -->
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
  const result = await cventSDK.housing.updateReservationSync({
    reservationId: "327S856H",
    newReservation: {
      attendeeType: {
        id: 34549966,
      },
      roomType: {
        id: 11549984,
      },
      splitFolio: false,
      numberOfAdults: 2,
      numberOfChildren: 1,
      guests: [],
      customFields: {
        customField1: "CustomField1",
        customField2: "CustomField2",
        customField3: "CustomField3",
        customField4: "CustomField4",
        customField5: "CustomField5",
        customField6: "CustomField6",
      },
      accessible: false,
      specialRequest: "Double bed",
      rewardProgram: {
        id: 10000,
        name: "Test name",
      },
      membershipId: "1154example",
      travelDetails: {
        arrival: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        departure: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        additionalInformation: "Additional Information",
      },
      housingEvent: {
        id: 69121314,
      },
      hotel: {
        id: 49543342,
      },
      modifiers: {
        allowWaitList: true,
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
import { housingUpdateReservationSync } from "@cvent/sdk/funcs/housingUpdateReservationSync.js";

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
  const res = await housingUpdateReservationSync(cventSDK, {
    reservationId: "327S856H",
    newReservation: {
      attendeeType: {
        id: 34549966,
      },
      roomType: {
        id: 11549984,
      },
      splitFolio: false,
      numberOfAdults: 2,
      numberOfChildren: 1,
      guests: [],
      customFields: {
        customField1: "CustomField1",
        customField2: "CustomField2",
        customField3: "CustomField3",
        customField4: "CustomField4",
        customField5: "CustomField5",
        customField6: "CustomField6",
      },
      accessible: false,
      specialRequest: "Double bed",
      rewardProgram: {
        id: 10000,
        name: "Test name",
      },
      membershipId: "1154example",
      travelDetails: {
        arrival: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        departure: {
          time: new Date("2024-12-01T00:00:00Z"),
          carrier: "JBU",
          carrierNumber: "12345",
        },
        additionalInformation: "Additional Information",
      },
      housingEvent: {
        id: 69121314,
      },
      hotel: {
        id: 49543342,
      },
      modifiers: {
        allowWaitList: true,
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("housingUpdateReservationSync failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateReservationSyncRequest](../../models/operations/updatereservationsyncrequest.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingReservation](../../models/components/existingreservation.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |
# VenueMeetingRooms

## Overview

Manage meeting rooms for a venue, including creating and updating room details, configuring capacities and amenities, and associating images.

### Available Operations

* [createMeetingRoom](#createmeetingroom) - Create Meeting Room
* [listMeetingRoomsOverviews](#listmeetingroomsoverviews) - List Meeting Rooms Overviews
* [updateMeetingRoom](#updatemeetingroom) - Update Meeting Room
* [patchMeetingRoom](#patchmeetingroom) - Patch Meeting Room
* [getMeetingRoomOverview](#getmeetingroomoverview) - Get Meeting Room Overview

## createMeetingRoom

Create a new meeting room for the specified venue.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createMeetingRoom" method="post" path="/venues/{venueId}/meeting-rooms" -->
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
  const result = await cventSDK.venueMeetingRooms.createMeetingRoom({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoom: {
      name: "Grand Ballroom",
      description: "Large conference space with natural lighting",
      dimensions: {
        totalSpace: {
          value: 1500,
          unit: "SQUARE_FEET",
        },
        ceilingHeight: {
          value: 12.5,
          unit: "FEET",
        },
        length: {
          value: 12.5,
          unit: "FEET",
        },
        width: {
          value: 12.5,
          unit: "FEET",
        },
      },
      displayOrder: 1,
      externalSourceId: "EXT-123",
      rates: {
        moveIn: {
          value: 500,
          applicationType: "PER_DAY",
        },
        moveOut: {
          value: 500,
          applicationType: "PER_DAY",
        },
        event: {
          value: 500,
          applicationType: "PER_DAY",
        },
      },
      capacities: {
        exhibits: [
          {
            layoutType: "BOOTH_10x10",
            maxExhibits: 50,
          },
        ],
        seating: [
          {
            layoutType: "THEATER",
            maxAttendees: 250,
          },
        ],
      },
      amenities: [
        "PROJECTOR",
      ],
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
import { venueMeetingRoomsCreateMeetingRoom } from "@cvent/sdk/funcs/venueMeetingRoomsCreateMeetingRoom.js";

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
  const res = await venueMeetingRoomsCreateMeetingRoom(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoom: {
      name: "Grand Ballroom",
      description: "Large conference space with natural lighting",
      dimensions: {
        totalSpace: {
          value: 1500,
          unit: "SQUARE_FEET",
        },
        ceilingHeight: {
          value: 12.5,
          unit: "FEET",
        },
        length: {
          value: 12.5,
          unit: "FEET",
        },
        width: {
          value: 12.5,
          unit: "FEET",
        },
      },
      displayOrder: 1,
      externalSourceId: "EXT-123",
      rates: {
        moveIn: {
          value: 500,
          applicationType: "PER_DAY",
        },
        moveOut: {
          value: 500,
          applicationType: "PER_DAY",
        },
        event: {
          value: 500,
          applicationType: "PER_DAY",
        },
      },
      capacities: {
        exhibits: [
          {
            layoutType: "BOOTH_10x10",
            maxExhibits: 50,
          },
        ],
        seating: [
          {
            layoutType: "THEATER",
            maxAttendees: 250,
          },
        ],
      },
      amenities: [
        "PROJECTOR",
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueMeetingRoomsCreateMeetingRoom failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateMeetingRoomRequest](../../models/operations/createmeetingroomrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.CreateMeetingRoomResponse](../../models/operations/createmeetingroomresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse1   | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## listMeetingRoomsOverviews

Retrieve a paginated list of meeting room overviews for the specified venue.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listMeetingRoomsOverviews" method="get" path="/venues/{venueId}/meeting-rooms/overviews" -->
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
  const result = await cventSDK.venueMeetingRooms.listMeetingRoomsOverviews({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "hiddenOnProfile eq 'false'",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueMeetingRoomsListMeetingRoomsOverviews } from "@cvent/sdk/funcs/venueMeetingRoomsListMeetingRoomsOverviews.js";

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
  const res = await venueMeetingRoomsListMeetingRoomsOverviews(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "hiddenOnProfile eq 'false'",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueMeetingRoomsListMeetingRoomsOverviews failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListMeetingRoomsOverviewsRequest](../../models/operations/listmeetingroomsoverviewsrequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.MeetingRoomsOverviewResponse](../../models/components/meetingroomsoverviewresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse1   | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateMeetingRoom

Update a meeting room for the specified venue, replacing the existing meeting room data.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateMeetingRoom" method="put" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}" -->
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
  const result = await cventSDK.venueMeetingRooms.updateMeetingRoom({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoomId: "2344f9ab-537e-412f-ad6d-264fedbf17a6",
    existingMeetingRoom: {
      name: "Grand Ballroom",
      description: "Large conference space with natural lighting",
      dimensions: {
        totalSpace: {
          value: 1500,
          unit: "SQUARE_FEET",
        },
        ceilingHeight: {
          value: 12.5,
          unit: "FEET",
        },
        length: {
          value: 12.5,
          unit: "FEET",
        },
        width: {
          value: 12.5,
          unit: "FEET",
        },
      },
      displayOrder: 1,
      externalSourceId: "EXT-123",
      rates: {
        moveIn: {
          value: 500,
          applicationType: "PER_DAY",
        },
        moveOut: {
          value: 500,
          applicationType: "PER_DAY",
        },
        event: {
          value: 500,
          applicationType: "PER_DAY",
        },
      },
      capacities: {
        exhibits: [
          {
            layoutType: "BOOTH_10x10",
            maxExhibits: 50,
          },
        ],
        seating: [
          {
            layoutType: "THEATER",
            maxAttendees: 250,
          },
        ],
      },
      amenities: [
        "PROJECTOR",
      ],
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
import { venueMeetingRoomsUpdateMeetingRoom } from "@cvent/sdk/funcs/venueMeetingRoomsUpdateMeetingRoom.js";

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
  const res = await venueMeetingRoomsUpdateMeetingRoom(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoomId: "2344f9ab-537e-412f-ad6d-264fedbf17a6",
    existingMeetingRoom: {
      name: "Grand Ballroom",
      description: "Large conference space with natural lighting",
      dimensions: {
        totalSpace: {
          value: 1500,
          unit: "SQUARE_FEET",
        },
        ceilingHeight: {
          value: 12.5,
          unit: "FEET",
        },
        length: {
          value: 12.5,
          unit: "FEET",
        },
        width: {
          value: 12.5,
          unit: "FEET",
        },
      },
      displayOrder: 1,
      externalSourceId: "EXT-123",
      rates: {
        moveIn: {
          value: 500,
          applicationType: "PER_DAY",
        },
        moveOut: {
          value: 500,
          applicationType: "PER_DAY",
        },
        event: {
          value: 500,
          applicationType: "PER_DAY",
        },
      },
      capacities: {
        exhibits: [
          {
            layoutType: "BOOTH_10x10",
            maxExhibits: 50,
          },
        ],
        seating: [
          {
            layoutType: "THEATER",
            maxAttendees: 250,
          },
        ],
      },
      amenities: [
        "PROJECTOR",
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueMeetingRoomsUpdateMeetingRoom failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateMeetingRoomRequest](../../models/operations/updatemeetingroomrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingMeetingRoom](../../models/components/existingmeetingroom.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse1   | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## patchMeetingRoom

Partially update a meeting room for the specified venue.

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- **Arrays (`capacities`, `amenities`) are treated as full replacements** — the entire array is replaced, not merged.
- All changes are applied atomically.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="patchMeetingRoom" method="patch" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}" -->
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
  const result = await cventSDK.venueMeetingRooms.patchMeetingRoom({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoomId: "2a12f958-0ac4-4665-9210-449812da553a",
    patchMeetingRoom: {
      name: "Grand Ballroom",
      description: "Large conference space with natural lighting",
      dimensions: {
        totalSpace: {
          value: 1500,
          unit: "SQUARE_FEET",
        },
        ceilingHeight: {
          value: 12.5,
          unit: "FEET",
        },
        length: {
          value: 12.5,
          unit: "FEET",
        },
        width: {
          value: 12.5,
          unit: "FEET",
        },
      },
      displayOrder: 1,
      externalSourceId: "EXT-RM-12345",
      rates: null,
      capacities: null,
      amenities: [
        "PROJECTOR",
      ],
      hiddenOnProfile: false,
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
import { venueMeetingRoomsPatchMeetingRoom } from "@cvent/sdk/funcs/venueMeetingRoomsPatchMeetingRoom.js";

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
  const res = await venueMeetingRoomsPatchMeetingRoom(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoomId: "2a12f958-0ac4-4665-9210-449812da553a",
    patchMeetingRoom: {
      name: "Grand Ballroom",
      description: "Large conference space with natural lighting",
      dimensions: {
        totalSpace: {
          value: 1500,
          unit: "SQUARE_FEET",
        },
        ceilingHeight: {
          value: 12.5,
          unit: "FEET",
        },
        length: {
          value: 12.5,
          unit: "FEET",
        },
        width: {
          value: 12.5,
          unit: "FEET",
        },
      },
      displayOrder: 1,
      externalSourceId: "EXT-RM-12345",
      rates: null,
      capacities: null,
      amenities: [
        "PROJECTOR",
      ],
      hiddenOnProfile: false,
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueMeetingRoomsPatchMeetingRoom failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PatchMeetingRoomRequest](../../models/operations/patchmeetingroomrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.PatchMeetingRoom](../../models/components/patchmeetingroom.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse1   | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getMeetingRoomOverview

Retrieve an overview of a specific meeting room for the specified venue.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getMeetingRoomOverview" method="get" path="/venues/{venueId}/meeting-rooms/{meetingRoomId}/overview" -->
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
  const result = await cventSDK.venueMeetingRooms.getMeetingRoomOverview({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoomId: "081078e3-8a73-49c6-b757-a3d52dbc2cc8",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueMeetingRoomsGetMeetingRoomOverview } from "@cvent/sdk/funcs/venueMeetingRoomsGetMeetingRoomOverview.js";

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
  const res = await venueMeetingRoomsGetMeetingRoomOverview(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    meetingRoomId: "081078e3-8a73-49c6-b757-a3d52dbc2cc8",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueMeetingRoomsGetMeetingRoomOverview failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetMeetingRoomOverviewRequest](../../models/operations/getmeetingroomoverviewrequest.md)                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.MeetingRoomOverview](../../models/components/meetingroomoverview.md)\>**

### Errors

| Error Type            | Status Code           | Content Type          |
| --------------------- | --------------------- | --------------------- |
| errors.ErrorResponse1 | 401, 403, 404, 429    | application/json      |
| errors.APIError       | 4XX, 5XX              | \*/\*                 |
# RFPAdditionalDetails

## Overview

RFP additional details APIs for managing past event references and other miscellaneous RFP operations.

### Available Operations

* [listRfpPastEvents](#listrfppastevents) - List RFP Past Events
* [createRfpPastEvent](#createrfppastevent) - Create RFP Past Event
* [getRfpPastEvent](#getrfppastevent) - Get RFP Past Event
* [updateRfpPastEvent](#updaterfppastevent) - Update RFP Past Event
* [deleteRfpPastEvent](#deleterfppastevent) - Delete RFP Past Event

## listRfpPastEvents

Retrieves a list of past events associated with an RFP. These can be non-Cvent events.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listRfpPastEvents" method="get" path="/rfps/{rfpId}/past-events" -->
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
  const result = await cventSDK.rfpAdditionalDetails.listRfpPastEvents({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpAdditionalDetailsListRFPPastEvents } from "@cvent/sdk/funcs/rfpAdditionalDetailsListRFPPastEvents.js";

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
  const res = await rfpAdditionalDetailsListRFPPastEvents(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpAdditionalDetailsListRFPPastEvents failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListRfpPastEventsRequest](../../models/operations/listrfppasteventsrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpPastEvents](../../models/components/rfppastevents.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## createRfpPastEvent

Adds a past event that is similar to the event associated with the specified RFP. An RFP can have at most 3 past events.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createRfpPastEvent" method="post" path="/rfps/{rfpId}/past-events" -->
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
  const result = await cventSDK.rfpAdditionalDetails.createRfpPastEvent({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpPastEventRequest: {
      venueName: "Delta Inn by Supreme Hotels",
      city: "New Delhi",
      stateProvince: "US-AL",
      date: "First week of January 2024",
      attendeeCount: 500,
      guestRoomsPickedUp: 500,
      guestRoomsBlocked: 500,
      foodBeverageSpend: "3,000 dollars",
      notes: "This was the 25th event hosted by Alpha Planners.",
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
import { rfpAdditionalDetailsCreateRFPPastEvent } from "@cvent/sdk/funcs/rfpAdditionalDetailsCreateRFPPastEvent.js";

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
  const res = await rfpAdditionalDetailsCreateRFPPastEvent(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpPastEventRequest: {
      venueName: "Delta Inn by Supreme Hotels",
      city: "New Delhi",
      stateProvince: "US-AL",
      date: "First week of January 2024",
      attendeeCount: 500,
      guestRoomsPickedUp: 500,
      guestRoomsBlocked: 500,
      foodBeverageSpend: "3,000 dollars",
      notes: "This was the 25th event hosted by Alpha Planners.",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpAdditionalDetailsCreateRFPPastEvent failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateRfpPastEventRequest](../../models/operations/createrfppasteventrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpPastEvent](../../models/components/rfppastevent.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRfpPastEvent

Returns details of a past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpPastEvent" method="get" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
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
  const result = await cventSDK.rfpAdditionalDetails.getRfpPastEvent({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    pastEventId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpAdditionalDetailsGetRFPPastEvent } from "@cvent/sdk/funcs/rfpAdditionalDetailsGetRFPPastEvent.js";

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
  const res = await rfpAdditionalDetailsGetRFPPastEvent(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    pastEventId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpAdditionalDetailsGetRFPPastEvent failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpPastEventRequest](../../models/operations/getrfppasteventrequest.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpPastEvent](../../models/components/rfppastevent.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## updateRfpPastEvent

Updates a past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateRfpPastEvent" method="put" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
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
  const result = await cventSDK.rfpAdditionalDetails.updateRfpPastEvent({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    pastEventId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
    rfpPastEvent: {
      venueName: "Delta Inn by Supreme Hotels",
      city: "New Delhi",
      stateProvince: "US-AL",
      date: "First week of January 2024",
      attendeeCount: 500,
      guestRoomsPickedUp: 500,
      guestRoomsBlocked: 500,
      foodBeverageSpend: "3,000 dollars",
      notes: "This was the 25th event hosted by Alpha Planners.",
      id: "db6a6dd9-3284-4936-bd7d-5242494acb03",
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
import { rfpAdditionalDetailsUpdateRFPPastEvent } from "@cvent/sdk/funcs/rfpAdditionalDetailsUpdateRFPPastEvent.js";

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
  const res = await rfpAdditionalDetailsUpdateRFPPastEvent(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    pastEventId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
    rfpPastEvent: {
      venueName: "Delta Inn by Supreme Hotels",
      city: "New Delhi",
      stateProvince: "US-AL",
      date: "First week of January 2024",
      attendeeCount: 500,
      guestRoomsPickedUp: 500,
      guestRoomsBlocked: 500,
      foodBeverageSpend: "3,000 dollars",
      notes: "This was the 25th event hosted by Alpha Planners.",
      id: "db6a6dd9-3284-4936-bd7d-5242494acb03",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpAdditionalDetailsUpdateRFPPastEvent failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateRfpPastEventRequest](../../models/operations/updaterfppasteventrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpPastEvent](../../models/components/rfppastevent.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteRfpPastEvent

Deletes the past event associated with the RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteRfpPastEvent" method="delete" path="/rfps/{rfpId}/past-events/{pastEventId}" -->
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
  await cventSDK.rfpAdditionalDetails.deleteRfpPastEvent({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    pastEventId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpAdditionalDetailsDeleteRFPPastEvent } from "@cvent/sdk/funcs/rfpAdditionalDetailsDeleteRFPPastEvent.js";

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
  const res = await rfpAdditionalDetailsDeleteRFPPastEvent(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    pastEventId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("rfpAdditionalDetailsDeleteRFPPastEvent failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteRfpPastEventRequest](../../models/operations/deleterfppasteventrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |
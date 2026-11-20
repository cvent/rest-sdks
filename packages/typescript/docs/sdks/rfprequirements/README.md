# RFPRequirements

## Overview

RFP requirements APIs for managing RFP-specific requirements including guest rooms, meeting rooms, custom questions, custom fields, and attachments (CRUD operations).

### Available Operations

* [listRfpAgendaItems](#listrfpagendaitems) - List RFP Agenda Items
* [createRfpAgendaItem](#createrfpagendaitem) - Create RFP Agenda Item
* [listRfpAgendaItemSchedules](#listrfpagendaitemschedules) - List RFP Agenda Item Schedules
* [getRfpAgendaItem](#getrfpagendaitem) - Get RFP Agenda Item
* [updateRfpAgendaItem](#updaterfpagendaitem) - Update RFP Agenda Item
* [deleteRfpAgendaItem](#deleterfpagendaitem) - Delete RFP Agenda Item
* [listRfpAttachments](#listrfpattachments) - List RFP Attachments
* [createRfpAttachment](#createrfpattachment) - Create RFP Attachment
* [getRfpAttachment](#getrfpattachment) - Get RFP Attachment
* [deleteRfpAttachment](#deleterfpattachment) - Delete RFP Attachment
* [listRfpCustomFields](#listrfpcustomfields) - List RFP Custom Field Answers
* [getRfpCustomFieldAnswers](#getrfpcustomfieldanswers) - Get RFP Custom Field Answers
* [updateRfpCustomFieldAnswers](#updaterfpcustomfieldanswers) - Update Custom Field Answers
* [getRfpGuestRooms](#getrfpguestrooms) - Get RFP Guest Rooms
* [updateRfpGuestRooms](#updaterfpguestrooms) - Update RFP Guest Rooms
* [listRfpInternalDocuments](#listrfpinternaldocuments) - List RFP Internal Documents
* [getRfpInternalDocument](#getrfpinternaldocument) - Get RFP Internal Document
* [associateRfpInternalDocument](#associaterfpinternaldocument) - Associate Internal Document
* [disassociateRfpInternalDocument](#disassociaterfpinternaldocument) - Disassociate Internal Document
* [listRfpQuestions](#listrfpquestions) - List RFP Questions
* [createRfpQuestion](#createrfpquestion) - Create RFP Question
* [getRfpQuestion](#getrfpquestion) - Get RFP Question
* [updateRfpQuestion](#updaterfpquestion) - Update RFP Question
* [deleteRfpQuestion](#deleterfpquestion) - Delete RFP Question

## listRfpAgendaItems

Returns a paginated list of agenda items associated with an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listRfpAgendaItems" method="get" path="/rfps/{rfpId}/agenda-items" -->
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
  const result = await cventSDK.rfpRequirements.listRfpAgendaItems({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsListRFPAgendaItems } from "@cvent/sdk/funcs/rfpRequirementsListRFPAgendaItems.js";

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
  const res = await rfpRequirementsListRFPAgendaItems(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("rfpRequirementsListRFPAgendaItems failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListRfpAgendaItemsRequest](../../models/operations/listrfpagendaitemsrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListRfpAgendaItemsResponse](../../models/operations/listrfpagendaitemsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createRfpAgendaItem

Creates a new agenda item for the specified RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createRfpAgendaItem" method="post" path="/rfps/{rfpId}/agenda-items" -->
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
  const result = await cventSDK.rfpRequirements.createRfpAgendaItem({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpAgendaItemRequest: {
      name: "Agenda Item 1",
      note: "This is a sample comment for this agenda item.",
      startTime: "10:00:00",
      endTime: "10:30:00",
      roomSize: 1000,
      attendeeCount: 10000,
      roomInfoRequired: false,
      twentyFourHourHold: true,
      locatedAtPrimaryEventVenue: false,
      number: 5,
      schedules: [
        {
          dayNumber: 1,
        },
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
import { rfpRequirementsCreateRFPAgendaItem } from "@cvent/sdk/funcs/rfpRequirementsCreateRFPAgendaItem.js";

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
  const res = await rfpRequirementsCreateRFPAgendaItem(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpAgendaItemRequest: {
      name: "Agenda Item 1",
      note: "This is a sample comment for this agenda item.",
      startTime: "10:00:00",
      endTime: "10:30:00",
      roomSize: 1000,
      attendeeCount: 10000,
      roomInfoRequired: false,
      twentyFourHourHold: true,
      locatedAtPrimaryEventVenue: false,
      number: 5,
      schedules: [
        {
          dayNumber: 1,
        },
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsCreateRFPAgendaItem failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateRfpAgendaItemRequest](../../models/operations/createrfpagendaitemrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpAgendaItem](../../models/components/rfpagendaitem.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## listRfpAgendaItemSchedules

Returns a paginated list of the schedules of the agenda items of an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listRfpAgendaItemSchedules" method="get" path="/rfps/{rfpId}/agenda-items/schedules" -->
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
  const result = await cventSDK.rfpRequirements.listRfpAgendaItemSchedules({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsListRFPAgendaItemSchedules } from "@cvent/sdk/funcs/rfpRequirementsListRFPAgendaItemSchedules.js";

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
  const res = await rfpRequirementsListRFPAgendaItemSchedules(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("rfpRequirementsListRFPAgendaItemSchedules failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListRfpAgendaItemSchedulesRequest](../../models/operations/listrfpagendaitemschedulesrequest.md)                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListRfpAgendaItemSchedulesResponse](../../models/operations/listrfpagendaitemschedulesresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRfpAgendaItem

Returns details of a specific agenda item associated with an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpAgendaItem" method="get" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
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
  const result = await cventSDK.rfpRequirements.getRfpAgendaItem({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsGetRFPAgendaItem } from "@cvent/sdk/funcs/rfpRequirementsGetRFPAgendaItem.js";

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
  const res = await rfpRequirementsGetRFPAgendaItem(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsGetRFPAgendaItem failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpAgendaItemRequest](../../models/operations/getrfpagendaitemrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpAgendaItem](../../models/components/rfpagendaitem.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## updateRfpAgendaItem

Updates an existing agenda item for the specified RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateRfpAgendaItem" method="put" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
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
  const result = await cventSDK.rfpRequirements.updateRfpAgendaItem({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
    rfpAgendaItem: {
      name: "Agenda Item 1",
      note: "This is a sample comment for this agenda item.",
      startTime: "10:00:00",
      endTime: "10:30:00",
      roomSize: 1000,
      attendeeCount: 10000,
      roomInfoRequired: false,
      twentyFourHourHold: true,
      locatedAtPrimaryEventVenue: false,
      number: 5,
      schedules: [
        {
          dayNumber: 1,
        },
      ],
      id: "9290ddfb-cc91-4cc3-9b3f-5ee5caba486b",
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
import { rfpRequirementsUpdateRFPAgendaItem } from "@cvent/sdk/funcs/rfpRequirementsUpdateRFPAgendaItem.js";

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
  const res = await rfpRequirementsUpdateRFPAgendaItem(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
    rfpAgendaItem: {
      name: "Agenda Item 1",
      note: "This is a sample comment for this agenda item.",
      startTime: "10:00:00",
      endTime: "10:30:00",
      roomSize: 1000,
      attendeeCount: 10000,
      roomInfoRequired: false,
      twentyFourHourHold: true,
      locatedAtPrimaryEventVenue: false,
      number: 5,
      schedules: [
        {
          dayNumber: 1,
        },
      ],
      id: "9290ddfb-cc91-4cc3-9b3f-5ee5caba486b",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsUpdateRFPAgendaItem failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateRfpAgendaItemRequest](../../models/operations/updaterfpagendaitemrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpAgendaItem](../../models/components/rfpagendaitem.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteRfpAgendaItem

Deletes an existing agenda item from the specified RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteRfpAgendaItem" method="delete" path="/rfps/{rfpId}/agenda-items/{agendaItemId}" -->
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
  await cventSDK.rfpRequirements.deleteRfpAgendaItem({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsDeleteRFPAgendaItem } from "@cvent/sdk/funcs/rfpRequirementsDeleteRFPAgendaItem.js";

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
  const res = await rfpRequirementsDeleteRFPAgendaItem(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    agendaItemId: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("rfpRequirementsDeleteRFPAgendaItem failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteRfpAgendaItemRequest](../../models/operations/deleterfpagendaitemrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## listRfpAttachments

Returns a paginated list of [attachments](#tag/RFP-Requirements) added to an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listRfpAttachments" method="get" path="/rfps/{rfpId}/attachments" -->
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
  const result = await cventSDK.rfpRequirements.listRfpAttachments({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "supplierSpecific eq 'false' or supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac','f56a51a4-84b0-46c9-a612-716dc95a1c96') AND sendInEmail eq 'false'",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsListRFPAttachments } from "@cvent/sdk/funcs/rfpRequirementsListRFPAttachments.js";

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
  const res = await rfpRequirementsListRFPAttachments(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "supplierSpecific eq 'false' or supplier.id in ('37f2de41-6f50-484a-a55d-3cf0ede2ebac','f56a51a4-84b0-46c9-a612-716dc95a1c96') AND sendInEmail eq 'false'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("rfpRequirementsListRFPAttachments failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListRfpAttachmentsRequest](../../models/operations/listrfpattachmentsrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListRfpAttachmentsResponse](../../models/operations/listrfpattachmentsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createRfpAttachment

Creates a new attachment on the specified RFP by copying an existing file. The file must be uploaded with [Upload File](#tag/File-Management/operation/uploadFile) before it can be copied.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createRfpAttachment" method="post" path="/rfps/{rfpId}/attachments" -->
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
  const result = await cventSDK.rfpRequirements.createRfpAttachment({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpAttachmentRequest: {
      file: {
        id: "94a18afa-30ad-407e-87c2-526e1e871a82",
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
import { rfpRequirementsCreateRFPAttachment } from "@cvent/sdk/funcs/rfpRequirementsCreateRFPAttachment.js";

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
  const res = await rfpRequirementsCreateRFPAttachment(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpAttachmentRequest: {
      file: {
        id: "94a18afa-30ad-407e-87c2-526e1e871a82",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsCreateRFPAttachment failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateRfpAttachmentRequest](../../models/operations/createrfpattachmentrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpAttachmentBase](../../models/components/rfpattachmentbase.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRfpAttachment

Returns details of a specific attachment added on an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpAttachment" method="get" path="/rfps/{rfpId}/attachments/{attachmentId}" -->
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
  const result = await cventSDK.rfpRequirements.getRfpAttachment({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    attachmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsGetRFPAttachment } from "@cvent/sdk/funcs/rfpRequirementsGetRFPAttachment.js";

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
  const res = await rfpRequirementsGetRFPAttachment(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    attachmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsGetRFPAttachment failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpAttachmentRequest](../../models/operations/getrfpattachmentrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpAttachmentBase](../../models/components/rfpattachmentbase.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## deleteRfpAttachment

Deletes the specified attachment from an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteRfpAttachment" method="delete" path="/rfps/{rfpId}/attachments/{attachmentId}" -->
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
  await cventSDK.rfpRequirements.deleteRfpAttachment({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    attachmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsDeleteRFPAttachment } from "@cvent/sdk/funcs/rfpRequirementsDeleteRFPAttachment.js";

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
  const res = await rfpRequirementsDeleteRFPAttachment(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    attachmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("rfpRequirementsDeleteRFPAttachment failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteRfpAttachmentRequest](../../models/operations/deleterfpattachmentrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## listRfpCustomFields

Returns a paginated list of answers for each custom field associated with a given RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listRfpCustomFields" method="get" path="/rfps/{rfpId}/custom-fields/answers" -->
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
  const result = await cventSDK.rfpRequirements.listRfpCustomFields({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    expand: [
      "customField",
    ],
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsListRFPCustomFields } from "@cvent/sdk/funcs/rfpRequirementsListRFPCustomFields.js";

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
  const res = await rfpRequirementsListRFPCustomFields(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    expand: [
      "customField",
    ],
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("rfpRequirementsListRFPCustomFields failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListRfpCustomFieldsRequest](../../models/operations/listrfpcustomfieldsrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListRfpCustomFieldsResponse](../../models/operations/listrfpcustomfieldsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRfpCustomFieldAnswers

Returns details of answers specific to a custom field associated to an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpCustomFieldAnswers" method="get" path="/rfps/{rfpId}/custom-fields/{customFieldId}/answers" -->
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
  const result = await cventSDK.rfpRequirements.getRfpCustomFieldAnswers({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "8cbcdb70-e2d0-46c2-8b3f-006e545394a7",
    expand: [
      "customField",
    ],
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsGetRFPCustomFieldAnswers } from "@cvent/sdk/funcs/rfpRequirementsGetRFPCustomFieldAnswers.js";

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
  const res = await rfpRequirementsGetRFPCustomFieldAnswers(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "8cbcdb70-e2d0-46c2-8b3f-006e545394a7",
    expand: [
      "customField",
    ],
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsGetRFPCustomFieldAnswers failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpCustomFieldAnswersRequest](../../models/operations/getrfpcustomfieldanswersrequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.CustomFieldAnswers](../../models/components/customfieldanswers.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateRfpCustomFieldAnswers

Updates the answers to a custom field of an RFP. Create the custom field at the account level with [Create Custom Field](#tag/Custom-Fields/operation/createCustomField) before you update its answers.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateRfpCustomFieldAnswers" method="put" path="/rfps/{rfpId}/custom-fields/{customFieldId}/answers" -->
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
  const result = await cventSDK.rfpRequirements.updateRfpCustomFieldAnswers({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "8cbcdb70-e2d0-46c2-8b3f-006e545394a7",
    expand: [
      "customField",
    ],
    customFieldAnswers: {
      customField: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
      answers: [
        "Choice 1",
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
import { rfpRequirementsUpdateRFPCustomFieldAnswers } from "@cvent/sdk/funcs/rfpRequirementsUpdateRFPCustomFieldAnswers.js";

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
  const res = await rfpRequirementsUpdateRFPCustomFieldAnswers(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "8cbcdb70-e2d0-46c2-8b3f-006e545394a7",
    expand: [
      "customField",
    ],
    customFieldAnswers: {
      customField: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
      answers: [
        "Choice 1",
      ],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsUpdateRFPCustomFieldAnswers failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateRfpCustomFieldAnswersRequest](../../models/operations/updaterfpcustomfieldanswersrequest.md)                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.CustomFieldAnswers](../../models/components/customfieldanswers.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRfpGuestRooms

Returns guest room requirements associated with an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpGuestRooms" method="get" path="/rfps/{rfpId}/guest-rooms" -->
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
  const result = await cventSDK.rfpRequirements.getRfpGuestRooms({
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
import { rfpRequirementsGetRFPGuestRooms } from "@cvent/sdk/funcs/rfpRequirementsGetRFPGuestRooms.js";

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
  const res = await rfpRequirementsGetRFPGuestRooms(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsGetRFPGuestRooms failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpGuestRoomsRequest](../../models/operations/getrfpguestroomsrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpGuestRooms](../../models/components/rfpguestrooms.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## updateRfpGuestRooms

Updates guest room requirements associated with an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateRfpGuestRooms" method="put" path="/rfps/{rfpId}/guest-rooms" -->
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
  const result = await cventSDK.rfpRequirements.updateRfpGuestRooms({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpGuestRooms: {
      occupancies: [
        {
          occupancy: "SINGLE",
          type: "DOUBLE",
        },
      ],
      checkInDate: new RFCDate("2025-10-13"),
      roomBlocks: [
        {
          dayNumber: 3,
          details: [
            {
              quantity: 24,
              type: "DOUBLE",
            },
          ],
        },
      ],
      additionalInformation: "2 Executive suites are mandatory.",
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
import { rfpRequirementsUpdateRFPGuestRooms } from "@cvent/sdk/funcs/rfpRequirementsUpdateRFPGuestRooms.js";
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
  const res = await rfpRequirementsUpdateRFPGuestRooms(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpGuestRooms: {
      occupancies: [
        {
          occupancy: "SINGLE",
          type: "DOUBLE",
        },
      ],
      checkInDate: new RFCDate("2025-10-13"),
      roomBlocks: [
        {
          dayNumber: 3,
          details: [
            {
              quantity: 24,
              type: "DOUBLE",
            },
          ],
        },
      ],
      additionalInformation: "2 Executive suites are mandatory.",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsUpdateRFPGuestRooms failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateRfpGuestRoomsRequest](../../models/operations/updaterfpguestroomsrequest.md)                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpGuestRooms](../../models/components/rfpguestrooms.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## listRfpInternalDocuments

Returns a paginated list of [internal documents](#tag/RFP-Requirements) added to an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listRfpInternalDocuments" method="get" path="/rfps/{rfpId}/internal-documents" -->
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
  const result = await cventSDK.rfpRequirements.listRfpInternalDocuments({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsListRFPInternalDocuments } from "@cvent/sdk/funcs/rfpRequirementsListRFPInternalDocuments.js";

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
  const res = await rfpRequirementsListRFPInternalDocuments(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "id in ('209a11d-5bf6-47d2-b81f-89360d7229b6')",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("rfpRequirementsListRFPInternalDocuments failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListRfpInternalDocumentsRequest](../../models/operations/listrfpinternaldocumentsrequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListRfpInternalDocumentsResponse](../../models/operations/listrfpinternaldocumentsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRfpInternalDocument

Returns details of an internal document associated with an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpInternalDocument" method="get" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
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
  const result = await cventSDK.rfpRequirements.getRfpInternalDocument({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    documentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsGetRFPInternalDocument } from "@cvent/sdk/funcs/rfpRequirementsGetRFPInternalDocument.js";

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
  const res = await rfpRequirementsGetRFPInternalDocument(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    documentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsGetRFPInternalDocument failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpInternalDocumentRequest](../../models/operations/getrfpinternaldocumentrequest.md)                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpInternalDocument](../../models/components/rfpinternaldocument.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## associateRfpInternalDocument

Associates a single document with an RFP. The `documentId` path parameter is the file ID that [Upload File](#tag/File-Management/operation/uploadFile) returns. A document with the same name or ID should not already exist.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="associateRfpInternalDocument" method="put" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
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
  const result = await cventSDK.rfpRequirements.associateRfpInternalDocument({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    documentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsAssociateRFPInternalDocument } from "@cvent/sdk/funcs/rfpRequirementsAssociateRFPInternalDocument.js";

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
  const res = await rfpRequirementsAssociateRFPInternalDocument(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    documentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsAssociateRFPInternalDocument failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.AssociateRfpInternalDocumentRequest](../../models/operations/associaterfpinternaldocumentrequest.md)                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpInternalDocument](../../models/components/rfpinternaldocument.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## disassociateRfpInternalDocument

Disassociates an internal document from an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="disassociateRfpInternalDocument" method="delete" path="/rfps/{rfpId}/internal-documents/{documentId}" -->
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
  await cventSDK.rfpRequirements.disassociateRfpInternalDocument({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    documentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsDisassociateRFPInternalDocument } from "@cvent/sdk/funcs/rfpRequirementsDisassociateRFPInternalDocument.js";

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
  const res = await rfpRequirementsDisassociateRFPInternalDocument(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    documentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("rfpRequirementsDisassociateRFPInternalDocument failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DisassociateRfpInternalDocumentRequest](../../models/operations/disassociaterfpinternaldocumentrequest.md)                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## listRfpQuestions

Returns a paginated list of standard and custom questions associated with the given RFP. Does not include answer details.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listRfpQuestions" method="get" path="/rfps/{rfpId}/questions" -->
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
  const result = await cventSDK.rfpRequirements.listRfpQuestions({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });

  for await (const page of result) {
    console.log(page);
  }
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsListRFPQuestions } from "@cvent/sdk/funcs/rfpRequirementsListRFPQuestions.js";

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
  const res = await rfpRequirementsListRFPQuestions(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("rfpRequirementsListRFPQuestions failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListRfpQuestionsRequest](../../models/operations/listrfpquestionsrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListRfpQuestionsResponse](../../models/operations/listrfpquestionsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createRfpQuestion

Creates a new question for the specified RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createRfpQuestion" method="post" path="/rfps/{rfpId}/questions" -->
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
  const result = await cventSDK.rfpRequirements.createRfpQuestion({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpQuestion: {
      text: "Are you spending any significant time offsite and need transportation?",
      shortText: "Needs offsite transportation?",
      htmlText: "Question Html",
      code: "4l6x",
      type: "SingleChoice",
      choices: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          label: "Choice A",
        },
      ],
      categories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          required: true,
        },
      ],
      subCategories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
        },
      ],
      notApplicableAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      otherAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      comments: "Comments Text",
      required: true,
      fields: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          choices: [
            {
              text: "Are you spending any significant time offsite and need transportation?",
              shortText: "Needs offsite transportation?",
              label: "Choice A",
            },
          ],
          notApplicableAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          otherAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          required: true,
        },
      ],
      maxScore: 20,
      totalSum: 45,
      minSelection: 1,
      maxSelection: 3,
      minDate: new RFCDate("2020-01-01"),
      maxDate: new RFCDate("2020-12-31"),
      showDateSelector: true,
      showCurrentDate: true,
      unitLabel: "miles",
      minLength: 5,
      maxLength: 100,
      customAnswerFormat: {
        id: 104,
      },
      supplierTypes: [
        "CVB",
        "HOTEL",
      ],
      classificationType: "GUEST_ROOM",
      order: 1,
      standardQuestion: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
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
import { rfpRequirementsCreateRFPQuestion } from "@cvent/sdk/funcs/rfpRequirementsCreateRFPQuestion.js";
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
  const res = await rfpRequirementsCreateRFPQuestion(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpQuestion: {
      text: "Are you spending any significant time offsite and need transportation?",
      shortText: "Needs offsite transportation?",
      htmlText: "Question Html",
      code: "4l6x",
      type: "SingleChoice",
      choices: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          label: "Choice A",
        },
      ],
      categories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          required: true,
        },
      ],
      subCategories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
        },
      ],
      notApplicableAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      otherAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      comments: "Comments Text",
      required: true,
      fields: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          choices: [
            {
              text: "Are you spending any significant time offsite and need transportation?",
              shortText: "Needs offsite transportation?",
              label: "Choice A",
            },
          ],
          notApplicableAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          otherAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          required: true,
        },
      ],
      maxScore: 20,
      totalSum: 45,
      minSelection: 1,
      maxSelection: 3,
      minDate: new RFCDate("2020-01-01"),
      maxDate: new RFCDate("2020-12-31"),
      showDateSelector: true,
      showCurrentDate: true,
      unitLabel: "miles",
      minLength: 5,
      maxLength: 100,
      customAnswerFormat: {
        id: 104,
      },
      supplierTypes: [
        "CVB",
        "HOTEL",
      ],
      classificationType: "GUEST_ROOM",
      order: 1,
      standardQuestion: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsCreateRFPQuestion failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateRfpQuestionRequest](../../models/operations/createrfpquestionrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpQuestion](../../models/components/rfpquestion.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getRfpQuestion

Returns the details of a specific question associated with an RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getRfpQuestion" method="get" path="/rfps/{rfpId}/questions/{questionId}" -->
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
  const result = await cventSDK.rfpRequirements.getRfpQuestion({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsGetRFPQuestion } from "@cvent/sdk/funcs/rfpRequirementsGetRFPQuestion.js";

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
  const res = await rfpRequirementsGetRFPQuestion(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsGetRFPQuestion failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetRfpQuestionRequest](../../models/operations/getrfpquestionrequest.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpQuestion](../../models/components/rfpquestion.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 401, 403, 404, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## updateRfpQuestion

Updates an existing question for the specified RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateRfpQuestion" method="put" path="/rfps/{rfpId}/questions/{questionId}" -->
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
  const result = await cventSDK.rfpRequirements.updateRfpQuestion({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpQuestion: {
      text: "Are you spending any significant time offsite and need transportation?",
      shortText: "Needs offsite transportation?",
      htmlText: "Question Html",
      code: "4l6x",
      type: "SingleChoice",
      choices: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          label: "Choice A",
        },
      ],
      categories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          required: true,
        },
      ],
      subCategories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
        },
      ],
      notApplicableAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      otherAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      comments: "Comments Text",
      required: true,
      fields: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          choices: [
            {
              text: "Are you spending any significant time offsite and need transportation?",
              shortText: "Needs offsite transportation?",
              label: "Choice A",
            },
          ],
          notApplicableAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          otherAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          required: true,
        },
      ],
      maxScore: 20,
      totalSum: 45,
      minSelection: 1,
      maxSelection: 3,
      minDate: new RFCDate("2020-01-01"),
      maxDate: new RFCDate("2020-12-31"),
      showDateSelector: true,
      showCurrentDate: true,
      unitLabel: "miles",
      minLength: 5,
      maxLength: 100,
      customAnswerFormat: {
        id: 104,
      },
      supplierTypes: [
        "CVB",
        "HOTEL",
      ],
      classificationType: "MEETING_ROOM",
      order: 1,
      standardQuestion: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
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
import { rfpRequirementsUpdateRFPQuestion } from "@cvent/sdk/funcs/rfpRequirementsUpdateRFPQuestion.js";
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
  const res = await rfpRequirementsUpdateRFPQuestion(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    rfpQuestion: {
      text: "Are you spending any significant time offsite and need transportation?",
      shortText: "Needs offsite transportation?",
      htmlText: "Question Html",
      code: "4l6x",
      type: "SingleChoice",
      choices: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          label: "Choice A",
        },
      ],
      categories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          required: true,
        },
      ],
      subCategories: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
        },
      ],
      notApplicableAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      otherAnswer: {
        text: "Dietary Restriction - Other",
        shortText: "Dietary Preference - Other Allergies",
      },
      comments: "Comments Text",
      required: true,
      fields: [
        {
          text: "Are you spending any significant time offsite and need transportation?",
          shortText: "Needs offsite transportation?",
          choices: [
            {
              text: "Are you spending any significant time offsite and need transportation?",
              shortText: "Needs offsite transportation?",
              label: "Choice A",
            },
          ],
          notApplicableAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          otherAnswer: {
            text: "Dietary Restriction - Other",
            shortText: "Dietary Preference - Other Allergies",
          },
          required: true,
        },
      ],
      maxScore: 20,
      totalSum: 45,
      minSelection: 1,
      maxSelection: 3,
      minDate: new RFCDate("2020-01-01"),
      maxDate: new RFCDate("2020-12-31"),
      showDateSelector: true,
      showCurrentDate: true,
      unitLabel: "miles",
      minLength: 5,
      maxLength: 100,
      customAnswerFormat: {
        id: 104,
      },
      supplierTypes: [
        "CVB",
        "HOTEL",
      ],
      classificationType: "MEETING_ROOM",
      order: 1,
      standardQuestion: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("rfpRequirementsUpdateRFPQuestion failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateRfpQuestionRequest](../../models/operations/updaterfpquestionrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.RfpQuestion](../../models/components/rfpquestion.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteRfpQuestion

Deletes an existing question from the specified RFP.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteRfpQuestion" method="delete" path="/rfps/{rfpId}/questions/{questionId}" -->
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
  await cventSDK.rfpRequirements.deleteRfpQuestion({
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { rfpRequirementsDeleteRFPQuestion } from "@cvent/sdk/funcs/rfpRequirementsDeleteRFPQuestion.js";

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
  const res = await rfpRequirementsDeleteRFPQuestion(cventSDK, {
    rfpId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    questionId: "a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("rfpRequirementsDeleteRFPQuestion failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteRfpQuestionRequest](../../models/operations/deleterfpquestionrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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
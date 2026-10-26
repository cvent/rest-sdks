# VenueLeads

## Overview

Manage inbound leads submitted to venues through Cvent's sourcing channels.

### Available Operations

* [createLeadCatcher](#createleadcatcher) - Create Lead Catcher
* [listLeadCatchersOverview](#listleadcatchersoverview) - List Lead Catchers Overview
* [updateLeadCatcher](#updateleadcatcher) - Update Lead Catcher
* [patchLeadCatcher](#patchleadcatcher) - Patch Lead Catcher
* [deleteLeadCatcher](#deleteleadcatcher) - Delete Lead Catcher
* [getLeadCatcherOverview](#getleadcatcheroverview) - Get Lead Catcher Overview

## createLeadCatcher

Creates a new lead catcher contact for the specified venue. Lead catchers receive email notifications when RFPs are submitted to the venue.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createLeadCatcher" method="post" path="/venues/{venueId}/lead-catchers" -->
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
  const result = await cventSDK.venueLeads.createLeadCatcher({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcher: {
      firstName: "Jane",
      lastName: "Smith",
      title: "Director of Sales",
      email: "jane.smith@example.com",
      phone: "+1-555-555-0101",
      fax: "+1-555-555-0101",
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
      },
      config: {
        supplierContactRole: "Sales Manager",
      },
      additionalInfo: "Preferred contact for APAC venues.",
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
import { venueLeadsCreateLeadCatcher } from "@cvent/sdk/funcs/venueLeadsCreateLeadCatcher.js";

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
  const res = await venueLeadsCreateLeadCatcher(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcher: {
      firstName: "Jane",
      lastName: "Smith",
      title: "Director of Sales",
      email: "jane.smith@example.com",
      phone: "+1-555-555-0101",
      fax: "+1-555-555-0101",
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
      },
      config: {
        supplierContactRole: "Sales Manager",
      },
      additionalInfo: "Preferred contact for APAC venues.",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueLeadsCreateLeadCatcher failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateLeadCatcherRequest](../../models/operations/createleadcatcherrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.CreateLeadCatcherResponse](../../models/operations/createleadcatcherresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## listLeadCatchersOverview

Returns a paginated, lightweight overview of the lead catchers for the specified venue,
containing only `id`, `firstName`, and `lastName` for each contact.

Use this endpoint to discover the `leadCatcherId` needed for PATCH, PUT, and DELETE.
The response does not include contact details such as email address or phone number.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="listLeadCatchersOverview" method="get" path="/venues/{venueId}/lead-catchers/overview" -->
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
  const result = await cventSDK.venueLeads.listLeadCatchersOverview({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
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
import { venueLeadsListLeadCatchersOverview } from "@cvent/sdk/funcs/venueLeadsListLeadCatchersOverview.js";

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
  const res = await venueLeadsListLeadCatchersOverview(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("venueLeadsListLeadCatchersOverview failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListLeadCatchersOverviewRequest](../../models/operations/listleadcatchersoverviewrequest.md)                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListLeadCatchersOverviewResponse](../../models/operations/listleadcatchersoverviewresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateLeadCatcher

Updates the given lead catcher for the specified venue, replacing the existing lead catcher data.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateLeadCatcher" method="put" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
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
  const result = await cventSDK.venueLeads.updateLeadCatcher({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "6e7d0d64-13f7-4472-8308-fa7067dba173",
    existingLeadCatcher: {
      firstName: "Jane",
      lastName: "Smith",
      title: "Director of Sales",
      email: "jane.smith@example.com",
      phone: "+1-555-555-0101",
      fax: "+1-555-555-0101",
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
      },
      config: {
        supplierContactRole: "Sales Manager",
      },
      additionalInfo: "Preferred contact for APAC venues.",
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
import { venueLeadsUpdateLeadCatcher } from "@cvent/sdk/funcs/venueLeadsUpdateLeadCatcher.js";

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
  const res = await venueLeadsUpdateLeadCatcher(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "6e7d0d64-13f7-4472-8308-fa7067dba173",
    existingLeadCatcher: {
      firstName: "Jane",
      lastName: "Smith",
      title: "Director of Sales",
      email: "jane.smith@example.com",
      phone: "+1-555-555-0101",
      fax: "+1-555-555-0101",
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
      },
      config: {
        supplierContactRole: "Sales Manager",
      },
      additionalInfo: "Preferred contact for APAC venues.",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueLeadsUpdateLeadCatcher failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateLeadCatcherRequest](../../models/operations/updateleadcatcherrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ExistingLeadCatcher](../../models/components/existingleadcatcher.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## patchLeadCatcher

Partially updates the specified lead catcher using JSON Merge Patch, as defined in [RFC 7396](https://www.rfc-editor.org/rfc/rfc7396.html).

- Only fields present in the request body are updated; omitted fields remain unchanged.
- Set a field to `null` to unset it.
- The response contains only the fields that were provided in the request payload.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="patchLeadCatcher" method="patch" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
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
  const result = await cventSDK.venueLeads.patchLeadCatcher({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "f72c984a-4f55-4563-90e5-7e34a3be1552",
    leadCatcherPatch: {
      firstName: "Jane",
      lastName: "Smith",
      title: "Director of Sales",
      email: "jane.smith@example.com",
      phone: "+1-555-0100",
      fax: "+1-555-0101",
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
      },
      locale: "en-US",
      config: {
        rfpEmailEnabled: true,
        pdfLinkEnabled: true,
        supplierContactRole: "roleName",
      },
      additionalInfo: "Preferred contact for APAC venues.",
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
import { venueLeadsPatchLeadCatcher } from "@cvent/sdk/funcs/venueLeadsPatchLeadCatcher.js";

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
  const res = await venueLeadsPatchLeadCatcher(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "f72c984a-4f55-4563-90e5-7e34a3be1552",
    leadCatcherPatch: {
      firstName: "Jane",
      lastName: "Smith",
      title: "Director of Sales",
      email: "jane.smith@example.com",
      phone: "+1-555-0100",
      fax: "+1-555-0101",
      address: {
        streetAddress1: "1234 Trap Road",
        streetAddress2: "Suite 100",
        city: "Vienna",
        zipPostalCode: "22182",
      },
      locale: "en-US",
      config: {
        rfpEmailEnabled: true,
        pdfLinkEnabled: true,
        supplierContactRole: "roleName",
      },
      additionalInfo: "Preferred contact for APAC venues.",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueLeadsPatchLeadCatcher failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.PatchLeadCatcherRequest](../../models/operations/patchleadcatcherrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.LeadCatcherPatch](../../models/components/leadcatcherpatch.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteLeadCatcher

Deletes the specified lead catcher for the venue.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteLeadCatcher" method="delete" path="/venues/{venueId}/lead-catchers/{leadCatcherId}" -->
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
  await cventSDK.venueLeads.deleteLeadCatcher({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "d7aa3fa0-4c8f-4353-9810-3984886b6a9d",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueLeadsDeleteLeadCatcher } from "@cvent/sdk/funcs/venueLeadsDeleteLeadCatcher.js";

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
  const res = await venueLeadsDeleteLeadCatcher(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "d7aa3fa0-4c8f-4353-9810-3984886b6a9d",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("venueLeadsDeleteLeadCatcher failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteLeadCatcherRequest](../../models/operations/deleteleadcatcherrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getLeadCatcherOverview

Retrieves a lightweight overview of a specific lead catcher for the specified venue,
containing only `id`, `firstName`, and `lastName`.

The response does not include contact details such as email address or phone number.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="getLeadCatcherOverview" method="get" path="/venues/{venueId}/lead-catchers/{leadCatcherId}/overview" -->
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
  const result = await cventSDK.venueLeads.getLeadCatcherOverview({
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "7de41b14-8083-46d4-91b6-5a3239d59277",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { venueLeadsGetLeadCatcherOverview } from "@cvent/sdk/funcs/venueLeadsGetLeadCatcherOverview.js";

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
  const res = await venueLeadsGetLeadCatcherOverview(cventSDK, {
    venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
    leadCatcherId: "7de41b14-8083-46d4-91b6-5a3239d59277",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("venueLeadsGetLeadCatcherOverview failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetLeadCatcherOverviewRequest](../../models/operations/getleadcatcheroverviewrequest.md)                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.LeadCatcherOverview](../../models/components/leadcatcheroverview.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |
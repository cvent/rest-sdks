# EventRole

## Overview

Event roles are event specific permission sets for your organization's users. Use these APIs to retrieve, create, update, and delete event role assignments to your organization's users.

### Available Operations

* [listEventRoleAssignment](#listeventroleassignment) - List Event Role Assignments
* [createEventRoleAssignment](#createeventroleassignment) - Assign Event Role
* [deleteEventRoleAssignment](#deleteeventroleassignment) - Unassign Event Role

## listEventRoleAssignment

Gets a paginated list of event role assignments associated with a single event.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="listEventRoleAssignment" method="get" path="/event-roles/assignments" -->
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
  const result = await cventSDK.eventRole.listEventRoleAssignment({
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    expand: [
      "eventRole",
    ],
    filter: "event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and user.id eq '6807e044-993b-428c-aec8-7316f13c1b95'",
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
import { eventRoleListEventRoleAssignment } from "@cvent/sdk/funcs/eventRoleListEventRoleAssignment.js";

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
  const res = await eventRoleListEventRoleAssignment(cventSDK, {
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    expand: [
      "eventRole",
    ],
    filter: "event.id eq '04ca6ae2-0dc3-487b-953e-86d6abbdf7d3' and user.id eq '6807e044-993b-428c-aec8-7316f13c1b95'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("eventRoleListEventRoleAssignment failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.ListEventRoleAssignmentRequest](../../models/operations/listeventroleassignmentrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.ListEventRoleAssignmentResponse](../../models/operations/listeventroleassignmentresponse.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.ErrorResponse12 | 400, 401, 403, 429     | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## createEventRoleAssignment

Assigns an event role to an account user or a no-login user for an event, using the details in the request body.

The optional `notification` object applies to both `ACCOUNT_USER` and `NO_LOGIN_USER`. If you omit the object,
omit `sendNotification`, or set it to `false`, the service sends no notification and still returns `201`.
When `sendNotification` is `true`, the service queues a notification email to the assignee after the assignment succeeds.

For a `NO_LOGIN_USER`, the service finds the user by `id` when it is sent, or else by `email`:
- If `id` and `email` are both sent and the email does not match that user, the service returns `400`.
- If no no-login user in the account has the email, the service returns `404`.
- If more than one no-login user in the account has the email, the service returns `409`. Send `id` instead.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage: accountUserWithNotification

<!-- UsageSnippet language="typescript" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="accountUserWithNotification" -->
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
  const result = await cventSDK.eventRole.createEventRoleAssignment({
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "ACCOUNT_USER",
      id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
    },
    notification: {
      sendNotification: true,
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
import { eventRoleCreateEventRoleAssignment } from "@cvent/sdk/funcs/eventRoleCreateEventRoleAssignment.js";

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
  const res = await eventRoleCreateEventRoleAssignment(cventSDK, {
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "ACCOUNT_USER",
      id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
    },
    notification: {
      sendNotification: true,
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("eventRoleCreateEventRoleAssignment failed:", res.error);
  }
}

run();
```
### Example Usage: accountUserWithoutNotification

<!-- UsageSnippet language="typescript" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="accountUserWithoutNotification" -->
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
  const result = await cventSDK.eventRole.createEventRoleAssignment({
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "ACCOUNT_USER",
      id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
    },
    notification: {
      sendNotification: false,
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
import { eventRoleCreateEventRoleAssignment } from "@cvent/sdk/funcs/eventRoleCreateEventRoleAssignment.js";

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
  const res = await eventRoleCreateEventRoleAssignment(cventSDK, {
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "ACCOUNT_USER",
      id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
    },
    notification: {
      sendNotification: false,
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("eventRoleCreateEventRoleAssignment failed:", res.error);
  }
}

run();
```
### Example Usage: noLoginUserByEmail

<!-- UsageSnippet language="typescript" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="noLoginUserByEmail" -->
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
  const result = await cventSDK.eventRole.createEventRoleAssignment({
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "NO_LOGIN_USER",
      email: "reviewer@example.com",
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
import { eventRoleCreateEventRoleAssignment } from "@cvent/sdk/funcs/eventRoleCreateEventRoleAssignment.js";

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
  const res = await eventRoleCreateEventRoleAssignment(cventSDK, {
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "NO_LOGIN_USER",
      email: "reviewer@example.com",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("eventRoleCreateEventRoleAssignment failed:", res.error);
  }
}

run();
```
### Example Usage: noLoginUserByIdWithNotification

<!-- UsageSnippet language="typescript" operationID="createEventRoleAssignment" method="post" path="/event-roles/assignments" example="noLoginUserByIdWithNotification" -->
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
  const result = await cventSDK.eventRole.createEventRoleAssignment({
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "NO_LOGIN_USER",
      id: "9f1b2c3d-4e5f-4a6b-8c7d-0e1f2a3b4c5d",
      email: "reviewer@example.com",
    },
    notification: {
      sendNotification: true,
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
import { eventRoleCreateEventRoleAssignment } from "@cvent/sdk/funcs/eventRoleCreateEventRoleAssignment.js";

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
  const res = await eventRoleCreateEventRoleAssignment(cventSDK, {
    event: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    eventRole: {
      id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
    },
    user: {
      type: "NO_LOGIN_USER",
      id: "9f1b2c3d-4e5f-4a6b-8c7d-0e1f2a3b4c5d",
      email: "reviewer@example.com",
    },
    notification: {
      sendNotification: true,
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("eventRoleCreateEventRoleAssignment failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.EventRoleAssignmentCreate](../../models/components/eventroleassignmentcreate.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.EventRoleAssignment](../../models/components/eventroleassignment.md)\>**

### Errors

| Error Type                                                 | Status Code                                                | Content Type                                               |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| errors.ErrorResponse12                                     | 400, 401, 403, 404, 409, 429                               | application/json                                           |
| errors.EventRoleAssignmentNotificationFailureResponseError | 503                                                        | application/json                                           |
| errors.APIError                                            | 4XX, 5XX                                                   | \*/\*                                                      |

## deleteEventRoleAssignment

Deletes an event role assignment identified by its composite assignment ID.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteEventRoleAssignment" method="delete" path="/event-roles/assignments/{assignmentId}" -->
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
  await cventSDK.eventRole.deleteEventRoleAssignment({
    assignmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::2b1a3bba-84b2-46f4-bddb-4b4a44442dcc::6807e044-993b-428c-aec8-7316f13c1b95",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { eventRoleDeleteEventRoleAssignment } from "@cvent/sdk/funcs/eventRoleDeleteEventRoleAssignment.js";

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
  const res = await eventRoleDeleteEventRoleAssignment(cventSDK, {
    assignmentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::2b1a3bba-84b2-46f4-bddb-4b4a44442dcc::6807e044-993b-428c-aec8-7316f13c1b95",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("eventRoleDeleteEventRoleAssignment failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteEventRoleAssignmentRequest](../../models/operations/deleteeventroleassignmentrequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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
# EventCredits

## Overview

Event Credits reward attendees for participating in your events. Planners can award credits for the entire event, specific sessions, or both. You can also award credits after attendees complete surveys. Use these APIs to retrieve credit details for your attendees.

### Available Operations

* [getAttendeeCredits](#getattendeecredits) - List Attendee Event Credits

## getAttendeeCredits

Gets a paginated list of attendee event credits in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getAttendeeCredits" method="get" path="/attendee-credits" -->
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
  const result = await cventSDK.eventCredits.getAttendeeCredits({
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    sort: "lastModified:DESC",
    expand: [
      "creditType",
    ],
    filter: "attendee.id eq '{UUID}'",
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
import { eventCreditsGetAttendeeCredits } from "@cvent/sdk/funcs/eventCreditsGetAttendeeCredits.js";

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
  const res = await eventCreditsGetAttendeeCredits(cventSDK, {
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    sort: "lastModified:DESC",
    expand: [
      "creditType",
    ],
    filter: "attendee.id eq '{UUID}'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("eventCreditsGetAttendeeCredits failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetAttendeeCreditsRequest](../../models/operations/getattendeecreditsrequest.md)                                                                                   | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetAttendeeCreditsResponse](../../models/operations/getattendeecreditsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse    | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |
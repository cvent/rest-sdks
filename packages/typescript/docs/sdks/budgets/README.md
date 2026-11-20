# Budgets

## Overview

Budget items and related configuration include planned expenses, [allocations](https://support.cvent.com/s/communityarticle/Setting-Up-Budget-Allocations), totals, custom fields, vendors, and currency conversion rates. Use these APIs to manage budget planning data and related account information.

### Available Operations

* [getAccountBudgetItems](#getaccountbudgetitems) - List Budget Items
* [getAccountVendors](#getaccountvendors) - List Account Vendors
* [getCurrencyConversionRate](#getcurrencyconversionrate) - List Currency Conversion Rates
* [createCurrencyConversionRate](#createcurrencyconversionrate) - Create Conversion Rate
* [updateCurrencyConversionRate](#updatecurrencyconversionrate) - Update Conversion Rate
* [deleteCurrencyConversionRate](#deletecurrencyconversionrate) - Delete Conversion Rate
* [getBudgetItems](#getbudgetitems) - List Event Budget Items
* [createBudgetItem](#createbudgetitem) - Create Budget Item
* [getBudgetAllocations](#getbudgetallocations) - List Budget Allocations
* [updateBudgetItem](#updatebudgetitem) - Update Budget Item
* [updateBudgetAllocations](#updatebudgetallocations) - Update Budget Allocations
* [deleteBudgetAllocations](#deletebudgetallocations) - Delete Budget Allocations
* [answerBudgetCustomField](#answerbudgetcustomfield) - Update Custom Field Answers
* [getEventBudgetTotals](#geteventbudgettotals) - List Budget Totals

## getAccountBudgetItems

Retrieves a paginated list of budget items across all events in your account. You can filter the data by the specified after and before date parameters, based on the last modified date, for a maximum duration of one year per request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getAccountBudgetItems" method="get" path="/budget-items" -->
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
  const result = await cventSDK.budgets.getAccountBudgetItems({
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "event.id eq 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5' and budgetVersion.id ne 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5'",
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
import { budgetsGetAccountBudgetItems } from "@cvent/sdk/funcs/budgetsGetAccountBudgetItems.js";

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
  const res = await budgetsGetAccountBudgetItems(cventSDK, {
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "event.id eq 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5' and budgetVersion.id ne 'e7120b27-ca4c-46c1-b5de-cbe5ea0e26d5'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("budgetsGetAccountBudgetItems failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetAccountBudgetItemsRequest](../../models/operations/getaccountbudgetitemsrequest.md)                                                                             | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetAccountBudgetItemsResponse](../../models/operations/getaccountbudgetitemsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getAccountVendors

Retrieves a paginated list of account-level budget vendors configured in Admin > Budget > Vendors for your account. Event-scoped vendors and CSN-only vendors are not included.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getAccountVendors" method="get" path="/budget-vendors" -->
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
  const result = await cventSDK.budgets.getAccountVendors({
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "active eq true and id eq '5b5a6e5c-1234-4af5-9d1f-9bcb9e7c1234' and lastModified ge '2025-01-01T00:00:00Z'",
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
import { budgetsGetAccountVendors } from "@cvent/sdk/funcs/budgetsGetAccountVendors.js";

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
  const res = await budgetsGetAccountVendors(cventSDK, {
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "active eq true and id eq '5b5a6e5c-1234-4af5-9d1f-9bcb9e7c1234' and lastModified ge '2025-01-01T00:00:00Z'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("budgetsGetAccountVendors failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetAccountVendorsRequest](../../models/operations/getaccountvendorsrequest.md)                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetAccountVendorsResponse](../../models/operations/getaccountvendorsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getCurrencyConversionRate

Retrieves a paginated list of conversion rates for a currency in an account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getCurrencyConversionRate" method="get" path="/currencies/{currency}/conversion-rates" -->
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
  const result = await cventSDK.budgets.getCurrencyConversionRate({
    currency: "USD",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    filter: "startDate eq '2020-02-07' ",
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
import { budgetsGetCurrencyConversionRate } from "@cvent/sdk/funcs/budgetsGetCurrencyConversionRate.js";

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
  const res = await budgetsGetCurrencyConversionRate(cventSDK, {
    currency: "USD",
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    filter: "startDate eq '2020-02-07' ",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("budgetsGetCurrencyConversionRate failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetCurrencyConversionRateRequest](../../models/operations/getcurrencyconversionraterequest.md)                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetCurrencyConversionRateResponse](../../models/operations/getcurrencyconversionrateresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createCurrencyConversionRate

Creates a conversion rate for a currency in an account using the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createCurrencyConversionRate" method="post" path="/currencies/{currency}/conversion-rates" -->
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
  const result = await cventSDK.budgets.createCurrencyConversionRate({
    currency: "USD",
    currencyConversionRate: {
      conversionRate: 5.2,
      startDate: new RFCDate("2020-02-07"),
      endDate: new RFCDate("2020-02-08"),
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
import { budgetsCreateCurrencyConversionRate } from "@cvent/sdk/funcs/budgetsCreateCurrencyConversionRate.js";
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
  const res = await budgetsCreateCurrencyConversionRate(cventSDK, {
    currency: "USD",
    currencyConversionRate: {
      conversionRate: 5.2,
      startDate: new RFCDate("2020-02-07"),
      endDate: new RFCDate("2020-02-08"),
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("budgetsCreateCurrencyConversionRate failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateCurrencyConversionRateRequest](../../models/operations/createcurrencyconversionraterequest.md)                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.CurrencyConversionRateResponse](../../models/components/currencyconversionrateresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateCurrencyConversionRate

Updates a conversion rate for a currency in an account using the details provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateCurrencyConversionRate" method="put" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
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
  const result = await cventSDK.budgets.updateCurrencyConversionRate({
    currency: "USD",
    conversionRateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    currencyConversionRateRequest: {
      conversionRate: 5.2,
      startDate: new RFCDate("2020-02-07"),
      endDate: new RFCDate("2020-02-08"),
      id: "9463c74e-18c6-401a-a710-ae0f485bf959",
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
import { budgetsUpdateCurrencyConversionRate } from "@cvent/sdk/funcs/budgetsUpdateCurrencyConversionRate.js";
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
  const res = await budgetsUpdateCurrencyConversionRate(cventSDK, {
    currency: "USD",
    conversionRateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    currencyConversionRateRequest: {
      conversionRate: 5.2,
      startDate: new RFCDate("2020-02-07"),
      endDate: new RFCDate("2020-02-08"),
      id: "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("budgetsUpdateCurrencyConversionRate failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateCurrencyConversionRateRequest](../../models/operations/updatecurrencyconversionraterequest.md)                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.CurrencyConversionRateResponse](../../models/components/currencyconversionrateresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteCurrencyConversionRate

Deletes a conversion rate defined for a currency.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteCurrencyConversionRate" method="delete" path="/currencies/{currency}/conversion-rates/{conversionRateId}" -->
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
  await cventSDK.budgets.deleteCurrencyConversionRate({
    currency: "USD",
    conversionRateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { budgetsDeleteCurrencyConversionRate } from "@cvent/sdk/funcs/budgetsDeleteCurrencyConversionRate.js";

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
  const res = await budgetsDeleteCurrencyConversionRate(cventSDK, {
    currency: "USD",
    conversionRateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("budgetsDeleteCurrencyConversionRate failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteCurrencyConversionRateRequest](../../models/operations/deletecurrencyconversionraterequest.md)                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
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

## getBudgetItems

Retrieves a paginated list of budget items for an event in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getBudgetItems" method="get" path="/events/{id}/budget-items" -->
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
  const result = await cventSDK.budgets.getBudgetItems({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "category.name eq 'Accommodation' and status ne 'Estimated'",
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
import { budgetsGetBudgetItems } from "@cvent/sdk/funcs/budgetsGetBudgetItems.js";

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
  const res = await budgetsGetBudgetItems(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "category.name eq 'Accommodation' and status ne 'Estimated'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("budgetsGetBudgetItems failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetBudgetItemsRequest](../../models/operations/getbudgetitemsrequest.md)                                                                                           | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetBudgetItemsResponse](../../models/operations/getbudgetitemsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## createBudgetItem

Creates a single budget item using the values provided in the request body.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createBudgetItem" method="post" path="/events/{id}/budget-items" -->
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
  const result = await cventSDK.budgets.createBudgetItem({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItem: {
      costType: "FIXED",
      name: "Airport Transportation",
      code: "AIRTRP",
      category: {
        id: 3,
      },
      subCategory: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      status: "ESTIMATED",
      vendor: {
        id: "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
      },
      date: new Date("2020-02-07T00:00:00.00Z"),
      generalLedger: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      costAvoidance: {
        amount: 99.5,
        description: "Discounted Cost",
      },
      costIncludesTaxGratuity: true,
      calculateTaxOnGratuity: false,
      gratuityType: "PERCENTAGE",
      internalNote: "This item is inclusive of taxes.",
      currency: "USD",
      conversionRateLocked: true,
      conversionRate: 5.2,
      costDetail: [
        {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          units: 5.2,
          cost: 100.5,
          gratuityDetail: {
            gratuity: 5.2,
          },
          taxDetail: [
            {
              id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
              taxType: "PERCENTAGE",
              tax: 5.2,
            },
          ],
        },
      ],
      associatedRegistrants: [
        {
          inviteeId: "7cc5304a-9323-452f-8ae8-111cae0047b0",
          contactId: "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
        },
      ],
      associatedSession: "9463c74e-18c6-401a-a710-ae0f485bf959",
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
import { budgetsCreateBudgetItem } from "@cvent/sdk/funcs/budgetsCreateBudgetItem.js";

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
  const res = await budgetsCreateBudgetItem(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItem: {
      costType: "FIXED",
      name: "Airport Transportation",
      code: "AIRTRP",
      category: {
        id: 3,
      },
      subCategory: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      status: "ESTIMATED",
      vendor: {
        id: "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
      },
      date: new Date("2020-02-07T00:00:00.00Z"),
      generalLedger: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      costAvoidance: {
        amount: 99.5,
        description: "Discounted Cost",
      },
      costIncludesTaxGratuity: true,
      calculateTaxOnGratuity: false,
      gratuityType: "PERCENTAGE",
      internalNote: "This item is inclusive of taxes.",
      currency: "USD",
      conversionRateLocked: true,
      conversionRate: 5.2,
      costDetail: [
        {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          units: 5.2,
          cost: 100.5,
          gratuityDetail: {
            gratuity: 5.2,
          },
          taxDetail: [
            {
              id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
              taxType: "PERCENTAGE",
              tax: 5.2,
            },
          ],
        },
      ],
      associatedRegistrants: [
        {
          inviteeId: "7cc5304a-9323-452f-8ae8-111cae0047b0",
          contactId: "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
        },
      ],
      associatedSession: "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("budgetsCreateBudgetItem failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.CreateBudgetItemRequest](../../models/operations/createbudgetitemrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BudgetItemResponse](../../models/components/budgetitemresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getBudgetAllocations

Retrieves a paginated list of budget allocations for all budget items within an event.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getBudgetAllocations" method="get" path="/events/{id}/budget-items/allocations" -->
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
  const result = await cventSDK.budgets.getBudgetAllocations({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "category.id eq 'e9ee2669-65db-46f8-872c-dbafbf9b0e92' or value lt 1000",
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
import { budgetsGetBudgetAllocations } from "@cvent/sdk/funcs/budgetsGetBudgetAllocations.js";

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
  const res = await budgetsGetBudgetAllocations(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "category.id eq 'e9ee2669-65db-46f8-872c-dbafbf9b0e92' or value lt 1000",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("budgetsGetBudgetAllocations failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetBudgetAllocationsRequest](../../models/operations/getbudgetallocationsrequest.md)                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetBudgetAllocationsResponse](../../models/operations/getbudgetallocationsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateBudgetItem

Updates a single budget item using the details provided in the body of the request.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateBudgetItem" method="put" path="/events/{id}/budget-items/{budgetItemId}" -->
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
  const result = await cventSDK.budgets.updateBudgetItem({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItem: {
      costType: "FIXED",
      name: "Airport Transportation",
      code: "AIRTRP",
      category: {
        id: 3,
      },
      subCategory: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      status: "ESTIMATED",
      vendor: {
        id: "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
      },
      date: new Date("2020-02-07T00:00:00.00Z"),
      generalLedger: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      costAvoidance: {
        amount: 99.5,
        description: "Discounted Cost",
      },
      costIncludesTaxGratuity: true,
      calculateTaxOnGratuity: false,
      gratuityType: "PERCENTAGE",
      internalNote: "This item is inclusive of taxes.",
      currency: "USD",
      conversionRateLocked: true,
      conversionRate: 5.2,
      costDetail: [
        {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          units: 5.2,
          cost: 100.5,
          gratuityDetail: {
            gratuity: 5.2,
          },
          taxDetail: [
            {
              id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
              taxType: "PERCENTAGE",
              tax: 5.2,
            },
          ],
        },
      ],
      associatedRegistrants: [
        {
          inviteeId: "7cc5304a-9323-452f-8ae8-111cae0047b0",
          contactId: "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
        },
      ],
      associatedSession: "9463c74e-18c6-401a-a710-ae0f485bf959",
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
import { budgetsUpdateBudgetItem } from "@cvent/sdk/funcs/budgetsUpdateBudgetItem.js";

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
  const res = await budgetsUpdateBudgetItem(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItem: {
      costType: "FIXED",
      name: "Airport Transportation",
      code: "AIRTRP",
      category: {
        id: 3,
      },
      subCategory: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      status: "ESTIMATED",
      vendor: {
        id: "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
      },
      date: new Date("2020-02-07T00:00:00.00Z"),
      generalLedger: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      costAvoidance: {
        amount: 99.5,
        description: "Discounted Cost",
      },
      costIncludesTaxGratuity: true,
      calculateTaxOnGratuity: false,
      gratuityType: "PERCENTAGE",
      internalNote: "This item is inclusive of taxes.",
      currency: "USD",
      conversionRateLocked: true,
      conversionRate: 5.2,
      costDetail: [
        {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          units: 5.2,
          cost: 100.5,
          gratuityDetail: {
            gratuity: 5.2,
          },
          taxDetail: [
            {
              id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
              taxType: "PERCENTAGE",
              tax: 5.2,
            },
          ],
        },
      ],
      associatedRegistrants: [
        {
          inviteeId: "7cc5304a-9323-452f-8ae8-111cae0047b0",
          contactId: "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
        },
      ],
      associatedSession: "9463c74e-18c6-401a-a710-ae0f485bf959",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("budgetsUpdateBudgetItem failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateBudgetItemRequest](../../models/operations/updatebudgetitemrequest.md)                                                                                       | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BudgetItemResponse](../../models/components/budgetitemresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## updateBudgetAllocations

Bulk add or update budget allocations in a budget item. If budget allocations already exist for the budget item, they will be updated.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="updateBudgetAllocations" method="put" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
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
  const result = await cventSDK.budgets.updateBudgetAllocations({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetAllocationsList: {
      allocateBy: "AMOUNT",
      allocations: [],
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
import { budgetsUpdateBudgetAllocations } from "@cvent/sdk/funcs/budgetsUpdateBudgetAllocations.js";

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
  const res = await budgetsUpdateBudgetAllocations(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetAllocationsList: {
      allocateBy: "AMOUNT",
      allocations: [],
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("budgetsUpdateBudgetAllocations failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.UpdateBudgetAllocationsRequest](../../models/operations/updatebudgetallocationsrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.BudgetAllocationsList](../../models/components/budgetallocationslist.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## deleteBudgetAllocations

Deletes all budget allocations for a budget item.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="deleteBudgetAllocations" method="delete" path="/events/{id}/budget-items/{budgetItemId}/allocations" -->
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
  await cventSDK.budgets.deleteBudgetAllocations({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });


}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { budgetsDeleteBudgetAllocations } from "@cvent/sdk/funcs/budgetsDeleteBudgetAllocations.js";

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
  const res = await budgetsDeleteBudgetAllocations(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  });
  if (res.ok) {
    const { value: result } = res;
    
  } else {
    console.log("budgetsDeleteBudgetAllocations failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.DeleteBudgetAllocationsRequest](../../models/operations/deletebudgetallocationsrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<void\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 401, 403, 404, 409, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## answerBudgetCustomField

Updates answers to a budget custom field using the details you provided in the body of the request. Answers must be formatted correctly according to the specific type of custom field. The available fields and their formats are listed below:
* **Open Ended Text - Date/Time**. This field type has several possible user-selected answer formats:
  - Date/Time (2022-01-01T12:00:00.000Z). Denoted by *DateTime* in the response payload.
  - Date (2022-01-01). Denoted by *Date* in the response payload.
* **Open Ended Text - One Line**. This field type has several possible user-selected answer formats:
  - General (Text). Denoted by *General* in the response payload.
  - Number (Whole numbers, 10, -10). Denoted by *Number* in the response payload.
  - Currency (Positive decimal value, 10.5). Denoted by *Currency* in the response payload.
  - Decimal (-20.5). Denoted by *Decimal* in the response payload.
  - US Phone Number (123-456-7890). Denoted by *USPhoneNumber* in the response payload.
  - Email Address (h.potterfield@example.com). Denoted by *Email* in the response payload.
* **Open Ended Text - Comment Box**. Answer format is free-text (any value). Denoted by *FreeText* in the
    response payload.
* **Choice - Single Answer (Drop-Down, Vertical, Horizontal).** Answer format is exactly one response to a
    list of user-defined choices. Denoted by *SingleSelect* in the response payload.
* **Choice - Multiple Answers (Multi-Select Box, Vertical, Horizontal).** Answer format is one or more
    responses from a list of user-defined choices. Denoted by *MultiSelect* in the response payload.

To delete a custom field answer, either omit the `value` parameter or provide an empty list of answers for the specified custom field ID.


More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="answerBudgetCustomField" method="put" path="/events/{id}/budget-items/{budgetItemId}/custom-fields/{customFieldId}/answers" -->
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
  const result = await cventSDK.budgets.answerBudgetCustomField({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customField: {
      id: "a8f94915-b3db-4fb7-8ac8-2da89a9ce3f6",
      value: [
        "Choice C",
        "Choice A",
      ],
      type: "General",
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
import { budgetsAnswerBudgetCustomField } from "@cvent/sdk/funcs/budgetsAnswerBudgetCustomField.js";

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
  const res = await budgetsAnswerBudgetCustomField(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    customField: {
      id: "a8f94915-b3db-4fb7-8ac8-2da89a9ce3f6",
      value: [
        "Choice C",
        "Choice A",
      ],
      type: "General",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("budgetsAnswerBudgetCustomField failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.AnswerBudgetCustomFieldRequest](../../models/operations/answerbudgetcustomfieldrequest.md)                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.CustomField](../../models/components/customfield.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |

## getEventBudgetTotals

Retrieves a paginated list of budget totals for an event in your account.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="getEventBudgetTotals" method="get" path="/events/{id}/budget-totals" -->
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
  const result = await cventSDK.budgets.getEventBudgetTotals({
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "version.name eq 'Test version' and version.id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'",
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
import { budgetsGetEventBudgetTotals } from "@cvent/sdk/funcs/budgetsGetEventBudgetTotals.js";

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
  const res = await budgetsGetEventBudgetTotals(cventSDK, {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    after: new Date("2017-01-02T02:00:00Z"),
    before: new Date("2017-01-02T02:00:00Z"),
    token: "0e28af57-511f-47ab-ae46-46cd1ca51a1a",
    filter: "version.name eq 'Test version' and version.id eq '1b3a755a-d440-498d-baab-30f45dae3cf5'",
  });
  if (res.ok) {
    const { value: result } = res;
    for await (const page of result) {
    console.log(page);
  }
  } else {
    console.log("budgetsGetEventBudgetTotals failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.GetEventBudgetTotalsRequest](../../models/operations/geteventbudgettotalsrequest.md)                                                                               | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.GetEventBudgetTotalsResponse](../../models/operations/geteventbudgettotalsresponse.md)\>**

### Errors

| Error Type              | Status Code             | Content Type            |
| ----------------------- | ----------------------- | ----------------------- |
| errors.ErrorResponse12  | 400, 401, 403, 404, 429 | application/json        |
| errors.APIError         | 4XX, 5XX                | \*/\*                   |
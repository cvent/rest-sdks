# CardTokens

## Overview

**Card Tokenization**: Tokenization is the process Cvent uses to collect sensitive card details and
personally identifiable information (PII), directly from your customers in a secure manner.
This guarantees that no sensitive card data touches your server, and allows your integration to
operate in compliance with PCI standards. A card token is a unique identifier that represents sensitive credit card information.
It is used as a secure alternative to directly handling credit card details during transactions.
The token can be used in place of the actual credit card data when making API calls, providing an extra layer of security.


### Available Operations

* [createCardTokens](#createcardtokens) - Create a Credit Card Token

## createCardTokens

Creates a short-lived token representing a credit card. This token replaces the credit card in API methods. It can be used multiple times within a 15-minute time-to-live (TTL) period. After 15 minutes, the token will expire and can no longer be used. If the same credit card is needed to perform additional API methods after the 15-minute TTL, the card will need to be resubmitted for another short-lived token.

### Example Usage

<!-- UsageSnippet language="typescript" operationID="createCardTokens" method="post" path="/card-tokens" -->
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
  const result = await cventSDK.cardTokens.createCardTokens({
    creditCard: {
      accountHolderName: "John Doe",
      expMonth: 11,
      expYear: 2026,
      cvv: "123",
      addressLine1: "123 Main Street",
      addressLine2: "First Floor",
      addressLine3: "Apt 101",
      addressCity: "McLean",
      addressStateProvince: "VA",
      addressPostalCode: "12345",
      addressCountry: "USA",
      addressCountryAlpha2: "US",
      contactPhone: "910-999-9999",
      email: "jdoe@example.com",
      number: "4111111111111111",
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
import { cardTokensCreateCardTokens } from "@cvent/sdk/funcs/cardTokensCreateCardTokens.js";

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
  const res = await cardTokensCreateCardTokens(cventSDK, {
    creditCard: {
      accountHolderName: "John Doe",
      expMonth: 11,
      expYear: 2026,
      cvv: "123",
      addressLine1: "123 Main Street",
      addressLine2: "First Floor",
      addressLine3: "Apt 101",
      addressCity: "McLean",
      addressStateProvince: "VA",
      addressPostalCode: "12345",
      addressCountry: "USA",
      addressCountryAlpha2: "US",
      contactPhone: "910-999-9999",
      email: "jdoe@example.com",
      number: "4111111111111111",
    },
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("cardTokensCreateCardTokens failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [components.CardTokenRequest](../../models/components/cardtokenrequest.md)                                                                                                     | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |
| `options.serverURL`                                                                                                                                                            | *string*                                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                             | An optional server URL to use.                                                                                                                                                 |

### Response

**Promise\<[components.CardTokenResponse](../../models/components/cardtokenresponse.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |
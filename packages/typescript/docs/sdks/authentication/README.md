# Authentication

## Overview

Available endpoints used to initiate an authentication request to obtain and validate an access token.

### Available Operations

* [oauth2Authorize](#oauth2authorize) - Authorize
* [oauth2Token](#oauth2token) - Token
* [validateToken](#validatetoken) - Validate Token

## oauth2Authorize

The /oauth2/authorize endpoint only supports HTTPS GET. The client typically makes this request through a browser.

The authorization server requires HTTPS instead of HTTP as the protocol when accessing the authorization endpoint
except for http://localhost for testing purposes only.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="oauth2Authorize" method="get" path="/oauth2/authorize" -->
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
  const result = await cventSDK.authentication.oauth2Authorize({
    responseType: "code",
    clientId: "ad398u21ijw3s9w3939",
    redirectUri: "https://example.com/redirect",
    state: "STATE",
    scope: "event/events:read event/attendees:read",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { authenticationOauth2Authorize } from "@cvent/sdk/funcs/authenticationOauth2Authorize.js";

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
  const res = await authenticationOauth2Authorize(cventSDK, {
    responseType: "code",
    clientId: "ad398u21ijw3s9w3939",
    redirectUri: "https://example.com/redirect",
    state: "STATE",
    scope: "event/events:read event/attendees:read",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("authenticationOauth2Authorize failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.Oauth2AuthorizeRequest](../../models/operations/oauth2authorizerequest.md)                                                                                         | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.Oauth2AuthorizeResponse](../../models/operations/oauth2authorizeresponse.md)\>**

### Errors

| Error Type      | Status Code     | Content Type    |
| --------------- | --------------- | --------------- |
| errors.APIError | 4XX, 5XX        | \*/\*           |

## oauth2Token

Obtains an Access Token, an ID Token, and optionally, a Refresh Token. Read the [Developer Quickstart](/docs/rest-api/tutorials/developer-quickstart) for an example request.

**Note:** The token endpoint returns refresh_token only when the grant_type is authorization_code.


### Example Usage

<!-- UsageSnippet language="typescript" operationID="oauth2Token" method="post" path="/oauth2/token" -->
```typescript
import { CventSDK } from "@cvent/sdk";

const cventSDK = new CventSDK();

async function run() {
  const result = await cventSDK.authentication.oauth2Token({
    username: "",
    password: "",
  }, {
    grantType: "client_credentials",
    clientId: "djc98u3jiedmi283eu928",
    scope: "event/events:read event/attendees:read",
    redirectUri: "https://example.com/redirect",
    refreshToken: "dn43ud8uj32nk2je",
    code: "AUTHORIZATION_CODE",
  });

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { authenticationOauth2Token } from "@cvent/sdk/funcs/authenticationOauth2Token.js";

// Use `CventSDKCore` for best tree-shaking performance.
// You can create one instance of it to use across an application.
const cventSDK = new CventSDKCore();

async function run() {
  const res = await authenticationOauth2Token(cventSDK, {
    username: "",
    password: "",
  }, {
    grantType: "client_credentials",
    clientId: "djc98u3jiedmi283eu928",
    scope: "event/events:read event/attendees:read",
    redirectUri: "https://example.com/redirect",
    refreshToken: "dn43ud8uj32nk2je",
    code: "AUTHORIZATION_CODE",
  });
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("authenticationOauth2Token failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                                      | [operations.Oauth2TokenRequest](../../models/operations/oauth2tokenrequest.md)                                                                                                 | :heavy_check_mark:                                                                                                                                                             | The request object to use for the request.                                                                                                                                     |
| `security`                                                                                                                                                                     | [operations.Oauth2TokenSecurity](../../models/operations/oauth2tokensecurity.md)                                                                                               | :heavy_check_mark:                                                                                                                                                             | The security requirements to use for the request.                                                                                                                              |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[operations.Oauth2TokenResponse](../../models/operations/oauth2tokenresponse.md)\>**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| errors.BadRequestError | 400                    | application/json       |
| errors.APIError        | 4XX, 5XX               | \*/\*                  |

## validateToken

Verifies presented authentication token is valid.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="typescript" operationID="validateToken" method="get" path="/token-validation" -->
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
  const result = await cventSDK.authentication.validateToken();

  console.log(result);
}

run();
```

### Standalone function

The standalone function version of this method:

```typescript
import { CventSDKCore } from "@cvent/sdk/core.js";
import { authenticationValidateToken } from "@cvent/sdk/funcs/authenticationValidateToken.js";

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
  const res = await authenticationValidateToken(cventSDK);
  if (res.ok) {
    const { value: result } = res;
    console.log(result);
  } else {
    console.log("authenticationValidateToken failed:", res.error);
  }
}

run();
```

### Parameters

| Parameter                                                                                                                                                                      | Type                                                                                                                                                                           | Required                                                                                                                                                                       | Description                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `options`                                                                                                                                                                      | RequestOptions                                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                             | Used to set various options for making HTTP requests.                                                                                                                          |
| `options.fetchOptions`                                                                                                                                                         | [RequestInit](https://developer.mozilla.org/en-US/docs/Web/API/Request/Request#options)                                                                                        | :heavy_minus_sign:                                                                                                                                                             | Options that are passed to the underlying HTTP request. This can be used to inject extra headers for examples. All `Request` options, except `method` and `body`, are allowed. |
| `options.retries`                                                                                                                                                              | [RetryConfig](../../lib/utils/retryconfig.md)                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                             | Enables retrying HTTP requests under certain failure conditions.                                                                                                               |

### Response

**Promise\<[components.ValidToken](../../models/components/validtoken.md)\>**

### Errors

| Error Type           | Status Code          | Content Type         |
| -------------------- | -------------------- | -------------------- |
| errors.ErrorResponse | 400, 401, 403, 429   | application/json     |
| errors.APIError      | 4XX, 5XX             | \*/\*                |
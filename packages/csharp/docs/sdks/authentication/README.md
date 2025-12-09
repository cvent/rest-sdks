# Authentication

## Overview

Available endpoints used to initiate an authentication request to obtain and validate an access token.

### Available Operations

* [Oauth2Authorize](#oauth2authorize) - Authorize
* [Oauth2Token](#oauth2token) - Token
* [ValidateToken](#validatetoken) - Validate Token

## Oauth2Authorize

The /oauth2/authorize endpoint only supports HTTPS GET. The client typically makes this request through a browser.

The authorization server requires HTTPS instead of HTTP as the protocol when accessing the authorization endpoint
except for http://localhost for testing purposes only.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="oauth2Authorize" method="get" path="/oauth2/authorize" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

Oauth2AuthorizeRequest req = new Oauth2AuthorizeRequest() {
    ResponseType = ResponseType.Code,
    ClientId = "ad398u21ijw3s9w3939",
    RedirectUri = "https://example.com/redirect",
    State = "STATE",
    Scope = "event/events:read event/attendees:read",
};

var res = await sdk.Authentication.Oauth2AuthorizeAsync(req);

// handle response
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [Oauth2AuthorizeRequest](../../Models/Requests/Oauth2AuthorizeRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[Oauth2AuthorizeResponse](../../Models/Requests/Oauth2AuthorizeResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| Cvent.SDK.Models.Errors.APIException | 4XX, 5XX                             | \*/\*                                |

## Oauth2Token

Obtains an Access Token, an ID Token, and optionally, a Refresh Token. Read the [Developer Quickstart](/docs/rest-api/tutorials/developer-quickstart) for an example request.

**Note:** The token endpoint returns refresh_token only when the grant_type is authorization_code.


### Example Usage

<!-- UsageSnippet language="csharp" operationID="oauth2Token" method="post" path="/oauth2/token" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Requests;

var sdk = new CventSDK();

Oauth2TokenRequest req = new Oauth2TokenRequest() {
    GrantType = GrantType.ClientCredentials,
    ClientId = "djc98u3jiedmi283eu928",
    Scope = "event/events:read event/attendees:read",
    RedirectUri = "https://example.com/redirect",
    RefreshToken = "dn43ud8uj32nk2je",
    Code = "AUTHORIZATION_CODE",
};

var res = await sdk.Authentication.Oauth2TokenAsync(
    security: new Oauth2TokenSecurity() {
        Username = "",
        Password = "",
    },
    request: req
);

// handle response
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [Oauth2TokenRequest](../../Models/Requests/Oauth2TokenRequest.md)   | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `security`                                                          | [Oauth2TokenSecurity](../../Models/Requests/Oauth2TokenSecurity.md) | :heavy_check_mark:                                                  | The security requirements to use for the request.                   |

### Response

**[Oauth2TokenResponse](../../Models/Requests/Oauth2TokenResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| Cvent.SDK.Models.Errors.BadRequestException | 400                                         | application/json                            |
| Cvent.SDK.Models.Errors.APIException        | 4XX, 5XX                                    | \*/\*                                       |

## ValidateToken

Verifies presented authentication token is valid.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="csharp" operationID="validateToken" method="get" path="/token-validation" -->
```csharp
using Cvent.SDK;
using Cvent.SDK.Models.Components;

var sdk = new CventSDK(security: new Security() {
    OAuth2ClientCredentials = new SchemeOAuth2ClientCredentials() {
        ClientID = "<YOUR_CLIENT_ID_HERE>",
        ClientSecret = "<YOUR_CLIENT_SECRET_HERE>",
        TokenURL = "<YOUR_TOKEN_URL_HERE>",
        Scopes = "<YOUR_SCOPES_HERE>",
    },
});

var res = await sdk.Authentication.ValidateTokenAsync();

// handle response
```

### Response

**[ValidateTokenResponse](../../Models/Requests/ValidateTokenResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| Cvent.SDK.Models.Errors.ErrorResponse | 400, 401, 403, 429                    | application/json                      |
| Cvent.SDK.Models.Errors.APIException  | 4XX, 5XX                              | \*/\*                                 |
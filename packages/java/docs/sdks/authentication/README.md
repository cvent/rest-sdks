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

<!-- UsageSnippet language="java" operationID="oauth2Authorize" method="get" path="/oauth2/authorize" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        Oauth2AuthorizeRequest req = Oauth2AuthorizeRequest.builder()
                .responseType(ResponseType.CODE)
                .clientId("ad398u21ijw3s9w3939")
                .redirectUri("https://example.com/redirect")
                .state("STATE")
                .scope("event/events:read event/attendees:read")
                .build();

        Oauth2AuthorizeResponse res = sdk.authentication().oauth2Authorize()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [Oauth2AuthorizeRequest](../../models/operations/Oauth2AuthorizeRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[Oauth2AuthorizeResponse](../../models/operations/Oauth2AuthorizeResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## oauth2Token

Obtains an Access Token, an ID Token, and optionally, a Refresh Token. Read the [Developer Quickstart](/docs/rest-api/tutorials/developer-quickstart) for an example request.

**Note:** The token endpoint returns refresh_token only when the grant_type is authorization_code.


### Example Usage

<!-- UsageSnippet language="java" operationID="oauth2Token" method="post" path="/oauth2/token" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.errors.BadRequestException;
import com.cvent.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequestException, Exception {

        CventSDK sdk = CventSDK.builder()
            .build();

        Oauth2TokenRequest req = Oauth2TokenRequest.builder()
                .grantType(GrantType.CLIENT_CREDENTIALS)
                .clientId("djc98u3jiedmi283eu928")
                .scope("event/events:read event/attendees:read")
                .redirectUri("https://example.com/redirect")
                .refreshToken("dn43ud8uj32nk2je")
                .code("AUTHORIZATION_CODE")
                .build();

        Oauth2TokenResponse res = sdk.authentication().oauth2Token()
                .request(req)
                .security(Oauth2TokenSecurity.builder()
                    .username("")
                    .password("")
                    .build())
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [Oauth2TokenRequest](../../models/operations/Oauth2TokenRequest.md)                               | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |
| `security`                                                                                        | [com.cvent.models.operations.Oauth2TokenSecurity](../../models/operations/Oauth2TokenSecurity.md) | :heavy_check_mark:                                                                                | The security requirements to use for the request.                                                 |

### Response

**[Oauth2TokenResponse](../../models/operations/Oauth2TokenResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/BadRequestException | 400                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## validateToken

Verifies presented authentication token is valid.

More about OAuth2 authorization code support for administrators
<#oauth2-auth-code-planner-admin>

### Example Usage

<!-- UsageSnippet language="java" operationID="validateToken" method="get" path="/token-validation" -->
```java
package hello.world;

import com.cvent.CventSDK;
import com.cvent.models.components.SchemeOAuth2ClientCredentials;
import com.cvent.models.components.Security;
import com.cvent.models.errors.ErrorResponse;
import com.cvent.models.operations.ValidateTokenResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        CventSDK sdk = CventSDK.builder()
                .security(Security.builder()
                    .oAuth2ClientCredentials(SchemeOAuth2ClientCredentials.builder()
                        .clientID("<id>")
                        .clientSecret("<value>")
                        .tokenURL("https://api-platform.cvent.com/ea/oauth2/token")
                        .scopes(List.of(System.getenv().getOrDefault("SCOPES", "")))
                        .build())
                    .build())
            .build();

        ValidateTokenResponse res = sdk.authentication().validateToken()
                .call();

        if (res.validToken().isPresent()) {
            System.out.println(res.validToken().get());
        }
    }
}
```

### Response

**[ValidateTokenResponse](../../models/operations/ValidateTokenResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 429          | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |
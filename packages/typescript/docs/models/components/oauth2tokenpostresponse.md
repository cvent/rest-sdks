# Oauth2TokenPostResponse

## Example Usage

```typescript
import { Oauth2TokenPostResponse } from "@cvent/sdk/models/components";

let value: Oauth2TokenPostResponse = {
  accessToken: "eyJz9sdfsdfsdfsd",
  refreshToken: "dn43ud8uj32nk2je",
  tokenType: "Bearer",
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `accessToken`                                                                                    | *string*                                                                                         | :heavy_check_mark:                                                                               | The access token contains scopes and groups and is used to grant access to authorized resources. | eyJz9sdfsdfsdfsd                                                                                 |
| `refreshToken`                                                                                   | *string*                                                                                         | :heavy_minus_sign:                                                                               | The refresh token contains the information necessary to obtain a new access token.               | dn43ud8uj32nk2je                                                                                 |
| `tokenType`                                                                                      | *string*                                                                                         | :heavy_check_mark:                                                                               | The OAuth2 token type. Always `Bearer`.                                                          | Bearer                                                                                           |
| `expiresIn`                                                                                      | *number*                                                                                         | :heavy_minus_sign:                                                                               | The lifetime in seconds of the access token.                                                     | 3600                                                                                             |
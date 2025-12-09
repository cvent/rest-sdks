# Oauth2TokenResponse

A successful response returning an access token and a possible refresh token.

## Example Usage

```typescript
import { Oauth2TokenResponse } from "@cvent/sdk/models/operations";

let value: Oauth2TokenResponse = {
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
| `tokenType`                                                                                      | *string*                                                                                         | :heavy_check_mark:                                                                               | The token type.                                                                                  | Bearer                                                                                           |
| `expiresIn`                                                                                      | *number*                                                                                         | :heavy_minus_sign:                                                                               | The lifetime in seconds of the access token.                                                     | 3600                                                                                             |
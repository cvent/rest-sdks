# AuthenticationSchemaJson

Authentication Schema

## Example Usage

```typescript
import { AuthenticationSchemaJson } from "@cvent/sdk/models/components";

let value: AuthenticationSchemaJson = {
  name: "OAuth Bearer Token",
  description: "Authentication scheme using the OAuth Bearer Token Standard",
  specUri: "https://developers.cvent.com/documentation#section/Introduction",
  documentationUri:
    "https://developers.cvent.com/documentation#section/Introduction",
  type: "oauthbearertoken",
  primary: true,
};
```

## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `name`                                                          | *string*                                                        | :heavy_minus_sign:                                              | The name of the authentication.                                 | OAuth Bearer Token                                              |
| `description`                                                   | *string*                                                        | :heavy_minus_sign:                                              | The description of the authentication.                          | Authentication scheme using the OAuth Bearer Token Standard     |
| `specUri`                                                       | *string*                                                        | :heavy_minus_sign:                                              | The location of the authentication specifications.              | https://developers.cvent.com/documentation#section/Introduction |
| `documentationUri`                                              | *string*                                                        | :heavy_minus_sign:                                              | The location of the API documentation.                          | https://developers.cvent.com/documentation#section/Introduction |
| `type`                                                          | *string*                                                        | :heavy_minus_sign:                                              | The type of the authentication.                                 | oauthbearertoken                                                |
| `primary`                                                       | *boolean*                                                       | :heavy_minus_sign:                                              | True indicates the authentication is primary.                   | true                                                            |
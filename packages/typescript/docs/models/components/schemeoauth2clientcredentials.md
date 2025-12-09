# SchemeOAuth2ClientCredentials

OAuth2 Client Credentials Flow

## Example Usage

```typescript
import { SchemeOAuth2ClientCredentials } from "@cvent/sdk/models/components";

let value: SchemeOAuth2ClientCredentials = {
  clientID: "<id>",
  clientSecret: "<value>",
};
```

## Fields

| Field              | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `clientID`         | *string*           | :heavy_check_mark: | N/A                |
| `clientSecret`     | *string*           | :heavy_check_mark: | N/A                |
| `tokenURL`         | *string*           | :heavy_check_mark: | N/A                |
| `scopes`           | *string*[]         | :heavy_minus_sign: | N/A                |
# ValidToken

Validity status of an authentication token.

## Example Usage

```typescript
import { ValidToken } from "@cvent/sdk/models/components";

let value: ValidToken = {
  tokenValid: true,
  statusCode: 200,
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `tokenValid`                                                         | *boolean*                                                            | :heavy_minus_sign:                                                   | True indicates the presented authentication token is valid.          | true                                                                 |
| `statusCode`                                                         | *number*                                                             | :heavy_minus_sign:                                                   | Supplementary status code. Typically will be 200 for a success case. | 200                                                                  |
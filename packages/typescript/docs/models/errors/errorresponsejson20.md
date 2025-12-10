# ErrorResponseJson20

The error response.

## Example Usage

```typescript
import { ErrorResponseJson20 } from "@cvent/sdk/models/errors";

// No examples available for this model
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `schemas`                                                                    | *string*[]                                                                   | :heavy_minus_sign:                                                           | The collection of error schemas.                                             |                                                                              |
| `status`                                                                     | *number*                                                                     | :heavy_check_mark:                                                           | Status code for error.                                                       | 400                                                                          |
| `detail`                                                                     | *string*                                                                     | :heavy_check_mark:                                                           | Details of the error.                                                        | Request is unparsable, syntactically incorrect, or violates schema.          |
| `scimType`                                                                   | [components.ErrorScimTypeJson](../../models/components/errorscimtypejson.md) | :heavy_minus_sign:                                                           | This is used to denote the scim type of the error.                           | invalidSyntax                                                                |
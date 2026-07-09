# ErrorResponse

Represents an error response with additional details of cascading error messages.

## Example Usage

```typescript
import { ErrorResponse } from "@cvent/sdk/models/components";

let value: ErrorResponse = {
  code: 400,
  message: "Bad Request",
  target: "example target",
  details: [
    {
      code: 400,
      message: "Bad Request",
      target: "example target",
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `code`                                                           | *number*                                                         | :heavy_check_mark:                                               | The HTTP status code representing the error.                     | 400                                                              |
| `message`                                                        | *string*                                                         | :heavy_check_mark:                                               | A brief description of the error.                                | Bad Request                                                      |
| `target`                                                         | *string*                                                         | :heavy_minus_sign:                                               | The target resource of the error.                                | example target                                                   |
| `details`                                                        | [components.ZeroAllOf1](../../models/components/zeroallof1.md)[] | :heavy_minus_sign:                                               | Additional details of cascading error messages.                  |                                                                  |
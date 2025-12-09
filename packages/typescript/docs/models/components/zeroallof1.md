# ZeroAllOf1

Represents an error response with no additional details.

## Example Usage

```typescript
import { ZeroAllOf1 } from "@cvent/sdk/models/components";

let value: ZeroAllOf1 = {
  code: 400,
  message: "Bad Request",
  target: "example target",
};
```

## Fields

| Field                                        | Type                                         | Required                                     | Description                                  | Example                                      |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `code`                                       | *number*                                     | :heavy_check_mark:                           | The HTTP status code representing the error. | 400                                          |
| `message`                                    | *string*                                     | :heavy_check_mark:                           | A brief description of the error.            | Bad Request                                  |
| `target`                                     | *string*                                     | :heavy_minus_sign:                           | The target resource of the error.            | example target                               |
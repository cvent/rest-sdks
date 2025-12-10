# ZeroAllOf7

Represents an error response for the checkin APIs that includes a unique id.

## Example Usage

```typescript
import { ZeroAllOf7 } from "@cvent/sdk/models/components";

let value: ZeroAllOf7 = {
  id: "a96e7faa-b23e-49de-9040-c908473ba7ac",
  code: 400,
  message: "Bad Request",
  target: "example target",
};
```

## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `id`                                          | *string*                                      | :heavy_minus_sign:                            | The unique identifier for the error response. | a96e7faa-b23e-49de-9040-c908473ba7ac          |
| `code`                                        | *number*                                      | :heavy_check_mark:                            | The HTTP status code representing the error.  | 400                                           |
| `message`                                     | *string*                                      | :heavy_check_mark:                            | A brief description of the error.             | Bad Request                                   |
| `target`                                      | *string*                                      | :heavy_minus_sign:                            | The target resource of the error.             | example target                                |
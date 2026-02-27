# SegmentsErrorResponse

Segments error response details.

## Example Usage

```typescript
import { SegmentsErrorResponse } from "@cvent/sdk/models/errors";

// No examples available for this model
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `code`                                                           | *number*                                                         | :heavy_check_mark:                                               | The HTTP status code representing the error.                     | 400                                                              |
| `message`                                                        | *string*                                                         | :heavy_check_mark:                                               | A brief description of the error.                                | Bad Request                                                      |
| `target`                                                         | *string*                                                         | :heavy_minus_sign:                                               | The target resource of the error.                                | example target                                                   |
| `details`                                                        | [components.ZeroAllOf1](../../models/components/zeroallof1.md)[] | :heavy_minus_sign:                                               | Additional details of cascading error messages.                  |                                                                  |
| `validationCode`                                                 | [errors.ValidationCode](../../models/errors/validationcode.md)   | :heavy_minus_sign:                                               | Business validation code for bad requests.                       | SEGMENTS_PER_EVENT_LIMIT_REACHED                                 |
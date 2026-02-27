# SegmentsErrorResponse

Segments error response details.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `code`                                                             | *long*                                                             | :heavy_check_mark:                                                 | The HTTP status code representing the error.                       | 400                                                                |
| `message`                                                          | *String*                                                           | :heavy_check_mark:                                                 | A brief description of the error.                                  | Bad Request                                                        |
| `target`                                                           | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | The target resource of the error.                                  | example target                                                     |
| `details`                                                          | List\<[ZeroAllOf1](../../models/components/ZeroAllOf1.md)>         | :heavy_minus_sign:                                                 | Additional details of cascading error messages.                    |                                                                    |
| `validationCode`                                                   | [Optional\<ValidationCode>](../../models/errors/ValidationCode.md) | :heavy_minus_sign:                                                 | Business validation code for bad requests.                         | SEGMENTS_PER_EVENT_LIMIT_REACHED                                   |
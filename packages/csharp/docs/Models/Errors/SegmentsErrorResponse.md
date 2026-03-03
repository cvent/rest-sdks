# SegmentsErrorResponse

Segments error response details.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Code`                                                    | *long*                                                    | :heavy_check_mark:                                        | The HTTP status code representing the error.              | 400                                                       |
| `Message`                                                 | *string*                                                  | :heavy_check_mark:                                        | A brief description of the error.                         | Bad Request                                               |
| `Target`                                                  | *string*                                                  | :heavy_minus_sign:                                        | The target resource of the error.                         | example target                                            |
| `Details`                                                 | List<[ZeroAllOf1](../../Models/Components/ZeroAllOf1.md)> | :heavy_minus_sign:                                        | Additional details of cascading error messages.           |                                                           |
| `ValidationCode`                                          | [ValidationCode](../../Models/Errors/ValidationCode.md)   | :heavy_minus_sign:                                        | Business validation code for bad requests.                | SEGMENTS_PER_EVENT_LIMIT_REACHED                          |
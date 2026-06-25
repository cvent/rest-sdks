# AttendeeAddBulkItemEventJsonErrorResponse

Represents an error response for the checkin APIs with additional details of cascading error messages.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Id`                                                      | *string*                                                  | :heavy_minus_sign:                                        | The unique identifier for the error response.             | a96e7faa-b23e-49de-9040-c908473ba7ac                      |
| `Code`                                                    | *long*                                                    | :heavy_check_mark:                                        | The HTTP status code representing the error.              | 400                                                       |
| `Message`                                                 | *string*                                                  | :heavy_check_mark:                                        | A brief description of the error.                         | Bad Request                                               |
| `Target`                                                  | *string*                                                  | :heavy_minus_sign:                                        | The target resource of the error.                         | example target                                            |
| `Details`                                                 | List<[ZeroAllOf7](../../Models/Components/ZeroAllOf7.md)> | :heavy_minus_sign:                                        | Additional details of cascading error messages.           |                                                           |
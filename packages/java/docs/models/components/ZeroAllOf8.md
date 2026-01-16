# ZeroAllOf8

Represents an error response for the checkin APIs that includes a unique id.


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `id`                                          | *Optional\<String>*                           | :heavy_minus_sign:                            | The unique identifier for the error response. | a96e7faa-b23e-49de-9040-c908473ba7ac          |
| `code`                                        | *long*                                        | :heavy_check_mark:                            | The HTTP status code representing the error.  | 400                                           |
| `message`                                     | *String*                                      | :heavy_check_mark:                            | A brief description of the error.             | Bad Request                                   |
| `target`                                      | *Optional\<String>*                           | :heavy_minus_sign:                            | The target resource of the error.             | example target                                |
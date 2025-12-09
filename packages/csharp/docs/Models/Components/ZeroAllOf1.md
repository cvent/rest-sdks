# ZeroAllOf1

Represents an error response with no additional details.


## Fields

| Field                                        | Type                                         | Required                                     | Description                                  | Example                                      |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| `Code`                                       | *long*                                       | :heavy_check_mark:                           | The HTTP status code representing the error. | 400                                          |
| `Message`                                    | *string*                                     | :heavy_check_mark:                           | A brief description of the error.            | Bad Request                                  |
| `Target`                                     | *string*                                     | :heavy_minus_sign:                           | The target resource of the error.            | example target                               |
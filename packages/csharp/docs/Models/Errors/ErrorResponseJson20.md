# ErrorResponseJson20

The error response.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Schemas`                                                           | List<*string*>                                                      | :heavy_minus_sign:                                                  | The collection of error schemas.                                    |                                                                     |
| `Status`                                                            | *long*                                                              | :heavy_check_mark:                                                  | Status code for error.                                              | 400                                                                 |
| `Detail`                                                            | *string*                                                            | :heavy_check_mark:                                                  | Details of the error.                                               | Request is unparsable, syntactically incorrect, or violates schema. |
| `ScimType`                                                          | [ErrorScimTypeJson](../../Models/Components/ErrorScimTypeJson.md)   | :heavy_minus_sign:                                                  | This is used to denote the scim type of the error.                  | invalidSyntax                                                       |
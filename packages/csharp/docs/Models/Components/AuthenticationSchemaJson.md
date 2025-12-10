# AuthenticationSchemaJson

Authentication Schema


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `Name`                                                          | *string*                                                        | :heavy_minus_sign:                                              | The name of the authentication.                                 | OAuth Bearer Token                                              |
| `Description`                                                   | *string*                                                        | :heavy_minus_sign:                                              | The description of the authentication.                          | Authentication scheme using the OAuth Bearer Token Standard     |
| `SpecUri`                                                       | *string*                                                        | :heavy_minus_sign:                                              | The location of the authentication specifications.              | https://developers.cvent.com/documentation#section/Introduction |
| `DocumentationUri`                                              | *string*                                                        | :heavy_minus_sign:                                              | The location of the API documentation.                          | https://developers.cvent.com/documentation#section/Introduction |
| `Type`                                                          | *string*                                                        | :heavy_minus_sign:                                              | The type of the authentication.                                 | oauthbearertoken                                                |
| `Primary`                                                       | *bool*                                                          | :heavy_minus_sign:                                              | True indicates the authentication is primary.                   | true                                                            |
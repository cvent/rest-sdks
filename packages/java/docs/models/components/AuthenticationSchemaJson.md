# AuthenticationSchemaJson

Authentication Schema


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `name`                                                          | *Optional\<String>*                                             | :heavy_minus_sign:                                              | The name of the authentication.                                 | OAuth Bearer Token                                              |
| `description`                                                   | *Optional\<String>*                                             | :heavy_minus_sign:                                              | The description of the authentication.                          | Authentication scheme using the OAuth Bearer Token Standard     |
| `specUri`                                                       | *Optional\<String>*                                             | :heavy_minus_sign:                                              | The location of the authentication specifications.              | https://developers.cvent.com/documentation#section/Introduction |
| `documentationUri`                                              | *Optional\<String>*                                             | :heavy_minus_sign:                                              | The location of the API documentation.                          | https://developers.cvent.com/documentation#section/Introduction |
| `type`                                                          | *Optional\<String>*                                             | :heavy_minus_sign:                                              | The type of the authentication.                                 | oauthbearertoken                                                |
| `primary`                                                       | *Optional\<Boolean>*                                            | :heavy_minus_sign:                                              | True indicates the authentication is primary.                   | true                                                            |
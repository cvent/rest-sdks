# ValidToken

Validity status of an authentication token.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `TokenValid`                                                         | *bool*                                                               | :heavy_minus_sign:                                                   | True indicates the presented authentication token is valid.          | true                                                                 |
| `StatusCode`                                                         | *long*                                                               | :heavy_minus_sign:                                                   | Supplementary status code. Typically will be 200 for a success case. | 200                                                                  |
# AccountUsersFilter

A filter, sent in the body of the request, used to retrieve a filtered down list of account users.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `filter`                                                                           | *Optional\<String>*                                                                | :heavy_minus_sign:                                                                 | A Cvent DSL filter expression used to apply a filtered down list of account users. | contact.email eq 'jsmith@example.com'                                              |
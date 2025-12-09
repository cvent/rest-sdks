# Users

A page in a paginated list of SCIM users. This would return the list of users.


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `schemas`                                              | List\<*String*>                                        | :heavy_minus_sign:                                     | The collection of user schemas.                        |                                                        |
| `itemsPerPage`                                         | *Optional\<Long>*                                      | :heavy_minus_sign:                                     | The number of users per page.                          | 50                                                     |
| `startIndex`                                           | *Optional\<Long>*                                      | :heavy_minus_sign:                                     | Starting index of the response.                        | 1                                                      |
| `totalResults`                                         | *Optional\<Long>*                                      | :heavy_minus_sign:                                     | The total count of users.                              | 5                                                      |
| `resources`                                            | List\<[UserJson](../../models/components/UserJson.md)> | :heavy_minus_sign:                                     | The collection of user resources.                      |                                                        |
# UserGroups

Groups


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `schemas`                                                  | List\<*String*>                                            | :heavy_minus_sign:                                         | The collection of user schemas.                            |                                                            |
| `itemsPerPage`                                             | *Optional\<Long>*                                          | :heavy_minus_sign:                                         | The number of schemas per page.                            | 50                                                         |
| `startIndex`                                               | *Optional\<Long>*                                          | :heavy_minus_sign:                                         | Starting index of the response.                            | 1                                                          |
| `totalResults`                                             | *Optional\<Long>*                                          | :heavy_minus_sign:                                         | The total count of schemas.                                | 5                                                          |
| `resources`                                                | List\<[GroupJson0](../../models/components/GroupJson0.md)> | :heavy_minus_sign:                                         | The collection of schema resources.                        |                                                            |
# UserGroups

Groups


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Schemas`                                                 | List<*string*>                                            | :heavy_minus_sign:                                        | The collection of user schemas.                           |                                                           |
| `ItemsPerPage`                                            | *long*                                                    | :heavy_minus_sign:                                        | The number of schemas per page.                           | 50                                                        |
| `StartIndex`                                              | *long*                                                    | :heavy_minus_sign:                                        | Starting index of the response.                           | 1                                                         |
| `TotalResults`                                            | *long*                                                    | :heavy_minus_sign:                                        | The total count of schemas.                               | 5                                                         |
| `Resources`                                               | List<[GroupJson0](../../Models/Components/GroupJson0.md)> | :heavy_minus_sign:                                        | The collection of schema resources.                       |                                                           |
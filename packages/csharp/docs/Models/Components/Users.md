# Users

A page in a paginated list of SCIM users. This would return the list of users.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `Schemas`                                             | List<*string*>                                        | :heavy_minus_sign:                                    | The collection of user schemas.                       |                                                       |
| `ItemsPerPage`                                        | *long*                                                | :heavy_minus_sign:                                    | The number of users per page.                         | 50                                                    |
| `StartIndex`                                          | *long*                                                | :heavy_minus_sign:                                    | Starting index of the response.                       | 1                                                     |
| `TotalResults`                                        | *long*                                                | :heavy_minus_sign:                                    | The total count of users.                             | 5                                                     |
| `Resources`                                           | List<[UserJson](../../Models/Components/UserJson.md)> | :heavy_minus_sign:                                    | The collection of user resources.                     |                                                       |
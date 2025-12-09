# BadgePaginatedResponse

Badge List response including paging and badge data.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[Badge](../../Models/Components/Badge.md)>                  | :heavy_minus_sign:                                               | List of badges.                                                  |
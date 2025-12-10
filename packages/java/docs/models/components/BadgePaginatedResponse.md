# BadgePaginatedResponse

Badge List response including paging and badge data.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)   | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Badge](../../models/components/Badge.md)>                 | :heavy_minus_sign:                                               | List of badges.                                                  |
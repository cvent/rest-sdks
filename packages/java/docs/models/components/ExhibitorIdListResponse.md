# ExhibitorIdListResponse

Exhibitor Id Paginated Response schema


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<Paging>](../../models/components/Paging.md)           | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ExhibitorId](../../models/components/ExhibitorId.md)>     | :heavy_minus_sign:                                               | Paginated list of exhibitor Ids for an exhibitor category.       |
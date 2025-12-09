# TravelAccountPaginatedResponse

A paginated list of travel accounts.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)   | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[TravelAccount](../../models/components/TravelAccount.md)> | :heavy_minus_sign:                                               | Collection of travel accounts and their related details.         |
# QuantityItemsPaginatedResponse

A paginated response of quantity items objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[QuantityItem](../../Models/Components/QuantityItem.md)>    | :heavy_check_mark:                                               | Collection of quantity items.                                    |
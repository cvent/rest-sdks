# QuantityItemsPaginatedResponse

A paginated response of quantity items objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[QuantityItem](../../models/components/QuantityItem.md)>   | :heavy_check_mark:                                               | Collection of quantity items.                                    |
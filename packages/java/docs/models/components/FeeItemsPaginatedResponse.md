# FeeItemsPaginatedResponse

A response of fee item objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[FeeItemJson](../../models/components/FeeItemJson.md)>     | :heavy_check_mark:                                               | Collection of fee items.                                         |
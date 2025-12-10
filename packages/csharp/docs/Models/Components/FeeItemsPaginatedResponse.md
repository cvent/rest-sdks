# FeeItemsPaginatedResponse

A response of fee item objects.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[FeeItemJson](../../Models/Components/FeeItemJson.md)>      | :heavy_check_mark:                                               | Collection of fee items.                                         |
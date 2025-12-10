# OrderItemsPaginatedResponse

The response from a request to list of order items. This includes the paging object as well.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[OrderItemJson](../../Models/Components/OrderItemJson.md)>  | :heavy_check_mark:                                               | Collection of order items.                                       |
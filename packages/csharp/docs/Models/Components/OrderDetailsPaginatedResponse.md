# OrderDetailsPaginatedResponse

The response from a request to list of orders. This includes the paging object as well.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[OrderDetail](../../Models/Components/OrderDetail.md)>      | :heavy_check_mark:                                               | Collection of order details.                                     |
# OrderDetailsPaginatedResponse

The response from a request to list of orders. This includes the paging object as well.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[OrderDetail](../../models/components/OrderDetail.md)>     | :heavy_check_mark:                                               | Collection of order details.                                     |
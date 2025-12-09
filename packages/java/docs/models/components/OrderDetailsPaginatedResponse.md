# OrderDetailsPaginatedResponse

The response from a request to list of orders. This includes the paging object as well.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[OrderDetailJson](../../models/components/OrderDetailJson.md)> | :heavy_check_mark:                                                   | Collection of order details.                                         |
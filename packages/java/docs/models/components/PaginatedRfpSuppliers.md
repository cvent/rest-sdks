# PaginatedRfpSuppliers

Paginated response containing suppliers associated with an RFP.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[RfpSupplier](../../models/components/RfpSupplier.md)>     | :heavy_check_mark:                                               | List of RFP suppliers.                                           |
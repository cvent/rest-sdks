# PaginatedRfpSuppliers

Paginated response containing suppliers associated with an RFP.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[RfpSupplier](../../Models/Components/RfpSupplier.md)>      | :heavy_check_mark:                                               | List of RFP suppliers.                                           |
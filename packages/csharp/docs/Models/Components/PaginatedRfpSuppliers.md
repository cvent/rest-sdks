# PaginatedRfpSuppliers

Paginated response containing suppliers associated with an RFP.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[RfpSupplierJson](../../Models/Components/RfpSupplierJson.md)> | :heavy_check_mark:                                                  | List of RFP suppliers.                                              |
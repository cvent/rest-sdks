# PaginatedRfpSuppliers

Paginated response containing suppliers associated with an RFP.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[RfpSupplierJson](../../models/components/RfpSupplierJson.md)> | :heavy_check_mark:                                                   | List of RFP suppliers.                                               |
# BudgetVendorsPaginatedResponse

The response from a request to get the list of vendors.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Paging`                                                                              | [PagingJson](../../Models/Components/PagingJson.md)                                   | :heavy_check_mark:                                                                    | Represents pagination information for a collection of resources.                      |
| `Data`                                                                                | List<[BudgetVendorResponseJson](../../Models/Components/BudgetVendorResponseJson.md)> | :heavy_check_mark:                                                                    | Collection of budget vendor entities.                                                 |
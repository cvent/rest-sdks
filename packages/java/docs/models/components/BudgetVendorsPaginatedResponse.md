# BudgetVendorsPaginatedResponse

The response from a request to get the list of vendors.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [PagingJson](../../models/components/PagingJson.md)                                    | :heavy_check_mark:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | List\<[BudgetVendorResponseJson](../../models/components/BudgetVendorResponseJson.md)> | :heavy_check_mark:                                                                     | Collection of budget vendor entities.                                                  |
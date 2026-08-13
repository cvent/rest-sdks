# BudgetVendorsPaginatedResponse

The response from a request to get the list of vendors.


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Paging`                                                                      | [Paging](../../Models/Components/Paging.md)                                   | :heavy_check_mark:                                                            | Represents pagination information for a collection of resources.              |
| `Data`                                                                        | List<[BudgetVendorResponse](../../Models/Components/BudgetVendorResponse.md)> | :heavy_check_mark:                                                            | Collection of budget vendor entities.                                         |
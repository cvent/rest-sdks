# BudgetAllocationsPaginatedListResponse

The response from a request to get the list of budget allocations for the event.


## Fields

| Field                                                                                                             | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                          | [PagingJson](../../Models/Components/PagingJson.md)                                                               | :heavy_check_mark:                                                                                                | Represents pagination information for a collection of resources.                                                  |
| `Data`                                                                                                            | List<[BudgetAllocationsPaginatedResponseJson](../../Models/Components/BudgetAllocationsPaginatedResponseJson.md)> | :heavy_check_mark:                                                                                                | Collection of budget allocations.                                                                                 |
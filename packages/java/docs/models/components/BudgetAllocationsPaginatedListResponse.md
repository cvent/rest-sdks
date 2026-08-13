# BudgetAllocationsPaginatedListResponse

The response from a request to get the list of budget allocations for the event.


## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                   | [Paging](../../models/components/Paging.md)                                                                | :heavy_check_mark:                                                                                         | Represents pagination information for a collection of resources.                                           |
| `data`                                                                                                     | List\<[BudgetAllocationsPaginatedResponse](../../models/components/BudgetAllocationsPaginatedResponse.md)> | :heavy_check_mark:                                                                                         | Collection of budget allocations.                                                                          |
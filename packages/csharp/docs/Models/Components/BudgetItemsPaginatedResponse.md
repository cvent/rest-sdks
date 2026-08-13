# BudgetItemsPaginatedResponse

The response from a request to get the list of budget items for the event.


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `Paging`                                                                          | [Paging](../../Models/Components/Paging.md)                                       | :heavy_check_mark:                                                                | Represents pagination information for a collection of resources.                  |
| `Data`                                                                            | List<[BudgetItemListResponse](../../Models/Components/BudgetItemListResponse.md)> | :heavy_check_mark:                                                                | Collection of budget items.                                                       |
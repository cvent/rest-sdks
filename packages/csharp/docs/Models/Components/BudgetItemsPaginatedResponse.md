# BudgetItemsPaginatedResponse

The response from a request to get the list of budget items for the event.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `Paging`                                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                                       | :heavy_check_mark:                                                                        | Represents pagination information for a collection of resources.                          |
| `Data`                                                                                    | List<[BudgetItemListResponseJson](../../Models/Components/BudgetItemListResponseJson.md)> | :heavy_check_mark:                                                                        | Collection of budget items.                                                               |
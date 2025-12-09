# BudgetItemsPaginatedResponse

The response from a request to get the list of budget items for the event.


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [PagingJson](../../models/components/PagingJson.md)                                        | :heavy_check_mark:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | List\<[BudgetItemListResponseJson](../../models/components/BudgetItemListResponseJson.md)> | :heavy_check_mark:                                                                         | Collection of budget items.                                                                |
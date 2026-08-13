# BudgetItemsPaginatedResponse

The response from a request to get the list of budget items for the event.


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [Paging](../../models/components/Paging.md)                                        | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[BudgetItemListResponse](../../models/components/BudgetItemListResponse.md)> | :heavy_check_mark:                                                                 | Collection of budget items.                                                        |
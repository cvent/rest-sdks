# AccountBudgetItemsPaginatedResponse

The response from a request to retrieve a paginated list of budget items across all events linked to the account.


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `paging`                                                                                         | [Paging](../../models/components/Paging.md)                                                      | :heavy_check_mark:                                                                               | Represents pagination information for a collection of resources.                                 |
| `data`                                                                                           | List\<[AccountBudgetItemListResponse](../../models/components/AccountBudgetItemListResponse.md)> | :heavy_check_mark:                                                                               | Collection of budget items.                                                                      |
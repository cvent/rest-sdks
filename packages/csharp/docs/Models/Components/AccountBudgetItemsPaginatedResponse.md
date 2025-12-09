# AccountBudgetItemsPaginatedResponse

The response from a request to retrieve a paginated list of budget items across all events linked to the account.


## Fields

| Field                                                                                                   | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `Paging`                                                                                                | [PagingJson](../../Models/Components/PagingJson.md)                                                     | :heavy_check_mark:                                                                                      | Represents pagination information for a collection of resources.                                        |
| `Data`                                                                                                  | List<[AccountBudgetItemListResponseJson](../../Models/Components/AccountBudgetItemListResponseJson.md)> | :heavy_check_mark:                                                                                      | Collection of budget items.                                                                             |
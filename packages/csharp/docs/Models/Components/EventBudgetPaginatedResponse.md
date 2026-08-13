# EventBudgetPaginatedResponse

The response from a request to get the list of event budget totals.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [Paging](../../Models/Components/Paging.md)                             | :heavy_check_mark:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[EventBudgetTotals](../../Models/Components/EventBudgetTotals.md)> | :heavy_check_mark:                                                      | Collection of Event Budget Totals Information.                          |
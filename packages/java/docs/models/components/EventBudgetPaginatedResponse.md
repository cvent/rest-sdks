# EventBudgetPaginatedResponse

The response from a request to get the list of event budget totals.


## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `paging`                                                                 | [Paging](../../models/components/Paging.md)                              | :heavy_check_mark:                                                       | Represents pagination information for a collection of resources.         |
| `data`                                                                   | List\<[EventBudgetTotals](../../models/components/EventBudgetTotals.md)> | :heavy_check_mark:                                                       | Collection of Event Budget Totals Information.                           |
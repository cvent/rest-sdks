# EventBudgetPaginatedResponse

The response from a request to get the list of event budget totals.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [PagingJson](../../models/components/PagingJson.md)                              | :heavy_check_mark:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | List\<[EventBudgetTotalsJson](../../models/components/EventBudgetTotalsJson.md)> | :heavy_check_mark:                                                               | Collection of Event Budget Totals Information.                                   |
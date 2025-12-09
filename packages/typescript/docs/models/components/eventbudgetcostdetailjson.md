# EventBudgetCostDetailJson

Event Budget cost detail information.

## Example Usage

```typescript
import { EventBudgetCostDetailJson } from "@cvent/sdk/models/components";

let value: EventBudgetCostDetailJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Budgeted",
  totalCostValue: 5500.5,
  totalAppliedTax: 500,
  totalAppliedGratuity: 100.5,
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `id`                                                                             | *string*                                                                         | :heavy_minus_sign:                                                               | A string that has to be a format matching the industry standard uuid             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                             |
| `name`                                                                           | *string*                                                                         | :heavy_minus_sign:                                                               | Denotes the name of the budget column associated to this cost.                   | Budgeted                                                                         |
| `totalCostValue`                                                                 | *number*                                                                         | :heavy_minus_sign:                                                               | The total cost amount of the budget version in an event.                         | 5500.5                                                                           |
| `totalAppliedTax`                                                                | *number*                                                                         | :heavy_minus_sign:                                                               | The total tax amount of the budget version in an event for the cost column.      | 500                                                                              |
| `totalAppliedGratuity`                                                           | *number*                                                                         | :heavy_minus_sign:                                                               | The total gratuity amount of the budget version in an event for the cost column. | 100.5                                                                            |
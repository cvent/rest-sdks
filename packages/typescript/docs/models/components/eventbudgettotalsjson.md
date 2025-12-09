# EventBudgetTotalsJson

Budget Totals for a Event.

## Example Usage

```typescript
import { EventBudgetTotalsJson } from "@cvent/sdk/models/components";

let value: EventBudgetTotalsJson = {
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  version: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Budget Version 2",
    default: true,
  },
  lastModifiedDate: new Date("2020-02-07T00:00:00.00Z"),
  currency: "USD",
  totalHighLevelEstimate: {
    amount: 5001.99,
  },
  costDetail: [
    {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      name: "Budgeted",
      totalCostValue: 5500.5,
      totalAppliedTax: 500,
      totalAppliedGratuity: 100.5,
    },
  ],
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `event`                                                                                        | [components.EventBudgetTotalsJsonEvent](../../models/components/eventbudgettotalsjsonevent.md) | :heavy_minus_sign:                                                                             | The identifier of the Event.                                                                   |                                                                                                |
| `version`                                                                                      | [components.Version](../../models/components/version.md)                                       | :heavy_minus_sign:                                                                             | The identifier of the Budget version for an event.                                             |                                                                                                |
| `lastModifiedDate`                                                                             | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)  | :heavy_minus_sign:                                                                             | The ISO 8601 zoned date and time for budget version last modified date.                        | 2020-02-07T00:00:00.00Z                                                                        |
| `currency`                                                                                     | *string*                                                                                       | :heavy_minus_sign:                                                                             | The ISO 4217 standard format currency code used of transaction currency.                       | USD                                                                                            |
| `totalHighLevelEstimate`                                                                       | [components.TotalHighLevelEstimate](../../models/components/totalhighlevelestimate.md)         | :heavy_minus_sign:                                                                             | Total High-level estimation details.                                                           |                                                                                                |
| `costDetail`                                                                                   | [components.EventBudgetCostDetailJson](../../models/components/eventbudgetcostdetailjson.md)[] | :heavy_minus_sign:                                                                             | The list of cost details.                                                                      |                                                                                                |
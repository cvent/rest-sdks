# BudgetTaxJsonInput

Budget item tax details.

## Example Usage

```typescript
import { BudgetTaxJsonInput } from "@cvent/sdk/models/components";

let value: BudgetTaxJsonInput = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  taxType: "PERCENTAGE",
  tax: 5.2,
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `id`                                                                                                | *string*                                                                                            | :heavy_check_mark:                                                                                  | A string that has to be a format matching the industry standard uuid                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                |
| `taxType`                                                                                           | [components.BudgetTaxGratuityTypeJson](../../models/components/budgettaxgratuitytypejson.md)        | :heavy_check_mark:                                                                                  | Denotes the type of tax or gratuity.                                                                | PERCENTAGE                                                                                          |
| `tax`                                                                                               | *number*                                                                                            | :heavy_check_mark:                                                                                  | Tax applied to the budget item. This value can be a percentage of the cost or a flat dollar amount. | 5.2                                                                                                 |
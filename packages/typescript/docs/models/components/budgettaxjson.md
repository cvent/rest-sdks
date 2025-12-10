# BudgetTaxJson

Budget item tax details.

## Example Usage

```typescript
import { BudgetTaxJson } from "@cvent/sdk/models/components";

let value: BudgetTaxJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Applicable Tax",
  taxType: "PERCENTAGE",
  tax: 5.2,
  appliedTaxValue: 5.2,
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `id`                                                                                                | *string*                                                                                            | :heavy_check_mark:                                                                                  | A string that has to be a format matching the industry standard uuid                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                |
| `name`                                                                                              | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Tax name.                                                                                           | Applicable Tax                                                                                      |
| `taxType`                                                                                           | [components.BudgetTaxGratuityTypeJson](../../models/components/budgettaxgratuitytypejson.md)        | :heavy_check_mark:                                                                                  | Denotes the type of tax or gratuity.                                                                | PERCENTAGE                                                                                          |
| `tax`                                                                                               | *number*                                                                                            | :heavy_check_mark:                                                                                  | Tax applied to the budget item. This value can be a percentage of the cost or a flat dollar amount. | 5.2                                                                                                 |
| `appliedTaxValue`                                                                                   | *number*                                                                                            | :heavy_minus_sign:                                                                                  | Calculated tax amount based on tax field.                                                           | 5.2                                                                                                 |
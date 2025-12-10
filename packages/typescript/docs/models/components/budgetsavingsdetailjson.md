# BudgetSavingsDetailJson

Budget savings detail information.

## Example Usage

```typescript
import { BudgetSavingsDetailJson } from "@cvent/sdk/models/components";

let value: BudgetSavingsDetailJson = {
  id: 1,
  name: "Budgeted - Actual",
  value: 15.8,
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  | Example                                                                                                      |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                         | *number*                                                                                                     | :heavy_minus_sign:                                                                                           | Budget savings detail ID.                                                                                    | 1                                                                                                            |
| `name`                                                                                                       | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | Denotes a mathematical formula to calculate savings. For example, Budgeted Amount - Actual amount = Savings. | Budgeted - Actual                                                                                            |
| `value`                                                                                                      | *number*                                                                                                     | :heavy_minus_sign:                                                                                           | Calculated value based on the savings formula.                                                               | 15.8                                                                                                         |
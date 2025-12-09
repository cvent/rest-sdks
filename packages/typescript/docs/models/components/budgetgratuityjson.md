# BudgetGratuityJson

Budget item gratuity details.

## Example Usage

```typescript
import { BudgetGratuityJson } from "@cvent/sdk/models/components";

let value: BudgetGratuityJson = {
  gratuity: 5.2,
  appliedGratuityValue: 25.2,
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `gratuity`                                                                                               | *number*                                                                                                 | :heavy_check_mark:                                                                                       | Gratuity applied to the budget item. This value can be a percentage of the cost or a flat dollar amount. | 5.2                                                                                                      |
| `appliedGratuityValue`                                                                                   | *number*                                                                                                 | :heavy_minus_sign:                                                                                       | Calculated gratuity amount based on gratuity field.                                                      | 25.2                                                                                                     |
# BudgetGratuityInput

Budget item gratuity details.

## Example Usage

```typescript
import { BudgetGratuityInput } from "@cvent/sdk/models/components";

let value: BudgetGratuityInput = {
  gratuity: 5.2,
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `gratuity`                                                                                               | *number*                                                                                                 | :heavy_check_mark:                                                                                       | Gratuity applied to the budget item. This value can be a percentage of the cost or a flat dollar amount. | 5.2                                                                                                      |
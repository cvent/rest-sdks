# BudgetCostAvoidanceJson

Budget cost avoidance information.

## Example Usage

```typescript
import { BudgetCostAvoidanceJson } from "@cvent/sdk/models/components";

let value: BudgetCostAvoidanceJson = {
  amount: 99.5,
  description: "Discounted Cost",
};
```

## Fields

| Field                       | Type                        | Required                    | Description                 | Example                     |
| --------------------------- | --------------------------- | --------------------------- | --------------------------- | --------------------------- |
| `amount`                    | *number*                    | :heavy_minus_sign:          | Cost avoidance amount.      | 99.5                        |
| `description`               | *string*                    | :heavy_minus_sign:          | Cost avoidance description. | Discounted Cost             |
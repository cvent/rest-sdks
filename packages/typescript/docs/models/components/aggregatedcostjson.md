# AggregatedCostJson

The aggregated cost

## Example Usage

```typescript
import { AggregatedCostJson } from "@cvent/sdk/models/components";

let value: AggregatedCostJson = {
  totalFoodAndBeverageCost: 396.56,
  totalMiscCost: 644.96,
};
```

## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `totalFoodAndBeverageCost`         | *number*                           | :heavy_minus_sign:                 | The cost of the food and beverage. | 396.56                             |
| `totalMiscCost`                    | *number*                           | :heavy_minus_sign:                 | The total misc cost.               | 644.96                             |
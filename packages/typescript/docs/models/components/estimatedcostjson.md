# EstimatedCostJson

The estimated cost

## Example Usage

```typescript
import { EstimatedCostJson } from "@cvent/sdk/models/components";

let value: EstimatedCostJson = {
  guestRoom: 100,
  meetingRoom: 10,
  foodAndBeverage: 100,
  foodAndBeverageMinimum: 10,
  notes: "Estimated cost includes taxes.",
};
```

## Fields

| Field                               | Type                                | Required                            | Description                         | Example                             |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `guestRoom`                         | *number*                            | :heavy_minus_sign:                  | Guest room cost.                    | 100                                 |
| `meetingRoom`                       | *number*                            | :heavy_minus_sign:                  | Meeting room cost.                  | 10                                  |
| `foodAndBeverage`                   | *number*                            | :heavy_minus_sign:                  | Food and beverage cost.             | 100                                 |
| `foodAndBeverageMinimum`            | *number*                            | :heavy_minus_sign:                  | Minimum cost for food and beverage. | 10                                  |
| `notes`                             | *string*                            | :heavy_minus_sign:                  | Extra notes on the cost.            | Estimated cost includes taxes.      |
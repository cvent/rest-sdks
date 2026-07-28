# ExistingVenueFacilitySingleRate

Published rate range for single-occupancy rooms, expressed in the venue's configured currency.

## Example Usage

```typescript
import { ExistingVenueFacilitySingleRate } from "@cvent/sdk/models/components";

let value: ExistingVenueFacilitySingleRate = {
  low: 129.99,
  high: 249.99,
};
```

## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `low`                                               | *number*                                            | :heavy_minus_sign:                                  | Lowest published rate for a single-occupancy room.  | 129.99                                              |
| `high`                                              | *number*                                            | :heavy_minus_sign:                                  | Highest published rate for a single-occupancy room. | 249.99                                              |
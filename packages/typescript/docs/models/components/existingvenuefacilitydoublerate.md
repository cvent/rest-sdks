# ExistingVenueFacilityDoubleRate

Published rate range for double-occupancy rooms, expressed in the venue's configured currency.

## Example Usage

```typescript
import { ExistingVenueFacilityDoubleRate } from "@cvent/sdk/models/components";

let value: ExistingVenueFacilityDoubleRate = {
  low: 149.99,
  high: 299.99,
};
```

## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `low`                                               | *number*                                            | :heavy_minus_sign:                                  | Lowest published rate for a double-occupancy room.  | 149.99                                              |
| `high`                                              | *number*                                            | :heavy_minus_sign:                                  | Highest published rate for a double-occupancy room. | 299.99                                              |
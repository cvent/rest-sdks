# DistanceJson1

Distance information.

## Example Usage

```typescript
import { DistanceJson1 } from "@cvent/sdk/models/components";

let value: DistanceJson1 = {
  distance: 18.3,
  distanceUnit: "Kilometers",
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `distance`                                                         | *number*                                                           | :heavy_check_mark:                                                 | Distance from the hotel to the venue.                              | 18.3                                                               |
| `distanceUnit`                                                     | [components.DistanceUnit](../../models/components/distanceunit.md) | :heavy_check_mark:                                                 | Unit of measurement for the distance.                              | Kilometers                                                         |
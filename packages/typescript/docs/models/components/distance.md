# Distance

Distance information.

## Example Usage

```typescript
import { Distance } from "@cvent/sdk/models/components";

let value: Distance = {
  distance: 18.3,
  distanceUnit: "Kilometers",
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `distance`                                                         | *number*                                                           | :heavy_check_mark:                                                 | Distance from the hotel to the venue.                              | 18.3                                                               |
| `distanceUnit`                                                     | [components.DistanceUnit](../../models/components/distanceunit.md) | :heavy_check_mark:                                                 | Unit of measurement for the distance.                              | Kilometers                                                         |
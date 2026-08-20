# Proximity

Proximity of the event venue to the hotel.

## Example Usage

```typescript
import { Proximity } from "@cvent/sdk/models/components";

let value: Proximity = {
  distance: {
    distance: 18.3,
    distanceUnit: "Kilometers",
  },
  mapMessage: "Your hotel is located here.",
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `distance`                                                 | [components.Distance](../../models/components/distance.md) | :heavy_minus_sign:                                         | Distance information.                                      |                                                            |
| `mapMessage`                                               | *string*                                                   | :heavy_minus_sign:                                         | Message shown on map.                                      | Your hotel is located here.                                |
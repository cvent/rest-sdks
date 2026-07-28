# ExistingVenueFacilityProximityFromAirport

Distance from the nearest airport. `unit` is required when `distance` is provided.

## Example Usage

```typescript
import { ExistingVenueFacilityProximityFromAirport } from "@cvent/sdk/models/components";

let value: ExistingVenueFacilityProximityFromAirport = {
  distance: 12.5,
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `distance`                                                                               | *number*                                                                                 | :heavy_minus_sign:                                                                       | Distance from the nearest airport, expressed in `unit`. Up to four digits.               | 12.5                                                                                     |
| `unit`                                                                                   | [components.DistanceMeasurementUnit](../../models/components/distancemeasurementunit.md) | :heavy_minus_sign:                                                                       | Unit of measurement for distance.<br/><br/>Values:<br/>- `MILES` — Miles<br/>- `KILOMETERS` — Kilometers |                                                                                          |
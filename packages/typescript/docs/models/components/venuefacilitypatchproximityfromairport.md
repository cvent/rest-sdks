# VenueFacilityPatchProximityFromAirport

Distance from the nearest airport. `unit` is required when `distance` is provided.

## Example Usage

```typescript
import { VenueFacilityPatchProximityFromAirport } from "@cvent/sdk/models/components";

let value: VenueFacilityPatchProximityFromAirport = {
  distance: 12.5,
};
```

## Fields

| Field                                                                                                                        | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `distance`                                                                                                                   | *number*                                                                                                                     | :heavy_minus_sign:                                                                                                           | Distance from the nearest airport, expressed in `unit`. Up to four digits.                                                   | 12.5                                                                                                                         |
| `unit`                                                                                                                       | [components.VenueFacilityPatchDistanceMeasurementUnit](../../models/components/venuefacilitypatchdistancemeasurementunit.md) | :heavy_minus_sign:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |
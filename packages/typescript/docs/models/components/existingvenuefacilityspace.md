# ExistingVenueFacilitySpace

Facility space measurements at the venue.

## Example Usage

```typescript
import { ExistingVenueFacilitySpace } from "@cvent/sdk/models/components";

let value: ExistingVenueFacilitySpace = {
  totalMeetingRoomSpace: 50000,
  totalExhibitSpace: 75000,
};
```

## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `unitOfMeasurement`                                                                                             | [components.MeasurementUnit](../../models/components/measurementunit.md)                                        | :heavy_minus_sign:                                                                                              | Unit of measurement for area or space.<br/><br/>Values:<br/>- `SQUARE_FEET` — Square Feet<br/>- `SQUARE_METERS` — Square Meters |                                                                                                                 |
| `totalMeetingRoomSpace`                                                                                         | *number*                                                                                                        | :heavy_minus_sign:                                                                                              | Total meeting room space at the venue.                                                                          | 50000                                                                                                           |
| `totalExhibitSpace`                                                                                             | *number*                                                                                                        | :heavy_minus_sign:                                                                                              | Total exhibit space at the venue.                                                                               | 75000                                                                                                           |
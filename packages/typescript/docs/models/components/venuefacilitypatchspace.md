# VenueFacilityPatchSpace

Facility space measurements at the venue.

## Example Usage

```typescript
import { VenueFacilityPatchSpace } from "@cvent/sdk/models/components";

let value: VenueFacilityPatchSpace = {
  totalMeetingRoomSpace: 50000,
  totalExhibitSpace: 75000,
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  | Example                                                                                                      |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `unitOfMeasurement`                                                                                          | [components.VenueFacilityPatchMeasurementUnit](../../models/components/venuefacilitypatchmeasurementunit.md) | :heavy_minus_sign:                                                                                           | N/A                                                                                                          |                                                                                                              |
| `totalMeetingRoomSpace`                                                                                      | *number*                                                                                                     | :heavy_minus_sign:                                                                                           | Total meeting room space at the venue.                                                                       | 50000                                                                                                        |
| `totalExhibitSpace`                                                                                          | *number*                                                                                                     | :heavy_minus_sign:                                                                                           | Total exhibit space at the venue.                                                                            | 75000                                                                                                        |
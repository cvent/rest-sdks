# MeetingRoomDimensions

Physical dimensions for the meeting room.

## Example Usage

```typescript
import { MeetingRoomDimensions } from "@cvent/sdk/models/components";

let value: MeetingRoomDimensions = {
  totalSpace: {
    value: 1500,
    unit: "SQUARE_FEET",
  },
  ceilingHeight: {
    value: 12.5,
    unit: "FEET",
  },
  length: {
    value: 12.5,
    unit: "FEET",
  },
  width: {
    value: 12.5,
    unit: "FEET",
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `totalSpace`                                                             | [components.AreaMeasurement](../../models/components/areameasurement.md) | :heavy_check_mark:                                                       | Measurement of area in square feet or square meters.                     |
| `ceilingHeight`                                                          | [components.Dimension](../../models/components/dimension.md)             | :heavy_minus_sign:                                                       | A dimension measurement in feet or meters.                               |
| `length`                                                                 | [components.Dimension](../../models/components/dimension.md)             | :heavy_minus_sign:                                                       | A dimension measurement in feet or meters.                               |
| `width`                                                                  | [components.Dimension](../../models/components/dimension.md)             | :heavy_minus_sign:                                                       | A dimension measurement in feet or meters.                               |
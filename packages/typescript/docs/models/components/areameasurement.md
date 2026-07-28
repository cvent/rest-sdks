# AreaMeasurement

Measurement of area in square feet or square meters.

## Example Usage

```typescript
import { AreaMeasurement } from "@cvent/sdk/models/components";

let value: AreaMeasurement = {
  value: 1500,
  unit: "SQUARE_FEET",
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `value`                                                                          | *number*                                                                         | :heavy_check_mark:                                                               | The numeric value of the area measurement.                                       | 1500                                                                             |
| `unit`                                                                           | [components.AreaMeasurementUnit](../../models/components/areameasurementunit.md) | :heavy_check_mark:                                                               | The unit of measurement for the area.                                            | SQUARE_FEET                                                                      |
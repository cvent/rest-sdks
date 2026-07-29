# Dimension

A dimension measurement in feet or meters.

## Example Usage

```typescript
import { Dimension } from "@cvent/sdk/models/components";

let value: Dimension = {
  value: 12.5,
  unit: "FEET",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `value`                                                              | *number*                                                             | :heavy_check_mark:                                                   | The numeric value of the dimension.                                  | 12.5                                                                 |
| `unit`                                                               | [components.DimensionUnit](../../models/components/dimensionunit.md) | :heavy_check_mark:                                                   | The unit of measurement for the dimension.                           | FEET                                                                 |
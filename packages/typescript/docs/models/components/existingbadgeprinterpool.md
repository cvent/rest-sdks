# ExistingBadgePrinterPool

Badge Printer Pool.

## Example Usage

```typescript
import { ExistingBadgePrinterPool } from "@cvent/sdk/models/components";

let value: ExistingBadgePrinterPool = {
  name: "Main Entrance",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  disabled: false,
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `name`                                                               | *string*                                                             | :heavy_check_mark:                                                   | The name of the badge printer pool.                                  | Main Entrance                                                        |
| `id`                                                                 | *string*                                                             | :heavy_check_mark:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `disabled`                                                           | *boolean*                                                            | :heavy_check_mark:                                                   | A flag to indicate if the pool is disabled.                          | false                                                                |
# TaxSchedule

A tax schedule used for location-based tax calculation.

## Example Usage

```typescript
import { TaxSchedule } from "@cvent/sdk/models/components";

let value: TaxSchedule = {
  id: "2611c129-b238-4989-96a5-e47628d2cfd4",
  name: "New York State Tax Schedule",
  defaultRate: 8.875,
};
```

## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `id`                                                          | *string*                                                      | :heavy_check_mark:                                            | Tax schedule ID.                                              |                                                               |
| `name`                                                        | *string*                                                      | :heavy_check_mark:                                            | Name of the tax schedule.                                     | New York State Tax Schedule                                   |
| `defaultRate`                                                 | *number*                                                      | :heavy_minus_sign:                                            | Default tax rate for the schedule, expressed as a percentage. | 8.875                                                         |
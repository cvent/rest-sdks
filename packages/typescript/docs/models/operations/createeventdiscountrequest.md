# CreateEventDiscountRequest

## Example Usage

```typescript
import { CreateEventDiscountRequest } from "@cvent/sdk/models/operations";

let value: CreateEventDiscountRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  createUpdateDiscount: {
    name: "10% off",
    active: true,
    stackable: true,
    method: {
      type: "BY_PERCENTAGE",
      value: 10,
    },
    thresholdType: "ALL",
    thresholdLimit: 10,
    interval: 1,
    includePrimaryRegistrant: true,
    type: "VOLUME_DISCOUNT",
  },
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Unique ID of an event.               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `createUpdateDiscount`               | *components.CreateUpdateDiscount*    | :heavy_check_mark:                   | N/A                                  |                                      |
# AvailablePackage

The available package.

## Example Usage

```typescript
import { AvailablePackage } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: AvailablePackage = {
  day: {
    dayNumber: 1,
    date: new RFCDate("2021-07-03"),
  },
  rate: 100,
  quantity: 100,
  notes: "We will give complimentary access of jacuzzi.",
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `day`                                                                        | [components.Day](../../models/components/day.md)                             | :heavy_minus_sign:                                                           | Day contains a date and a counter                                            |                                                                              |
| `packageType`                                                                | [components.PackageType](../../models/components/packagetype.md)             | :heavy_minus_sign:                                                           | Package type for the proposal.                                               |                                                                              |
| `roomOccupancy`                                                              | [components.RoomOccupancy](../../models/components/roomoccupancy.md)         | :heavy_minus_sign:                                                           | RoomOccupancy                                                                |                                                                              |
| `roomType`                                                                   | [components.SleepingRoomType1](../../models/components/sleepingroomtype1.md) | :heavy_minus_sign:                                                           | Sleeping room type                                                           |                                                                              |
| `rate`                                                                       | *number*                                                                     | :heavy_minus_sign:                                                           | Package cost.                                                                | 100                                                                          |
| `quantity`                                                                   | *number*                                                                     | :heavy_minus_sign:                                                           | Quantity of the package.                                                     | 100                                                                          |
| `includedCostItems`                                                          | [components.CostItemType](../../models/components/costitemtype.md)[]         | :heavy_minus_sign:                                                           | List of items for which cost is included in the package.                     |                                                                              |
| `notes`                                                                      | *string*                                                                     | :heavy_minus_sign:                                                           | Extra notes on the package.                                                  | We will give complimentary access of jacuzzi.                                |
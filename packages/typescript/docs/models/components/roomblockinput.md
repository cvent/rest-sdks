# RoomBlockInput

Contains details related to room allotment for a day.

## Example Usage

```typescript
import { RoomBlockInput } from "@cvent/sdk/models/components";

let value: RoomBlockInput = {
  dayNumber: 3,
  details: [
    {
      quantity: 24,
      type: "DOUBLE",
    },
  ],
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `dayNumber`                                                                  | *number*                                                                     | :heavy_minus_sign:                                                           | Counter for day number.                                                      | 3                                                                            |
| `details`                                                                    | [components.RoomBlockDetails](../../models/components/roomblockdetails.md)[] | :heavy_minus_sign:                                                           | Contains detail of quantity required for each room type.                     |                                                                              |
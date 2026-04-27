# RoomBlockJson

Contains details related to room allotment for a day.

## Example Usage

```typescript
import { RoomBlockJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: RoomBlockJson = {
  id: "1f6193da-e12b-4638-b1e2-13dd60d0adeb",
  date: new RFCDate("2025-10-13"),
  dayNumber: 3,
  totalRooms: 24,
  details: [
    {
      quantity: 24,
      type: "DOUBLE",
    },
  ],
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *string*                                                                             | :heavy_minus_sign:                                                                   | Unique identifier for the room block.                                                | 1f6193da-e12b-4638-b1e2-13dd60d0adeb                                                 |
| `date`                                                                               | [RFCDate](../../types/rfcdate.md)                                                    | :heavy_minus_sign:                                                                   | The ISO 8601 date when the rooms are required.                                       | 2025-10-13                                                                           |
| `dayNumber`                                                                          | *number*                                                                             | :heavy_minus_sign:                                                                   | Counter for day number.                                                              | 3                                                                                    |
| `totalRooms`                                                                         | *number*                                                                             | :heavy_minus_sign:                                                                   | Total number of rooms required for the day.                                          | 24                                                                                   |
| `details`                                                                            | [components.RoomBlockDetailsJson](../../models/components/roomblockdetailsjson.md)[] | :heavy_minus_sign:                                                                   | Contains detail of quantity required for each room type.                             |                                                                                      |
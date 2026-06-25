# RfpGuestRooms

Guest Room Requirements

## Example Usage

```typescript
import { RfpGuestRooms } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: RfpGuestRooms = {
  totalRooms: 24,
  peakRooms: 24,
  occupancies: [
    {
      occupancy: "SINGLE",
      type: "DOUBLE",
    },
  ],
  checkInDate: new RFCDate("2025-10-13"),
  roomBlocks: [
    {
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
    },
  ],
  additionalInformation: "2 Executive suites are mandatory.",
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            | Example                                                                                                |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `totalRooms`                                                                                           | *number*                                                                                               | :heavy_minus_sign:                                                                                     | Sum of the number of rooms required each night across all the nights for the event.                    | 24                                                                                                     |
| `peakRooms`                                                                                            | *number*                                                                                               | :heavy_minus_sign:                                                                                     | The number of rooms required during peak nights.                                                       | 24                                                                                                     |
| `occupancies`                                                                                          | [components.GuestRoomOccupancyPerRoomType](../../models/components/guestroomoccupancyperroomtype.md)[] | :heavy_minus_sign:                                                                                     | Occupancies for every room type.                                                                       |                                                                                                        |
| `checkInDate`                                                                                          | [RFCDate](../../types/rfcdate.md)                                                                      | :heavy_minus_sign:                                                                                     | The ISO 8601 check-in date.                                                                            | 2025-10-13                                                                                             |
| `roomBlocks`                                                                                           | [components.RoomBlock](../../models/components/roomblock.md)[]                                         | :heavy_minus_sign:                                                                                     | List of room blocks required.                                                                          |                                                                                                        |
| `additionalInformation`                                                                                | *string*                                                                                               | :heavy_minus_sign:                                                                                     | Additional Info (if any).                                                                              | 2 Executive suites are mandatory.                                                                      |
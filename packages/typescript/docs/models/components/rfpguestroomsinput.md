# RfpGuestRoomsInput

Guest Room Requirements

## Example Usage

```typescript
import { RfpGuestRoomsInput } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: RfpGuestRoomsInput = {
  occupancies: [
    {
      occupancy: "SINGLE",
      type: "DOUBLE",
    },
  ],
  checkInDate: new RFCDate("2025-10-13"),
  roomBlocks: [
    {
      dayNumber: 3,
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
| `occupancies`                                                                                          | [components.GuestRoomOccupancyPerRoomType](../../models/components/guestroomoccupancyperroomtype.md)[] | :heavy_minus_sign:                                                                                     | Occupancies for every room type.                                                                       |                                                                                                        |
| `checkInDate`                                                                                          | [RFCDate](../../types/rfcdate.md)                                                                      | :heavy_minus_sign:                                                                                     | The ISO 8601 check-in date.                                                                            | 2025-10-13                                                                                             |
| `roomBlocks`                                                                                           | [components.RoomBlockInput](../../models/components/roomblockinput.md)[]                               | :heavy_minus_sign:                                                                                     | List of room blocks required.                                                                          |                                                                                                        |
| `additionalInformation`                                                                                | *string*                                                                                               | :heavy_minus_sign:                                                                                     | Additional Info (if any).                                                                              | 2 Executive suites are mandatory.                                                                      |
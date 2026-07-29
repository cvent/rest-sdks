# UpdateMeetingRoomRequest

## Example Usage

```typescript
import { UpdateMeetingRoomRequest } from "@cvent/sdk/models/operations";

let value: UpdateMeetingRoomRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  meetingRoomId: "2594ecc5-53f8-4f9d-9f54-0b6b8c7a8dd2",
  existingMeetingRoom: {
    name: "Grand Ballroom",
    description: "Large conference space with natural lighting",
    dimensions: {
      totalSpace: {
        value: 1500,
        unit: "SQUARE_FEET",
      },
      ceilingHeight: {
        value: 12.5,
        unit: "FEET",
      },
      length: {
        value: 12.5,
        unit: "FEET",
      },
      width: {
        value: 12.5,
        unit: "FEET",
      },
    },
    displayOrder: 1,
    externalSourceId: "EXT-123",
    rates: {
      moveIn: {
        value: 500,
        applicationType: "PER_DAY",
      },
      moveOut: {
        value: 500,
        applicationType: "PER_DAY",
      },
      event: {
        value: 500,
        applicationType: "PER_DAY",
      },
    },
    capacities: {
      exhibits: [
        {
          layoutType: "BOOTH_10x10",
          maxExhibits: 50,
        },
      ],
      seating: [
        {
          layoutType: "THEATER",
          maxAttendees: 250,
        },
      ],
    },
    amenities: [
      "PROJECTOR",
    ],
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `venueId`                                                                                  | *string*                                                                                   | :heavy_check_mark:                                                                         | Unique Cvent based identifier for a Venue.                                                 | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                       |
| `meetingRoomId`                                                                            | *string*                                                                                   | :heavy_check_mark:                                                                         | Unique identifier for a meeting room.                                                      |                                                                                            |
| `existingMeetingRoom`                                                                      | [components.ExistingMeetingRoomInput](../../models/components/existingmeetingroominput.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |                                                                                            |
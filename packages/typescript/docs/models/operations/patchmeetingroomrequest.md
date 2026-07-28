# PatchMeetingRoomRequest

## Example Usage

```typescript
import { PatchMeetingRoomRequest } from "@cvent/sdk/models/operations";

let value: PatchMeetingRoomRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  meetingRoomId: "6f569db0-cd38-463b-b2c0-222c0f8c9750",
  patchMeetingRoom: {
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
    externalSourceId: "EXT-RM-12345",
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
    hiddenOnProfile: false,
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `venueId`                                                                  | *string*                                                                   | :heavy_check_mark:                                                         | Unique Cvent based identifier for a Venue.                                 | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                       |
| `meetingRoomId`                                                            | *string*                                                                   | :heavy_check_mark:                                                         | Unique identifier for a meeting room.                                      |                                                                            |
| `patchMeetingRoom`                                                         | [components.PatchMeetingRoom](../../models/components/patchmeetingroom.md) | :heavy_check_mark:                                                         | N/A                                                                        |                                                                            |
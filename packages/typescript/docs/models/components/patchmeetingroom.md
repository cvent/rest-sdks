# PatchMeetingRoom

Partial update payload for a venue meeting room.

## Example Usage

```typescript
import { PatchMeetingRoom } from "@cvent/sdk/models/components";

let value: PatchMeetingRoom = {
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
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `name`                                                                                         | *string*                                                                                       | :heavy_minus_sign:                                                                             | The name of the meeting room.                                                                  | Grand Ballroom                                                                                 |
| `description`                                                                                  | *string*                                                                                       | :heavy_minus_sign:                                                                             | The detailed description of the meeting room.                                                  | Large conference space with natural lighting                                                   |
| `dimensions`                                                                                   | [components.PatchMeetingRoomDimensions](../../models/components/patchmeetingroomdimensions.md) | :heavy_minus_sign:                                                                             | Physical dimensions for the meeting room.                                                      |                                                                                                |
| `displayOrder`                                                                                 | *number*                                                                                       | :heavy_minus_sign:                                                                             | The position of this meeting room in the venue's room listing.                                 | 1                                                                                              |
| `externalSourceId`                                                                             | *string*                                                                                       | :heavy_minus_sign:                                                                             | The provider's own identifier for this meeting room.                                           | EXT-RM-12345                                                                                   |
| `rates`                                                                                        | [components.PatchMeetingRoomRates](../../models/components/patchmeetingroomrates.md)           | :heavy_minus_sign:                                                                             | Rate information for move in/out and events.                                                   |                                                                                                |
| `capacities`                                                                                   | [components.Capacities](../../models/components/capacities.md)                                 | :heavy_minus_sign:                                                                             | Capacity information for the meeting room, grouped by category.                                |                                                                                                |
| `amenities`                                                                                    | [components.MeetingRoomAmenity](../../models/components/meetingroomamenity.md)[]               | :heavy_minus_sign:                                                                             | List of amenities available in the meeting room.                                               |                                                                                                |
| `hiddenOnProfile`                                                                              | *boolean*                                                                                      | :heavy_minus_sign:                                                                             | True indicates the meeting room is hidden on the venue profile.                                | false                                                                                          |
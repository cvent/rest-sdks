# ExistingMeetingRoom

An existing venue meeting room with read-only generated properties.

## Example Usage

```typescript
import { ExistingMeetingRoom } from "@cvent/sdk/models/components";

let value: ExistingMeetingRoom = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
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
  id: "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `created`                                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)        | :heavy_minus_sign:                                                                                   | The ISO 8601 zoned date time when this record was created.                                           | 2017-01-02T02:00:00Z                                                                                 |
| `createdBy`                                                                                          | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The identifier of the user that created this record.                                                 | hporter                                                                                              |
| `lastModified`                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)        | :heavy_minus_sign:                                                                                   | The ISO 8601 zoned date time when this record was updated.                                           | 2019-02-12T03:00:00Z                                                                                 |
| `lastModifiedBy`                                                                                     | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The identifier of the user that last updated this record.                                            | hporter                                                                                              |
| `name`                                                                                               | *string*                                                                                             | :heavy_check_mark:                                                                                   | The name of the meeting room.                                                                        | Grand Ballroom                                                                                       |
| `description`                                                                                        | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The detailed description of the meeting room.                                                        | Large conference space with natural lighting                                                         |
| `dimensions`                                                                                         | [components.ExistingMeetingRoomDimensions](../../models/components/existingmeetingroomdimensions.md) | :heavy_check_mark:                                                                                   | Physical dimensions for the meeting room.                                                            |                                                                                                      |
| `displayOrder`                                                                                       | *number*                                                                                             | :heavy_minus_sign:                                                                                   | The position of this meeting room in the venue's room listing.                                       | 1                                                                                                    |
| `externalSourceId`                                                                                   | *string*                                                                                             | :heavy_minus_sign:                                                                                   | The provider's own identifier for this meeting room.                                                 | EXT-123                                                                                              |
| `rates`                                                                                              | [components.ExistingMeetingRoomRates](../../models/components/existingmeetingroomrates.md)           | :heavy_minus_sign:                                                                                   | Rate information for move in/out and events.                                                         |                                                                                                      |
| `capacities`                                                                                         | [components.MeetingRoomCapacities](../../models/components/meetingroomcapacities.md)                 | :heavy_minus_sign:                                                                                   | Capacity information for a meeting room, grouped by category.                                        |                                                                                                      |
| `amenities`                                                                                          | [components.MeetingRoomAmenity](../../models/components/meetingroomamenity.md)[]                     | :heavy_minus_sign:                                                                                   | List of amenities available in the meeting room.                                                     |                                                                                                      |
| `hiddenOnProfile`                                                                                    | *boolean*                                                                                            | :heavy_minus_sign:                                                                                   | True indicates the meeting room is hidden on the venue profile.                                      | false                                                                                                |
| `id`                                                                                                 | *string*                                                                                             | :heavy_check_mark:                                                                                   | The unique identifier for the meeting room.                                                          | a1b2c3d4-e5f6-7890-abcd-ef1234567890                                                                 |
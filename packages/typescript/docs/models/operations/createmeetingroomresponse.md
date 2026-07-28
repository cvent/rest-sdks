# CreateMeetingRoomResponse

## Example Usage

```typescript
import { CreateMeetingRoomResponse } from "@cvent/sdk/models/operations";

let value: CreateMeetingRoomResponse = {
  headers: {
    "key": [],
    "key1": [
      "<value 1>",
      "<value 2>",
    ],
    "key2": [],
  },
  result: {
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
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `headers`                                                                        | Record<string, *string*[]>                                                       | :heavy_check_mark:                                                               | N/A                                                                              |
| `result`                                                                         | [components.ExistingMeetingRoom](../../models/components/existingmeetingroom.md) | :heavy_check_mark:                                                               | N/A                                                                              |
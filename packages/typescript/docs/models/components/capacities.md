# Capacities

Capacity information for the meeting room, grouped by category.

## Example Usage

```typescript
import { Capacities } from "@cvent/sdk/models/components";

let value: Capacities = {
  exhibits: [
    {
      layoutType: "BOOTH_10x10",
      maxExhibits: 50,
    },
  ],
  seating: null,
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `exhibits`                                                                                       | [components.MeetingRoomExhibitCapacity](../../models/components/meetingroomexhibitcapacity.md)[] | :heavy_minus_sign:                                                                               | Maximum number of exhibits per room setup.                                                       |
| `seating`                                                                                        | [components.MeetingRoomSeatingCapacity](../../models/components/meetingroomseatingcapacity.md)[] | :heavy_minus_sign:                                                                               | Maximum number of attendees per seating style.                                                   |
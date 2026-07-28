# MeetingRoomSeatingCapacity

Maximum number of attendees for a specific seating style in a meeting room.

## Example Usage

```typescript
import { MeetingRoomSeatingCapacity } from "@cvent/sdk/models/components";

let value: MeetingRoomSeatingCapacity = {
  layoutType: "THEATER",
  maxAttendees: 250,
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `layoutType`                                                                                                       | [components.SeatingLayoutType](../../models/components/seatinglayouttype.md)                                       | :heavy_check_mark:                                                                                                 | The seating arrangement style for a meeting room. Values represent standard event industry seating configurations. | THEATER                                                                                                            |
| `maxAttendees`                                                                                                     | *number*                                                                                                           | :heavy_check_mark:                                                                                                 | Maximum number of attendees for this seating style.                                                                | 250                                                                                                                |
# MeetingRoomOverview

An overview of a venue meeting room containing key identifiers and display properties.

## Example Usage

```typescript
import { MeetingRoomOverview } from "@cvent/sdk/models/components";

let value: MeetingRoomOverview = {
  id: "b2c3d4e5-f6a7-8901-bcde-f12345678901",
  name: "Grand Ballroom",
  hiddenOnProfile: false,
  displayOrder: 1,
};
```

## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `id`                                                                                        | *string*                                                                                    | :heavy_check_mark:                                                                          | The ID of the meeting room.                                                                 | b2c3d4e5-f6a7-8901-bcde-f12345678901                                                        |
| `name`                                                                                      | *string*                                                                                    | :heavy_check_mark:                                                                          | The display name of the meeting room.                                                       | Grand Ballroom                                                                              |
| `hiddenOnProfile`                                                                           | *boolean*                                                                                   | :heavy_minus_sign:                                                                          | True indicates the meeting room is hidden on the venue profile.                             | false                                                                                       |
| `displayOrder`                                                                              | *number*                                                                                    | :heavy_minus_sign:                                                                          | Position of this meeting room in the venue's room listing, with 1 being the first position. | 1                                                                                           |
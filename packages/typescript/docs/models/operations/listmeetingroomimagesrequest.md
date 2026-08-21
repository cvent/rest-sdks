# ListMeetingRoomImagesRequest

## Example Usage

```typescript
import { ListMeetingRoomImagesRequest } from "@cvent/sdk/models/operations";

let value: ListMeetingRoomImagesRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  meetingRoomId: "4487463e-9898-4fb2-ab71-dca867e69155",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `meetingRoomId`                            | *string*                                   | :heavy_check_mark:                         | Unique identifier for a meeting room.      |                                            |
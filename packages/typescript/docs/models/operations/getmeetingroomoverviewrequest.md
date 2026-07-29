# GetMeetingRoomOverviewRequest

## Example Usage

```typescript
import { GetMeetingRoomOverviewRequest } from "@cvent/sdk/models/operations";

let value: GetMeetingRoomOverviewRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  meetingRoomId: "14c63b6f-b029-4da3-bad1-de2f5ac58146",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `meetingRoomId`                            | *string*                                   | :heavy_check_mark:                         | Unique identifier for a meeting room.      |                                            |
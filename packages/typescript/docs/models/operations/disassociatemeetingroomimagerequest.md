# DisassociateMeetingRoomImageRequest

## Example Usage

```typescript
import { DisassociateMeetingRoomImageRequest } from "@cvent/sdk/models/operations";

let value: DisassociateMeetingRoomImageRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  meetingRoomId: "3ab4bfa6-e89a-4071-b6ff-b5dbc7299ebd",
  imageId: "d7bdeb75-8141-40c7-b6c0-bcc074cd6bf4",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `meetingRoomId`                            | *string*                                   | :heavy_check_mark:                         | Unique identifier for a meeting room.      |                                            |
| `imageId`                                  | *string*                                   | :heavy_check_mark:                         | Unique identifier of a venue image.        |                                            |
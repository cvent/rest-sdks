# AssociateMeetingRoomImageRequest

## Example Usage

```typescript
import { AssociateMeetingRoomImageRequest } from "@cvent/sdk/models/operations";

let value: AssociateMeetingRoomImageRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  meetingRoomId: "f56b815f-ed7f-4abb-bcf8-61db972ed17c",
  meetingRoomImageAssociationRequest: {
    file: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
  },
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    | Example                                                                                                        |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `venueId`                                                                                                      | *string*                                                                                                       | :heavy_check_mark:                                                                                             | Unique Cvent based identifier for a Venue.                                                                     | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                                           |
| `meetingRoomId`                                                                                                | *string*                                                                                                       | :heavy_check_mark:                                                                                             | Unique identifier for a meeting room.                                                                          |                                                                                                                |
| `meetingRoomImageAssociationRequest`                                                                           | [components.MeetingRoomImageAssociationRequest](../../models/components/meetingroomimageassociationrequest.md) | :heavy_check_mark:                                                                                             | N/A                                                                                                            |                                                                                                                |
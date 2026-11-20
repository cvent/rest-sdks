# TravelProposalGroupAndMeetingMeetingRoomBasicInformation

The basic information about the meeting rooms of the property.

## Example Usage

```typescript
import { TravelProposalGroupAndMeetingMeetingRoomBasicInformation } from "@cvent/sdk/models/components";

let value: TravelProposalGroupAndMeetingMeetingRoomBasicInformation = {
  largestMeetingRoom: 1000,
  unitOfMeasurement: "sq.ft.",
  meetingRooms: 10,
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `largestMeetingRoom`                                                               | *number*                                                                           | :heavy_minus_sign:                                                                 | The size of the largest meeting room. The `unitOfMeasurement` field sets the unit. | 1000                                                                               |
| `unitOfMeasurement`                                                                | *string*                                                                           | :heavy_minus_sign:                                                                 | The unit of measurement of the `largestMeetingRoom` size.                          | sq.ft.                                                                             |
| `meetingRooms`                                                                     | *number*                                                                           | :heavy_minus_sign:                                                                 | Total number of meeting rooms.                                                     | 10                                                                                 |
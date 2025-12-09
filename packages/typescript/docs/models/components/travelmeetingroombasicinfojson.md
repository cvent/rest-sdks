# TravelMeetingRoomBasicInfoJson

Meeting room basic information.

## Example Usage

```typescript
import { TravelMeetingRoomBasicInfoJson } from "@cvent/sdk/models/components";

let value: TravelMeetingRoomBasicInfoJson = {
  largestMeetingRoom: 1000,
  unitOfMeasurement: "sq.ft.",
  meetingRooms: 10,
};
```

## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `largestMeetingRoom`                                                                            | *number*                                                                                        | :heavy_minus_sign:                                                                              | Size of the largest meeting room. Units of measurement determined by `unitOfMeasurement` field. | 1000                                                                                            |
| `unitOfMeasurement`                                                                             | *string*                                                                                        | :heavy_minus_sign:                                                                              | Unit of measurement of the `largestMeetingRoom`'s size.                                         | sq.ft.                                                                                          |
| `meetingRooms`                                                                                  | *number*                                                                                        | :heavy_minus_sign:                                                                              | Total number of meeting rooms.                                                                  | 10                                                                                              |
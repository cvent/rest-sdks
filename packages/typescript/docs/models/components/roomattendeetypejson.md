# RoomAttendeeTypeJson

Attendee type details specific to room.

## Example Usage

```typescript
import { RoomAttendeeTypeJson } from "@cvent/sdk/models/components";

let value: RoomAttendeeTypeJson = {
  id: 34549966,
  name: "Staff",
  codes: [
    "PEWATT0524317",
  ],
  cancelPolicy:
    "If you wish to cancel your reservation, please do so 72 hours prior to your arrival date.",
  taxPolicy: "New York State Sales Tax is currently 8.875% per night.",
};
```

## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `id`                                                                                      | *number*                                                                                  | :heavy_check_mark:                                                                        | The unique ID of the attendee type.                                                       | 34549966                                                                                  |
| `name`                                                                                    | *string*                                                                                  | :heavy_check_mark:                                                                        | The name of the attendee type.                                                            | Staff                                                                                     |
| `codes`                                                                                   | *string*[]                                                                                | :heavy_check_mark:                                                                        | A list of attendee type codes.                                                            |                                                                                           |
| `cancelPolicy`                                                                            | *string*                                                                                  | :heavy_minus_sign:                                                                        | Room cancellation policy for the attendee types.                                          | If you wish to cancel your reservation, please do so 72 hours prior to your arrival date. |
| `taxPolicy`                                                                               | *string*                                                                                  | :heavy_minus_sign:                                                                        | Room tax policy for the attendee types.                                                   | New York State Sales Tax is currently 8.875% per night.                                   |
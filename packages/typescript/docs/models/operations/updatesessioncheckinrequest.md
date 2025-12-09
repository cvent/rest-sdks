# UpdateSessionCheckInRequest

## Example Usage

```typescript
import { UpdateSessionCheckInRequest } from "@cvent/sdk/models/operations";

let value: UpdateSessionCheckInRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  requestBody: [
    {
      id: "9463c74e-18c6-401a-a710-ae0f485bf059",
      checkOut: new Date("2018-01-13T02:00:00Z"),
      device: "Mobile App",
      duration: 4000,
    },
  ],
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              | Example                                                                                  |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `id`                                                                                     | *string*                                                                                 | :heavy_check_mark:                                                                       | Unique ID of a session.                                                                  | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                     |
| `requestBody`                                                                            | [components.SessionCheckinBaseJson](../../models/components/sessioncheckinbasejson.md)[] | :heavy_check_mark:                                                                       | Attendee check-in to be updated. Up to **100 attendees** can be updated per call.        |                                                                                          |
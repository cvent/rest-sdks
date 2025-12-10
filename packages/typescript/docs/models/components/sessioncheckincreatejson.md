# SessionCheckinCreateJson

Represents an attendee to be checked into a session.

## Example Usage

```typescript
import { SessionCheckinCreateJson } from "@cvent/sdk/models/components";

let value: SessionCheckinCreateJson = {
  id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  checkOut: new Date("2018-01-13T02:00:00Z"),
  device: "Mobile App",
  duration: 4000,
  checkIn: new Date("2018-01-13T02:00:00Z"),
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | ID of an attendee to be checked in to a session.                                              | 9463c74e-18c6-401a-a710-ae0f485bf059                                                          |
| `checkOut`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date and time when the attendee checked out of a session.                  | 2018-01-13T02:00:00Z                                                                          |
| `device`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the device used for check-in.                                                         | Mobile App                                                                                    |
| `duration`                                                                                    | *number*                                                                                      | :heavy_minus_sign:                                                                            | Duration (in milliseconds) of attendance in the session.                                      | 4000                                                                                          |
| `checkIn`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | The ISO 8601 zoned date and time when the attendee was checked into a session.                | 2018-01-13T02:00:00Z                                                                          |
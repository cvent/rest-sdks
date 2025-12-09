# CheckinJson

Represents event check-in details.

## Example Usage

```typescript
import { CheckinJson } from "@cvent/sdk/models/components";

let value: CheckinJson = {
  id: "9463c74e-18c6-401a-a710-ae0f485bf059",
  checkIn: new Date("2018-01-13T02:00:00Z"),
  device: "Mobile App",
  checkOut: new Date("2018-01-13T02:00:00Z"),
  duration: 4000,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | ID of the attendee to be checked-in to an event.                                              | 9463c74e-18c6-401a-a710-ae0f485bf059                                                          |
| `checkIn`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_check_mark:                                                                            | The ISO 8601 zoned date and time when the attendee was checked-in to an event.                | 2018-01-13T02:00:00Z                                                                          |
| `device`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the device used for check-in.                                                         | Mobile App                                                                                    |
| `checkOut`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date and time when the attendee checked out of an event.                   | 2018-01-13T02:00:00Z                                                                          |
| `duration`                                                                                    | *number*                                                                                      | :heavy_minus_sign:                                                                            | Duration (in milliseconds) the attendee was present at the event.                             | 4000                                                                                          |
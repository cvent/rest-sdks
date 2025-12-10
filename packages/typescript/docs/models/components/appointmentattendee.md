# AppointmentAttendee

Attendee for an event appointment.

## Example Usage

```typescript
import { AppointmentAttendee } from "@cvent/sdk/models/components";

let value: AppointmentAttendee = {
  id:
    "0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715",
  code: "GKNNHYW9GFV",
  appointmentEvent: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  contact: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  registration: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  created: new Date("2019-04-01T17:00:00.000Z"),
  modified: new Date("2019-04-01T17:00:00.000Z"),
  deleted: false,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | The unique ID representing the attendee.                                                      | 0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715                    |
| `code`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | System generated code for this attendee appointment.                                          | GKNNHYW9GFV                                                                                   |
| `appointmentEvent`                                                                            | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_check_mark:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `contact`                                                                                     | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_check_mark:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `registration`                                                                                | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_minus_sign:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 formatted date/time when the appointment attendee was created.                   | 2019-04-01T17:00:00.000Z                                                                      |
| `modified`                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 formatted date/time when the appointment attendee was last modified.             | 2019-04-01T17:00:00.000Z                                                                      |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the appointment attendee has been logically deleted.                           | false                                                                                         |
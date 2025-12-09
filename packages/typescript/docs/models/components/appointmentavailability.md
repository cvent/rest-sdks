# AppointmentAvailability

Appointment availability details.

## Example Usage

```typescript
import { AppointmentAvailability } from "@cvent/sdk/models/components";

let value: AppointmentAvailability = {
  id:
    "da8b035b-428b-4069-b25b-92afbcf514b3::2d8234f1-55df-483c-abe3-7e2cb98f8275",
  attendee: {
    id:
      "0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715",
  },
  appointmentEvent: {
    id: "2d8234f1-55df-483c-abe3-7e2cb98f8275",
  },
  timeRanges: [
    {
      start: "2020-04-01T19:00:00.000",
      end: "2020-04-01T20:00:00.000",
      type: "AVAILABLE",
    },
  ],
  created: new Date("2019-04-01T17:00:00.000Z"),
  lastModified: new Date("2019-04-01T17:00:00.000Z"),
  deleted: false,
};
```

## Fields

| Field                                                                                                                  | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            | Example                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                   | *string*                                                                                                               | :heavy_minus_sign:                                                                                                     | The unique ID representing the attendee's availability in an appointment event.                                        | da8b035b-428b-4069-b25b-92afbcf514b3::2d8234f1-55df-483c-abe3-7e2cb98f8275                                             |
| `attendee`                                                                                                             | [components.AppointmentAvailabilityAttendee](../../models/components/appointmentavailabilityattendee.md)               | :heavy_minus_sign:                                                                                                     | The appointment attendee the availability is associated with.                                                          |                                                                                                                        |
| `appointmentEvent`                                                                                                     | [components.AppointmentEventIdJson](../../models/components/appointmenteventidjson.md)                                 | :heavy_minus_sign:                                                                                                     | Represents an appointment event ID.                                                                                    |                                                                                                                        |
| `timeRanges`                                                                                                           | [components.AppointmentAvailabilityTimeRangeJson](../../models/components/appointmentavailabilitytimerangejson.md)[]   | :heavy_minus_sign:                                                                                                     | A list of time ranges when the attendee is available for appointments. Times are in the appointment event's time zone. |                                                                                                                        |
| `created`                                                                                                              | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                          | :heavy_minus_sign:                                                                                                     | The ISO 8601 formatted datetime when the attendee availability was created.                                            | 2019-04-01T17:00:00.000Z                                                                                               |
| `lastModified`                                                                                                         | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                          | :heavy_minus_sign:                                                                                                     | The ISO 8601 formatted date/time when the attendee availability was last modified.                                     | 2019-04-01T17:00:00.000Z                                                                                               |
| `deleted`                                                                                                              | *boolean*                                                                                                              | :heavy_minus_sign:                                                                                                     | True indicates the record is deleted.                                                                                  | false                                                                                                                  |
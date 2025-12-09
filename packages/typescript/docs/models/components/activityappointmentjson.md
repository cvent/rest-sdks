# ActivityAppointmentJson

An activity appointment.

## Example Usage

```typescript
import { ActivityAppointmentJson } from "@cvent/sdk/models/components";

let value: ActivityAppointmentJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Meeting with Cvent",
  code: "NTNHR3XMX5Z",
  appointmentEvent: {
    title: "Demo- Attendee Activity",
    code: "VFNGZT7LH7D",
  },
  start: new Date("2020-02-03T13:00:00.000Z"),
  end: new Date("2020-02-03T14:00:00.000Z"),
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | A string that has to be a format matching the industry standard uuid                                                     | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                                     |
| `name`                                                                                                                   | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The name of the appointment.                                                                                             | Meeting with Cvent                                                                                                       |
| `code`                                                                                                                   | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The code of an appointment.                                                                                              | NTNHR3XMX5Z                                                                                                              |
| `appointmentEvent`                                                                                                       | [components.ActivityAppointmentJsonAppointmentEvent](../../models/components/activityappointmentjsonappointmentevent.md) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |                                                                                                                          |
| `start`                                                                                                                  | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                            | :heavy_minus_sign:                                                                                                       | The ISO 8601 zoned date time when an appointment starts.                                                                 | 2020-02-03T13:00:00.000Z                                                                                                 |
| `end`                                                                                                                    | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                            | :heavy_minus_sign:                                                                                                       | The ISO 8601 zoned date time when an appointment ends.                                                                   | 2020-02-03T14:00:00.000Z                                                                                                 |
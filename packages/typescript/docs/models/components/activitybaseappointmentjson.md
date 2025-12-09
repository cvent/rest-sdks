# ActivityBaseAppointmentJson

Base entity of an activity appointment.

## Example Usage

```typescript
import { ActivityBaseAppointmentJson } from "@cvent/sdk/models/components";

let value: ActivityBaseAppointmentJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Meeting with Cvent",
  code: "NTNHR3XMX5Z",
  appointmentEvent: {
    title: "Demo- Attendee Activity",
    code: "VFNGZT7LH7D",
  },
};
```

## Fields

| Field                                                                                                                            | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      | Example                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                             | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | A string that has to be a format matching the industry standard uuid                                                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                                             |
| `name`                                                                                                                           | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | The name of the appointment.                                                                                                     | Meeting with Cvent                                                                                                               |
| `code`                                                                                                                           | *string*                                                                                                                         | :heavy_minus_sign:                                                                                                               | The code of an appointment.                                                                                                      | NTNHR3XMX5Z                                                                                                                      |
| `appointmentEvent`                                                                                                               | [components.ActivityBaseAppointmentJsonAppointmentEvent](../../models/components/activitybaseappointmentjsonappointmentevent.md) | :heavy_minus_sign:                                                                                                               | N/A                                                                                                                              |                                                                                                                                  |
# AppointmentDenied

Appointment denied activity.

## Example Usage

```typescript
import { AppointmentDenied } from "@cvent/sdk/models/components";

let value: AppointmentDenied = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `appointment`                                                                                    | [components.ActivityBaseAppointmentJson](../../models/components/activitybaseappointmentjson.md) | :heavy_minus_sign:                                                                               | Base entity of an activity appointment.                                                          |
| `contact`                                                                                        | [components.ActivityContactJson](../../models/components/activitycontactjson.md)                 | :heavy_minus_sign:                                                                               | An activity contact.                                                                             |
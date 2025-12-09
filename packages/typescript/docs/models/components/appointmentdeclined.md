# AppointmentDeclined

Appointment activity

## Example Usage

```typescript
import { AppointmentDeclined } from "@cvent/sdk/models/components";

let value: AppointmentDeclined = {
  appointment: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Meeting with Cvent",
    code: "NTNHR3XMX5Z",
    appointmentEvent: {
      title: "Demo- Attendee Activity",
      code: "VFNGZT7LH7D",
    },
    start: new Date("2020-02-03T13:00:00.000Z"),
    end: new Date("2020-02-03T14:00:00.000Z"),
  },
  contact: {
    firstName: "Henry",
    lastName: "Potterfield",
    email: "h.potterfield@test.com",
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `appointment`                                                                            | [components.ActivityAppointmentJson](../../models/components/activityappointmentjson.md) | :heavy_minus_sign:                                                                       | An activity appointment.                                                                 |
| `contact`                                                                                | [components.ActivityContactJson](../../models/components/activitycontactjson.md)         | :heavy_minus_sign:                                                                       | An activity contact.                                                                     |
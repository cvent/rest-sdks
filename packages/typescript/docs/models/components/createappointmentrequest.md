# CreateAppointmentRequest

A request to create an appointment

## Example Usage

```typescript
import { CreateAppointmentRequest } from "@cvent/sdk/models/components";

let value: CreateAppointmentRequest = {
  subject: "Meeting with Cvent",
  description: "A private meeting to discuss sales opportunities.",
  startTime: new Date("2017-01-01T15:20:00Z"),
  endTime: new Date("2030-01-01T15:30:00Z"),
  location: "fa896667-5998-46dc-ac06-6be8e053ef4e",
  customLocationName: "Coffee Shop",
  hosts: [
    {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
  ],
  attendees: [
    {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
  ],
  code: "APPT-0001",
  appointmentTypeId: "b53dc938-8121-4af1-a5e2-d9f3f4fcd574",
  autoAccept: true,
};
```

## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               | Example                                                                                                   |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `subject`                                                                                                 | *string*                                                                                                  | :heavy_check_mark:                                                                                        | Name of the appointment.                                                                                  | Meeting with Cvent                                                                                        |
| `description`                                                                                             | *string*                                                                                                  | :heavy_minus_sign:                                                                                        | Description for the appointment.                                                                          | A private meeting to discuss sales opportunities.                                                         |
| `startTime`                                                                                               | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)             | :heavy_check_mark:                                                                                        | The ISO 8601 formatted start date/time of the appointment in UTC.                                         | 2017-01-01T15:20:00Z                                                                                      |
| `endTime`                                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)             | :heavy_check_mark:                                                                                        | The ISO 8601 formatted end date/time of the appointment in UTC.                                           | 2030-01-01T15:30:00Z                                                                                      |
| `location`                                                                                                | *string*                                                                                                  | :heavy_minus_sign:                                                                                        | Unique identifier of the location to be used for the appointment. Not supported for "SIMPLE" event types. | fa896667-5998-46dc-ac06-6be8e053ef4e                                                                      |
| `customLocationName`                                                                                      | *string*                                                                                                  | :heavy_minus_sign:                                                                                        | Name of the location created by the meeting host. Created ad-hoc for a FLEXIBLE type meeting.             | Coffee Shop                                                                                               |
| `hosts`                                                                                                   | [components.UuidJson](../../models/components/uuidjson.md)[]                                              | :heavy_check_mark:                                                                                        | Contact ids of the appointment hosts.                                                                     |                                                                                                           |
| `attendees`                                                                                               | [components.UuidJson](../../models/components/uuidjson.md)[]                                              | :heavy_minus_sign:                                                                                        | Contact ids of the appointment attendees.                                                                 |                                                                                                           |
| `enforceScheduleRule`                                                                                     | *boolean*                                                                                                 | :heavy_minus_sign:                                                                                        | Flag to indicate if schedule rule needs to be enforced.                                                   | true                                                                                                      |
| `code`                                                                                                    | *string*                                                                                                  | :heavy_minus_sign:                                                                                        | The unique appointment code in Cvent or unique reference id of an appointment in the external systems.    | APPT-0001                                                                                                 |
| `appointmentTypeId`                                                                                       | *string*                                                                                                  | :heavy_check_mark:                                                                                        | Unique identifier of the Appointment type.                                                                | b53dc938-8121-4af1-a5e2-d9f3f4fcd574                                                                      |
| `autoAccept`                                                                                              | *boolean*                                                                                                 | :heavy_minus_sign:                                                                                        | Flag to indicate if the attendees should be auto accepted.                                                | true                                                                                                      |
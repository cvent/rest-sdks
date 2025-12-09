# AttendeeAppointmentMeetingInterest

An attendee's meeting interests for an event.

## Example Usage

```typescript
import { AttendeeAppointmentMeetingInterest } from "@cvent/sdk/models/components";

let value: AttendeeAppointmentMeetingInterest = {
  id:
    "0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715",
  attendee: {
    id:
      "0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715",
  },
  appointmentEvent: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  interests: [
    {
      name: "Cvent",
      exhibitor: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      ranking: "5",
      meetingType: "Group Meeting",
      comment: "A 1:1 or group meeting works.",
    },
  ],
  created: new Date("2019-04-01T17:00:00.000Z"),
  lastModified: new Date("2019-04-01T17:00:00.000Z"),
  deleted: true,
};
```

## Fields

| Field                                                                                                                          | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    | Example                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                           | *string*                                                                                                                       | :heavy_minus_sign:                                                                                                             | The unique ID of this meeting interest.                                                                                        | 0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715                                                     |
| `attendee`                                                                                                                     | [components.AttendeeAppointmentMeetingInterestAttendee](../../models/components/attendeeappointmentmeetinginterestattendee.md) | :heavy_minus_sign:                                                                                                             | The appointment attendee the meeting interest is associated to.                                                                |                                                                                                                                |
| `appointmentEvent`                                                                                                             | [components.UuidJson](../../models/components/uuidjson.md)                                                                     | :heavy_minus_sign:                                                                                                             | The reference to the related entity. Contains only the ID of the related entity.                                               |                                                                                                                                |
| `interests`                                                                                                                    | [components.AppointmentMeetingInterestJson](../../models/components/appointmentmeetinginterestjson.md)[]                       | :heavy_minus_sign:                                                                                                             | An array describing each of the attendee's meeting interests for the given appointment event.                                  |                                                                                                                                |
| `created`                                                                                                                      | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                  | :heavy_minus_sign:                                                                                                             | The ISO 8601 formatted date/time when the meeting interest was created.                                                        | 2019-04-01T17:00:00.000Z                                                                                                       |
| `lastModified`                                                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                  | :heavy_minus_sign:                                                                                                             | The ISO 8601 formatted date/time when the object was last modified.                                                            | 2019-04-01T17:00:00.000Z                                                                                                       |
| `deleted`                                                                                                                      | *boolean*                                                                                                                      | :heavy_minus_sign:                                                                                                             | True indicates the record is deleted.                                                                                          | true                                                                                                                           |
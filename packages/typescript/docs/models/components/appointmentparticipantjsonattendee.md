# AppointmentParticipantJsonAttendee

Reference information for the attendee.

## Example Usage

```typescript
import { AppointmentParticipantJsonAttendee } from "@cvent/sdk/models/components";

let value: AppointmentParticipantJsonAttendee = {
  id:
    "dd1057b9-a957-4c22-be88-741a29d01471/97f2ca58-0f9e-401f-a6b5-a6f20d3a9568",
  contact: {
    id: "97f2ca58-0f9e-401f-a6b5-a6f20d3a9568",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `id`                                                                             | *string*                                                                         | :heavy_minus_sign:                                                               | The unique ID representing the attendee.                                         | 0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715       |
| `contact`                                                                        | [components.UuidJson](../../models/components/uuidjson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
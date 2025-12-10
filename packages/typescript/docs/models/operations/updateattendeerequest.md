# UpdateAttendeeRequest

## Example Usage

```typescript
import { UpdateAttendeeRequest } from "@cvent/sdk/models/operations";

let value: UpdateAttendeeRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  attendeeUpdate: {
    event: {
      id: "0a955598-376e-43d4-a796-91d6d5f41e3f",
    },
    contact: {
      id: "ea66a709-2a93-4fa0-8b83-cf4f62df9dc3",
    },
    invitationList: {
      id: "06da38f9-12da-4cb6-a581-7a5954f8e0e2",
    },
    referenceId: "refid-marketingwebsite",
    note: "Would like to sit near the front of the room for sessions.",
    administrator: {
      id: "7949c335-b5b2-46cf-8f5d-f6b21795df51",
    },
    unsubscribed: false,
    admissionItem: {
      id: "7949c335-b5b2-46cf-8f5d-f6b21795df51",
    },
    visibility: "Private",
    answers: [
      {
        question: {
          id: "60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a",
        },
        value: [
          "1234",
        ],
      },
    ],
    sendEmail: false,
    status: "Accepted",
  },
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *string*                                                               | :heavy_check_mark:                                                     | The unique ID of an attendee.                                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                   |
| `attendeeUpdate`                                                       | [components.AttendeeUpdate](../../models/components/attendeeupdate.md) | :heavy_check_mark:                                                     | N/A                                                                    |                                                                        |
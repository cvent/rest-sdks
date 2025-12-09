# AttendeeAppointmentMeetingInterestsPaginatedResponse

The response for a request of appointment meeting interests, including paging information.

## Example Usage

```typescript
import { AttendeeAppointmentMeetingInterestsPaginatedResponse } from "@cvent/sdk/models/components";

let value: AttendeeAppointmentMeetingInterestsPaginatedResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
    totalCount: 2,
    links: {
      next: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      self: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
      prev: {
        href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
      },
    },
  },
  data: [
    {
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
    },
  ],
};
```

## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                         | [components.PagingJson](../../models/components/pagingjson.md)                                                   | :heavy_minus_sign:                                                                                               | Represents pagination information for a collection of resources.                                                 |
| `data`                                                                                                           | [components.AttendeeAppointmentMeetingInterest](../../models/components/attendeeappointmentmeetinginterest.md)[] | :heavy_minus_sign:                                                                                               | Collection of appointment meeting interests.                                                                     |
# AttendeeActivitiesPaginatedResponse

The response from a request to get the list of attendee activities. This includes the paging object as well as the collection of attendee activities.

## Example Usage

```typescript
import { AttendeeActivitiesPaginatedResponse } from "@cvent/sdk/models/components";

let value: AttendeeActivitiesPaginatedResponse = {
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
      id: "9463c74e-18c6-401a-a710-ae0f485bf059",
      attendee: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      event: {
        id: "d84855b0-eeda-41c4-8e7a-53e80364cb95",
        title: "Cvent Connect 2020",
        code: "XRNGB4YY3CX",
        timezone: "America/New_York",
      },
      time: new Date("2019-08-24T14:15:22Z"),
      created: new Date("2019-08-24T14:15:22Z"),
      name: "Registered for Event",
      type: "event.registered",
      data: {
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
      },
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [components.PagingJson](../../models/components/pagingjson.md)       | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | [components.ActivityJson](../../models/components/activityjson.md)[] | :heavy_check_mark:                                                   | Collection of attendee activities.                                   |
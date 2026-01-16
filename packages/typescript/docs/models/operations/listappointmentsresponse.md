# ListAppointmentsResponse

## Example Usage

```typescript
import { ListAppointmentsResponse } from "@cvent/sdk/models/operations";

let value: ListAppointmentsResponse = {
  result: {
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
        id: "0046e875-79a5-4851-8332-da105d58088a",
        code: "APPT-0001",
        name: "Meeting with Cvent",
        description: "Discuss about marketing.",
        start: new Date("2019-04-12T15:20:00.000Z"),
        end: new Date("2019-04-12T15:30:00.000Z"),
        status: "CONFIRMED",
        location: {
          name: "Hynes Convention Center",
        },
        type: {
          name: "Customer Meeting",
        },
        created: new Date("2017-01-02T02:00:00Z"),
        createdBy: "hporter",
        lastModified: new Date("2019-02-12T03:00:00Z"),
        lastModifiedBy: "hporter",
        appointmentEvent: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        participants: [
          {
            created: new Date("2017-01-02T02:00:00Z"),
            createdBy: "hporter",
            lastModified: new Date("2019-02-12T03:00:00Z"),
            lastModifiedBy: "hporter",
            attendee: {
              id:
                "dd1057b9-a957-4c22-be88-741a29d01471/97f2ca58-0f9e-401f-a6b5-a6f20d3a9568",
              contact: {
                id: "97f2ca58-0f9e-401f-a6b5-a6f20d3a9568",
              },
            },
            type: "Attendee",
            response: "CONFIRMED",
            participation: {
              participated: true,
            },
            questionViewer: false,
            privateNoteViewer: false,
            deleted: false,
            status: "confirmed",
          },
        ],
        autoAcceptAttendees: false,
        enforceScheduleRules: false,
        deleted: false,
      },
    ],
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `result`                                                                                           | [components.AppointmentPaginatedResponse](../../models/components/appointmentpaginatedresponse.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |
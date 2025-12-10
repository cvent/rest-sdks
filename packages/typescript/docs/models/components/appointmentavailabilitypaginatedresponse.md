# AppointmentAvailabilityPaginatedResponse

The response for a request for appointment availability times, including paging information.

## Example Usage

```typescript
import { AppointmentAvailabilityPaginatedResponse } from "@cvent/sdk/models/components";

let value: AppointmentAvailabilityPaginatedResponse = {
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
        "da8b035b-428b-4069-b25b-92afbcf514b3::2d8234f1-55df-483c-abe3-7e2cb98f8275",
      attendee: {
        id:
          "0cdfa3f7-05da-4121-857b-d7732891e01a::52a68001-70ce-4ec4-a6fe-d0888123c715",
      },
      appointmentEvent: {
        id: "2d8234f1-55df-483c-abe3-7e2cb98f8275",
      },
      timeRanges: [
        {
          start: "2020-04-01T19:00:00.000",
          end: "2020-04-01T20:00:00.000",
          type: "AVAILABLE",
        },
      ],
      created: new Date("2019-04-01T17:00:00.000Z"),
      lastModified: new Date("2019-04-01T17:00:00.000Z"),
      deleted: false,
    },
  ],
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [components.PagingJson](../../models/components/pagingjson.md)                             | :heavy_minus_sign:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | [components.AppointmentAvailability](../../models/components/appointmentavailability.md)[] | :heavy_minus_sign:                                                                         | The collection of appointment availability times and their related details.                |
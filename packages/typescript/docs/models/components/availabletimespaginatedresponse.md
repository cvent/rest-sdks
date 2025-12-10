# AvailableTimesPaginatedResponse

The response for a request of available time ranges for scheduling appointments.

## Example Usage

```typescript
import { AvailableTimesPaginatedResponse } from "@cvent/sdk/models/components";

let value: AvailableTimesPaginatedResponse = {
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
      startTime: new Date("2019-04-12T15:15:00.000Z"),
      endTime: new Date("2019-04-12T15:30:00.000Z"),
      type: "DEFINED",
      appointmentType: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      location: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      availableAppointments: 2,
    },
  ],
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [components.PagingJson](../../models/components/pagingjson.md)                 | :heavy_minus_sign:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | [components.AvailableTimeJson](../../models/components/availabletimejson.md)[] | :heavy_minus_sign:                                                             | Collection of available time ranges and their associated details.              |
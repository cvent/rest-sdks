# ListAvailableTimesResponse

## Example Usage

```typescript
import { ListAvailableTimesResponse } from "@cvent/sdk/models/operations";

let value: ListAvailableTimesResponse = {
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
  },
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                 | [components.AvailableTimesPaginatedResponse](../../models/components/availabletimespaginatedresponse.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |
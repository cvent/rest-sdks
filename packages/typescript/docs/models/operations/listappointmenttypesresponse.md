# ListAppointmentTypesResponse

## Example Usage

```typescript
import { ListAppointmentTypesResponse } from "@cvent/sdk/models/operations";

let value: ListAppointmentTypesResponse = {
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
        name: "Event Appointment",
        category: "CUSTOM_APPOINTMENT",
        timeRangeType: "DEFINED",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `result`                                                                                                     | [components.AppointmentTypesPaginatedResponse](../../models/components/appointmenttypespaginatedresponse.md) | :heavy_check_mark:                                                                                           | N/A                                                                                                          |
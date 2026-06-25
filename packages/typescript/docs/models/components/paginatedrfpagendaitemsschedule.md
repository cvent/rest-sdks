# PaginatedRfpAgendaItemsSchedule

Paginated list of agenda items schedule attached to an RFP.

## Example Usage

```typescript
import { PaginatedRfpAgendaItemsSchedule } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: PaginatedRfpAgendaItemsSchedule = {
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
      dayNumber: 1,
      date: new RFCDate("2021-07-03"),
      id: "50dc08af-24a9-4d01-84be-3d43133dc945",
    },
  ],
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `paging`                                                                                           | [components.Paging](../../models/components/paging.md)                                             | :heavy_minus_sign:                                                                                 | Represents pagination information for a collection of resources.                                   |
| `data`                                                                                             | [components.RfpAgendaItemScheduleWithId](../../models/components/rfpagendaitemschedulewithid.md)[] | :heavy_minus_sign:                                                                                 | List of agenda items schedule attached to an RFP.                                                  |
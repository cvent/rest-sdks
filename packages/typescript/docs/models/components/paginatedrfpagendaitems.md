# PaginatedRfpAgendaItems

Paginated list of agenda items associated with an RFP.

## Example Usage

```typescript
import { PaginatedRfpAgendaItems } from "@cvent/sdk/models/components";

let value: PaginatedRfpAgendaItems = {
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
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      name: "Agenda Item 1",
      note: "This is a sample comment for this agenda item.",
      startTime: "10:00:00",
      endTime: "10:30:00",
      roomSize: 1000,
      attendeeCount: 10000,
      roomInfoRequired: false,
      twentyFourHourHold: true,
      locatedAtPrimaryEventVenue: false,
      number: 5,
      schedules: [],
      id: "f56a51a4-84b0-46c9-a612-716dc95a1c96",
      agendaBuilderAttachment: {
        id: "50dc08af-24a9-4d01-84be-3d43133dc945",
      },
    },
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [components.Paging](../../models/components/paging.md)                 | :heavy_minus_sign:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | [components.RfpAgendaItem](../../models/components/rfpagendaitem.md)[] | :heavy_minus_sign:                                                     | List of agenda items associated with an RFP.                           |
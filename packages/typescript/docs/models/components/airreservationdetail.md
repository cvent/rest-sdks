# AirReservationDetail

The response from a request to get the list of air reservation for the attendees.  This includes the paging object as well as the collection of air actual details.

## Example Usage

```typescript
import { AirReservationDetail } from "@cvent/sdk/models/components";

let value: AirReservationDetail = {
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
  data: [],
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `paging`                                                                                     | [components.PagingJson](../../models/components/pagingjson.md)                               | :heavy_check_mark:                                                                           | Represents pagination information for a collection of resources.                             |
| `data`                                                                                       | [components.AirReservationDetailJson](../../models/components/airreservationdetailjson.md)[] | :heavy_check_mark:                                                                           | Collection of air reservations for attendees.                                                |
# LeadCatchersOverviewResponse

Paginated overview of lead catchers for a venue.

## Example Usage

```typescript
import { LeadCatchersOverviewResponse } from "@cvent/sdk/models/components";

let value: LeadCatchersOverviewResponse = {
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
      id: "7e5c2c23-b2bb-461a-adc9-025184988519",
      firstName: "Jane",
      lastName: "Smith",
    },
  ],
};
```

## Fields

| Field                                                                                                                                | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `paging`                                                                                                                             | [components.Paging](../../models/components/paging.md)                                                                               | :heavy_check_mark:                                                                                                                   | Represents pagination information for a collection of resources.                                                                     |
| `data`                                                                                                                               | [components.LeadCatcherOverview](../../models/components/leadcatcheroverview.md)[]                                                   | :heavy_check_mark:                                                                                                                   | Each item is a lightweight, non-PII overview of a lead catcher for the venue, containing only the `id`, `firstName`, and `lastName`. |
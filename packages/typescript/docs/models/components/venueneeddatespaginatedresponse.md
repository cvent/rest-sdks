# VenueNeedDatesPaginatedResponse

Paginated list of need dates for a venue.

## Example Usage

```typescript
import { VenueNeedDatesPaginatedResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: VenueNeedDatesPaginatedResponse = {
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
      startDate: new RFCDate("2026-07-01"),
      endDate: new RFCDate("2026-07-31"),
      id: "7e5c2c23-b2bb-461a-adc9-025184988519",
    },
  ],
};
```

## Fields

| Field                                                                                                                               | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                                            | [components.Paging](../../models/components/paging.md)                                                                              | :heavy_check_mark:                                                                                                                  | Represents pagination information for a collection of resources.                                                                    |
| `data`                                                                                                                              | [components.ExistingVenueNeedDate](../../models/components/existingvenueneeddate.md)[]                                              | :heavy_check_mark:                                                                                                                  | List of need date ranges for the venue. Each item represents a contiguous period when the venue is actively seeking event business. |
# HousingEventSummaryList

List of housing events with key information, providing a summarized view of each event.

## Example Usage

```typescript
import { HousingEventSummaryList } from "@cvent/sdk/models/components";

let value: HousingEventSummaryList = {
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
      id: 21738574,
      name: "Summit 2027",
      start: new Date("2027-01-13T05:00:00Z"),
      end: new Date("2027-01-15T05:00:00Z"),
      cutOff: new Date("2026-10-13T04:00:00Z"),
      timeZone: "America/New_York",
      venue: {
        name: "Holiday Inn",
        address: {
          address1: "West St. 1",
          address2: "Apt. 16",
          city: "Austin",
          region: "Texas",
          regionCode: "TX",
          postalCode: "23452AB",
          country: "United States of America",
          countryCode: "US",
          latitude: 2342.23423,
          longitude: 231234.23423,
        },
      },
      status: "Open",
    },
  ],
};
```

## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `paging`                                                                                | [components.PagingJson](../../models/components/pagingjson.md)                          | :heavy_check_mark:                                                                      | Represents pagination information for a collection of resources.                        |
| `data`                                                                                  | [components.ZeroAllOf9](../../models/components/zeroallof9.md)[]                        | :heavy_check_mark:                                                                      | List of housing events with key information, providing a summarized view of each event. |
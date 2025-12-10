# ListTravelAccountsResponse

## Example Usage

```typescript
import { ListTravelAccountsResponse } from "@cvent/sdk/models/operations";

let value: ListTravelAccountsResponse = {
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
        created: new Date("2017-01-02T02:00:00Z"),
        createdBy: "hporter",
        lastModified: new Date("2019-02-12T03:00:00Z"),
        lastModifiedBy: "hporter",
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        name: "Test Corporation",
        type: "corporate",
        certified: true,
        addresses: [
          {
            address1: "717 N Harwood St",
            address2: "Suite 2800",
            city: "Dallas",
            region: "Texas",
            regionCode: "TX",
            postalCode: "75201",
            country: "United States",
            countryCode: "US",
          },
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `result`                                                                                               | [components.TravelAccountPaginatedResponse](../../models/components/travelaccountpaginatedresponse.md) | :heavy_check_mark:                                                                                     | N/A                                                                                                    |
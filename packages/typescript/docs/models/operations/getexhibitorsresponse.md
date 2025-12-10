# GetExhibitorsResponse

## Example Usage

```typescript
import { GetExhibitorsResponse } from "@cvent/sdk/models/operations";

let value: GetExhibitorsResponse = {
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
        event: {
          id: "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        name: "Potterfield Harry",
        description: "A man who sells relatively good hotdogs",
        code: "abc123",
        sourceId: "software",
        location: "Taj Mahal",
        address: {
          address1: "Cvent Inc.",
          address2: "4001 West Parmer Lane",
          city: "Austin",
          region: "Texas",
          postalCode: "78727",
          country: "United States of America",
        },
        email: "h.potterfield@test.com",
        mobilePhone: "555-555-5555",
        workPhone: "555-555-5555",
        otherPhone: "555-555-5555",
        website: "www.superhappyfuntime.com",
        contactLinks: {
          twitterUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          facebookUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          linkedInUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
          instagramUrl: {
            href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
          },
        },
        sponsorshipLevel: {
          id: "3db28cfc-db22-11eb-8d19-0242ac130003",
        },
        id: "4888db54-db22-11eb-8d19-0242ac130003",
        profileLogoId: "31bd3ae1-0dc3-487b-953e-41d6bbade7d2",
        profileLogoUrl: "https://images.cvent.com/pt/fileLocation/url_123",
        bannerId: "12ca3ae2-0dc3-487b-953e-86d6acadf7d5",
        bannerUrl: "https://images.cvent.com/pt/fileLocation/url_456",
      },
    ],
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `result`                                                                                         | [components.ExhibitorsPaginatedResponse](../../models/components/exhibitorspaginatedresponse.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |
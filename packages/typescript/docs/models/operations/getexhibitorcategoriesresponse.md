# GetExhibitorCategoriesResponse

## Example Usage

```typescript
import { GetExhibitorCategoriesResponse } from "@cvent/sdk/models/operations";

let value: GetExhibitorCategoriesResponse = {
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
        name: "Automobile",
        description: "everything related to automobiles",
        order: 3,
        type: "LOGO",
        id: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
        bannerId: "22ca5ab1-0dc3-487b-953e-41d6dacde3e6",
        bannerUrl: "https://images.cvent.com/pt/fileLocation/url_456",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `result`                                                                                                           | [components.ExhibitorCategoriesPaginatedResponse](../../models/components/exhibitorcategoriespaginatedresponse.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |
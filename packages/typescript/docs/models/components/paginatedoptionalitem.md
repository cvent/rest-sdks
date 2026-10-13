# PaginatedOptionalItem

Optional Item fetch results.

## Example Usage

```typescript
import { PaginatedOptionalItem } from "@cvent/sdk/models/components";

let value: PaginatedOptionalItem = {
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
      id: "2d8234f1-55df-483c-abe3-7e2cb98f8275",
      event: {
        id: "2d8234f1-55df-483c-abe3-7e2cb98f8275",
      },
      name: "T-Shirts",
      code: "SHIRTS",
      type: "DonationItem",
      quantity: 5,
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.Paging](../../models/components/paging.md)           | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | *components.PaginatedOptionalItemData*[]                         | :heavy_check_mark:                                               | Collection of optional items.                                    |
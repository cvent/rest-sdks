# DiscountAgendaItemsPaginatedResponse

A paginated response containing a list of agenda items associated with a discount.

## Example Usage

```typescript
import { DiscountAgendaItemsPaginatedResponse } from "@cvent/sdk/models/components";

let value: DiscountAgendaItemsPaginatedResponse = {
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
      id: "14ca6ae2-0dc3-487b-953e-86d6abbdf6d4",
      type: "Session",
      discount: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
    },
  ],
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `paging`                                                                                 | [components.PagingJson](../../models/components/pagingjson.md)                           | :heavy_check_mark:                                                                       | Represents pagination information for a collection of resources.                         |
| `data`                                                                                   | [components.DiscountAgendaItemJson](../../models/components/discountagendaitemjson.md)[] | :heavy_check_mark:                                                                       | Collection of associated agenda items for a discount.                                    |
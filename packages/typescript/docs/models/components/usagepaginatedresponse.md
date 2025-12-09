# UsagePaginatedResponse

The list of usage for the caller's account in the date range specified.

## Example Usage

```typescript
import { UsagePaginatedResponse } from "@cvent/sdk/models/components";

let value: UsagePaginatedResponse = {
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
      used: 40000,
      remaining: 260000,
      total: 300000,
      date: "2020-01-01",
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.PagingJson](../../models/components/pagingjson.md)   | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | [components.UsageJson](../../models/components/usagejson.md)[]   | :heavy_check_mark:                                               | Collection of usage objects.                                     |
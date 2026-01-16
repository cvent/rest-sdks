# MembershipItemsPaginatedResponse

A paginated response of membership items.

## Example Usage

```typescript
import { MembershipItemsPaginatedResponse } from "@cvent/sdk/models/components";

let value: MembershipItemsPaginatedResponse = {
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
      renewalType: "Calendar",
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.PagingJson](../../models/components/pagingjson.md)   | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | *components.MembershipItemsPaginatedResponseData*[]              | :heavy_check_mark:                                               | Collection of membership items.                                  |
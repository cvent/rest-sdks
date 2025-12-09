# LocationsPaginatedResponse

The response for a request of locations for scheduling appointments.

## Example Usage

```typescript
import { LocationsPaginatedResponse } from "@cvent/sdk/models/components";

let value: LocationsPaginatedResponse = {
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
      id: "0046e875-79a5-4851-8332-da105d58088a",
      name: "Conference Room B",
      parentLocation: {
        id: "0046e875-79a5-4851-8332-da105d58088a",
        name: "Conference Room B",
      },
      capacity: 5,
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [components.PagingJson](../../models/components/pagingjson.md)       | :heavy_minus_sign:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | [components.LocationJson](../../models/components/locationjson.md)[] | :heavy_minus_sign:                                                   | Collection of appointment locations and their associated details.    |
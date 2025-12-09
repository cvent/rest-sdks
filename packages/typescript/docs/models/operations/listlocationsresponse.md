# ListLocationsResponse

## Example Usage

```typescript
import { ListLocationsResponse } from "@cvent/sdk/models/operations";

let value: ListLocationsResponse = {
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
        id: "0046e875-79a5-4851-8332-da105d58088a",
        name: "Conference Room B",
        parentLocation: {
          id: "0046e875-79a5-4851-8332-da105d58088a",
          name: "Conference Room B",
        },
        capacity: 5,
      },
    ],
  },
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `result`                                                                                       | [components.LocationsPaginatedResponse](../../models/components/locationspaginatedresponse.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |
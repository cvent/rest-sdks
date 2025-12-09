# ListTablesResponse

## Example Usage

```typescript
import { ListTablesResponse } from "@cvent/sdk/models/operations";

let value: ListTablesResponse = {
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
        name: "CVENT table",
        code: "CAETABLE1",
        capacity: 10,
        description: "This table is for VIP attendees.",
        sourceId: "Id1255",
        id: "c9763ce5-b965-44ed-9c2b-b5657dfab012",
        seats: [
          {
            id: "37ace026-f4ac-40e3-9144-e2c8399844be",
          },
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `result`                                                                                 | [components.TablesPaginatedResponse](../../models/components/tablespaginatedresponse.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |
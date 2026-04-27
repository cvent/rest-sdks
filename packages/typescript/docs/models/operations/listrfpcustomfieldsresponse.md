# ListRfpCustomFieldsResponse

## Example Usage

```typescript
import { ListRfpCustomFieldsResponse } from "@cvent/sdk/models/operations";

let value: ListRfpCustomFieldsResponse = {
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
        customField: {
          id: "50dc08af-24a9-4d01-84be-3d43133dc945",
        },
        answers: [
          "Choice 1",
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `result`                                                                                 | [components.PaginatedRfpCustomField](../../models/components/paginatedrfpcustomfield.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |
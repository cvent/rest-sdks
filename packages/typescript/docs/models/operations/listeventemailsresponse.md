# ListEventEmailsResponse

## Example Usage

```typescript
import { ListEventEmailsResponse } from "@cvent/sdk/models/operations";

let value: ListEventEmailsResponse = {
  result: {
    paging: {
      nextToken: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
      currentToken: "90c5f062-76ad-4ea4-aa53-00eb698d9262",
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
    data: [],
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `result`                                                                                           | [components.EventEmailsPaginatedResponse](../../models/components/eventemailspaginatedresponse.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |
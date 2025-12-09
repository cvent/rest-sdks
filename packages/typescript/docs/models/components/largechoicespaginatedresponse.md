# LargeChoicesPaginatedResponse

Response include paging and collection of choices for large choices question.

## Example Usage

```typescript
import { LargeChoicesPaginatedResponse } from "@cvent/sdk/models/components";

let value: LargeChoicesPaginatedResponse = {
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
      text: "Choice A",
      question: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.LargeChoiceJson](../../models/components/largechoicejson.md)[] | :heavy_check_mark:                                                         | Collection of choices for large choices question.                          |
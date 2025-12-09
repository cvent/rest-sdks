# BounceDetailsResponse

The response from a request to get the bounce details of an email. This includes paging object

## Example Usage

```typescript
import { BounceDetailsResponse } from "@cvent/sdk/models/components";

let value: BounceDetailsResponse = {
  paging: {
    previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
    nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
    currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
    limit: 100,
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
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `paging`                                                                                 | [components.PagingNoTotalCountJson1](../../models/components/pagingnototalcountjson1.md) | :heavy_check_mark:                                                                       | Represents pagination information for a collection of resources.                         |
| `data`                                                                                   | [components.BounceDetailsJson](../../models/components/bouncedetailsjson.md)[]           | :heavy_check_mark:                                                                       | Bounce details.                                                                          |
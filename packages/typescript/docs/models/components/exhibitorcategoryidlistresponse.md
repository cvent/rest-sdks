# ExhibitorCategoryIdListResponse

A paginated response containing a list of exhibitor category Ids.

## Example Usage

```typescript
import { ExhibitorCategoryIdListResponse } from "@cvent/sdk/models/components";

let value: ExhibitorCategoryIdListResponse = {
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
      id: "534a465b-b4cb-471d-9498-4bf3917ad8bf",
    },
  ],
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [components.PagingJson](../../models/components/pagingjson.md)                             | :heavy_minus_sign:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | [components.ExhibitorCategoryIdJson](../../models/components/exhibitorcategoryidjson.md)[] | :heavy_minus_sign:                                                                         | Paginated list of exhibitor category Ids for an exhibitor.                                 |
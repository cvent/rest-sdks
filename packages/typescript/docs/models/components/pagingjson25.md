# PagingJson25

Represents pagination information for a collection of resources.

## Example Usage

```typescript
import { PagingJson25 } from "@cvent/sdk/models/components";

let value: PagingJson25 = {
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
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `nextToken`                                                                                                              | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The pagination token for the next page; if available. You can use this to determine if there is additional data to fetch | 3b2359a7-4583-40ed-8afd-67e5f15373d3                                                                                     |
| `currentToken`                                                                                                           | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The pagination token for the current page                                                                                | 90c5f062-76ad-4ea4-aa53-00eb698d9262                                                                                     |
| `limit`                                                                                                                  | *number*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The number of records to return on the page not to exceed 200                                                            | 100                                                                                                                      |
| `totalCount`                                                                                                             | *number*                                                                                                                 | :heavy_minus_sign:                                                                                                       | The total number of records available                                                                                    | 2                                                                                                                        |
| `links`                                                                                                                  | [components.PaginationLinksJson](../../models/components/paginationlinksjson.md)                                         | :heavy_check_mark:                                                                                                       | Represents pagination links for navigating between pages of data.                                                        |                                                                                                                          |
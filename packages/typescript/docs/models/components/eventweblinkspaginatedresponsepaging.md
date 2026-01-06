# EventWeblinksPaginatedResponsePaging

Represents pagination information for a collection of resources.

## Example Usage

```typescript
import { EventWeblinksPaginatedResponsePaging } from "@cvent/sdk/models/components";

let value: EventWeblinksPaginatedResponsePaging = {
  limit: 100,
  previousToken: "1a2b3c4d5e6f7g8h9i10j11k",
  nextToken: "1a2b3c4d5e6f7g8h9i10j11k",
  currentToken: "1a2b3c4d5e6f7g8h9i10j11k",
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

| Field                                                                                                                                                                  | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            | Example                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `limit`                                                                                                                                                                | *number*                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                     | The number of records to return on the page. Not to exceed 200.                                                                                                        | 100                                                                                                                                                                    |
| `previousToken`                                                                                                                                                        | *string*                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                     | The pagination token for the previous page, if one exists. You can use this token to navigate to the previous page of data.                                            | 1a2b3c4d5e6f7g8h9i10j11k                                                                                                                                               |
| `nextToken`                                                                                                                                                            | *string*                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                     | The pagination token for the next page. If this value is present in the response, there is another page of data you can fetch.                                         | 1a2b3c4d5e6f7g8h9i10j11k                                                                                                                                               |
| `currentToken`                                                                                                                                                         | *string*                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                     | The pagination token for the current page.                                                                                                                             | 1a2b3c4d5e6f7g8h9i10j11k                                                                                                                                               |
| `totalCount`                                                                                                                                                           | *number*                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                     | The total number of records available. This field may return blank, even if there are more records. To confirm if there are more records, check the `nextToken` field. | 2                                                                                                                                                                      |
| `links`                                                                                                                                                                | [components.PaginationLinksJson](../../models/components/paginationlinksjson.md)                                                                                       | :heavy_check_mark:                                                                                                                                                     | Represents pagination links for navigating between pages of data.                                                                                                      |                                                                                                                                                                        |
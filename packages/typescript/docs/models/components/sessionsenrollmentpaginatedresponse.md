# SessionsEnrollmentPaginatedResponse

Represents a paginated collection of session registration objects.

## Example Usage

```typescript
import { SessionsEnrollmentPaginatedResponse } from "@cvent/sdk/models/components";

let value: SessionsEnrollmentPaginatedResponse = {
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
  data: [],
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `paging`                                                                                 | [components.PagingJson](../../models/components/pagingjson.md)                           | :heavy_check_mark:                                                                       | Represents pagination information for a collection of resources.                         |
| `data`                                                                                   | [components.SessionsEnrollmentJson](../../models/components/sessionsenrollmentjson.md)[] | :heavy_check_mark:                                                                       | A collection of session registration objects.                                            |
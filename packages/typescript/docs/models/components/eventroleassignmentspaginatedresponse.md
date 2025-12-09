# EventRoleAssignmentsPaginatedResponse

The response to a request to get a paginated list of event role assignments. This includes the paging object and the collection of event role assignments.

## Example Usage

```typescript
import { EventRoleAssignmentsPaginatedResponse } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentsPaginatedResponse = {
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

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [components.PagingJson](../../models/components/pagingjson.md)                             | :heavy_check_mark:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | [components.EventRoleAssignmentJson](../../models/components/eventroleassignmentjson.md)[] | :heavy_check_mark:                                                                         | A collection of event role assignments.                                                    |
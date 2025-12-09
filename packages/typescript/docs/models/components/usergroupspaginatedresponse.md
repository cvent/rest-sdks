# UserGroupsPaginatedResponse

Contains a paginated list of user groups associated with an event

## Example Usage

```typescript
import { UserGroupsPaginatedResponse } from "@cvent/sdk/models/components";

let value: UserGroupsPaginatedResponse = {
  data: [
    {
      id: "1a419665-8190-4915-ae35-36c2a002d6ac",
      name: "Event Administrators",
    },
  ],
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
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `data`                                                                   | [components.UserGroupJson1](../../models/components/usergroupjson1.md)[] | :heavy_check_mark:                                                       | List of user groups                                                      |
| `paging`                                                                 | [components.PagingJson](../../models/components/pagingjson.md)           | :heavy_check_mark:                                                       | Represents pagination information for a collection of resources.         |
# ContactGroupPaginatedResponse

The response from a request to get the list of contact groups.  This includes the paging object as well as the collection of contact-groups.

## Example Usage

```typescript
import { ContactGroupPaginatedResponse } from "@cvent/sdk/models/components";

let value: ContactGroupPaginatedResponse = {
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
      created: new Date("2017-01-02T02:00:00Z"),
      createdBy: "hporter",
      lastModified: new Date("2019-02-12T03:00:00Z"),
      lastModifiedBy: "hporter",
      id: "ce8260bf-bf54-4d20-9bd4-5f1a7f90eeac",
      name: "group name",
      shortDescription: "short description",
      description: "long description",
      distributionListInfo: {
        internalNote: "Sample distribution list internal note",
        status: "PENDING",
      },
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [components.PagingJson](../../models/components/pagingjson.md)       | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | [components.ContactGroup](../../models/components/contactgroup.md)[] | :heavy_check_mark:                                                   | Collection of contact groups.                                        |
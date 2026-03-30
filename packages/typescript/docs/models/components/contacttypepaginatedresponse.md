# ContactTypePaginatedResponse

The response from a request to get the list of contact types. This includes the paging object as well as the collection of contact-types.

## Example Usage

```typescript
import { ContactTypePaginatedResponse } from "@cvent/sdk/models/components";

let value: ContactTypePaginatedResponse = {
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
      id: "f6de3c4c-4429-42d1-9bb6-46838005f63f",
      code: "VIP",
      name: "VIP Attendee",
      description: "Very important attendee.",
      active: true,
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.ContactTypeJson](../../models/components/contacttypejson.md)[] | :heavy_check_mark:                                                         | Collection of contact types.                                               |
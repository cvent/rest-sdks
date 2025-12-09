# SeatingPaginatedResponse

The response from a request to get the event seating for the event.

## Example Usage

```typescript
import { SeatingPaginatedResponse } from "@cvent/sdk/models/components";

let value: SeatingPaginatedResponse = {
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
      name: "Awards Dinner",
      code: "1VCAPITRAN18012023",
      readOnly: false,
      sourceId: "Id2854",
      id: "ad6df5aa-f21f-47e6-9c48-8d3a7831ad5f",
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_minus_sign:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.ExistingSeating](../../models/components/existingseating.md)[] | :heavy_check_mark:                                                         | A list of event seating                                                    |
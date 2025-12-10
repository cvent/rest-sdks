# SeatsPaginatedResponse

The response from a request to get the event seat for the event.

## Example Usage

```typescript
import { SeatsPaginatedResponse } from "@cvent/sdk/models/components";

let value: SeatsPaginatedResponse = {
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
      name: "Management seat",
      sourceId: "Id5874",
      id: "37ace026-f4ac-40e3-9144-e2c8399844be",
    },
  ],
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [components.PagingJson](../../models/components/pagingjson.md)       | :heavy_minus_sign:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | [components.ExistingSeat](../../models/components/existingseat.md)[] | :heavy_check_mark:                                                   | A list of event seats                                                |
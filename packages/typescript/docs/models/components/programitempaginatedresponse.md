# ProgramItemPaginatedResponse

The response from a request to get the list of session program items.

## Example Usage

```typescript
import { ProgramItemPaginatedResponse } from "@cvent/sdk/models/components";

let value: ProgramItemPaginatedResponse = {
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
      id: "38db6ae2-0dc3-487b-953e-86d6abbdf7d3",
      event: {
        id: "78842378-5d83-11ee-8c99-0242ac120002",
      },
      session: {
        id: "78842aee-5d83-11ee-8c99-0242ac120002",
      },
      name: "Day 1 Program Item.",
      duration: 30,
      description: "This is a sample description of the day 1 program item.",
      rteDescription:
        "{\"format\":\"draftjs-nucleus\",\"version\":1,\"content\":{\"blocks\":[{\"key\":\"cubve\",\"text\":\"Program Item Description\",\"type\":\"unstyled\",\"depth\":0,\"inlineStyleRanges\":[],\"entityRanges\":[],\"data\":{}}],\"entityMap\":{}}}",
    },
  ],
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [components.PagingJson](../../models/components/pagingjson.md)     | :heavy_check_mark:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | [components.ProgramItem](../../models/components/programitem.md)[] | :heavy_check_mark:                                                 | Collection of Session Program Items.                               |
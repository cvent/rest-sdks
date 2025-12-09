# SegmentAttendeesAssociatedPaginatedResponse

The response from a request to get the paginated list of attendees associated/disassociated to/from an audience segment.

## Example Usage

```typescript
import { SegmentAttendeesAssociatedPaginatedResponse } from "@cvent/sdk/models/components";

let value: SegmentAttendeesAssociatedPaginatedResponse = {
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
      segment: {
        id: "b13497ea-c117-4d62-a17b-e6c14d7e49d4",
      },
      id: "103097a4-143d-11e5-9f99-d0a637ee0032",
      disassociated: false,
    },
  ],
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `paging`                                                                                           | [components.PagingJson](../../models/components/pagingjson.md)                                     | :heavy_check_mark:                                                                                 | Represents pagination information for a collection of resources.                                   |
| `data`                                                                                             | [components.SegmentAttendeeResponseJson](../../models/components/segmentattendeeresponsejson.md)[] | :heavy_check_mark:                                                                                 | Collection of list of attendees associated/disassociated to/from an audience segment.              |
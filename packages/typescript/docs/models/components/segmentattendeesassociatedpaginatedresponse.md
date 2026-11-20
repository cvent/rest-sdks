# SegmentAttendeesAssociatedPaginatedResponse

A paginated collection of attendees associated with or disassociated from an audience segment.

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
        id: "27c6bdc0-58c4-4d3c-b4be-4f57dbaa77b3",
      },
      id: "4f519009-7247-4dcc-8a28-e0b155756617",
      disassociated: false,
    },
  ],
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [components.Paging](../../models/components/paging.md)                             | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | [components.SegmentAttendee](../../models/components/segmentattendee.md)[]         | :heavy_check_mark:                                                                 | Collection of attendees associated with or disassociated from an audience segment. |
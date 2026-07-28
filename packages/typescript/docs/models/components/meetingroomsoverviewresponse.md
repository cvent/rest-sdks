# MeetingRoomsOverviewResponse

Paginated overview of meeting rooms for a venue.

## Example Usage

```typescript
import { MeetingRoomsOverviewResponse } from "@cvent/sdk/models/components";

let value: MeetingRoomsOverviewResponse = {
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
      id: "b2c3d4e5-f6a7-8901-bcde-f12345678901",
      name: "Grand Ballroom",
      hiddenOnProfile: false,
      displayOrder: 1,
    },
  ],
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [components.Paging](../../models/components/paging.md)                             | :heavy_minus_sign:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | [components.MeetingRoomOverview](../../models/components/meetingroomoverview.md)[] | :heavy_check_mark:                                                                 | Overview of meeting rooms.                                                         |
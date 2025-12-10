# VideoViewsPaginatedResponse

Paginated list of video views.

## Example Usage

```typescript
import { VideoViewsPaginatedResponse } from "@cvent/sdk/models/components";

let value: VideoViewsPaginatedResponse = {
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
      contact: {
        id: "123e4567-e89b-12d3-a456-426614174000",
      },
      solution: "EVENTS_PLUS",
      video: {
        id: "456e4567-e89b-12d3-a456-426614174000",
      },
      totalDuration: 233000,
      watchDuration: 153600,
      watchPercentage: 52,
    },
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `paging`                                                               | [components.PagingJson](../../models/components/pagingjson.md)         | :heavy_minus_sign:                                                     | Represents pagination information for a collection of resources.       |
| `data`                                                                 | [components.VideoViewJson](../../models/components/videoviewjson.md)[] | :heavy_minus_sign:                                                     | List of unique video views.                                            |
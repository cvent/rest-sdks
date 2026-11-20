# AudienceSegmentsPaginatedResponse

The response from a request to get the paginated list of audience segments for the event.

## Example Usage

```typescript
import { AudienceSegmentsPaginatedResponse } from "@cvent/sdk/models/components";

let value: AudienceSegmentsPaginatedResponse = {
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
      event: {
        id: "f8a930fa-1f3e-4d75-93d3-597aa6a321ea",
      },
      name: "VIP Attendees",
      description: "A group of VIP attendees.",
      id: "27c6bdc0-58c4-4d3c-b4be-4f57dbaa77b3",
      deleted: true,
    },
  ],
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `paging`                                                                                   | [components.Paging](../../models/components/paging.md)                                     | :heavy_check_mark:                                                                         | Represents pagination information for a collection of resources.                           |
| `data`                                                                                     | [components.AudienceSegmentResponse](../../models/components/audiencesegmentresponse.md)[] | :heavy_check_mark:                                                                         | Collection of audience segments.                                                           |
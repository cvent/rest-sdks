# ListWebcastAttendeeLinksResponse

## Example Usage

```typescript
import { ListWebcastAttendeeLinksResponse } from "@cvent/sdk/models/operations";

let value: ListWebcastAttendeeLinksResponse = {
  result: {
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
        webcast: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        event: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        session: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        attendee: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        sourceId: "kBBBAAcccdddd8U==",
        join: {
          href: "https://cvent.zoom.us/j/7566652259",
          code: "1456ZS78",
        },
        id: "7a4822b9-cbda-483e-ad98-72b89f164032",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `result`                                                                                             | [components.AttendeeLinkPaginatedResponse](../../models/components/attendeelinkpaginatedresponse.md) | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
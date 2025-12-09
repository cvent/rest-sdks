# WebcastPaginatedResponse

The response from a request to get the list of webcasts.  This includes the paging object as well as the collection of webcasts.

## Example Usage

```typescript
import { WebcastPaginatedResponse } from "@cvent/sdk/models/components";

let value: WebcastPaginatedResponse = {
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
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      session: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      appointment: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      solutionType: "External Platform",
      exhibitor: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      format: "Pre-recorded",
      type: "Meeting",
      provider: "Zoom",
      status: "Started",
      playerType: "Cvent Video Player",
      simulatedLive: false,
      recordLiveStream: false,
      onDemandVideo: false,
      sourceId: "kBBBAAcccdddd8U==",
      title: "Webinar Connect Event",
      meetingId: "123ERt",
      links: {
        join: {
          href: "https://cvent.zoom.us/j/7566652259",
          code: "1456ZS78",
        },
        speaker: {
          href: "https://cvent.zoom.us/j/7566652259",
          code: "1456ZS78",
        },
        host: {
          href: "https://cvent.zoom.us/j/7566652259",
          code: "1456ZS78",
          key: "abcd1234",
        },
        recording: {
          href: "https://cvent.zoom.us/j/7566652259",
          code: "1456ZS78",
        },
      },
      details: "This is free of cost event",
      video: {
        id: "35b43fce-e87f-4a52-8685-2ba09fb53f53",
      },
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.ExistingWebcast](../../models/components/existingwebcast.md)[] | :heavy_check_mark:                                                         | Collection of webcasts.                                                    |
# ListPlayersResponse

## Example Usage

```typescript
import { ListPlayersResponse } from "@cvent/sdk/models/operations";

let value: ListPlayersResponse = {
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
        videoId: "123ERt",
        videoUrl:
          "https://80a8541ebf4d.us-east-1.playback.live-video.net/api/video/v1/us-east-1.572724207364.channel.L7FiQgC4MUt6.m3u8",
        password: "123ERt",
        stream: {
          id: "stream1256wet",
          url: "https://cvent.zoom.us/j/7566652259",
          key: "145asa16ZS78",
          status: "Standby",
          session: {
            id: "st-1A2b3c4D5e6F78ghij9Klmn",
          },
          page: "https://cvent.zoom.aspx/j/7566652259",
          recording: {
            id: "62989518f9294e19b2f7e184e8141d72",
            status: "finished",
          },
        },
        region: "Oregon",
        duration: 3600000,
        schedule: {
          scheduledExecution: new Date("2024-03-05T09:00:00Z"),
          action: "activate",
        },
        playerTypeProvider: "Amazon IVS",
        simuliveOffset: 300,
      },
    ],
  },
};
```

## Fields

| Field                                                                                    | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `result`                                                                                 | [components.PlayerPaginatedResponse](../../models/components/playerpaginatedresponse.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |
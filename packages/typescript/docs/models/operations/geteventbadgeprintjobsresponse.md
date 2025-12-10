# GetEventBadgePrintJobsResponse

## Example Usage

```typescript
import { GetEventBadgePrintJobsResponse } from "@cvent/sdk/models/operations";

let value: GetEventBadgePrintJobsResponse = {
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
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        status: "Scheduled",
        pool: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        badgeId: "VNNDLJ6DKVK",
        printer: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          name: "Printing Station 1",
        },
        code: "Connection",
        message:
          "The printer is out of paper. Please contact an onsite staff for assistance.",
        created: new Date("2017-01-02T02:00:00Z"),
        lastModified: new Date("2017-01-02T03:00:00Z"),
      },
    ],
  },
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                 | [components.BadgePrintJobsPaginatedResponse](../../models/components/badgeprintjobspaginatedresponse.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |
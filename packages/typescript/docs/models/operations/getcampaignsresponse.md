# GetCampaignsResponse

## Example Usage

```typescript
import { GetCampaignsResponse } from "@cvent/sdk/models/operations";

let value: GetCampaignsResponse = {
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
        campaignId: "2A941E55-3367-4C50-B21B-B6A7613DFB23",
        campaignName: "Demo Campaign",
        active: true,
        clickTrackingEnabled: true,
        companyName: "Demo Company",
        fromName: "Demo name",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `result`                                                                                             | [components.CampaignListPaginatedResponse](../../models/components/campaignlistpaginatedresponse.md) | :heavy_check_mark:                                                                                   | N/A                                                                                                  |
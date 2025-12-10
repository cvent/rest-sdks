# GetBadgePrinterPoolsResponse

## Example Usage

```typescript
import { GetBadgePrinterPoolsResponse } from "@cvent/sdk/models/operations";

let value: GetBadgePrinterPoolsResponse = {
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
        name: "Main Entrance",
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        disabled: false,
      },
    ],
  },
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                       | [components.BadgePrinterPoolsPaginatedResponse](../../models/components/badgeprinterpoolspaginatedresponse.md) | :heavy_check_mark:                                                                                             | N/A                                                                                                            |
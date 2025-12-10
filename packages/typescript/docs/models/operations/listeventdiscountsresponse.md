# ListEventDiscountsResponse

## Example Usage

```typescript
import { ListEventDiscountsResponse } from "@cvent/sdk/models/operations";

let value: ListEventDiscountsResponse = {
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
        name: "10% off",
        active: true,
        stackable: true,
        method: {
          type: "BY_PERCENTAGE",
          value: 10,
        },
        thresholdType: "ALL",
        thresholdLimit: 10,
        interval: 1,
        includePrimaryRegistrant: true,
        type: "VOLUME_DISCOUNT",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `result`                                                                                                     | [components.ExistingDiscountPaginatedResponse](../../models/components/existingdiscountpaginatedresponse.md) | :heavy_check_mark:                                                                                           | N/A                                                                                                          |
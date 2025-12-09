# GetEventBudgetTotalsResponse

## Example Usage

```typescript
import { GetEventBudgetTotalsResponse } from "@cvent/sdk/models/operations";

let value: GetEventBudgetTotalsResponse = {
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
        event: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        version: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
          name: "Budget Version 2",
          default: true,
        },
        lastModifiedDate: new Date("2020-02-07T00:00:00.00Z"),
        currency: "USD",
        totalHighLevelEstimate: {
          amount: 5001.99,
        },
        costDetail: [
          {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            name: "Budgeted",
            totalCostValue: 5500.5,
            totalAppliedTax: 500,
            totalAppliedGratuity: 100.5,
          },
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `result`                                                                                           | [components.EventBudgetPaginatedResponse](../../models/components/eventbudgetpaginatedresponse.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |
# GetCardTransactionsResponse

## Example Usage

```typescript
import { GetCardTransactionsResponse } from "@cvent/sdk/models/operations";

let value: GetCardTransactionsResponse = {
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
        card: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        id: "1000000012",
        transactionDate: new Date("2020-02-07T09:37:50Z"),
        type: "Approved",
        amount: 100.5,
        currency: "USD",
        merchant: "Test Merchant",
        reconciliation: {
          status: "Reconciled",
          amount: 100.5,
          reconciledBy: "Test User",
          reconciledDate: new Date("2020-02-07T09:37:50Z"),
        },
        reconciliations: [
          {
            status: "Reconciled",
            amount: 100.5,
            reconciledBy: "Test User",
            reconciledDate: new Date("2020-02-07T09:37:50Z"),
          },
        ],
        descriptions: [
          "Electricity bill",
          "Event ticket",
          "Miscellaneous charge",
          "Purchase car",
          "Accommodation charge",
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `result`                                                                                                   | [components.CardTransactionPaginatedResponse](../../models/components/cardtransactionpaginatedresponse.md) | :heavy_check_mark:                                                                                         | N/A                                                                                                        |
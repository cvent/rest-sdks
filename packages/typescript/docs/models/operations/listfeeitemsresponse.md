# ListFeeItemsResponse

## Example Usage

```typescript
import { ListFeeItemsResponse } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: ListFeeItemsResponse = {
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
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        name: "Orientation Session Registration Fee",
        amount: 100,
        currency: "EUR",
        product: {
          id: "a64b648e-b7b0-4031-8f8a-8d5e0919b936",
          type: "AdmissionItem",
          name: "Admission Item 1",
        },
        earlyBirdPricing: [
          {
            id: "b64b648e-b7b0-4031-8f8a-8d5e0919b936",
            amount: 100,
            registerByDate: new RFCDate("2020-02-09"),
            maxRefund: 100,
          },
        ],
        refundPolicy: [
          {
            amount: 50,
            percentage: 50,
            type: "RefundByPercentage",
            cancelByDate: new RFCDate("2020-02-09"),
          },
        ],
        display: true,
        default: true,
        generalLedgerCodes: [
          {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d5",
            name: "General Ledger",
            code: "General Ledger Code",
            allocation: 100,
          },
        ],
        registrationTypes: [
          "a64b648e-b7b0-4031-8f8a-8d5e0919b936",
          "f590f1ee-6c54-4b01-90e6-d701748f0851",
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `result`                                                                                     | [components.FeeItemsPaginatedResponse](../../models/components/feeitemspaginatedresponse.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |
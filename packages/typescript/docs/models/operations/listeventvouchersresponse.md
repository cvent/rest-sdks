# ListEventVouchersResponse

## Example Usage

```typescript
import { ListEventVouchersResponse } from "@cvent/sdk/models/operations";

let value: ListEventVouchersResponse = {
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
        id: "1800c9bd-b5f4-438a-a92c-ea1f59553a5c",
        code: "VIP-100",
        description: "VIP full-comp voucher for keynote attendees.",
        alertEmailAddress: "planner@example.com",
        capacity: {
          total: 100,
          redeemedCount: 42,
        },
        lastModifiedBy: "planner@example.com",
        lastModifiedDate: new Date("2026-04-08T02:05:12.000Z"),
      },
    ],
  },
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `result`                                                                                     | [components.VouchersPaginatedResponse](../../models/components/voucherspaginatedresponse.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |
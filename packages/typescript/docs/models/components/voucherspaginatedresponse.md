# VouchersPaginatedResponse

A paginated response of vouchers.

## Example Usage

```typescript
import { VouchersPaginatedResponse } from "@cvent/sdk/models/components";

let value: VouchersPaginatedResponse = {
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
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [components.Paging](../../models/components/paging.md)           | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | [components.Voucher](../../models/components/voucher.md)[]       | :heavy_check_mark:                                               | Collection of vouchers.                                          |
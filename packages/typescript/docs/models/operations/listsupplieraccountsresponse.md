# ListSupplierAccountsResponse

## Example Usage

```typescript
import { ListSupplierAccountsResponse } from "@cvent/sdk/models/operations";

let value: ListSupplierAccountsResponse = {
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
        travelAccount: {
          id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        },
        name: "Test Corporation",
        managementLevel: "global",
        active: true,
        crmId: "ABC123",
        chainDefinedId: "1000000299",
        chainDefinedType: "RFP",
      },
    ],
  },
};
```

## Fields

| Field                                                                                                                                | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `result`                                                                                                                             | [components.TravelAccountSupplierAccountPaginatedResponse](../../models/components/travelaccountsupplieraccountpaginatedresponse.md) | :heavy_check_mark:                                                                                                                   | N/A                                                                                                                                  |
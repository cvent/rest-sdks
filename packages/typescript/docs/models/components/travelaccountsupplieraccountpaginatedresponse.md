# TravelAccountSupplierAccountPaginatedResponse

A paginated list of supplier travel accounts.

## Example Usage

```typescript
import { TravelAccountSupplierAccountPaginatedResponse } from "@cvent/sdk/models/components";

let value: TravelAccountSupplierAccountPaginatedResponse = {
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
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `paging`                                                                                             | [components.PagingJson](../../models/components/pagingjson.md)                                       | :heavy_minus_sign:                                                                                   | Represents pagination information for a collection of resources.                                     |
| `data`                                                                                               | [components.TravelAccountSupplierAccount](../../models/components/travelaccountsupplieraccount.md)[] | :heavy_minus_sign:                                                                                   | Collection of suppliers travel accounts and their related details.                                   |
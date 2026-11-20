# BudgetAllocationsPaginatedListResponse

The response from a request to get the list of budget allocations for the event.

## Example Usage

```typescript
import { BudgetAllocationsPaginatedListResponse } from "@cvent/sdk/models/components";

let value: BudgetAllocationsPaginatedListResponse = {
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
      budgetVersion: {
        id: "6b6f2a1f-33f6-4794-8428-49c83b9f388c",
      },
      budgetItem: {
        id: "569f22e0-1070-4434-884e-5e422ee3354e",
      },
      category: {
        id: "e9ee2669-65db-46f8-872c-dbafbf9b0e92",
      },
      subcategory: {
        id: "b2f194bd-a62c-4e27-a713-48b08196b8a7",
      },
      generalLedger: {
        id: "ff28f935-3670-43d2-98f6-5247a18f686c",
      },
      method: "AMOUNT",
      value: 200.5,
      note: "This will be handled by manager.",
    },
  ],
};
```

## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                         | [components.Paging](../../models/components/paging.md)                                                           | :heavy_check_mark:                                                                                               | Represents pagination information for a collection of resources.                                                 |
| `data`                                                                                                           | [components.BudgetAllocationsPaginatedResponse](../../models/components/budgetallocationspaginatedresponse.md)[] | :heavy_check_mark:                                                                                               | Collection of budget allocations.                                                                                |
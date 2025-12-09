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
        id: "3d808ee8-94f8-4f3a-9ad1-6b23f4e4c329",
      },
      budgetItem: {
        id: "49037583-aec5-4ca7-8f2a-0afd499b10da",
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

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `paging`                                                                                                                 | [components.PagingJson](../../models/components/pagingjson.md)                                                           | :heavy_check_mark:                                                                                                       | Represents pagination information for a collection of resources.                                                         |
| `data`                                                                                                                   | [components.BudgetAllocationsPaginatedResponseJson](../../models/components/budgetallocationspaginatedresponsejson.md)[] | :heavy_check_mark:                                                                                                       | Collection of budget allocations.                                                                                        |
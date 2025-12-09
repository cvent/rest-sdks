# AccountBudgetItemsPaginatedResponse

The response from a request to retrieve a paginated list of budget items across all events linked to the account.

## Example Usage

```typescript
import { AccountBudgetItemsPaginatedResponse } from "@cvent/sdk/models/components";

let value: AccountBudgetItemsPaginatedResponse = {
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
      event: {
        id: "3d808ee8-94f8-4f3a-9ad1-6b23f4e4c329",
      },
      rfp: {
        id: "3d808ee8-94f8-4f3a-9ad1-6b23f4e4c329",
      },
      budgetVersion: {
        id: "3d808ee8-94f8-4f3a-9ad1-6b23f4e4c329",
      },
      id: "9463c74e-18c6-401a-a710-ae0f485bf959",
      name: "Airport Transportation",
      code: "AIRTRP",
      category: {
        id: 3,
        name: "Travel",
      },
      subCategory: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        name: "utilities",
      },
      deleted: false,
    },
  ],
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `paging`                                                                                                       | [components.PagingJson](../../models/components/pagingjson.md)                                                 | :heavy_check_mark:                                                                                             | Represents pagination information for a collection of resources.                                               |
| `data`                                                                                                         | [components.AccountBudgetItemListResponseJson](../../models/components/accountbudgetitemlistresponsejson.md)[] | :heavy_check_mark:                                                                                             | Collection of budget items.                                                                                    |
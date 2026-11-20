# UpdateBudgetAllocationsRequest

## Example Usage

```typescript
import { UpdateBudgetAllocationsRequest } from "@cvent/sdk/models/operations";

let value: UpdateBudgetAllocationsRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetAllocationsList: {
    allocateBy: "AMOUNT",
    allocations: [],
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *string*                                                                             | :heavy_check_mark:                                                                   | Event ID.                                                                            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                 |
| `budgetItemId`                                                                       | *string*                                                                             | :heavy_check_mark:                                                                   | Budget item ID.                                                                      | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                 |
| `budgetAllocationsList`                                                              | [components.BudgetAllocationsList](../../models/components/budgetallocationslist.md) | :heavy_check_mark:                                                                   | Budget allocations to create or update.                                              |                                                                                      |
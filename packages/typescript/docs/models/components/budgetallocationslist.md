# BudgetAllocationsList

Request body  for creating or updating the budget allocations for the event. The soft limit for the maximum number of allocations is 100.

## Example Usage

```typescript
import { BudgetAllocationsList } from "@cvent/sdk/models/components";

let value: BudgetAllocationsList = {
  allocateBy: "AMOUNT",
  allocations: [
    {
      category: {
        id: "e9ee2669-65db-46f8-872c-dbafbf9b0e92",
      },
      subcategory: {
        id: "b2f194bd-a62c-4e27-a713-48b08196b8a7",
      },
      generalLedger: {
        id: "ff28f935-3670-43d2-98f6-5247a18f686c",
      },
      value: 200.5,
      note: "This will be handled by manager.",
    },
  ],
};
```

## Fields

| Field                                                                                                                                                                                                    | Type                                                                                                                                                                                                     | Required                                                                                                                                                                                                 | Description                                                                                                                                                                                              | Example                                                                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `allocateBy`                                                                                                                                                                                             | [components.BudgetAllocatebyJson](../../models/components/budgetallocatebyjson.md)                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                       | Specifies the method of budget allocation. Select "AMOUNT" to allocate a fixed amount (e.g., $700 from a $1000 budget), or "PERCENTAGE" to allocate based on a percentage (e.g., 70% of a $1000 budget). | AMOUNT                                                                                                                                                                                                   |
| `allocations`                                                                                                                                                                                            | [components.BudgetAllocationJson](../../models/components/budgetallocationjson.md)[]                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                       | List of budget allocations.                                                                                                                                                                              |                                                                                                                                                                                                          |
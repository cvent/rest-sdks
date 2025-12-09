# UpdateBudgetItemRequest

## Example Usage

```typescript
import { UpdateBudgetItemRequest } from "@cvent/sdk/models/operations";

let value: UpdateBudgetItemRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetItem: {
    costType: "FIXED",
    name: "Airport Transportation",
    code: "AIRTRP",
    category: {
      id: 3,
    },
    subCategory: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    status: "ESTIMATED",
    vendor: {
      id: "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
    },
    date: new Date("2020-02-07T00:00:00.00Z"),
    generalLedger: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    costAvoidance: {
      amount: 99.5,
      description: "Discounted Cost",
    },
    costIncludesTaxGratuity: true,
    calculateTaxOnGratuity: false,
    gratuityType: "PERCENTAGE",
    internalNote: "This item is inclusive of taxes.",
    currency: "USD",
    conversionRateLocked: true,
    conversionRate: 5.2,
    costDetail: [
      {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        units: 5.2,
        cost: 100.5,
        gratuityDetail: {
          gratuity: 5.2,
        },
        taxDetail: [
          {
            id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
            taxType: "PERCENTAGE",
            tax: 5.2,
          },
        ],
      },
    ],
    associatedRegistrants: [
      {
        inviteeId: "7cc5304a-9323-452f-8ae8-111cae0047b0",
        contactId: "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
      },
    ],
    associatedSession: "9463c74e-18c6-401a-a710-ae0f485bf959",
  },
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `id`                                                                     | *string*                                                                 | :heavy_check_mark:                                                       | Unique ID of an event.                                                   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                     |
| `budgetItemId`                                                           | *string*                                                                 | :heavy_check_mark:                                                       | Unique ID of a budget item.                                              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                     |
| `budgetItem`                                                             | [components.BudgetItemInput](../../models/components/budgetiteminput.md) | :heavy_check_mark:                                                       | Budget Item to be updated                                                |                                                                          |
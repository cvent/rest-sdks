# BudgetItemsPaginatedResponse

The response from a request to get the list of budget items for the event.

## Example Usage

```typescript
import { BudgetItemsPaginatedResponse } from "@cvent/sdk/models/components";

let value: BudgetItemsPaginatedResponse = {
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
      event: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      },
      id: "9463c74e-18c6-401a-a710-ae0f485bf959",
      costType: "FIXED",
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
      status: "ESTIMATED",
      vendor: {
        id: "d64380fd-3631-43e9-aac7-bd6bb6eccf6b",
        name: "Best Rest Hotels",
        type: "CSN",
      },
      rfp: {
        id: "79b975b9-07e2-4d78-b7bc-941eb1bf894b",
      },
      date: new Date("2020-02-07T00:00:00.00Z"),
      lastModifiedDate: new Date("2020-02-07T00:00:00.00Z"),
      generalLedger: {
        id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
        code: "MU",
        name: "Meet up",
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
          name: "Budgeted",
          units: 5.2,
          cost: 100.5,
          gratuityDetail: {
            gratuity: 5.2,
            appliedGratuityValue: 25.2,
          },
          taxDetail: [
            {
              id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
              name: "Applicable Tax",
              taxType: "PERCENTAGE",
              tax: 5.2,
              appliedTaxValue: 5.2,
            },
          ],
          totalCost: 100.5,
        },
      ],
      savings: [
        {
          id: 1,
          name: "Budgeted - Actual",
          value: 15.8,
        },
      ],
      associatedRegistrants: [
        {
          firstName: "Amit",
          lastName: "Kumar",
          hcpStatus: true,
          inviteeId: "7cc5304a-9323-452f-8ae8-111cae0047b0",
          contactId: "0c478ddc-cf11-4026-a8e5-e6a59ae1c902",
        },
      ],
      associatedSession: "9463c74e-18c6-401a-a710-ae0f485bf959",
      customFields: [
        {
          id: "c0201561-fc30-47bc-a86e-5b9978bee850",
          name: "What is a your favorite color?",
          type: "MultiSelect",
          value: [
            "Choice C",
            "Choice A",
          ],
          order: 1,
        },
      ],
      deleted: false,
    },
  ],
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `paging`                                                                                         | [components.PagingJson](../../models/components/pagingjson.md)                                   | :heavy_check_mark:                                                                               | Represents pagination information for a collection of resources.                                 |
| `data`                                                                                           | [components.BudgetItemListResponseJson](../../models/components/budgetitemlistresponsejson.md)[] | :heavy_check_mark:                                                                               | Collection of budget items.                                                                      |
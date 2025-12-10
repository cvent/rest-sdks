# PaymentPaginatedResponse

The response from a request to get the list of payments for event.

## Example Usage

```typescript
import { PaymentPaginatedResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: PaymentPaginatedResponse = {
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
      name: "Check Payment",
      referenceNumber: "abc12bde",
      currency: "USD",
      amount: 5.2,
      date: new RFCDate("2020-02-07"),
      note: "This payment is for admission.",
      type: "CB",
      lastModified: new Date("2020-02-07T00:00:00.00Z"),
      id: "9463c74e-18c6-401a-a710-ae0f485bf959",
      budgetVersion: {
        id: "9463c74e-18c6-401a-a710-ae0f485bf959",
      },
      budgetItem: {
        id: "9463c74e-18c6-401a-a710-ae0f485bf959",
      },
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.PaymentResponse](../../models/components/paymentresponse.md)[] | :heavy_check_mark:                                                         | Collection of payments for budget items for an event.                      |
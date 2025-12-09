# OrderDetailsPaginatedResponse

The response from a request to list of orders. This includes the paging object as well.

## Example Usage

```typescript
import { OrderDetailsPaginatedResponse } from "@cvent/sdk/models/components";

let value: OrderDetailsPaginatedResponse = {
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
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
      event: {
        id: "4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56",
      },
      attendee: {
        id: "5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
      },
      number: "PZNK2PKZH4N",
      cancelled: false,
      type: "Online Refund",
      invoiceNumber: "112021-0017",
      amountOrdered: 35.35,
      amountPaid: 10.15,
      amountDue: 25.2,
      discounts: [
        {
          id: "e7fd2027-5b26-4965-9ddf-b5db78ebcfec",
          name: "SRV Discount Code",
          code: "HALF_OFF",
          type: "Amount",
          value: 50,
          amount: 15,
        },
      ],
      paymentMethod: "Mastercard",
      referenceNumber: "112021-0017",
      deleted: false,
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `paging`                                                                   | [components.PagingJson](../../models/components/pagingjson.md)             | :heavy_check_mark:                                                         | Represents pagination information for a collection of resources.           |
| `data`                                                                     | [components.OrderDetailJson](../../models/components/orderdetailjson.md)[] | :heavy_check_mark:                                                         | Collection of order details.                                               |
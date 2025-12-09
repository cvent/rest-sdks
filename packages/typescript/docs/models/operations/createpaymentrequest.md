# CreatePaymentRequest

## Example Usage

```typescript
import { CreatePaymentRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: CreatePaymentRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  payment: {
    name: "Check Payment",
    referenceNumber: "abc12bde",
    currency: "USD",
    amount: 5.2,
    date: new RFCDate("2020-02-07"),
    note: "This payment is for admission.",
    type: "MASTERCARD",
  },
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *string*                                                 | :heavy_check_mark:                                       | Unique ID of an event.                                   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                     |
| `budgetItemId`                                           | *string*                                                 | :heavy_check_mark:                                       | Unique ID of a budget item.                              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                     |
| `payment`                                                | [components.Payment](../../models/components/payment.md) | :heavy_check_mark:                                       | Payment to be created.                                   |                                                          |
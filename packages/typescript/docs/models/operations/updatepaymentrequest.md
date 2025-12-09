# UpdatePaymentRequest

## Example Usage

```typescript
import { UpdatePaymentRequest } from "@cvent/sdk/models/operations";
import { RFCDate } from "@cvent/sdk/types";

let value: UpdatePaymentRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  paymentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  paymentRequest: {
    name: "Check Payment",
    referenceNumber: "abc12bde",
    currency: "USD",
    amount: 5.2,
    date: new RFCDate("2020-02-07"),
    note: "This payment is for admission.",
    type: "SOLO",
    id: "9463c74e-18c6-401a-a710-ae0f485bf959",
  },
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *string*                                                               | :heavy_check_mark:                                                     | Unique ID of an event.                                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                   |
| `budgetItemId`                                                         | *string*                                                               | :heavy_check_mark:                                                     | Unique ID of a budget item.                                            | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                   |
| `paymentId`                                                            | *string*                                                               | :heavy_check_mark:                                                     | Unique ID of a payment.                                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                   |
| `paymentRequest`                                                       | [components.PaymentRequest](../../models/components/paymentrequest.md) | :heavy_check_mark:                                                     | The budget item payment to be updated.                                 |                                                                        |
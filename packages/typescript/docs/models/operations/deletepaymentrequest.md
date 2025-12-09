# DeletePaymentRequest

## Example Usage

```typescript
import { DeletePaymentRequest } from "@cvent/sdk/models/operations";

let value: DeletePaymentRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  paymentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Unique ID of an event.               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `budgetItemId`                       | *string*                             | :heavy_check_mark:                   | Unique ID of a budget item.          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `paymentId`                          | *string*                             | :heavy_check_mark:                   | Unique ID of a payment.              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
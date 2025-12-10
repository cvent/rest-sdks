# AttachInvoiceToPaymentRequest

## Example Usage

```typescript
import { AttachInvoiceToPaymentRequest } from "@cvent/sdk/models/operations";

let value: AttachInvoiceToPaymentRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  paymentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  invoiceId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_check_mark:                   | Unique ID of an event.               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `paymentId`                          | *string*                             | :heavy_check_mark:                   | Unique ID of a payment.              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `invoiceId`                          | *string*                             | :heavy_check_mark:                   | Unique ID of an invoice.             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
# Payment

Payment for a budget item in an event.

## Example Usage

```typescript
import { Payment } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: Payment = {
  name: "Check Payment",
  referenceNumber: "abc12bde",
  currency: "USD",
  amount: 5.2,
  date: new RFCDate("2020-02-07"),
  note: "This payment is for admission.",
  type: "BILLY",
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                   | *string*                                                                                                 | :heavy_check_mark:                                                                                       | Name of the payment.                                                                                     | Check Payment                                                                                            |
| `referenceNumber`                                                                                        | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Reference number for the payment. Assists the user in reconciling the payment with their bank statement. | abc12bde                                                                                                 |
| `currency`                                                                                               | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The ISO 4217 standard format currency code used of payment currency.                                     | USD                                                                                                      |
| `amount`                                                                                                 | *number*                                                                                                 | :heavy_check_mark:                                                                                       | Payment amount.                                                                                          | 5.2                                                                                                      |
| `date`                                                                                                   | [RFCDate](../../types/rfcdate.md)                                                                        | :heavy_check_mark:                                                                                       | The ISO 8601 zoned date assigned to the payment, typically denotes the date of payment.                  | 2020-02-07                                                                                               |
| `note`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Note for the payment done.                                                                               | This payment is for admission.                                                                           |
| `type`                                                                                                   | [components.PaymentTypeJson1](../../models/components/paymenttypejson1.md)                               | :heavy_minus_sign:                                                                                       | Denotes the method of payment.                                                                           | Visa                                                                                                     |
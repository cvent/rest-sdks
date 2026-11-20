# PaymentResponse

Payment for a budget item in an event.

## Example Usage

```typescript
import { PaymentResponse } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: PaymentResponse = {
  name: "Check Payment",
  referenceNumber: "abc12bde",
  currency: "USD",
  amount: 5.2,
  date: new RFCDate("2020-02-07"),
  note: "This payment is for admission.",
  type: "CHECK",
  lastModified: new Date("2020-02-07T00:00:00.000Z"),
  id: "a64b457b-19d9-484e-bb86-effc63f7a889",
  budgetVersion: {
    id: "b52e44a0-f3bb-4757-a45c-5a875c4b0946",
  },
  budgetItem: {
    id: "a4863748-d8df-4873-a81e-288cd7df9d14",
  },
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `name`                                                                                                   | *string*                                                                                                 | :heavy_check_mark:                                                                                       | Name of the payment.                                                                                     | Check Payment                                                                                            |
| `referenceNumber`                                                                                        | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Reference number for the payment. Assists the user in reconciling the payment with their bank statement. | abc12bde                                                                                                 |
| `currency`                                                                                               | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The ISO 4217 standard format currency code used of payment currency.                                     | USD                                                                                                      |
| `amount`                                                                                                 | *number*                                                                                                 | :heavy_check_mark:                                                                                       | Payment amount.                                                                                          | 5.2                                                                                                      |
| `date`                                                                                                   | [RFCDate](../../types/rfcdate.md)                                                                        | :heavy_check_mark:                                                                                       | The ISO 8601 date assigned to the payment. It typically denotes the date of payment.                     | 2020-02-07                                                                                               |
| `note`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Note for the payment done.                                                                               | This payment is for admission.                                                                           |
| `type`                                                                                                   | [components.PaymentType11](../../models/components/paymenttype11.md)                                     | :heavy_minus_sign:                                                                                       | Denotes the method of payment.                                                                           | Visa                                                                                                     |
| `lastModified`                                                                                           | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)            | :heavy_minus_sign:                                                                                       | The ISO 8601 zoned date and time when the budget item was last modified.                                 | 2020-02-07T00:00:00.000Z                                                                                 |
| `id`                                                                                                     | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The ID of the payment.                                                                                   | a64b457b-19d9-484e-bb86-effc63f7a889                                                                     |
| `budgetVersion`                                                                                          | [components.PaymentResponseBudgetVersion](../../models/components/paymentresponsebudgetversion.md)       | :heavy_minus_sign:                                                                                       | This is the budget version where this payment was made.                                                  |                                                                                                          |
| `budgetItem`                                                                                             | [components.PaymentResponseBudgetItem](../../models/components/paymentresponsebudgetitem.md)             | :heavy_minus_sign:                                                                                       | This is the budget item where this payment was made.                                                     |                                                                                                          |
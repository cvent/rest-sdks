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
  lastModified: new Date("2020-02-07T00:00:00.00Z"),
  id: "9463c74e-18c6-401a-a710-ae0f485bf959",
  budgetVersion: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf959",
  },
  budgetItem: {
    id: "9463c74e-18c6-401a-a710-ae0f485bf959",
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
| `date`                                                                                                   | [RFCDate](../../types/rfcdate.md)                                                                        | :heavy_check_mark:                                                                                       | The ISO 8601 zoned date assigned to the payment, typically denotes the date of payment.                  | 2020-02-07                                                                                               |
| `note`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Note for the payment done.                                                                               | This payment is for admission.                                                                           |
| `type`                                                                                                   | [components.PaymentTypeJson1](../../models/components/paymenttypejson1.md)                               | :heavy_minus_sign:                                                                                       | Denotes the method of payment.                                                                           | Visa                                                                                                     |
| `lastModified`                                                                                           | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)            | :heavy_minus_sign:                                                                                       | The ISO 8601 zoned date and time when the budget item was last modified.                                 | 2020-02-07T00:00:00.00Z                                                                                  |
| `id`                                                                                                     | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The ID of the payment.                                                                                   | 9463c74e-18c6-401a-a710-ae0f485bf959                                                                     |
| `budgetVersion`                                                                                          | [components.PaymentResponseBudgetVersion](../../models/components/paymentresponsebudgetversion.md)       | :heavy_minus_sign:                                                                                       | This is the budget version where this payment was made.                                                  |                                                                                                          |
| `budgetItem`                                                                                             | [components.PaymentResponseBudgetItem](../../models/components/paymentresponsebudgetitem.md)             | :heavy_minus_sign:                                                                                       | This is the budget item where this payment was made.                                                     |                                                                                                          |
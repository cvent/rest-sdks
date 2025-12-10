# OtherPaymentJson

Other payment details.

## Example Usage

```typescript
import { OtherPaymentJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: OtherPaymentJson = {
  amount: 0,
  paymentDate: new RFCDate("2021-12-31"),
  referenceItem: "Reference Item",
  checkNumber: "Check Num",
  received: false,
  note: "No Comment",
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `amount`                               | *number*                               | :heavy_minus_sign:                     | Amount paid.                           | 0                                      |
| `paymentDate`                          | [RFCDate](../../types/rfcdate.md)      | :heavy_minus_sign:                     | Payment due date or date of payment.   | 2021-12-31                             |
| `referenceItem`                        | *string*                               | :heavy_minus_sign:                     | Payment reference item.                | Reference Item                         |
| `checkNumber`                          | *string*                               | :heavy_minus_sign:                     | Pay check number.                      | Check Num                              |
| `received`                             | *boolean*                              | :heavy_minus_sign:                     | True indicates a payment was received. | false                                  |
| `note`                                 | *string*                               | :heavy_minus_sign:                     | Payment note.                          | No Comment                             |
# CreditCardResponseJson

Credit Card Response Object

## Example Usage

```typescript
import { CreditCardResponseJson } from "@cvent/sdk/models/components";

let value: CreditCardResponseJson = {
  cardType: "VISA",
  last4Digits: "4444",
  accountHolderName: "John Doe",
  expMonth: 11,
  expYear: 2026,
  number: "************1111",
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `cardType`                                                                     | [components.CreditCardTypeJson](../../models/components/creditcardtypejson.md) | :heavy_minus_sign:                                                             | Credit Card Type                                                               | VISA                                                                           |
| `last4Digits`                                                                  | *string*                                                                       | :heavy_minus_sign:                                                             | Last 4 digits of the credit card.                                              | 4444                                                                           |
| `accountHolderName`                                                            | *string*                                                                       | :heavy_minus_sign:                                                             | Name on the credit card.                                                       | John Doe                                                                       |
| `expMonth`                                                                     | *number*                                                                       | :heavy_minus_sign:                                                             | Credit card expiration month.                                                  | 11                                                                             |
| `expYear`                                                                      | *number*                                                                       | :heavy_minus_sign:                                                             | Credit card expiration year.                                                   | 2026                                                                           |
| `number`                                                                       | *string*                                                                       | :heavy_minus_sign:                                                             | Masked credit card number.                                                     | ************1111                                                               |
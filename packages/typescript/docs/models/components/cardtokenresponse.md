# CardTokenResponse

Card token resource created in response to generating a card token for a credit card.

## Example Usage

```typescript
import { CardTokenResponse } from "@cvent/sdk/models/components";

let value: CardTokenResponse = {
  id: "00000000-0000-0000-0000-000000000000",
  creditCard: {
    cardType: "VISA",
    last4Digits: "4444",
    accountHolderName: "John Doe",
    expMonth: 11,
    expYear: 2026,
    number: "************1111",
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `id`                                                                                   | *string*                                                                               | :heavy_minus_sign:                                                                     | A token that can be used to reference the credit card for a transaction.               | 00000000-0000-0000-0000-000000000000                                                   |
| `creditCard`                                                                           | [components.CreditCardResponseJson](../../models/components/creditcardresponsejson.md) | :heavy_minus_sign:                                                                     | Credit Card Response Object                                                            |                                                                                        |
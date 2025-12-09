# TokenizedCreditCardJsonInput

Credit card info.

## Example Usage

```typescript
import { TokenizedCreditCardJsonInput } from "@cvent/sdk/models/components";

let value: TokenizedCreditCardJsonInput = {
  paymentToken: "1234567890",
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `type`                                                                           | [components.CreditCardTypesJson](../../models/components/creditcardtypesjson.md) | :heavy_minus_sign:                                                               | Credit card type.                                                                |                                                                                  |
| `paymentToken`                                                                   | *string*                                                                         | :heavy_check_mark:                                                               | Credit card token. Use Tokenization API to generate.                             | 1234567890                                                                       |
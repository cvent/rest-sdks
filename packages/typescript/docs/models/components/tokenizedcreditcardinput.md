# TokenizedCreditCardInput

Credit card info.

## Example Usage

```typescript
import { TokenizedCreditCardInput } from "@cvent/sdk/models/components";

let value: TokenizedCreditCardInput = {
  paymentToken: "1234567890",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `type`                                                                   | [components.CreditCardTypes](../../models/components/creditcardtypes.md) | :heavy_minus_sign:                                                       | Credit card type.                                                        |                                                                          |
| `paymentToken`                                                           | *string*                                                                 | :heavy_check_mark:                                                       | Credit card token. Use Tokenization API to generate.                     | 1234567890                                                               |
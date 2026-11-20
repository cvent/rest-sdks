# CardTransactionUpdate

The transaction you're updating and its associated details.

## Example Usage

```typescript
import { CardTransactionUpdate } from "@cvent/sdk/models/components";

let value: CardTransactionUpdate = {
  id: "1VCAPITRAN18012023",
  eventId: "37045558-6a98-4021-ba39-3b0c214f4dd4",
  cardDescription: "API Card Transaction",
  transactionAmount: 1000.87,
  transactionDate: new Date("2020-02-07T00:00:00.000Z"),
  transactionCurrency: "USD",
  transactionMerchant: "API Merchant",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Transaction ID assigned by the payment processor or gateway. This value must be unique.       | 1VCAPITRAN18012023                                                                            |
| `eventId`                                                                                     | *string*                                                                                      | :heavy_minus_sign:                                                                            | Event ID associated with the transaction.                                                     | 37045558-6a98-4021-ba39-3b0c214f4dd4                                                          |
| `cardDescription`                                                                             | *string*                                                                                      | :heavy_minus_sign:                                                                            | Description of the card associated with the transaction.                                      | API Card Transaction                                                                          |
| `transactionAmount`                                                                           | *number*                                                                                      | :heavy_minus_sign:                                                                            | The transaction amount.                                                                       | 1000.87                                                                                       |
| `transactionDate`                                                                             | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | ISO 8601 date and time of the transaction (in UTC).                                           | 2020-02-07T00:00:00.000Z                                                                      |
| `transactionCurrency`                                                                         | *string*                                                                                      | :heavy_minus_sign:                                                                            | ISO 4217 currency code of the transaction currency.                                           | USD                                                                                           |
| `transactionMerchant`                                                                         | *string*                                                                                      | :heavy_minus_sign:                                                                            | Name of the merchant used in the transaction.                                                 | API Merchant                                                                                  |
# CardTransactionJson1

Card transaction associated with an event.

## Example Usage

```typescript
import { CardTransactionJson1 } from "@cvent/sdk/models/components";

let value: CardTransactionJson1 = {
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  card: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  id: "1000000012",
  transactionDate: new Date("2020-02-07T09:37:50Z"),
  type: "Approved",
  amount: 100.5,
  currency: "USD",
  merchant: "Test Merchant",
  reconciliation: {
    status: "Reconciled",
    amount: 100.5,
    reconciledBy: "Test User",
    reconciledDate: new Date("2020-02-07T09:37:50Z"),
  },
  reconciliations: [
    {
      status: "Reconciled",
      amount: 100.5,
      reconciledBy: "Test User",
      reconciledDate: new Date("2020-02-07T09:37:50Z"),
    },
  ],
  descriptions: [
    "Electricity bill",
    "Event ticket",
    "Miscellaneous charge",
    "Purchase car",
    "Accommodation charge",
  ],
};
```

## Fields

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            | Example                                                                                                |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `event`                                                                                                | [components.CardTransactionJson1Event](../../models/components/cardtransactionjson1event.md)           | :heavy_minus_sign:                                                                                     | The identifier of the Event.                                                                           |                                                                                                        |
| `card`                                                                                                 | [components.Card](../../models/components/card.md)                                                     | :heavy_minus_sign:                                                                                     | The identifier of the Card.                                                                            |                                                                                                        |
| `id`                                                                                                   | *string*                                                                                               | :heavy_minus_sign:                                                                                     | Card transaction ID.                                                                                   | 1000000012                                                                                             |
| `transactionDate`                                                                                      | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)          | :heavy_minus_sign:                                                                                     | The ISO 8601 zoned date and time for Card transaction date.                                            | 2020-02-07T09:37:50Z                                                                                   |
| `type`                                                                                                 | [components.TransactionTypeJson1](../../models/components/transactiontypejson1.md)                     | :heavy_minus_sign:                                                                                     | This is used to denote the transaction type for a transaction.                                         | Approved                                                                                               |
| `amount`                                                                                               | *number*                                                                                               | :heavy_minus_sign:                                                                                     | Transaction amount.                                                                                    | 100.5                                                                                                  |
| `currency`                                                                                             | *string*                                                                                               | :heavy_minus_sign:                                                                                     | The ISO 4217 standard format currency code used of transaction currency.                               | USD                                                                                                    |
| `merchant`                                                                                             | *string*                                                                                               | :heavy_minus_sign:                                                                                     | Merchant name.                                                                                         | Test Merchant                                                                                          |
| `reconciliation`                                                                                       | [components.TransactionReconciliation](../../models/components/transactionreconciliation.md)           | :heavy_minus_sign:                                                                                     | N/A                                                                                                    |                                                                                                        |
| `reconciliations`                                                                                      | [components.ZeroAllOf6](../../models/components/zeroallof6.md)[]                                       | :heavy_minus_sign:                                                                                     | The list of reconciled item.                                                                           |                                                                                                        |
| `descriptions`                                                                                         | *string*[]                                                                                             | :heavy_minus_sign:                                                                                     | The list of transaction description.                                                                   | [<br/>"Electricity bill",<br/>"Event ticket",<br/>"Miscellaneous charge",<br/>"Purchase car",<br/>"Accommodation charge"<br/>] |
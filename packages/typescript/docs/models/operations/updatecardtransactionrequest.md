# UpdateCardTransactionRequest

## Example Usage

```typescript
import { UpdateCardTransactionRequest } from "@cvent/sdk/models/operations";

let value: UpdateCardTransactionRequest = {
  transactionId: "1VCAPITRAN18012023",
  cardTransactionUpdate: {
    id: "1VCAPITRAN18012023",
    eventId: "9463c74e-18c6-401a-a710-ae0f485bf959",
    cardDescription: "API Card Transaction",
    transactionAmount: 1000.87,
    transactionDate: new Date("2020-02-07T00:00:00.00Z"),
    transactionCurrency: "USD",
    transactionMerchant: "API Merchant",
  },
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `transactionId`                                                                      | *string*                                                                             | :heavy_check_mark:                                                                   | Unique ID of a transaction.                                                          | 1VCAPITRAN18012023                                                                   |
| `cardTransactionUpdate`                                                              | [components.CardTransactionUpdate](../../models/components/cardtransactionupdate.md) | :heavy_check_mark:                                                                   | Single card transaction record to be updated.                                        |                                                                                      |
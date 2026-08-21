# GetAccountTransactionItemRequest

## Example Usage

```typescript
import { GetAccountTransactionItemRequest } from "@cvent/sdk/models/operations";

let value: GetAccountTransactionItemRequest = {
  transactionId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  transactionItemId:
    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::7f3e2a1b-c4d5-6789-efab-2345678901bc",
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                | Example                                                                    |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `transactionId`                                                            | *string*                                                                   | :heavy_check_mark:                                                         | Unique ID of a Transaction.                                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                       |
| `transactionItemId`                                                        | *string*                                                                   | :heavy_check_mark:                                                         | Unique ID of a Transaction item.                                           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::7f3e2a1b-c4d5-6789-efab-2345678901bc |
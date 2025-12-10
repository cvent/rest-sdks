# TransactionJson

This is used to denote the id and merchant/processor transaction id for transaction items.

## Example Usage

```typescript
import { TransactionJson } from "@cvent/sdk/models/components";

let value: TransactionJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  processorTransactionId: "ch_3Lrr4TBhiDV0mZz50nZpGx4a",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `id`                                                                 | *string*                                                             | :heavy_check_mark:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `processorTransactionId`                                             | *string*                                                             | :heavy_minus_sign:                                                   | This denotes the online processor transaction Id for transactions.   | ch_3Lrr4TBhiDV0mZz50nZpGx4a                                          |
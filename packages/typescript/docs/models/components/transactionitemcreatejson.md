# TransactionItemCreateJson

The item in the created transaction.

## Example Usage

```typescript
import { TransactionItemCreateJson } from "@cvent/sdk/models/components";

let value: TransactionItemCreateJson = {
  product: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  amount: 15.25,
};
```

## Fields

| Field                                                                                                                               | Type                                                                                                                                | Required                                                                                                                            | Description                                                                                                                         | Example                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
| `product`                                                                                                                           | [components.ProductOrderItemJson](../../models/components/productorderitemjson.md)                                                  | :heavy_minus_sign:                                                                                                                  | This is used to denote the product details in an order item                                                                         |                                                                                                                                     |
| `amount`                                                                                                                            | *number*                                                                                                                            | :heavy_minus_sign:                                                                                                                  | Amount of the overall transaction you're allotting to the specified product. This amount is in the same currency used by the event. | 15.25                                                                                                                               |
# GetAccountOrderItemRequest

## Example Usage

```typescript
import { GetAccountOrderItemRequest } from "@cvent/sdk/models/operations";

let value: GetAccountOrderItemRequest = {
  orderId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  orderItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `orderId`                            | *string*                             | :heavy_check_mark:                   | Unique ID of an Order.               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
| `orderItemId`                        | *string*                             | :heavy_check_mark:                   | Unique ID of an Order Item.          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
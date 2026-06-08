# OrderItemAssociateDiscount

Details for order item update while associating a discount code

## Example Usage

```typescript
import { OrderItemAssociateDiscount } from "@cvent/sdk/models/components";

let value: OrderItemAssociateDiscount = {
  event: {
    id: "4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56",
  },
  order: {
    id: "6c0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
  },
  item: {
    id: "6c0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
  },
  amountOrdered: 15.35,
};
```

## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `event`                                                           | [components.Event2](../../models/components/event2.md)            | :heavy_check_mark:                                                | The reference to the event. Contains only the ID of the event.    |                                                                   |
| `order`                                                           | [components.Order](../../models/components/order.md)              | :heavy_check_mark:                                                | Represents an order. Contains only the ID of the order.           |                                                                   |
| `item`                                                            | [components.OrderItem](../../models/components/orderitem.md)      | :heavy_check_mark:                                                | Represents an order item. Contains only the ID of the order item. |                                                                   |
| `amountOrdered`                                                   | *number*                                                          | :heavy_check_mark:                                                | New order amount for the charge order item.                       | 15.35                                                             |
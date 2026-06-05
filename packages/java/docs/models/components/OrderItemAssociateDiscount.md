# OrderItemAssociateDiscount

Details for order item update while associating a discount code


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `event`                                                           | [Event2](../../models/components/Event2.md)                       | :heavy_check_mark:                                                | The reference to the event. Contains only the ID of the event.    |                                                                   |
| `order`                                                           | [Order](../../models/components/Order.md)                         | :heavy_check_mark:                                                | Represents an order. Contains only the ID of the order.           |                                                                   |
| `item`                                                            | [OrderItem](../../models/components/OrderItem.md)                 | :heavy_check_mark:                                                | Represents an order item. Contains only the ID of the order item. |                                                                   |
| `amountOrdered`                                                   | *double*                                                          | :heavy_check_mark:                                                | New order amount for the charge order item.                       | 15.35                                                             |
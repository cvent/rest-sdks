# OrderItemAssociateDiscount

Details for order item update while associating a discount code


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `event`                                                           | [EventJson](../../models/components/EventJson.md)                 | :heavy_check_mark:                                                | The reference to the event. Contains only the ID of the event.    |                                                                   |
| `order`                                                           | [OrderJson](../../models/components/OrderJson.md)                 | :heavy_check_mark:                                                | Represents an order. Contains only the ID of the order.           |                                                                   |
| `item`                                                            | [OrderItemJson0](../../models/components/OrderItemJson0.md)       | :heavy_check_mark:                                                | Represents an order item. Contains only the ID of the order item. |                                                                   |
| `amountOrdered`                                                   | *double*                                                          | :heavy_check_mark:                                                | New order amount for the charge order item.                       | 15.35                                                             |
# OrderItemAssociateDiscount

Details for order item update while associating a discount code


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Event`                                                           | [EventJson](../../Models/Components/EventJson.md)                 | :heavy_check_mark:                                                | The reference to the event. Contains only the ID of the event.    |                                                                   |
| `Order`                                                           | [OrderJson](../../Models/Components/OrderJson.md)                 | :heavy_check_mark:                                                | Represents an order. Contains only the ID of the order.           |                                                                   |
| `Item`                                                            | [OrderItemJson0](../../Models/Components/OrderItemJson0.md)       | :heavy_check_mark:                                                | Represents an order item. Contains only the ID of the order item. |                                                                   |
| `AmountOrdered`                                                   | *double*                                                          | :heavy_check_mark:                                                | New order amount for the charge order item.                       | 15.35                                                             |
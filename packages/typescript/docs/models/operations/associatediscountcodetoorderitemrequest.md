# AssociateDiscountCodeToOrderItemRequest

## Example Usage

```typescript
import { AssociateDiscountCodeToOrderItemRequest } from "@cvent/sdk/models/operations";

let value: AssociateDiscountCodeToOrderItemRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  orderId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  orderItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  discountCode: "HALF_OFF",
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `id`                                                                                           | *string*                                                                                       | :heavy_check_mark:                                                                             | Unique ID of an Event.                                                                         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                           |
| `orderId`                                                                                      | *string*                                                                                       | :heavy_check_mark:                                                                             | Unique ID of an Order.                                                                         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                           |
| `orderItemId`                                                                                  | *string*                                                                                       | :heavy_check_mark:                                                                             | Unique ID of an Order Item.                                                                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                           |
| `discountCode`                                                                                 | *string*                                                                                       | :heavy_check_mark:                                                                             | Unique Code for a Discount.                                                                    | HALF_OFF                                                                                       |
| `orderItemAssociateDiscount`                                                                   | [components.OrderItemAssociateDiscount](../../models/components/orderitemassociatediscount.md) | :heavy_minus_sign:                                                                             | Details in body required to associate discount code to order item.                             |                                                                                                |
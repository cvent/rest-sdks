# OrderRef

Represents an order by its ID and includes the order type.

## Example Usage

```typescript
import { OrderRef } from "@cvent/sdk/models/components";

let value: OrderRef = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  type: "Online Refund",
};
```

## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `id`                                                          | *string*                                                      | :heavy_minus_sign:                                            | The unique identifier of the order.                           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                          |
| `type`                                                        | [components.OrderType](../../models/components/ordertype.md)  | :heavy_minus_sign:                                            | This is used to denote the type of order made by an attendee. | Online Refund                                                 |
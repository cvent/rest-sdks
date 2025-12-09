# ProductOrderItemJson

This is used to denote the product details in an order item

## Example Usage

```typescript
import { ProductOrderItemJson } from "@cvent/sdk/models/components";

let value: ProductOrderItemJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *string*                                                                     | :heavy_minus_sign:                                                           | A string that has to be a format matching the industry standard uuid         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `type`                                                                       | [components.OrderItemTypeJson](../../models/components/orderitemtypejson.md) | :heavy_minus_sign:                                                           | This is used to denote the product type.                                     | Session                                                                      |
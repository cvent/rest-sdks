# ProductOrderItemJson

This is used to denote the product details in an order item


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *Optional\<String>*                                                          | :heavy_minus_sign:                                                           | A string that has to be a format matching the industry standard uuid         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `type`                                                                       | [Optional\<OrderItemTypeJson>](../../models/components/OrderItemTypeJson.md) | :heavy_minus_sign:                                                           | This is used to denote the product type.                                     | Session                                                                      |
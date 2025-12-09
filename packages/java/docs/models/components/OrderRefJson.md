# OrderRefJson

Represents an order by its ID and includes the order type.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `id`                                                                 | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | The unique identifier of the order.                                  | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `type`                                                               | [Optional\<OrderTypeJson>](../../models/components/OrderTypeJson.md) | :heavy_minus_sign:                                                   | This is used to denote the type of order made by an attendee.        | Online Refund                                                        |
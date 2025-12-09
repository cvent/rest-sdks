# OrderItemResponse

This is used to denote an item in the order

## Example Usage

```typescript
import { OrderItemResponse } from "@cvent/sdk/models/components";

let value: OrderItemResponse = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  order: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    type: "Online Refund",
  },
  event: {
    id: "4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56",
  },
  attendee: {
    id: "5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
  },
  guest: true,
  guestDetail: {
    id: "07c1cf32-a603-4736-8b77-749c3cee3107",
  },
  product: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  active: true,
  name: "Dinner Session",
  price: 15.35,
  fee: {
    id: "28FEA0CD-A8B8-4A51-96C1-DDD5EAD642C6",
    name: "Orientation Session Registration Fee",
  },
  quantity: 2,
  amountOrdered: 35.35,
  amountPaid: 10.15,
  amountDue: 25.2,
  productPriceTierAmount: 15.35,
  tiered: true,
  generalLedgerItems: [
    {
      id: "a6b6c1bc-e410-48da-86c2-80478ecf60f9",
      name: "Other Accounts Receivable",
      code: "123445",
      description: "Other Accounts Receivable; Leg. Accounts Receivable",
      allocationPercentage: 50,
    },
  ],
  discounts: [
    {
      id: "e7fd2027-5b26-4965-9ddf-b5db78ebcfec",
      name: "SRV Discount Code",
      code: "HALF_OFF",
      type: "Amount",
      value: 50,
      amount: 15,
    },
  ],
  deleted: false,
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | A string that has to be a format matching the industry standard uuid                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `order`                                                                                       | [components.OrderRefJson](../../models/components/orderrefjson.md)                            | :heavy_minus_sign:                                                                            | Represents an order by its ID and includes the order type.                                    |                                                                                               |
| `event`                                                                                       | [components.EventJson](../../models/components/eventjson.md)                                  | :heavy_minus_sign:                                                                            | The reference to the event. Contains only the ID of the event.                                |                                                                                               |
| `attendee`                                                                                    | [components.AttendeeJson](../../models/components/attendeejson.md)                            | :heavy_minus_sign:                                                                            | The reference to the attendee. Contains only the ID of the attendee.                          |                                                                                               |
| `guest`                                                                                       | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Indicates if an attendee is a guest                                                           | true                                                                                          |
| `guestDetail`                                                                                 | [components.GuestDetailJson](../../models/components/guestdetailjson.md)                      | :heavy_minus_sign:                                                                            | The reference to the guest. Contains only the ID of the guest.                                |                                                                                               |
| `product`                                                                                     | [components.ProductOrderItemJson](../../models/components/productorderitemjson.md)            | :heavy_minus_sign:                                                                            | This is used to denote the product details in an order item                                   |                                                                                               |
| `active`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Indicates if the order item is active                                                         | true                                                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | This denotes the name of the item                                                             | Dinner Session                                                                                |
| `price`                                                                                       | *number*                                                                                      | :heavy_minus_sign:                                                                            | Price of the item                                                                             | 15.35                                                                                         |
| `fee`                                                                                         | [components.FeeJson](../../models/components/feejson.md)                                      | :heavy_minus_sign:                                                                            | Fee for a product.                                                                            |                                                                                               |
| `quantity`                                                                                    | *number*                                                                                      | :heavy_minus_sign:                                                                            | Quantity of item purchased by an attendee.                                                    | 2                                                                                             |
| `amountOrdered`                                                                               | *number*                                                                                      | :heavy_minus_sign:                                                                            | Total amount for the item purchased by the attendee.                                          | 35.35                                                                                         |
| `amountPaid`                                                                                  | *number*                                                                                      | :heavy_minus_sign:                                                                            | Amount paid by the attendee.                                                                  | 10.15                                                                                         |
| `amountDue`                                                                                   | *number*                                                                                      | :heavy_minus_sign:                                                                            | Amount due on the order item.                                                                 | 25.2                                                                                          |
| `productPriceTierAmount`                                                                      | *number*                                                                                      | :heavy_minus_sign:                                                                            | Cost of item at current/early bird price                                                      | 15.35                                                                                         |
| `tiered`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Indicates if the order item is tiered                                                         | true                                                                                          |
| `generalLedgerItems`                                                                          | [components.GeneralLedgerJson](../../models/components/generalledgerjson.md)[]                | :heavy_minus_sign:                                                                            | The list of general ledger details in an order item.                                          |                                                                                               |
| `discounts`                                                                                   | [components.DiscountDetailJson](../../models/components/discountdetailjson.md)[]              | :heavy_minus_sign:                                                                            | The list of discount details.                                                                 |                                                                                               |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the order item has been deleted.                                               | false                                                                                         |
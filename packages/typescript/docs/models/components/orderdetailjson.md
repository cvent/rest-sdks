# OrderDetailJson

This is used to denote the details of the order made by an attendee.

## Example Usage

```typescript
import { OrderDetailJson } from "@cvent/sdk/models/components";

let value: OrderDetailJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  event: {
    id: "4a0e8d1f-8fd6-4ebe-977a-602b4a1f9c56",
  },
  attendee: {
    id: "5b0e8d1f-8fd6-4ebe-977a-602b4a1f9c43",
  },
  number: "PZNK2PKZH4N",
  cancelled: false,
  type: "Online Refund",
  invoiceNumber: "112021-0017",
  amountOrdered: 35.35,
  amountPaid: 10.15,
  amountDue: 25.2,
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
  paymentMethod: "Mastercard",
  referenceNumber: "112021-0017",
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
| `event`                                                                                       | [components.EventJson](../../models/components/eventjson.md)                                  | :heavy_minus_sign:                                                                            | The reference to the event. Contains only the ID of the event.                                |                                                                                               |
| `attendee`                                                                                    | [components.AttendeeJson](../../models/components/attendeejson.md)                            | :heavy_minus_sign:                                                                            | The reference to the attendee. Contains only the ID of the attendee.                          |                                                                                               |
| `number`                                                                                      | *string*                                                                                      | :heavy_minus_sign:                                                                            | Order number for this order                                                                   | PZNK2PKZH4N                                                                                   |
| `cancelled`                                                                                   | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | This denotes if an order is cancelled or not.                                                 | false                                                                                         |
| `type`                                                                                        | [components.OrderTypeJson](../../models/components/ordertypejson.md)                          | :heavy_minus_sign:                                                                            | This is used to denote the type of order made by an attendee.                                 | Online Refund                                                                                 |
| `invoiceNumber`                                                                               | *string*                                                                                      | :heavy_minus_sign:                                                                            | This denotes the invoice number of this order                                                 | 112021-0017                                                                                   |
| `amountOrdered`                                                                               | *number*                                                                                      | :heavy_minus_sign:                                                                            | Total amount for items purchased by the attendee.                                             | 35.35                                                                                         |
| `amountPaid`                                                                                  | *number*                                                                                      | :heavy_minus_sign:                                                                            | Amount paid by the attendee.                                                                  | 10.15                                                                                         |
| `amountDue`                                                                                   | *number*                                                                                      | :heavy_minus_sign:                                                                            | Amount due on the order.                                                                      | 25.2                                                                                          |
| `discounts`                                                                                   | [components.DiscountDetailJson](../../models/components/discountdetailjson.md)[]              | :heavy_minus_sign:                                                                            | The list of discount details.                                                                 |                                                                                               |
| `paymentMethod`                                                                               | *string*                                                                                      | :heavy_minus_sign:                                                                            | This denotes the payment method used for transaction                                          | Mastercard                                                                                    |
| `referenceNumber`                                                                             | *string*                                                                                      | :heavy_minus_sign:                                                                            | This denotes the reference number of the transaction                                          | 112021-0017                                                                                   |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the order has been deleted.                                                    | false                                                                                         |
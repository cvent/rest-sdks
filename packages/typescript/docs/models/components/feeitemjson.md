# FeeItemJson

A fee item is a fee associated with something an agenda item at the event. A given agenda item can have one or more fee items associated.

## Example Usage

```typescript
import { FeeItemJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: FeeItemJson = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Orientation Session Registration Fee",
  amount: 100,
  currency: "EUR",
  product: {
    id: "a64b648e-b7b0-4031-8f8a-8d5e0919b936",
    type: "AdmissionItem",
    name: "Admission Item 1",
  },
  earlyBirdPricing: [
    {
      id: "b64b648e-b7b0-4031-8f8a-8d5e0919b936",
      amount: 100,
      registerByDate: new RFCDate("2020-02-09"),
      maxRefund: 100,
    },
  ],
  refundPolicy: [
    {
      amount: 50,
      percentage: 50,
      type: "RefundByPercentage",
      cancelByDate: new RFCDate("2020-02-09"),
    },
  ],
  display: true,
  default: true,
  generalLedgerCodes: [
    {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d5",
      name: "General Ledger",
      code: "General Ledger Code",
      allocation: 100,
    },
  ],
  registrationTypes: [
    "a64b648e-b7b0-4031-8f8a-8d5e0919b936",
    "f590f1ee-6c54-4b01-90e6-d701748f0851",
  ],
};
```

## Fields

| Field                                                                                                                                                | Type                                                                                                                                                 | Required                                                                                                                                             | Description                                                                                                                                          | Example                                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| `created`                                                                                                                                            | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                                        | :heavy_minus_sign:                                                                                                                                   | The ISO 8601 zoned date time when this record was created.                                                                                           | 2017-01-02T02:00:00Z                                                                                                                                 |
| `createdBy`                                                                                                                                          | *string*                                                                                                                                             | :heavy_minus_sign:                                                                                                                                   | The identifier of the user that created this record.                                                                                                 | hporter                                                                                                                                              |
| `lastModified`                                                                                                                                       | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                                        | :heavy_minus_sign:                                                                                                                                   | The ISO 8601 zoned date time when this record was updated.                                                                                           | 2019-02-12T03:00:00Z                                                                                                                                 |
| `lastModifiedBy`                                                                                                                                     | *string*                                                                                                                                             | :heavy_minus_sign:                                                                                                                                   | The identifier of the user that last updated this record.                                                                                            | hporter                                                                                                                                              |
| `id`                                                                                                                                                 | *string*                                                                                                                                             | :heavy_minus_sign:                                                                                                                                   | A unique identifier of the fee item.                                                                                                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                                                                 |
| `name`                                                                                                                                               | *string*                                                                                                                                             | :heavy_minus_sign:                                                                                                                                   | Name of the fee.                                                                                                                                     | Orientation Session Registration Fee                                                                                                                 |
| `amount`                                                                                                                                             | *number*                                                                                                                                             | :heavy_minus_sign:                                                                                                                                   | The total fee amount.                                                                                                                                | 100                                                                                                                                                  |
| `currency`                                                                                                                                           | *string*                                                                                                                                             | :heavy_minus_sign:                                                                                                                                   | Denotes the ISO 4217 currency code for this fee item.                                                                                                | EUR                                                                                                                                                  |
| `product`                                                                                                                                            | [components.ProductJson](../../models/components/productjson.md)                                                                                     | :heavy_minus_sign:                                                                                                                                   | Represents a product. Products are items that can be purchased during registration.                                                                  |                                                                                                                                                      |
| `earlyBirdPricing`                                                                                                                                   | [components.EarlyBirdPricingJson](../../models/components/earlybirdpricingjson.md)[]                                                                 | :heavy_minus_sign:                                                                                                                                   | Early bird pricing associated with the fee.                                                                                                          |                                                                                                                                                      |
| `refundPolicy`                                                                                                                                       | [components.RefundPolicyJson](../../models/components/refundpolicyjson.md)[]                                                                         | :heavy_minus_sign:                                                                                                                                   | Refund policy for the fee.                                                                                                                           |                                                                                                                                                      |
| `active`                                                                                                                                             | *boolean*                                                                                                                                            | :heavy_minus_sign:                                                                                                                                   | True indicates that the fee is active.                                                                                                               |                                                                                                                                                      |
| `display`                                                                                                                                            | *boolean*                                                                                                                                            | :heavy_minus_sign:                                                                                                                                   | True indicates that the fee displays in the fee widget.                                                                                              | true                                                                                                                                                 |
| `default`                                                                                                                                            | *boolean*                                                                                                                                            | :heavy_minus_sign:                                                                                                                                   | True indicates this is the default fee. Default fees apply to attendees without a registration type. Each agenda item can only have one default fee. | true                                                                                                                                                 |
| `generalLedgerCodes`                                                                                                                                 | [components.GeneralLedgerCodeJson](../../models/components/generalledgercodejson.md)[]                                                               | :heavy_minus_sign:                                                                                                                                   | General ledger codes for the fee.                                                                                                                    |                                                                                                                                                      |
| `registrationTypes`                                                                                                                                  | *string*[]                                                                                                                                           | :heavy_minus_sign:                                                                                                                                   | The registration types this fee is applies to, represented by their IDs.                                                                             | [<br/>"a64b648e-b7b0-4031-8f8a-8d5e0919b936",<br/>"f590f1ee-6c54-4b01-90e6-d701748f0851"<br/>]                                                       |
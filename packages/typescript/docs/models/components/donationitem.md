# DonationItem

Donation item selected by attendee during event registration.

## Example Usage

```typescript
import { DonationItem } from "@cvent/sdk/models/components";

let value: DonationItem = {
  id: "2d8234f1-55df-483c-abe3-7e2cb98f8275",
  event: {
    id: "2d8234f1-55df-483c-abe3-7e2cb98f8275",
  },
  name: "T-Shirts",
  code: "SHIRTS",
  type: "DonationItem",
  amountPaid: 500.75,
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *string*                                                                     | :heavy_minus_sign:                                                           | The unique ID representing the optional item.                                | 2d8234f1-55df-483c-abe3-7e2cb98f8275                                         |
| `event`                                                                      | [components.DonationItemEvent](../../models/components/donationitemevent.md) | :heavy_minus_sign:                                                           | The event this optional item belongs to.                                     |                                                                              |
| `name`                                                                       | *string*                                                                     | :heavy_minus_sign:                                                           | The name of the optional item.                                               | T-Shirts                                                                     |
| `code`                                                                       | *string*                                                                     | :heavy_minus_sign:                                                           | The planner provided code of the optional item.                              | SHIRTS                                                                       |
| `type`                                                                       | [components.OptionalItemType](../../models/components/optionalitemtype.md)   | :heavy_minus_sign:                                                           | Denotes the product type of the optional item.                               | DonationItem                                                                 |
| `amountPaid`                                                                 | *number*                                                                     | :heavy_minus_sign:                                                           | The donation amount paid by an attendee in the event.                        | 500.75                                                                       |
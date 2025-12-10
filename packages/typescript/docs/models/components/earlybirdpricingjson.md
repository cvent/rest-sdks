# EarlyBirdPricingJson

Early bird pricing for a fee, where attendees receive a discounted fee if they register before a given date.

## Example Usage

```typescript
import { EarlyBirdPricingJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: EarlyBirdPricingJson = {
  id: "b64b648e-b7b0-4031-8f8a-8d5e0919b936",
  amount: 100,
  registerByDate: new RFCDate("2020-02-09"),
  maxRefund: 100,
};
```

## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `id`                                                                                            | *string*                                                                                        | :heavy_minus_sign:                                                                              | The ID of an early bird price.                                                                  | b64b648e-b7b0-4031-8f8a-8d5e0919b936                                                            |
| `amount`                                                                                        | *number*                                                                                        | :heavy_minus_sign:                                                                              | Fee amount for an early bird price.                                                             | 100                                                                                             |
| `registerByDate`                                                                                | [RFCDate](../../types/rfcdate.md)                                                               | :heavy_minus_sign:                                                                              | The ISO 8601 formatted date by which attendees should register to receive the early bird price. | 2020-02-09                                                                                      |
| `maxRefund`                                                                                     | *number*                                                                                        | :heavy_minus_sign:                                                                              | Maximum refund amount for an early bird price.                                                  | 100                                                                                             |
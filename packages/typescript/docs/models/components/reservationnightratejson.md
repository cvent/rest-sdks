# ReservationNightRateJson

Rate details for a single reservation night.

## Example Usage

```typescript
import { ReservationNightRateJson } from "@cvent/sdk/models/components";

let value: ReservationNightRateJson = {
  base: 150,
  currency: "USD",
  additionalGuestFees: [
    {
      guestCount: 2,
      fee: 20,
    },
  ],
  displayRate: 150,
};
```

## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `base`                                                                                                      | *number*                                                                                                    | :heavy_check_mark:                                                                                          | Base rate.                                                                                                  | 150                                                                                                         |
| `currency`                                                                                                  | *string*                                                                                                    | :heavy_check_mark:                                                                                          | ISO 4217 currency code.                                                                                     | USD                                                                                                         |
| `additionalGuestFees`                                                                                       | [components.AdditionalGuestFeesJson](../../models/components/additionalguestfeesjson.md)[]                  | :heavy_minus_sign:                                                                                          | List of additional guest fees.                                                                              |                                                                                                             |
| `displayRate`                                                                                               | *number*                                                                                                    | :heavy_minus_sign:                                                                                          | The room rate displayed to guests, which includes any fees configured to display in the hotel tax settings. | 150                                                                                                         |
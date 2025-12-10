# ReservationNightJson

Reservation night details.

## Example Usage

```typescript
import { ReservationNightJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: ReservationNightJson = {
  stayDate: new RFCDate("2024-12-01"),
  status: "confirmed",
  hideRates: false,
  rate: {
    base: 150,
    currency: "USD",
    additionalGuestFees: [
      {
        guestCount: 2,
        fee: 20,
      },
    ],
    displayRate: 150,
  },
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `stayDate`                                                                                     | [RFCDate](../../types/rfcdate.md)                                                              | :heavy_check_mark:                                                                             | Night date.                                                                                    | 2024-12-01                                                                                     |
| `status`                                                                                       | [components.ReservationNightJsonStatus](../../models/components/reservationnightjsonstatus.md) | :heavy_check_mark:                                                                             | Indicator of night's status.                                                                   |                                                                                                |
| `hideRates`                                                                                    | *boolean*                                                                                      | :heavy_minus_sign:                                                                             | True indicates the rates are hidden for this night.                                            | false                                                                                          |
| `rate`                                                                                         | [components.ReservationNightRateJson](../../models/components/reservationnightratejson.md)     | :heavy_check_mark:                                                                             | Rate details for a single reservation night.                                                   |                                                                                                |
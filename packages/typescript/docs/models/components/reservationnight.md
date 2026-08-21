# ReservationNight

Reservation night details.

## Example Usage

```typescript
import { ReservationNight } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: ReservationNight = {
  stayDate: new RFCDate("2024-12-01"),
  status: "waitlisted",
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

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `stayDate`                                                                             | [RFCDate](../../types/rfcdate.md)                                                      | :heavy_check_mark:                                                                     | Night date.                                                                            | 2024-12-01                                                                             |
| `status`                                                                               | [components.ReservationNightStatus](../../models/components/reservationnightstatus.md) | :heavy_check_mark:                                                                     | Indicator of night's status.                                                           |                                                                                        |
| `hideRates`                                                                            | *boolean*                                                                              | :heavy_minus_sign:                                                                     | True indicates the rates are hidden for this night.                                    | false                                                                                  |
| `rate`                                                                                 | [components.ReservationNightRate](../../models/components/reservationnightrate.md)     | :heavy_check_mark:                                                                     | Rate details for a single reservation night.                                           |                                                                                        |
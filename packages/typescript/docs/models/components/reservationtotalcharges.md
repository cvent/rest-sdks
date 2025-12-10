# ReservationTotalCharges

Calculated total charges for this reservation.

## Example Usage

```typescript
import { ReservationTotalCharges } from "@cvent/sdk/models/components";

let value: ReservationTotalCharges = {
  amountBeforeTax: 750,
  taxes: 50,
  totalGuestFees: 50,
  totalAddons: 30,
  amountAfterTax: 800,
  totalAmount: 830,
  currency: "USD",
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `amountBeforeTax`                                          | *number*                                                   | :heavy_minus_sign:                                         | Total charges for the given reservation without taxes.     | 750                                                        |
| `taxes`                                                    | *number*                                                   | :heavy_minus_sign:                                         | The amount of taxes.                                       | 50                                                         |
| `totalGuestFees`                                           | *number*                                                   | :heavy_minus_sign:                                         | Total amount of additional guest fees.                     | 50                                                         |
| `totalAddons`                                              | *number*                                                   | :heavy_minus_sign:                                         | Total add-ons charges.                                     | 30                                                         |
| `amountAfterTax`                                           | *number*                                                   | :heavy_minus_sign:                                         | Total charges for the given reservation including taxes.   | 800                                                        |
| `totalAmount`                                              | *number*                                                   | :heavy_minus_sign:                                         | Total charges for the given reservation including add-ons. | 830                                                        |
| `currency`                                                 | *string*                                                   | :heavy_minus_sign:                                         | ISO 4217 currency code.                                    | USD                                                        |
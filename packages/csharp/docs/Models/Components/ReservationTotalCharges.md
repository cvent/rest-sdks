# ReservationTotalCharges

Calculated total charges for this reservation.


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `AmountBeforeTax`                                          | *long*                                                     | :heavy_minus_sign:                                         | Total charges for the given reservation without taxes.     | 750                                                        |
| `Taxes`                                                    | *double*                                                   | :heavy_minus_sign:                                         | The amount of taxes.                                       | 50                                                         |
| `TotalGuestFees`                                           | *double*                                                   | :heavy_minus_sign:                                         | Total amount of additional guest fees.                     | 50                                                         |
| `TotalAddons`                                              | *double*                                                   | :heavy_minus_sign:                                         | Total add-ons charges.                                     | 30                                                         |
| `AmountAfterTax`                                           | *long*                                                     | :heavy_minus_sign:                                         | Total charges for the given reservation including taxes.   | 800                                                        |
| `TotalAmount`                                              | *double*                                                   | :heavy_minus_sign:                                         | Total charges for the given reservation including add-ons. | 830                                                        |
| `Currency`                                                 | *string*                                                   | :heavy_minus_sign:                                         | ISO 4217 currency code.                                    | USD                                                        |
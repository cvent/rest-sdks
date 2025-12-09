# ReservationTotalCharges

Calculated total charges for this reservation.


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `amountBeforeTax`                                          | *Optional\<Long>*                                          | :heavy_minus_sign:                                         | Total charges for the given reservation without taxes.     | 750                                                        |
| `taxes`                                                    | *Optional\<Double>*                                        | :heavy_minus_sign:                                         | The amount of taxes.                                       | 50                                                         |
| `totalGuestFees`                                           | *Optional\<Double>*                                        | :heavy_minus_sign:                                         | Total amount of additional guest fees.                     | 50                                                         |
| `totalAddons`                                              | *Optional\<Double>*                                        | :heavy_minus_sign:                                         | Total add-ons charges.                                     | 30                                                         |
| `amountAfterTax`                                           | *Optional\<Long>*                                          | :heavy_minus_sign:                                         | Total charges for the given reservation including taxes.   | 800                                                        |
| `totalAmount`                                              | *Optional\<Double>*                                        | :heavy_minus_sign:                                         | Total charges for the given reservation including add-ons. | 830                                                        |
| `currency`                                                 | *Optional\<String>*                                        | :heavy_minus_sign:                                         | ISO 4217 currency code.                                    | USD                                                        |
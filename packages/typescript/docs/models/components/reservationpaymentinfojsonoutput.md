# ReservationPaymentInfoJsonOutput

Payment information.

## Example Usage

```typescript
import { ReservationPaymentInfoJsonOutput } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: ReservationPaymentInfoJsonOutput = {
  fullName: "Gustav Schultz",
  address: {
    address1: "West St. 1",
    address2: "Apt. 16",
    city: "Austin",
    region: "Texas",
    regionCode: "TX",
    postalCode: "23452AB",
    country: "United States of America",
    countryCode: "US",
  },
  phone: "(231)213-1222",
  other: {
    amount: 0,
    paymentDate: new RFCDate("2021-12-31"),
    referenceItem: "Reference Item",
    checkNumber: "Check Num",
    received: false,
    note: "No Comment",
  },
  creditCard: {
    expiration: new RFCDate("2021-12-31"),
    lastFour: "1111",
  },
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `paymentType`                                                                                                            | [components.PaymentTypesJson](../../models/components/paymenttypesjson.md)                                               | :heavy_minus_sign:                                                                                                       | Payment type.                                                                                                            |                                                                                                                          |
| `fullName`                                                                                                               | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Full name.                                                                                                               | Gustav Schultz                                                                                                           |
| `address`                                                                                                                | [components.AddressJson3](../../models/components/addressjson3.md)                                                       | :heavy_minus_sign:                                                                                                       | Address details. Required to create/update a guest's reservation if the hotel/event requires an address in reservations. |                                                                                                                          |
| `phone`                                                                                                                  | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Phone number.                                                                                                            | (231)213-1222                                                                                                            |
| `other`                                                                                                                  | [components.OtherPaymentJson](../../models/components/otherpaymentjson.md)                                               | :heavy_minus_sign:                                                                                                       | Other payment details.                                                                                                   |                                                                                                                          |
| `creditCard`                                                                                                             | [components.TokenizedCreditCardJsonOutput](../../models/components/tokenizedcreditcardjsonoutput.md)                     | :heavy_minus_sign:                                                                                                       | Credit card info.                                                                                                        |                                                                                                                          |
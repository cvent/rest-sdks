# GuestJson

Guest details.

## Example Usage

```typescript
import { GuestJson } from "@cvent/sdk/models/components";
import { RFCDate } from "@cvent/sdk/types";

let value: GuestJson = {
  arrival: new RFCDate("2020-03-05"),
  departure: new RFCDate("2020-03-07"),
  firstName: "Gustav",
  lastName: "Schultz",
  middleName: "Al",
  title: "Dr.",
  position: "manager",
  company: "Test Inc",
  homeFax: "9785674321",
  email: "guest@cvent.com",
  homePhone: "(231)-213-1222",
  workPhone: "(231)-213-1222",
  homeAddress: {
    address1: "West St. 1",
    address2: "Apt. 16",
    city: "Austin",
    region: "Texas",
    regionCode: "TX",
    postalCode: "23452AB",
    country: "United States of America",
    countryCode: "US",
  },
  paymentInfo: {
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
  },
};
```

## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `arrival`                                                                                                                | [RFCDate](../../types/rfcdate.md)                                                                                        | :heavy_minus_sign:                                                                                                       | Arrival date in ISO 8601 format.                                                                                         | 2020-03-05                                                                                                               |
| `departure`                                                                                                              | [RFCDate](../../types/rfcdate.md)                                                                                        | :heavy_minus_sign:                                                                                                       | Departure date in ISO 8601 format.                                                                                       | 2020-03-07                                                                                                               |
| `firstName`                                                                                                              | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | First name of the guest.                                                                                                 | Gustav                                                                                                                   |
| `lastName`                                                                                                               | *string*                                                                                                                 | :heavy_check_mark:                                                                                                       | Last name of the guest.                                                                                                  | Schultz                                                                                                                  |
| `middleName`                                                                                                             | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Middle name of the guest.                                                                                                | Al                                                                                                                       |
| `title`                                                                                                                  | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Title of the guest.                                                                                                      | Dr.                                                                                                                      |
| `position`                                                                                                               | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Position of the guest.                                                                                                   | manager                                                                                                                  |
| `company`                                                                                                                | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Organization or company name of the guest.                                                                               | Test Inc                                                                                                                 |
| `homeFax`                                                                                                                | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Home fax number of the guest.                                                                                            | 9785674321                                                                                                               |
| `email`                                                                                                                  | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Email address of the guest.                                                                                              | guest@cvent.com                                                                                                          |
| `homePhone`                                                                                                              | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Home phone number of the guest. Required if the hotel/event requires address in reservations.                            | (231)-213-1222                                                                                                           |
| `workPhone`                                                                                                              | *string*                                                                                                                 | :heavy_minus_sign:                                                                                                       | Work phone number of the guest.                                                                                          | (231)-213-1222                                                                                                           |
| `homeAddress`                                                                                                            | [components.AddressJson3](../../models/components/addressjson3.md)                                                       | :heavy_minus_sign:                                                                                                       | Address details. Required to create/update a guest's reservation if the hotel/event requires an address in reservations. |                                                                                                                          |
| `paymentInfo`                                                                                                            | [components.PaymentInfoJson](../../models/components/paymentinfojson.md)                                                 | :heavy_minus_sign:                                                                                                       | Payment information.                                                                                                     |                                                                                                                          |
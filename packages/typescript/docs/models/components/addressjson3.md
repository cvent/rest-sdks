# AddressJson3

Address details. Required to create/update a guest's reservation if the hotel/event requires an address in reservations.

## Example Usage

```typescript
import { AddressJson3 } from "@cvent/sdk/models/components";

let value: AddressJson3 = {
  address1: "West St. 1",
  address2: "Apt. 16",
  city: "Austin",
  region: "Texas",
  regionCode: "TX",
  postalCode: "23452AB",
  country: "United States of America",
  countryCode: "US",
};
```

## Fields

| Field                          | Type                           | Required                       | Description                    | Example                        |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `address1`                     | *string*                       | :heavy_minus_sign:             | Address line 1.                | West St. 1                     |
| `address2`                     | *string*                       | :heavy_minus_sign:             | Address line 2.                | Apt. 16                        |
| `city`                         | *string*                       | :heavy_minus_sign:             | City name.                     | Austin                         |
| `region`                       | *string*                       | :heavy_minus_sign:             | Region name.                   | Texas                          |
| `regionCode`                   | *string*                       | :heavy_minus_sign:             | Region code.                   | TX                             |
| `postalCode`                   | *string*                       | :heavy_minus_sign:             | Postal code.                   | 23452AB                        |
| `country`                      | *string*                       | :heavy_minus_sign:             | Country name.                  | United States of America       |
| `countryCode`                  | *string*                       | :heavy_minus_sign:             | ISO 3166 alpha-2 country code. | US                             |
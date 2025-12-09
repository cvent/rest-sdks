# VenueAddressJson1

Address details for venue.

## Example Usage

```typescript
import { VenueAddressJson1 } from "@cvent/sdk/models/components";

let value: VenueAddressJson1 = {
  address1: "West St. 1",
  address2: "Apt. 16",
  city: "Austin",
  region: "Texas",
  regionCode: "TX",
  postalCode: "23452AB",
  country: "United States of America",
  countryCode: "US",
  latitude: 2342.23423,
  longitude: 231234.23423,
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
| `latitude`                     | *number*                       | :heavy_minus_sign:             | Location latitude.             | 2342.23423                     |
| `longitude`                    | *number*                       | :heavy_minus_sign:             | Location longitude.            | 231234.23423                   |
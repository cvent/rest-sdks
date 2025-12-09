# AddressJson5

A physical address.

## Example Usage

```typescript
import { AddressJson5 } from "@cvent/sdk/models/components";

let value: AddressJson5 = {
  address1: "717 N Harwood St",
  address2: "Suite 2800",
  city: "Dallas",
  region: "Texas",
  regionCode: "TX",
  postalCode: "75201",
  country: "United States",
  countryCode: "US",
};
```

## Fields

| Field                          | Type                           | Required                       | Description                    | Example                        |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `address1`                     | *string*                       | :heavy_minus_sign:             | Address line 1.                | 717 N Harwood St               |
| `address2`                     | *string*                       | :heavy_minus_sign:             | Address line 2.                | Suite 2800                     |
| `city`                         | *string*                       | :heavy_minus_sign:             | City name.                     | Dallas                         |
| `region`                       | *string*                       | :heavy_minus_sign:             | Region name.                   | Texas                          |
| `regionCode`                   | *string*                       | :heavy_minus_sign:             | Region code.                   | TX                             |
| `postalCode`                   | *string*                       | :heavy_minus_sign:             | Postal code.                   | 75201                          |
| `country`                      | *string*                       | :heavy_minus_sign:             | Country name.                  | United States                  |
| `countryCode`                  | *string*                       | :heavy_minus_sign:             | ISO 3166 alpha-2 country code. | US                             |
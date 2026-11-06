# Address11

Address of the lead.

## Example Usage

```typescript
import { Address11 } from "@cvent/sdk/models/components";

let value: Address11 = {
  address1: "Cvent Inc.",
  address2: "4001 West Parmer Lane",
  city: "Austin",
  region: "Texas",
  regionCode: "TX",
  postalCode: "78727",
  country: "United States of America",
  countryCode: "US",
};
```

## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `address1`                                      | *string*                                        | :heavy_minus_sign:                              | First line of the address.                      | Cvent Inc.                                      |
| `address2`                                      | *string*                                        | :heavy_minus_sign:                              | Second line of the address.                     | 4001 West Parmer Lane                           |
| `city`                                          | *string*                                        | :heavy_minus_sign:                              | Name of the city.                               | Austin                                          |
| `region`                                        | *string*                                        | :heavy_minus_sign:                              | Name of the state, province, or region.         | Texas                                           |
| `regionCode`                                    | *string*                                        | :heavy_minus_sign:                              | Abbreviation of the state, province, or region. | TX                                              |
| `postalCode`                                    | *string*                                        | :heavy_minus_sign:                              | Postal code or ZIP code of the address.         | 78727                                           |
| `country`                                       | *string*                                        | :heavy_minus_sign:                              | Name of the country.                            | United States of America                        |
| `countryCode`                                   | *string*                                        | :heavy_minus_sign:                              | ISO 3166-1 alpha-2 code of the country.         | US                                              |
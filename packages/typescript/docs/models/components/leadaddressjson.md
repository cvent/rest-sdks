# LeadAddressJson

Schema for address information

## Example Usage

```typescript
import { LeadAddressJson } from "@cvent/sdk/models/components";

let value: LeadAddressJson = {
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

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `address1`                                                    | *string*                                                      | :heavy_minus_sign:                                            | The first line of an address                                  | Cvent Inc.                                                    |
| `address2`                                                    | *string*                                                      | :heavy_minus_sign:                                            | The second line of an address                                 | 4001 West Parmer Lane                                         |
| `city`                                                        | *string*                                                      | :heavy_minus_sign:                                            | The name of the city.                                         | Austin                                                        |
| `region`                                                      | *string*                                                      | :heavy_minus_sign:                                            | The name of the state/province/region of the address.         | Texas                                                         |
| `regionCode`                                                  | *string*                                                      | :heavy_minus_sign:                                            | The abbreviation of the state/province/region of the address. | TX                                                            |
| `postalCode`                                                  | *string*                                                      | :heavy_minus_sign:                                            | postal code (also known as zipcode) of the address            | 78727                                                         |
| `country`                                                     | *string*                                                      | :heavy_minus_sign:                                            | Name of the country for example, 'United States'              | United States of America                                      |
| `countryCode`                                                 | *string*                                                      | :heavy_minus_sign:                                            | ISO 3166 two-letter (alpha-2) country code                    | US                                                            |
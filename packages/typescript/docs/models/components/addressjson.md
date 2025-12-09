# AddressJson

Contact address details.

## Example Usage

```typescript
import { AddressJson } from "@cvent/sdk/models/components";

let value: AddressJson = {
  address1: "Cvent Inc.",
  address2: "4001 West Parmer Lane",
  address3: "PO Box 123",
  city: "Austin",
  countryCode: "US",
  postalCode: "78727",
  region: "Texas",
  regionCode: "TX",
  country: "United States of America",
};
```

## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `address1`                                                    | *string*                                                      | :heavy_minus_sign:                                            | The first line of an address.                                 | Cvent Inc.                                                    |
| `address2`                                                    | *string*                                                      | :heavy_minus_sign:                                            | The second line of an address.                                | 4001 West Parmer Lane                                         |
| `address3`                                                    | *string*                                                      | :heavy_minus_sign:                                            | The third line of an address.                                 | PO Box 123                                                    |
| `city`                                                        | *string*                                                      | :heavy_minus_sign:                                            | The name of the city.                                         | Austin                                                        |
| `countryCode`                                                 | *string*                                                      | :heavy_minus_sign:                                            | ISO 3166 two-letter (alpha-2) country code.                   | US                                                            |
| `postalCode`                                                  | *string*                                                      | :heavy_minus_sign:                                            | Postal code (also known as zipcode) of the address.           | 78727                                                         |
| `region`                                                      | *string*                                                      | :heavy_minus_sign:                                            | The name of the state/province/region of the address.         | Texas                                                         |
| `regionCode`                                                  | *string*                                                      | :heavy_minus_sign:                                            | The abbreviation of the state/province/region of the address. | TX                                                            |
| `country`                                                     | *string*                                                      | :heavy_minus_sign:                                            | Name of the country of the address.                           | United States of America                                      |
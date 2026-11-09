# Address5

Address of the exhibitor.

## Example Usage

```typescript
import { Address5 } from "@cvent/sdk/models/components";

let value: Address5 = {
  address1: "Cvent Inc.",
  address2: "4001 West Parmer Lane",
  city: "Austin",
  region: "Texas",
  postalCode: "78727",
  country: "United States of America",
};
```

## Fields

| Field                                   | Type                                    | Required                                | Description                             | Example                                 |
| --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- | --------------------------------------- |
| `address1`                              | *string*                                | :heavy_minus_sign:                      | First line of the address.              | Cvent Inc.                              |
| `address2`                              | *string*                                | :heavy_minus_sign:                      | Second line of the address.             | 4001 West Parmer Lane                   |
| `city`                                  | *string*                                | :heavy_minus_sign:                      | Name of the city.                       | Austin                                  |
| `region`                                | *string*                                | :heavy_minus_sign:                      | Name of the state, province, or region. | Texas                                   |
| `postalCode`                            | *string*                                | :heavy_minus_sign:                      | Postal code or ZIP code of the address. | 78727                                   |
| `country`                               | *string*                                | :heavy_minus_sign:                      | Name of the country.                    | United States of America                |
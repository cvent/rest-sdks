# AddressInfo

Venue address information.

## Example Usage

```typescript
import { AddressInfo } from "@cvent/sdk/models/components";

let value: AddressInfo = {
  streetAddress1: "1234 Trap Road",
  streetAddress2: "Suite 100",
  city: "Vienna",
  zipPostalCode: "22182",
  country: "NU",
  directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `streetAddress1`                                                                                    | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Street address line 1.                                                                              | 1234 Trap Road                                                                                      |
| `streetAddress2`                                                                                    | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Street address line 2.                                                                              | Suite 100                                                                                           |
| `city`                                                                                              | *string*                                                                                            | :heavy_check_mark:                                                                                  | City.                                                                                               | Vienna                                                                                              |
| `stateProvince`                                                                                     | [components.StateProvince1](../../models/components/stateprovince1.md)                              | :heavy_minus_sign:                                                                                  | The state province code used for contact information.                                               |                                                                                                     |
| `zipPostalCode`                                                                                     | *string*                                                                                            | :heavy_minus_sign:                                                                                  | ZIP or postal code.                                                                                 | 22182                                                                                               |
| `country`                                                                                           | [components.Country](../../models/components/country.md)                                            | :heavy_check_mark:                                                                                  | ISO 3166 two-letter (alpha-2) country codes with some additional non-standard cvent specific codes. |                                                                                                     |
| `directions`                                                                                        | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Directions or instructions for getting to the venue.                                                | Take I-66 West to Exit 67, then follow signs to Trap Road.                                          |
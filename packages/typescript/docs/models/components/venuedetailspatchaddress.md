# VenueDetailsPatchAddress

Venue address information.

## Example Usage

```typescript
import { VenueDetailsPatchAddress } from "@cvent/sdk/models/components";

let value: VenueDetailsPatchAddress = {
  streetAddress1: "1234 Trap Road",
  streetAddress2: "Suite 100",
  city: "Vienna",
  zipPostalCode: "22182",
  directions: "Take I-66 West to Exit 67, then follow signs to Trap Road.",
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `streetAddress1`                                                                                    | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Street address line 1.                                                                              | 1234 Trap Road                                                                                      |
| `streetAddress2`                                                                                    | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Street address line 2.                                                                              | Suite 100                                                                                           |
| `city`                                                                                              | *string*                                                                                            | :heavy_minus_sign:                                                                                  | City.                                                                                               | Vienna                                                                                              |
| `stateProvince`                                                                                     | [components.StateProvince](../../models/components/stateprovince.md)                                | :heavy_minus_sign:                                                                                  | The state province code used for contact information.                                               |                                                                                                     |
| `zipPostalCode`                                                                                     | *string*                                                                                            | :heavy_minus_sign:                                                                                  | ZIP or postal code.                                                                                 | 22182                                                                                               |
| `country`                                                                                           | [components.Country](../../models/components/country.md)                                            | :heavy_minus_sign:                                                                                  | ISO 3166 two-letter (alpha-2) country codes with some additional non-standard cvent specific codes. |                                                                                                     |
| `directions`                                                                                        | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Directions or instructions for getting to the venue.                                                | Take I-66 West to Exit 67, then follow signs to Trap Road.                                          |
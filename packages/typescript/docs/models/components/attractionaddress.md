# AttractionAddress

Venue attraction address information.

## Example Usage

```typescript
import { AttractionAddress } from "@cvent/sdk/models/components";

let value: AttractionAddress = {
  streetAddress1: "Golden Gate Bridge",
  streetAddress2: "Suite 100",
  city: "San Francisco",
  zipPostalCode: "94129",
};
```

## Fields

| Field                                                                                               | Type                                                                                                | Required                                                                                            | Description                                                                                         | Example                                                                                             |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `streetAddress1`                                                                                    | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Street address line 1.                                                                              | Golden Gate Bridge                                                                                  |
| `streetAddress2`                                                                                    | *string*                                                                                            | :heavy_minus_sign:                                                                                  | Street address line 2.                                                                              | Suite 100                                                                                           |
| `city`                                                                                              | *string*                                                                                            | :heavy_minus_sign:                                                                                  | City.                                                                                               | San Francisco                                                                                       |
| `stateProvince`                                                                                     | [components.StateProvince](../../models/components/stateprovince.md)                                | :heavy_minus_sign:                                                                                  | The state province code used for contact information.                                               |                                                                                                     |
| `zipPostalCode`                                                                                     | *string*                                                                                            | :heavy_minus_sign:                                                                                  | ZIP or postal code.                                                                                 | 94129                                                                                               |
| `country`                                                                                           | [components.Country](../../models/components/country.md)                                            | :heavy_minus_sign:                                                                                  | ISO 3166 two-letter (alpha-2) country codes with some additional non-standard cvent specific codes. |                                                                                                     |
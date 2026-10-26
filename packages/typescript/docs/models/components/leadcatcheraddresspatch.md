# LeadCatcherAddressPatch

Address information for the lead catcher contact. Only the address sub-fields supplied are updated; omitted sub-fields are left unchanged.

## Example Usage

```typescript
import { LeadCatcherAddressPatch } from "@cvent/sdk/models/components";

let value: LeadCatcherAddressPatch = {
  streetAddress1: "1234 Trap Road",
  streetAddress2: "Suite 100",
  city: "Vienna",
  zipPostalCode: "22182",
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `streetAddress1`                                                                                     | *string*                                                                                             | :heavy_minus_sign:                                                                                   | Street address line 1.                                                                               | 1234 Trap Road                                                                                       |
| `streetAddress2`                                                                                     | *string*                                                                                             | :heavy_minus_sign:                                                                                   | Street address line 2.                                                                               | Suite 100                                                                                            |
| `city`                                                                                               | *string*                                                                                             | :heavy_minus_sign:                                                                                   | City.                                                                                                | Vienna                                                                                               |
| `stateProvince`                                                                                      | [components.LeadCatcherPatchStateProvince](../../models/components/leadcatcherpatchstateprovince.md) | :heavy_minus_sign:                                                                                   | The state province code used for contact information.                                                |                                                                                                      |
| `zipPostalCode`                                                                                      | *string*                                                                                             | :heavy_minus_sign:                                                                                   | ZIP or postal code.                                                                                  | 22182                                                                                                |
| `country`                                                                                            | [components.LeadCatcherPatchCountry](../../models/components/leadcatcherpatchcountry.md)             | :heavy_minus_sign:                                                                                   | ISO 3166 two-letter (alpha-2) country code used for contact information.                             |                                                                                                      |
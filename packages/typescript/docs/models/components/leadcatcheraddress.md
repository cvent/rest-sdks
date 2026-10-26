# LeadCatcherAddress

Address information for a lead catcher contact.

## Example Usage

```typescript
import { LeadCatcherAddress } from "@cvent/sdk/models/components";

let value: LeadCatcherAddress = {
  streetAddress1: "1234 Trap Road",
  streetAddress2: "Suite 100",
  city: "Vienna",
  zipPostalCode: "22182",
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `streetAddress1`                                                                                         | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Street address line 1.                                                                                   | 1234 Trap Road                                                                                           |
| `streetAddress2`                                                                                         | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | Street address line 2.                                                                                   | Suite 100                                                                                                |
| `city`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | City.                                                                                                    | Vienna                                                                                                   |
| `stateProvince`                                                                                          | [components.LeadCatcherAddressStateProvince](../../models/components/leadcatcheraddressstateprovince.md) | :heavy_minus_sign:                                                                                       | State or province code for the contact address (ISO 3166-2).                                             |                                                                                                          |
| `zipPostalCode`                                                                                          | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | ZIP or postal code.                                                                                      | 22182                                                                                                    |
| `country`                                                                                                | [components.LeadCatcherAddressCountry](../../models/components/leadcatcheraddresscountry.md)             | :heavy_minus_sign:                                                                                       | Country code for the contact address (ISO 3166-1 alpha-2).                                               |                                                                                                          |
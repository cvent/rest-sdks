# EventOrganization1Input

Details of the organization hosting the event. When organization.id identifies one of the account's organization profiles, the organization details come from that profile and the other fields in this object are ignored on input. When organization.id is omitted or is the nil UUID, the fields in this object describe a new organization for this RFP, and name and type are required for an active RFP.

## Example Usage

```typescript
import { EventOrganization1Input } from "@cvent/sdk/models/components";

let value: EventOrganization1Input = {
  organization: {
    id: "50dc08af-24a9-4d01-84be-3d43133dc945",
  },
  name: "Cvent Inc.",
  address: {
    countryCode: "US",
    city: "Austin",
    regionCode: "US-AL",
  },
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `organization`                                                               | [components.Organization](../../models/components/organization.md)           | :heavy_minus_sign:                                                           | Organization details.                                                        |                                                                              |
| `confidentialProfile`                                                        | *boolean*                                                                    | :heavy_minus_sign:                                                           | True indicates organization profile has to be kept confidential.             |                                                                              |
| `industry`                                                                   | [components.Industry1](../../models/components/industry1.md)                 | :heavy_minus_sign:                                                           | Industry                                                                     |                                                                              |
| `name`                                                                       | *string*                                                                     | :heavy_minus_sign:                                                           | Name of the organization hosting the event.                                  | Cvent Inc.                                                                   |
| `type`                                                                       | [components.OrganizationType1](../../models/components/organizationtype1.md) | :heavy_minus_sign:                                                           | Organization type.                                                           |                                                                              |
| `address`                                                                    | [components.Address1](../../models/components/address1.md)                   | :heavy_minus_sign:                                                           | Address details.                                                             |                                                                              |
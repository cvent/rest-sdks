# RfpEventOrganizationJson

Details of organization which is hosting the event.

## Example Usage

```typescript
import { RfpEventOrganizationJson } from "@cvent/sdk/models/components";

let value: RfpEventOrganizationJson = {
  organization: {
    id: "50dc08af-24a9-4d01-84be-3d43133dc945",
  },
  name: "Cvent Inc.",
  type: "MILITARY",
  address: {
    countryCode: "US",
    city: "Austin",
    regionCode: "US-AL",
  },
  eventsPerYear: 450,
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `organization`                                                                       | [components.OrganizationJson](../../models/components/organizationjson.md)           | :heavy_minus_sign:                                                                   | Organization details.                                                                |                                                                                      |
| `confidentialProfile`                                                                | *boolean*                                                                            | :heavy_minus_sign:                                                                   | True indicates organization profile has to be kept confidential.                     |                                                                                      |
| `industry`                                                                           | [components.IndustryJson0](../../models/components/industryjson0.md)                 | :heavy_minus_sign:                                                                   | Industry                                                                             |                                                                                      |
| `name`                                                                               | *string*                                                                             | :heavy_check_mark:                                                                   | Name of the organization hosting the event.                                          | Cvent Inc.                                                                           |
| `type`                                                                               | [components.OrganizationTypeJson0](../../models/components/organizationtypejson0.md) | :heavy_check_mark:                                                                   | Organization type.                                                                   |                                                                                      |
| `address`                                                                            | [components.AddressJson0](../../models/components/addressjson0.md)                   | :heavy_minus_sign:                                                                   | Address details.                                                                     |                                                                                      |
| `eventsPerYear`                                                                      | *number*                                                                             | :heavy_minus_sign:                                                                   | Number of events per year.                                                           | 450                                                                                  |
# TravelAccount

Travel account details.

## Example Usage

```typescript
import { TravelAccount } from "@cvent/sdk/models/components";

let value: TravelAccount = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "Test Corporation",
  type: "corporate",
  certified: true,
  addresses: [
    {
      address1: "717 N Harwood St",
      address2: "Suite 2800",
      city: "Dallas",
      region: "Texas",
      regionCode: "TX",
      postalCode: "75201",
      country: "United States",
      countryCode: "US",
    },
  ],
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | A uuid used to uniquely identify the travel account.                                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | The name of the travel account.                                                               | Test Corporation                                                                              |
| `type`                                                                                        | [components.TravelAccountTypeJson](../../models/components/travelaccounttypejson.md)          | :heavy_minus_sign:                                                                            | Code representing the travel account type.                                                    | corporate                                                                                     |
| `certified`                                                                                   | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | Is this a certified travel account?                                                           | true                                                                                          |
| `addresses`                                                                                   | [components.AddressJson7](../../models/components/addressjson7.md)[]                          | :heavy_minus_sign:                                                                            | List of addresses associated with the travel account.                                         |                                                                                               |
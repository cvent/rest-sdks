# Chain

Chain details.

## Example Usage

```typescript
import { Chain } from "@cvent/sdk/models/components";

let value: Chain = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "415079ab-4bee-491e-84ad-c2379f840379",
  name: "Northern Hotels",
  code: "NH",
  brand: {
    id: "NorthernHotels",
  },
  address: {
    address1: "717 N Harwood St",
    address2: "Suite 2800",
    city: "Dallas",
    region: "Texas",
    regionCode: "TX",
    postalCode: "75201",
    country: "United States",
    countryCode: "US",
  },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | The ID of the chain.                                                                          | 415079ab-4bee-491e-84ad-c2379f840379                                                          |
| `name`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | The name of the travel supplier chain.                                                        | Northern Hotels                                                                               |
| `code`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | The code identifying the travel supplier chain.                                               | NH                                                                                            |
| `brand`                                                                                       | [components.ChainBrand](../../models/components/chainbrand.md)                                | :heavy_minus_sign:                                                                            | The brand that the chain belongs to.                                                          |                                                                                               |
| `address`                                                                                     | [components.AddressJson5](../../models/components/addressjson5.md)                            | :heavy_minus_sign:                                                                            | A physical address.                                                                           |                                                                                               |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the chain is deleted.                                                          | false                                                                                         |
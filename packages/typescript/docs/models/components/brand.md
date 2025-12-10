# Brand

Brand details.

## Example Usage

```typescript
import { Brand } from "@cvent/sdk/models/components";

let value: Brand = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "NorthernHotels",
  name: "Northern Hotel Group",
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
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | The ID of the travel supplier brand.                                                          | NorthernHotels                                                                                |
| `name`                                                                                        | *string*                                                                                      | :heavy_minus_sign:                                                                            | The name of the travel supplier brand.                                                        | Northern Hotel Group                                                                          |
| `address`                                                                                     | [components.AddressJson5](../../models/components/addressjson5.md)                            | :heavy_minus_sign:                                                                            | A physical address.                                                                           |                                                                                               |
| `deleted`                                                                                     | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the brand is deleted.                                                          | false                                                                                         |
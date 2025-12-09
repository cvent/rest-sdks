# Property

Details of the property

## Example Usage

```typescript
import { Property } from "@cvent/sdk/models/components";

let value: Property = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  name: "The Grand Property",
  chain: {
    id: "415079ab-4bee-491e-84ad-c2379f840379",
  },
  brand: {
    id: "NorthernHotels",
  },
  code: "GH101",
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
  externalCodes: [
    {
      type: "amadeus_gds",
      chainCode: "NH",
      propertyCode: "GH1",
    },
  ],
};
```

## Fields

| Field                                                                                                                          | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    | Example                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `created`                                                                                                                      | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                  | :heavy_minus_sign:                                                                                                             | The ISO 8601 zoned date time when this record was created.                                                                     | 2017-01-02T02:00:00Z                                                                                                           |
| `createdBy`                                                                                                                    | *string*                                                                                                                       | :heavy_minus_sign:                                                                                                             | The identifier of the user that created this record.                                                                           | hporter                                                                                                                        |
| `lastModified`                                                                                                                 | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                  | :heavy_minus_sign:                                                                                                             | The ISO 8601 zoned date time when this record was updated.                                                                     | 2019-02-12T03:00:00Z                                                                                                           |
| `lastModifiedBy`                                                                                                               | *string*                                                                                                                       | :heavy_minus_sign:                                                                                                             | The identifier of the user that last updated this record.                                                                      | hporter                                                                                                                        |
| `id`                                                                                                                           | *string*                                                                                                                       | :heavy_minus_sign:                                                                                                             | The ID of the property.                                                                                                        | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                                           |
| `name`                                                                                                                         | *string*                                                                                                                       | :heavy_minus_sign:                                                                                                             | The name of the property.                                                                                                      | The Grand Property                                                                                                             |
| `chain`                                                                                                                        | [components.PropertyChain](../../models/components/propertychain.md)                                                           | :heavy_minus_sign:                                                                                                             | The chain that the property belongs to.                                                                                        |                                                                                                                                |
| `brand`                                                                                                                        | [components.PropertyBrand](../../models/components/propertybrand.md)                                                           | :heavy_minus_sign:                                                                                                             | The brand that the property belongs to.                                                                                        |                                                                                                                                |
| `code`                                                                                                                         | *string*                                                                                                                       | :heavy_minus_sign:                                                                                                             | The property code for the property.                                                                                            | GH101                                                                                                                          |
| `deleted`                                                                                                                      | *boolean*                                                                                                                      | :heavy_minus_sign:                                                                                                             | True indicates that the property is deleted.                                                                                   | false                                                                                                                          |
| `currencyCode`                                                                                                                 | *string*                                                                                                                       | :heavy_minus_sign:                                                                                                             | The ISO 4217 standard format currency code specified for the property.                                                         | USD                                                                                                                            |
| `address`                                                                                                                      | [components.AddressJson5](../../models/components/addressjson5.md)                                                             | :heavy_minus_sign:                                                                                                             | A physical address.                                                                                                            |                                                                                                                                |
| `externalCodes`                                                                                                                | [components.PropertyExternalCodeJson](../../models/components/propertyexternalcodejson.md)[]                                   | :heavy_minus_sign:                                                                                                             | Collection of external codes for a property. This includes GDS nd other codes used to identify a property in external systems. |                                                                                                                                |
# TravelAmenityJson

Group and meeting amenity info.

## Example Usage

```typescript
import { TravelAmenityJson } from "@cvent/sdk/models/components";

let value: TravelAmenityJson = {
  lcdPrice: 100,
  screenPrice: 100,
  hsiaPrice: 100,
  whatCompanyProvidesAVEquipment: "Some company",
};
```

## Fields

| Field                                                                     | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `lcdIncluded`                                                             | *boolean*                                                                 | :heavy_minus_sign:                                                        | True indicates a liquid crystal display (LCD) is included in the amenity. |                                                                           |
| `lcdPrice`                                                                | *number*                                                                  | :heavy_minus_sign:                                                        | Price of the liquid crystal display (LCD).                                | 100                                                                       |
| `screenIncluded`                                                          | *boolean*                                                                 | :heavy_minus_sign:                                                        | True indicates a screen is included in the amenity.                       |                                                                           |
| `screenPrice`                                                             | *number*                                                                  | :heavy_minus_sign:                                                        | Price of the screen.                                                      | 100                                                                       |
| `hsiaIncluded`                                                            | *boolean*                                                                 | :heavy_minus_sign:                                                        | True indicates high speed internet access is included in the amenity.     |                                                                           |
| `hsiaPrice`                                                               | *number*                                                                  | :heavy_minus_sign:                                                        | Price of high speed internet access (HSIA).                               | 100                                                                       |
| `complementaryParkingIncluded`                                            | *boolean*                                                                 | :heavy_minus_sign:                                                        | True indicates parking is included in the amenity.                        |                                                                           |
| `whatCompanyProvidesAVEquipment`                                          | *string*                                                                  | :heavy_minus_sign:                                                        | Name of company providing AV equipment.                                   | Some company                                                              |
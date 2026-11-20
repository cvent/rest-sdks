# TravelProposalGroupAndMeetingAmenity

The group and meeting amenities of the proposal.

## Example Usage

```typescript
import { TravelProposalGroupAndMeetingAmenity } from "@cvent/sdk/models/components";

let value: TravelProposalGroupAndMeetingAmenity = {
  lcdPrice: 100,
  screenPrice: 100,
  hsiaPrice: 100,
  whatCompanyProvidesAVEquipment: "Example AV Services",
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `lcdIncluded`                                                                | *boolean*                                                                    | :heavy_minus_sign:                                                           | True indicates a liquid crystal display (LCD) is included in the amenity.    |                                                                              |
| `lcdPrice`                                                                   | *number*                                                                     | :heavy_minus_sign:                                                           | The price of the liquid crystal display (LCD).                               | 100                                                                          |
| `screenIncluded`                                                             | *boolean*                                                                    | :heavy_minus_sign:                                                           | True indicates a screen is included in the amenity.                          |                                                                              |
| `screenPrice`                                                                | *number*                                                                     | :heavy_minus_sign:                                                           | The price of the screen.                                                     | 100                                                                          |
| `hsiaIncluded`                                                               | *boolean*                                                                    | :heavy_minus_sign:                                                           | True indicates high-speed internet access (HSIA) is included in the amenity. |                                                                              |
| `hsiaPrice`                                                                  | *number*                                                                     | :heavy_minus_sign:                                                           | The price of high-speed internet access (HSIA).                              | 100                                                                          |
| `complementaryParkingIncluded`                                               | *boolean*                                                                    | :heavy_minus_sign:                                                           | True indicates parking is included in the amenity.                           |                                                                              |
| `whatCompanyProvidesAVEquipment`                                             | *string*                                                                     | :heavy_minus_sign:                                                           | The name of the company that provides the AV equipment.                      | Example AV Services                                                          |
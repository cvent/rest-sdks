# VenueAmenityFacilitySpaceItem

A facility space entry for a venue, with an optional area measurement expressed in the venue's configured unit of measurement.

## Example Usage

```typescript
import { VenueAmenityFacilitySpaceItem } from "@cvent/sdk/models/components";

let value: VenueAmenityFacilitySpaceItem = {
  amenity: "SEMI_PRIVATE_SPACE",
  value: 5000,
};
```

## Fields

| Field                                                                                                                                                              | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `amenity`                                                                                                                                                          | [components.VenueAmenityFacilitySpace](../../models/components/venueamenityfacilityspace.md)                                                                       | :heavy_check_mark:                                                                                                                                                 | Facility space type available at a venue.<br/><br/>Values:<br/>- `OUTDOOR_SPACE` — Outdoor Space<br/>- `PRIVATE_SPACE` — Private Space<br/>- `SEMI_PRIVATE_SPACE` — Semi-Private Space |                                                                                                                                                                    |
| `value`                                                                                                                                                            | *number*                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                 | Area of the space in the venue's configured unit of measurement.                                                                                                   | 5000                                                                                                                                                               |
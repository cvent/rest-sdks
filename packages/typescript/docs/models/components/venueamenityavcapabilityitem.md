# VenueAmenityAvCapabilityItem

An AV capability selection for a venue. An internet speed may be provided when the selected amenity is `HIGH_SPEED_INTERNET`.

## Example Usage

```typescript
import { VenueAmenityAvCapabilityItem } from "@cvent/sdk/models/components";

let value: VenueAmenityAvCapabilityItem = {
  amenity: "HIGH_SPEED_INTERNET",
  speed: 1000,
};
```

## Fields

| Field                                                                                                                                                                      | Type                                                                                                                                                                       | Required                                                                                                                                                                   | Description                                                                                                                                                                | Example                                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `amenity`                                                                                                                                                                  | [components.VenueAmenityAVCapability](../../models/components/venueamenityavcapability.md)                                                                                 | :heavy_check_mark:                                                                                                                                                         | Audio-visual capability available at a venue.<br/><br/>Values:<br/>- `AV_EQUIPMENT` — AV Equipment<br/>- `HIGH_SPEED_INTERNET` — High Speed Internet<br/>- `ONSITE_AV_STAFF` — Onsite AV Staff |                                                                                                                                                                            |
| `speed`                                                                                                                                                                    | *number*                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                         | Internet connection speed in Mbps. Applicable only when `amenity` is `HIGH_SPEED_INTERNET`.                                                                                | 1000                                                                                                                                                                       |
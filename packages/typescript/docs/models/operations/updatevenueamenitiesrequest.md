# UpdateVenueAmenitiesRequest

## Example Usage

```typescript
import { UpdateVenueAmenitiesRequest } from "@cvent/sdk/models/operations";

let value: UpdateVenueAmenitiesRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  existingVenueAmenities: {
    avCapabilities: [
      {
        amenity: "HIGH_SPEED_INTERNET",
        speed: 1000,
      },
    ],
    parking: [
      {
        amenity: "COMPLIMENTARY_PARKING_PROVIDED",
        cost: 25,
      },
    ],
    facilitySpaceInfo: [
      {
        amenity: "SEMI_PRIVATE_SPACE",
        value: 5000,
      },
    ],
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `venueId`                                                                                        | *string*                                                                                         | :heavy_check_mark:                                                                               | Unique Cvent based identifier for a Venue.                                                       | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                             |
| `existingVenueAmenities`                                                                         | [components.ExistingVenueAmenitiesInput](../../models/components/existingvenueamenitiesinput.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |                                                                                                  |
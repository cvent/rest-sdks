# AssociateVenueImageRequest

## Example Usage

```typescript
import { AssociateVenueImageRequest } from "@cvent/sdk/models/operations";

let value: AssociateVenueImageRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueImageId: "286e2866-b443-4d09-ab0f-0fac45cc026f",
  venueImageAssociationRequest: {
    file: {
      id: "e0921301-7742-4354-a0d8-2a747ff66958",
    },
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `venueId`                                                                                          | *string*                                                                                           | :heavy_check_mark:                                                                                 | Unique Cvent based identifier for a Venue.                                                         | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                               |
| `venueImageId`                                                                                     | *string*                                                                                           | :heavy_check_mark:                                                                                 | Unique identifier of a venue image.                                                                | 286e2866-b443-4d09-ab0f-0fac45cc026f                                                               |
| `venueImageAssociationRequest`                                                                     | [components.VenueImageAssociationRequest](../../models/components/venueimageassociationrequest.md) | :heavy_check_mark:                                                                                 | N/A                                                                                                |                                                                                                    |
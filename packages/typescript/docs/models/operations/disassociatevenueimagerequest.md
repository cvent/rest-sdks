# DisassociateVenueImageRequest

## Example Usage

```typescript
import { DisassociateVenueImageRequest } from "@cvent/sdk/models/operations";

let value: DisassociateVenueImageRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueImageId: "286e2866-b443-4d09-ab0f-0fac45cc026f",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `venueImageId`                             | *string*                                   | :heavy_check_mark:                         | Unique identifier of a venue image.        | 286e2866-b443-4d09-ab0f-0fac45cc026f       |
# UpdateVenueRatingsRequest

## Example Usage

```typescript
import { UpdateVenueRatingsRequest } from "@cvent/sdk/models/operations";

let value: UpdateVenueRatingsRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  venueRatings: {
    ratings: [
      {
        ratingAgency: "AAA",
        ratingValue: "FOUR_DIAMONDS",
        primaryRating: true,
      },
    ],
    venueAwards: "Recipient of the 2025 Green Hospitality Award.",
  },
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `venueId`                                                          | *string*                                                           | :heavy_check_mark:                                                 | Unique Cvent based identifier for a Venue.                         | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                               |
| `venueRatings`                                                     | [components.VenueRatings](../../models/components/venueratings.md) | :heavy_check_mark:                                                 | N/A                                                                |                                                                    |
# VenueRatings

The full set of agency ratings and awards for a venue. Submitting a PUT with this payload replaces all existing ratings for the venue. Not applicable to CVB/DMC venues.

## Example Usage

```typescript
import { VenueRatings } from "@cvent/sdk/models/components";

let value: VenueRatings = {
  ratings: [
    {
      ratingAgency: "AAA",
      ratingValue: "FOUR_DIAMONDS",
      primaryRating: true,
    },
  ],
  venueAwards: "Recipient of the 2025 Green Hospitality Award.",
};
```

## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `ratings`                                                                                                                                               | [components.VenueRatingInput](../../models/components/venueratinginput.md)[]                                                                            | :heavy_minus_sign:                                                                                                                                      | The list of agency ratings for this venue. On PUT, this list replaces all previously saved ratings — agencies omitted from the request will be removed. |                                                                                                                                                         |
| `venueAwards`                                                                                                                                           | *string*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                      | A free-text description of awards or accolades the venue has received. Maximum 2500 characters. Omit to clear.                                          | Recipient of the 2025 Green Hospitality Award.                                                                                                          |
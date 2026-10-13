# DeleteVenueAttractionRequest

## Example Usage

```typescript
import { DeleteVenueAttractionRequest } from "@cvent/sdk/models/operations";

let value: DeleteVenueAttractionRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  attractionId: "65986618-5536-4f38-bd1e-4e1da5679fb2",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `attractionId`                             | *string*                                   | :heavy_check_mark:                         | Unique identifier for an attraction.       |                                            |
# GetVenueAttractionRequest

## Example Usage

```typescript
import { GetVenueAttractionRequest } from "@cvent/sdk/models/operations";

let value: GetVenueAttractionRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  attractionId: "ae2f77f8-5e72-475c-8588-6dce5c4bc050",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `attractionId`                             | *string*                                   | :heavy_check_mark:                         | Unique identifier for an attraction.       |                                            |
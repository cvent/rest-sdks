# GetAttractionImagesRequest

## Example Usage

```typescript
import { GetAttractionImagesRequest } from "@cvent/sdk/models/operations";

let value: GetAttractionImagesRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  attractionId: "c34c21f1-2752-4bb7-aee8-ffe83f1d3c9a",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `attractionId`                             | *string*                                   | :heavy_check_mark:                         | Unique identifier for an attraction.       |                                            |
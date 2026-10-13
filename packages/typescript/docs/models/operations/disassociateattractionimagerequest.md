# DisassociateAttractionImageRequest

## Example Usage

```typescript
import { DisassociateAttractionImageRequest } from "@cvent/sdk/models/operations";

let value: DisassociateAttractionImageRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  attractionId: "aeeb4104-8a33-43e7-bd86-e6498ed86bd6",
  imageId: "cbaa8ded-f622-4eeb-aa0d-21219e050f60",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `venueId`                                  | *string*                                   | :heavy_check_mark:                         | Unique Cvent based identifier for a Venue. | 6bb0e2db-861f-46e3-a923-eb4d959ffa00       |
| `attractionId`                             | *string*                                   | :heavy_check_mark:                         | Unique identifier for an attraction.       |                                            |
| `imageId`                                  | *string*                                   | :heavy_check_mark:                         | Unique identifier of an attraction image.  |                                            |
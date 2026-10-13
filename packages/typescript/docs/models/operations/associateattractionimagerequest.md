# AssociateAttractionImageRequest

## Example Usage

```typescript
import { AssociateAttractionImageRequest } from "@cvent/sdk/models/operations";

let value: AssociateAttractionImageRequest = {
  venueId: "6bb0e2db-861f-46e3-a923-eb4d959ffa00",
  attractionId: "ad89abfa-13c8-4d00-a84a-b68ac52cd0cd",
  attractionImageAssociationRequest: {
    file: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
  },
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  | Example                                                                                                      |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `venueId`                                                                                                    | *string*                                                                                                     | :heavy_check_mark:                                                                                           | Unique Cvent based identifier for a Venue.                                                                   | 6bb0e2db-861f-46e3-a923-eb4d959ffa00                                                                         |
| `attractionId`                                                                                               | *string*                                                                                                     | :heavy_check_mark:                                                                                           | Unique identifier for an attraction.                                                                         |                                                                                                              |
| `attractionImageAssociationRequest`                                                                          | [components.AttractionImageAssociationRequest](../../models/components/attractionimageassociationrequest.md) | :heavy_check_mark:                                                                                           | N/A                                                                                                          |                                                                                                              |
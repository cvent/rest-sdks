# VenueImageAssociationRequest

Request body for associating a previously uploaded image file with a venue image.

## Example Usage

```typescript
import { VenueImageAssociationRequest } from "@cvent/sdk/models/components";

let value: VenueImageAssociationRequest = {
  file: {
    id: "e0921301-7742-4354-a0d8-2a747ff66958",
  },
};
```

## Fields

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `file`                                                                                                     | [components.VenueImageAssociationRequestFile](../../models/components/venueimageassociationrequestfile.md) | :heavy_check_mark:                                                                                         | The previously uploaded image file to associate with the venue.                                            |
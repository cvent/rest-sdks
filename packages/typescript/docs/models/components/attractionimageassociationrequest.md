# AttractionImageAssociationRequest

Request body for associating an uploaded image file with an attraction.

## Example Usage

```typescript
import { AttractionImageAssociationRequest } from "@cvent/sdk/models/components";

let value: AttractionImageAssociationRequest = {
  file: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `file`                                                                                                               | [components.AttractionImageAssociationRequestFile](../../models/components/attractionimageassociationrequestfile.md) | :heavy_check_mark:                                                                                                   | The previously uploaded image file to associate with the attraction.                                                 |
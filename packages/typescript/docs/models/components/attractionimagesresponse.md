# AttractionImagesResponse

The images associated with an attraction. Only one image is supported per attraction.

## Example Usage

```typescript
import { AttractionImagesResponse } from "@cvent/sdk/models/components";

let value: AttractionImagesResponse = {
  data: [
    {
      id: "286e2866-b443-4d09-ab0f-0fac45cc026f",
      href:
        "https://images.cvent.com/production/csn/3c7be8c9-cddb-4eaf-93a8-27da3250ed4f/images/83142ebfecbb42d2ac3be0433a180829_extrasmall!_!5b5c517134afb758b6fbbefb0e94d819.jpg",
    },
  ],
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `data`                                                                     | [components.AttractionImage](../../models/components/attractionimage.md)[] | :heavy_minus_sign:                                                         | The images for an attraction. Maximum of one image per attraction.         |
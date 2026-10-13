# VenueImageAssociationResponse

Response body after successfully associating an image with a venue.

## Example Usage

```typescript
import { VenueImageAssociationResponse } from "@cvent/sdk/models/components";

let value: VenueImageAssociationResponse = {
  id: "286e2866-b443-4d09-ab0f-0fac45cc026f",
  file: {
    id: "080a01ef-2f73-45f6-8f48-91dbc83a4c47",
  },
  href:
    "https://images.cvent.com/production/csn/3c7be8c9-cddb-4eaf-93a8-27da3250ed4f/images/83142ebfecbb42d2ac3be0433a180829_extrasmall!_!5b5c517134afb758b6fbbefb0e94d819.jpg",
};
```

## Fields

| Field                                                                                                                                                                  | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            | Example                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                   | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | The ID of the venue image.                                                                                                                                             | 286e2866-b443-4d09-ab0f-0fac45cc026f                                                                                                                                   |
| `file`                                                                                                                                                                 | [components.VenueImageAssociationResponseFile](../../models/components/venueimageassociationresponsefile.md)                                                           | :heavy_check_mark:                                                                                                                                                     | The file uploaded to be associated with the venue.                                                                                                                     |                                                                                                                                                                        |
| `href`                                                                                                                                                                 | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | URL of the venue image.                                                                                                                                                | https://images.cvent.com/production/csn/3c7be8c9-cddb-4eaf-93a8-27da3250ed4f/images/83142ebfecbb42d2ac3be0433a180829_extrasmall!_!5b5c517134afb758b6fbbefb0e94d819.jpg |
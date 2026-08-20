# MeetingRoomImageAssociationResponse

Response body after successfully associating an image with a meeting room.

## Example Usage

```typescript
import { MeetingRoomImageAssociationResponse } from "@cvent/sdk/models/components";

let value: MeetingRoomImageAssociationResponse = {
  id: "286e2866-b443-4d09-ab0f-0fac45cc026f",
  href:
    "https://images.cvent.com/production/csn/3c7be8c9-cddb-4eaf-93a8-27da3250ed4f/images/83142ebfecbb42d2ac3be0433a180829_extrasmall!_!5b5c517134afb758b6fbbefb0e94d819.jpg",
  file: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                                                                                                                  | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            | Example                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                   | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | The ID of the associated meeting room image.                                                                                                                           | 286e2866-b443-4d09-ab0f-0fac45cc026f                                                                                                                                   |
| `href`                                                                                                                                                                 | *string*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | URL of the meeting room image.                                                                                                                                         | https://images.cvent.com/production/csn/3c7be8c9-cddb-4eaf-93a8-27da3250ed4f/images/83142ebfecbb42d2ac3be0433a180829_extrasmall!_!5b5c517134afb758b6fbbefb0e94d819.jpg |
| `file`                                                                                                                                                                 | [components.MeetingRoomImageAssociationResponseFile](../../models/components/meetingroomimageassociationresponsefile.md)                                               | :heavy_check_mark:                                                                                                                                                     | The file uploaded to be associated with the meeting room.                                                                                                              |                                                                                                                                                                        |
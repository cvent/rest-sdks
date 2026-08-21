# MeetingRoomImagesResponse

The images associated with a meeting room. Each meeting room has at most one image.

## Example Usage

```typescript
import { MeetingRoomImagesResponse } from "@cvent/sdk/models/components";

let value: MeetingRoomImagesResponse = {
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

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `data`                                                                       | [components.MeetingRoomImage](../../models/components/meetingroomimage.md)[] | :heavy_minus_sign:                                                           | The images for a meeting room. Contains at most one item.                    |
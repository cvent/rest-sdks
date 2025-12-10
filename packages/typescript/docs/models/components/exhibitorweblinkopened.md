# ExhibitorWeblinkOpened

An exhibitor weblink-opened activity.

## Example Usage

```typescript
import { ExhibitorWeblinkOpened } from "@cvent/sdk/models/components";

let value: ExhibitorWeblinkOpened = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  weblink: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "Cvent's website",
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `exhibitor`                                                                                        | [components.ExhibitorJson1](../../models/components/exhibitorjson1.md)                             | :heavy_minus_sign:                                                                                 | An exhibitor.                                                                                      |                                                                                                    |
| `platform`                                                                                         | *string*                                                                                           | :heavy_minus_sign:                                                                                 | The platform used by the user.                                                                     | Attendee Hub                                                                                       |
| `weblink`                                                                                          | [components.ActivityExhibitorWebLinkJson](../../models/components/activityexhibitorweblinkjson.md) | :heavy_minus_sign:                                                                                 | A web-link for an activity exhibitor.                                                              |                                                                                                    |
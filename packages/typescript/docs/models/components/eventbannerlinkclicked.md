# EventBannerLinkClicked

The link on the banner clicked by an attendee.

## Example Usage

```typescript
import { EventBannerLinkClicked } from "@cvent/sdk/models/components";

let value: EventBannerLinkClicked = {
  exhibitor: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    name: "AutoExpo",
    featured: true,
    eventSponsor: true,
  },
  platform: "Attendee Hub",
  target: {
    details: "https://www.cvent.com",
  },
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        | Example                                                                            |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `exhibitor`                                                                        | [components.ExhibitorJson1](../../models/components/exhibitorjson1.md)             | :heavy_minus_sign:                                                                 | An exhibitor.                                                                      |                                                                                    |
| `platform`                                                                         | *string*                                                                           | :heavy_minus_sign:                                                                 | The platform used by the user.                                                     | Attendee Hub                                                                       |
| `banner`                                                                           | [components.Banner](../../models/components/banner.md)                             | :heavy_minus_sign:                                                                 | The related banner                                                                 |                                                                                    |
| `target`                                                                           | [components.BannerLinkTargetJson](../../models/components/bannerlinktargetjson.md) | :heavy_minus_sign:                                                                 | The target of the link clicked on the banner.                                      |                                                                                    |
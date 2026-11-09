# ExhibitorBannerLogoFile

Banner or logo image file of an exhibitor.

## Example Usage

```typescript
import { ExhibitorBannerLogoFile } from "@cvent/sdk/models/components";

let value: ExhibitorBannerLogoFile = {
  file: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  href:
    "https://images.cvent.com/pt/production/account_123/event_123/ExhibitorLogo.png",
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `file`                                                                                           | [components.ExhibitorBannerLogoFileFile](../../models/components/exhibitorbannerlogofilefile.md) | :heavy_minus_sign:                                                                               | File of the image, with the file ID.                                                             |                                                                                                  |
| `href`                                                                                           | *string*                                                                                         | :heavy_minus_sign:                                                                               | URL of the banner or logo image.                                                                 | https://images.cvent.com/pt/production/account_123/event_123/ExhibitorLogo.png                   |
# ExhibitorBannerLogoFile

JSON Schema for Exhibitor Banner/Logo File

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
| `file`                                                                                           | [components.ExhibitorBannerLogoFileFile](../../models/components/exhibitorbannerlogofilefile.md) | :heavy_minus_sign:                                                                               | File object containing UUID                                                                      |                                                                                                  |
| `href`                                                                                           | *string*                                                                                         | :heavy_minus_sign:                                                                               | URL of a exhibitor banner/logo image                                                             | https://images.cvent.com/pt/production/account_123/event_123/ExhibitorLogo.png                   |
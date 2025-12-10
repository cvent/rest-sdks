# ExhibitorCategoryBannerFile

A JSON schema for the exhibitor category banner file.

## Example Usage

```typescript
import { ExhibitorCategoryBannerFile } from "@cvent/sdk/models/components";

let value: ExhibitorCategoryBannerFile = {
  file: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  href:
    "https://images.cvent.com/pt/production/account_123/event_123/CategoryImage.png",
};
```

## Fields

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `file`                                                                                                   | [components.ExhibitorCategoryBannerFileFile](../../models/components/exhibitorcategorybannerfilefile.md) | :heavy_minus_sign:                                                                                       | File properties for the exhibitor category banner file.                                                  |                                                                                                          |
| `href`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | URL of a exhibitor category banner image                                                                 | https://images.cvent.com/pt/production/account_123/event_123/CategoryImage.png                           |
# BannerLinkTargetJson

The target of the link clicked on the banner.

## Example Usage

```typescript
import { BannerLinkTargetJson } from "@cvent/sdk/models/components";

let value: BannerLinkTargetJson = {
  details: "https://www.cvent.com",
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `type`                                                                                     | [components.BannerLinkTargetJsonType](../../models/components/bannerlinktargetjsontype.md) | :heavy_minus_sign:                                                                         | The type of target associated with the banner link.                                        |                                                                                            |
| `details`                                                                                  | *string*                                                                                   | :heavy_minus_sign:                                                                         | The details of the target associated with the banner link.                                 | https://www.cvent.com                                                                      |
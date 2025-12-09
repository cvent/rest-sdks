# SocialMediaLinksJson

Member's social media links.

## Example Usage

```typescript
import { SocialMediaLinksJson } from "@cvent/sdk/models/components";

let value: SocialMediaLinksJson = {
  facebookUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  twitterUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  linkedinUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  websiteUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `facebookUrl`                                              | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `twitterUrl`                                               | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `linkedinUrl`                                              | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `websiteUrl`                                               | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
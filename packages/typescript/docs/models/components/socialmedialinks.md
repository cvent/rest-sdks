# SocialMediaLinks

Member's social media links.

## Example Usage

```typescript
import { SocialMediaLinks } from "@cvent/sdk/models/components";

let value: SocialMediaLinks = {
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

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `facebookUrl`                                      | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
| `twitterUrl`                                       | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
| `linkedinUrl`                                      | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
| `websiteUrl`                                       | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
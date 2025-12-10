# ContactLinksJson2

A JSON schema representing contact links, including Twitter, Facebook, and LinkedIn URLs.

## Example Usage

```typescript
import { ContactLinksJson2 } from "@cvent/sdk/models/components";

let value: ContactLinksJson2 = {
  twitterUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  facebookUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  linkedInUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  instagramUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `twitterUrl`                                               | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `facebookUrl`                                              | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `linkedInUrl`                                              | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `instagramUrl`                                             | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
# ~~PlannerJson2ContactLinks~~

Collection of social media links for the contact.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { PlannerJson2ContactLinks } from "@cvent/sdk/models/components";

let value: PlannerJson2ContactLinks = {
  twitterUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  facebookUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  linkedInUrl: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  profilePicture: {
    href: "https://cvent.com/picture123",
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `twitterUrl`                                                               | [components.LinkJson](../../models/components/linkjson.md)                 | :heavy_minus_sign:                                                         | Represents a link to a related resource.                                   |
| `facebookUrl`                                                              | [components.LinkJson](../../models/components/linkjson.md)                 | :heavy_minus_sign:                                                         | Represents a link to a related resource.                                   |
| `linkedInUrl`                                                              | [components.LinkJson](../../models/components/linkjson.md)                 | :heavy_minus_sign:                                                         | Represents a link to a related resource.                                   |
| `profilePicture`                                                           | [components.PlannerJson2Link](../../models/components/plannerjson2link.md) | :heavy_minus_sign:                                                         | Reference to a profile picture.                                            |
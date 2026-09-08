# ~~StakeholderContactLinks~~

Collection of social media links for the contact.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { StakeholderContactLinks } from "@cvent/sdk/models/components";

let value: StakeholderContactLinks = {
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

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `twitterUrl`                                                             | [components.Link](../../models/components/link.md)                       | :heavy_minus_sign:                                                       | Represents a link to a related resource.                                 |
| `facebookUrl`                                                            | [components.Link](../../models/components/link.md)                       | :heavy_minus_sign:                                                       | Represents a link to a related resource.                                 |
| `linkedInUrl`                                                            | [components.Link](../../models/components/link.md)                       | :heavy_minus_sign:                                                       | Represents a link to a related resource.                                 |
| `profilePicture`                                                         | [components.StakeholderLink](../../models/components/stakeholderlink.md) | :heavy_minus_sign:                                                       | Reference to a profile picture.                                          |
# ContactLinks

Collection of social media links for the contact.

## Example Usage

```typescript
import { ContactLinks } from "@cvent/sdk/models/components";

let value: ContactLinks = {
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
| `twitterUrl`                                                               | [components.Link](../../models/components/link.md)                         | :heavy_minus_sign:                                                         | Represents a link to a related resource.                                   |
| `facebookUrl`                                                              | [components.Link](../../models/components/link.md)                         | :heavy_minus_sign:                                                         | Represents a link to a related resource.                                   |
| `linkedInUrl`                                                              | [components.Link](../../models/components/link.md)                         | :heavy_minus_sign:                                                         | Represents a link to a related resource.                                   |
| `profilePicture`                                                           | [components.ContactLinksLink](../../models/components/contactlinkslink.md) | :heavy_minus_sign:                                                         | Reference to a profile picture.                                            |
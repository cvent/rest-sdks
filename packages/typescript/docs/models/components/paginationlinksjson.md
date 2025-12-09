# PaginationLinksJson

Represents pagination links for navigating between pages of data.

## Example Usage

```typescript
import { PaginationLinksJson } from "@cvent/sdk/models/components";

let value: PaginationLinksJson = {
  next: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  self: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
  prev: {
    href: "?token=90c5f062-76ad-4ea4-aa53-00eb698d9262",
  },
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `next`                                                     | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `self`                                                     | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `prev`                                                     | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
# EventLinksJson

Represents the links associated with an event.

## Example Usage

```typescript
import { EventLinksJson } from "@cvent/sdk/models/components";

let value: EventLinksJson = {
  invitation: {
    href: "https://cvent.com",
  },
  agenda: {
    href: "https://cvent.com",
  },
  summary: {
    href: "https://cvent.com",
  },
  registration: {
    href: "https://cvent.com",
  },
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `invitation`                                               | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `agenda`                                                   | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `summary`                                                  | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
| `registration`                                             | [components.LinkJson](../../models/components/linkjson.md) | :heavy_minus_sign:                                         | Represents a link to a related resource.                   |
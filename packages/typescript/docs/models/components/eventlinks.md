# EventLinks

Represents the links associated with an event.

## Example Usage

```typescript
import { EventLinks } from "@cvent/sdk/models/components";

let value: EventLinks = {
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

| Field                                              | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `invitation`                                       | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
| `agenda`                                           | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
| `summary`                                          | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
| `registration`                                     | [components.Link](../../models/components/link.md) | :heavy_minus_sign:                                 | Represents a link to a related resource.           |
# WebcastLink

Link details for a webcast.

## Example Usage

```typescript
import { WebcastLink } from "@cvent/sdk/models/components";

let value: WebcastLink = {
  href: "https://cvent.zoom.us/j/7566652259",
  code: "1456ZS78",
};
```

## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `href`                             | *string*                           | :heavy_minus_sign:                 | A url to the webcast.              | https://cvent.zoom.us/j/7566652259 |
| `code`                             | *string*                           | :heavy_minus_sign:                 | Access code of webcast link.       | 1456ZS78                           |
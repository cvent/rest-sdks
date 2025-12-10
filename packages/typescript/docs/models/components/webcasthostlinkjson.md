# WebcastHostLinkJson

Link details for a webcast host.

## Example Usage

```typescript
import { WebcastHostLinkJson } from "@cvent/sdk/models/components";

let value: WebcastHostLinkJson = {
  href: "https://cvent.zoom.us/j/7566652259",
  code: "1456ZS78",
  key: "abcd1234",
};
```

## Fields

| Field                              | Type                               | Required                           | Description                        | Example                            |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `href`                             | *string*                           | :heavy_minus_sign:                 | A url to the webcast.              | https://cvent.zoom.us/j/7566652259 |
| `code`                             | *string*                           | :heavy_minus_sign:                 | Access code of webcast link.       | 1456ZS78                           |
| `key`                              | *string*                           | :heavy_minus_sign:                 | Host key for the webcast.          | abcd1234                           |
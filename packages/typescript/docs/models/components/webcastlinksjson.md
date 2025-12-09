# WebcastLinksJson

webcast link references

## Example Usage

```typescript
import { WebcastLinksJson } from "@cvent/sdk/models/components";

let value: WebcastLinksJson = {
  join: {
    href: "https://cvent.zoom.us/j/7566652259",
    code: "1456ZS78",
  },
  speaker: {
    href: "https://cvent.zoom.us/j/7566652259",
    code: "1456ZS78",
  },
  host: {
    href: "https://cvent.zoom.us/j/7566652259",
    code: "1456ZS78",
    key: "abcd1234",
  },
  recording: {
    href: "https://cvent.zoom.us/j/7566652259",
    code: "1456ZS78",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `join`                                                                           | [components.WebcastLinkJson](../../models/components/webcastlinkjson.md)         | :heavy_minus_sign:                                                               | Link details for a webcast.                                                      |
| `speaker`                                                                        | [components.WebcastLinkJson](../../models/components/webcastlinkjson.md)         | :heavy_minus_sign:                                                               | Link details for a webcast.                                                      |
| `host`                                                                           | [components.WebcastHostLinkJson](../../models/components/webcasthostlinkjson.md) | :heavy_minus_sign:                                                               | Link details for a webcast host.                                                 |
| `recording`                                                                      | [components.WebcastLinkJson](../../models/components/webcastlinkjson.md)         | :heavy_minus_sign:                                                               | Link details for a webcast.                                                      |
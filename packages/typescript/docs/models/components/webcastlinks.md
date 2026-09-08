# WebcastLinks

webcast link references

## Example Usage

```typescript
import { WebcastLinks } from "@cvent/sdk/models/components";

let value: WebcastLinks = {
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

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `join`                                                                   | [components.WebcastLink](../../models/components/webcastlink.md)         | :heavy_minus_sign:                                                       | Link details for a webcast.                                              |
| `speaker`                                                                | [components.WebcastLink](../../models/components/webcastlink.md)         | :heavy_minus_sign:                                                       | Link details for a webcast.                                              |
| `host`                                                                   | [components.WebcastHostLink](../../models/components/webcasthostlink.md) | :heavy_minus_sign:                                                       | Link details for a webcast host.                                         |
| `recording`                                                              | [components.WebcastLink](../../models/components/webcastlink.md)         | :heavy_minus_sign:                                                       | Link details for a webcast.                                              |
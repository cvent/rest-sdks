# Weblink

Content of exhibitor weblink.

## Example Usage

```typescript
import { Weblink } from "@cvent/sdk/models/components";

let value: Weblink = {
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  name: "Marketing Page",
  url: "http://www.example.com",
  order: 3,
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `event`                                                              | [components.EventJson5](../../models/components/eventjson5.md)       | :heavy_check_mark:                                                   | The Associated Event.                                                |                                                                      |
| `exhibitor`                                                          | [components.ExhibitorJson](../../models/components/exhibitorjson.md) | :heavy_check_mark:                                                   | The Associated Exhibitor.                                            |                                                                      |
| `name`                                                               | *string*                                                             | :heavy_check_mark:                                                   | Display name of the weblink.                                         | Marketing Page                                                       |
| `url`                                                                | *string*                                                             | :heavy_check_mark:                                                   | The URL of the weblink.                                              | http://www.example.com                                               |
| `hidden`                                                             | *boolean*                                                            | :heavy_minus_sign:                                                   | True indicates the weblink is hidden from attendees.                 |                                                                      |
| `order`                                                              | *number*                                                             | :heavy_check_mark:                                                   | Display order for exhibitor weblink content.                         | 3                                                                    |
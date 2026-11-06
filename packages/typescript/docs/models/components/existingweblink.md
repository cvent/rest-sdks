# ExistingWeblink

Exhibitor weblink with an ID.

## Example Usage

```typescript
import { ExistingWeblink } from "@cvent/sdk/models/components";

let value: ExistingWeblink = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
  exhibitor: {
    id: "4888db54-db22-11eb-8d19-0242ac130003",
  },
  name: "Marketing Page",
  url: "https://www.example.com",
  order: 3,
  id: "4d44b9e4-8c1a-403d-a20a-0b981f539935",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `event`                                                                                       | [components.Event4](../../models/components/event4.md)                                        | :heavy_check_mark:                                                                            | Associated event.                                                                             |                                                                                               |
| `exhibitor`                                                                                   | [components.Exhibitor](../../models/components/exhibitor.md)                                  | :heavy_check_mark:                                                                            | Associated exhibitor.                                                                         |                                                                                               |
| `name`                                                                                        | *string*                                                                                      | :heavy_check_mark:                                                                            | Display name of the weblink.                                                                  | Marketing Page                                                                                |
| `url`                                                                                         | *string*                                                                                      | :heavy_check_mark:                                                                            | URL of the weblink.                                                                           | https://www.example.com                                                                       |
| `hidden`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the weblink is hidden from attendees.                                          |                                                                                               |
| `order`                                                                                       | *number*                                                                                      | :heavy_check_mark:                                                                            | Display order of the weblink.                                                                 | 3                                                                                             |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Weblink ID.                                                                                   | 4d44b9e4-8c1a-403d-a20a-0b981f539935                                                          |
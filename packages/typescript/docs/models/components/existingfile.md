# ExistingFile

Content of existing exhibitor file

## Example Usage

```typescript
import { ExistingFile } from "@cvent/sdk/models/components";

let value: ExistingFile = {
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
  displayName: "Marketing Page",
  order: 3,
  id: "3d44b9e4-8c1a-403d-a20a-0b981f539935",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `event`                                                                                       | [components.EventJson6](../../models/components/eventjson6.md)                                | :heavy_check_mark:                                                                            | The Associated Event.                                                                         |                                                                                               |
| `exhibitor`                                                                                   | [components.ExhibitorJson](../../models/components/exhibitorjson.md)                          | :heavy_check_mark:                                                                            | The Associated Exhibitor.                                                                     |                                                                                               |
| `displayName`                                                                                 | *string*                                                                                      | :heavy_check_mark:                                                                            | Display name of the file.                                                                     | Marketing Page                                                                                |
| `hidden`                                                                                      | *boolean*                                                                                     | :heavy_minus_sign:                                                                            | True indicates the file is hidden from attendees.                                             |                                                                                               |
| `order`                                                                                       | *number*                                                                                      | :heavy_check_mark:                                                                            | Display order for exhibitor file content.                                                     | 3                                                                                             |
| `id`                                                                                          | *string*                                                                                      | :heavy_minus_sign:                                                                            | Unique ID of the file.                                                                        | 3d44b9e4-8c1a-403d-a20a-0b981f539935                                                          |
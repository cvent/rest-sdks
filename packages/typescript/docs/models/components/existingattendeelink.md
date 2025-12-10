# ExistingAttendeeLink

An existing attendee link.

## Example Usage

```typescript
import { ExistingAttendeeLink } from "@cvent/sdk/models/components";

let value: ExistingAttendeeLink = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  webcast: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  sourceId: "kBBBAAcccdddd8U==",
  join: {
    href: "https://cvent.zoom.us/j/7566652259",
    code: "1456ZS78",
  },
  id: "61120b74-0905-4aaf-9343-8fc2d7e0b430",
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `webcast`                                                                                     | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_check_mark:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `event`                                                                                       | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_minus_sign:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `session`                                                                                     | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_minus_sign:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `attendee`                                                                                    | [components.UuidJson](../../models/components/uuidjson.md)                                    | :heavy_check_mark:                                                                            | The reference to the related entity. Contains only the ID of the related entity.              |                                                                                               |
| `sourceId`                                                                                    | *string*                                                                                      | :heavy_minus_sign:                                                                            | Source Id of the webcast provider                                                             | kBBBAAcccdddd8U==                                                                             |
| `join`                                                                                        | [components.WebcastLinkJson](../../models/components/webcastlinkjson.md)                      | :heavy_minus_sign:                                                                            | Link details for a webcast.                                                                   |                                                                                               |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | Attendee-link ID                                                                              |                                                                                               |
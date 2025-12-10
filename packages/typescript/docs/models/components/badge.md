# Badge

A JSON Schema for Badge object.

## Example Usage

```typescript
import { Badge } from "@cvent/sdk/models/components";

let value: Badge = {
  created: new Date("2017-01-02T02:00:00Z"),
  createdBy: "hporter",
  lastModified: new Date("2019-02-12T03:00:00Z"),
  lastModifiedBy: "hporter",
  id: "abc123",
  status: "Active",
  type: "Epc",
  attendee: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  event: {
    id: "3db28cfc-db22-11eb-8d19-0242ac130003",
  },
};
```

## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `created`                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was created.                                    | 2017-01-02T02:00:00Z                                                                          |
| `createdBy`                                                                                   | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that created this record.                                          | hporter                                                                                       |
| `lastModified`                                                                                | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date) | :heavy_minus_sign:                                                                            | The ISO 8601 zoned date time when this record was updated.                                    | 2019-02-12T03:00:00Z                                                                          |
| `lastModifiedBy`                                                                              | *string*                                                                                      | :heavy_minus_sign:                                                                            | The identifier of the user that last updated this record.                                     | hporter                                                                                       |
| `id`                                                                                          | *string*                                                                                      | :heavy_check_mark:                                                                            | Id of a badge                                                                                 | abc123                                                                                        |
| `status`                                                                                      | [components.BadgeStatusJson](../../models/components/badgestatusjson.md)                      | :heavy_check_mark:                                                                            | Badge status                                                                                  | Active                                                                                        |
| `type`                                                                                        | [components.BadgeTypeJson](../../models/components/badgetypejson.md)                          | :heavy_check_mark:                                                                            | Badge type                                                                                    | Epc                                                                                           |
| `attendee`                                                                                    | [components.AttendeeJson3](../../models/components/attendeejson3.md)                          | :heavy_check_mark:                                                                            | A JSON Schema for an Attendee object                                                          |                                                                                               |
| `event`                                                                                       | [components.EventJson5](../../models/components/eventjson5.md)                                | :heavy_check_mark:                                                                            | The Associated Event.                                                                         |                                                                                               |
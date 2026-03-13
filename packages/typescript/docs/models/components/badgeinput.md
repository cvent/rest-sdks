# BadgeInput

A JSON Schema for Badge object.

## Example Usage

```typescript
import { BadgeInput } from "@cvent/sdk/models/components";

let value: BadgeInput = {
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

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `id`                                                                     | *string*                                                                 | :heavy_check_mark:                                                       | Id of a badge                                                            | abc123                                                                   |
| `status`                                                                 | [components.BadgeStatusJson](../../models/components/badgestatusjson.md) | :heavy_check_mark:                                                       | Badge status                                                             | Active                                                                   |
| `type`                                                                   | [components.BadgeTypeJson](../../models/components/badgetypejson.md)     | :heavy_check_mark:                                                       | Badge type                                                               | Epc                                                                      |
| `attendee`                                                               | [components.AttendeeJson3](../../models/components/attendeejson3.md)     | :heavy_check_mark:                                                       | A JSON Schema for an Attendee object                                     |                                                                          |
| `event`                                                                  | [components.EventJson6](../../models/components/eventjson6.md)           | :heavy_check_mark:                                                       | The Associated Event.                                                    |                                                                          |
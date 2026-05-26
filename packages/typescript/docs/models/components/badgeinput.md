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

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `id`                                                             | *string*                                                         | :heavy_check_mark:                                               | Id of a badge                                                    | abc123                                                           |
| `status`                                                         | [components.BadgeStatus](../../models/components/badgestatus.md) | :heavy_check_mark:                                               | Badge status                                                     | Active                                                           |
| `type`                                                           | [components.BadgeType](../../models/components/badgetype.md)     | :heavy_check_mark:                                               | Badge type                                                       | Epc                                                              |
| `attendee`                                                       | [components.Attendee2](../../models/components/attendee2.md)     | :heavy_check_mark:                                               | The associated Attendee.                                         |                                                                  |
| `event`                                                          | [components.Event1](../../models/components/event1.md)           | :heavy_check_mark:                                               | The Associated Event.                                            |                                                                  |
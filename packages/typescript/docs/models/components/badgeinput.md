# BadgeInput

Badge of an attendee.

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
| `id`                                                             | *string*                                                         | :heavy_check_mark:                                               | Badge ID.                                                        | abc123                                                           |
| `status`                                                         | [components.BadgeStatus](../../models/components/badgestatus.md) | :heavy_check_mark:                                               | Status of the badge.                                             | Active                                                           |
| `type`                                                           | [components.BadgeType](../../models/components/badgetype.md)     | :heavy_check_mark:                                               | Type of the badge.                                               | Epc                                                              |
| `attendee`                                                       | [components.Attendee12](../../models/components/attendee12.md)   | :heavy_check_mark:                                               | Associated attendee.                                             |                                                                  |
| `event`                                                          | [components.Event4](../../models/components/event4.md)           | :heavy_check_mark:                                               | Associated event.                                                |                                                                  |
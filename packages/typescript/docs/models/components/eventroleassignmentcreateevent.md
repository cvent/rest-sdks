# EventRoleAssignmentCreateEvent

The event to which the role assignment belongs.

## Example Usage

```typescript
import { EventRoleAssignmentCreateEvent } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentCreateEvent = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *string*                                                 | :heavy_check_mark:                                       | The ID of the event to which the event role is assigned. |
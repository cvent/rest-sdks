# EventRoleAssignmentJsonEvent

The event where the user gets a role. For more details, use the [Get Event](#tag/Events/operation/getEventById) endpoint with the event ID.

## Example Usage

```typescript
import { EventRoleAssignmentJsonEvent } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentJsonEvent = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The unique ID of the event.          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3 |
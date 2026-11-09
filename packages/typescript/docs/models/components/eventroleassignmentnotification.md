# EventRoleAssignmentNotification

Notification settings for an event role assignment.

## Example Usage

```typescript
import { EventRoleAssignmentNotification } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentNotification = {
  sendNotification: true,
};
```

## Fields

| Field                                                                                                                                                       | Type                                                                                                                                                        | Required                                                                                                                                                    | Description                                                                                                                                                 | Example                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sendNotification`                                                                                                                                          | *boolean*                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                          | When true, the service queues a notification email to the assignee after the assignment succeeds. When false or omitted, the service sends no notification. | true                                                                                                                                                        |
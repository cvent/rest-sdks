# EventRoleAssignmentNotificationFailureDetail

Describes why an event-role assignment notification failed. The code is the integer HTTP response status code.

## Example Usage

```typescript
import { EventRoleAssignmentNotificationFailureDetail } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentNotificationFailureDetail = {
  code: 503,
  message: "Notification could not be rendered or queued.",
};
```

## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `code`                                                          | *number*                                                        | :heavy_check_mark:                                              | Integer HTTP response status code for the notification failure. | 503                                                             |
| `message`                                                       | *string*                                                        | :heavy_check_mark:                                              | A safe description of the notification failure.                 | Notification could not be rendered or queued.                   |
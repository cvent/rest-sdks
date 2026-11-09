# EventRoleAssignmentNotificationFailureDetail

Describes why an event-role assignment notification failed. The code is the integer HTTP response status code.


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `code`                                                          | *long*                                                          | :heavy_check_mark:                                              | Integer HTTP response status code for the notification failure. | 503                                                             |
| `message`                                                       | *String*                                                        | :heavy_check_mark:                                              | A safe description of the notification failure.                 | Notification could not be rendered or queued.                   |
# EventRoleAssignmentCreate

Request to assign an event role to an account user or no-login user. The notification object is optional.

## Example Usage

```typescript
import { EventRoleAssignmentCreate } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentCreate = {
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  eventRole: {
    id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
  },
  user: {
    type: "ACCOUNT_USER",
    id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
  },
  notification: {
    sendNotification: true,
  },
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    | Example                                                                                                        |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `event`                                                                                                        | [components.EventRoleAssignmentCreateEvent](../../models/components/eventroleassignmentcreateevent.md)         | :heavy_check_mark:                                                                                             | The event to which the role assignment belongs.                                                                | {<br/>"id": "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3"<br/>}                                                       |
| `eventRole`                                                                                                    | [components.EventRoleAssignmentCreateEventRole](../../models/components/eventroleassignmentcreateeventrole.md) | :heavy_check_mark:                                                                                             | The event role to assign.                                                                                      | {<br/>"id": "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc"<br/>}                                                       |
| `user`                                                                                                         | *components.EventRoleAssignmentUserUnion*                                                                      | :heavy_check_mark:                                                                                             | The user to receive the event role. This can be an account user or a no-login user.                            | {<br/>"type": "ACCOUNT_USER",<br/>"id": "7c9e6679-7425-40de-944b-e07fc1f90ae7"<br/>}                           |
| `notification`                                                                                                 | [components.EventRoleAssignmentNotification](../../models/components/eventroleassignmentnotification.md)       | :heavy_minus_sign:                                                                                             | Notification settings for an event role assignment.                                                            | {<br/>"sendNotification": true<br/>}                                                                           |
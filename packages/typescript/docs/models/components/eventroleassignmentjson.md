# EventRoleAssignmentJson

An assignment of an event role to a user for an event.

## Example Usage

```typescript
import { EventRoleAssignmentJson } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentJson = {
  id:
    "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::2b1a3bba-84b2-46f4-bddb-4b4a44442dcc::6807e044-993b-428c-aec8-7316f13c1b95",
  event: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  user: {
    id: "6807e044-993b-428c-aec8-7316f13c1b95",
  },
  eventRole: {
    id: "2b1a3bba-84b2-46f4-bddb-4b4a44442dcc",
  },
  assigned: new Date("2017-01-02T02:00:00Z"),
  assignedBy: "hporter",
};
```

## Fields

| Field                                                                                                                                          | Type                                                                                                                                           | Required                                                                                                                                       | Description                                                                                                                                    | Example                                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                           | *string*                                                                                                                                       | :heavy_minus_sign:                                                                                                                             | The unique ID of the event role assignment, which concatenates the IDs of the event, the event role, and the user assigned the role.           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3::2b1a3bba-84b2-46f4-bddb-4b4a44442dcc::6807e044-993b-428c-aec8-7316f13c1b95                               |
| `event`                                                                                                                                        | [components.EventRoleAssignmentJsonEvent](../../models/components/eventroleassignmentjsonevent.md)                                             | :heavy_minus_sign:                                                                                                                             | The event where the user gets a role. For more details, use the [Get Event](#tag/Events/operation/getEventById) endpoint with the event ID.    |                                                                                                                                                |
| `user`                                                                                                                                         | [components.EventRoleAssignmentJsonUser](../../models/components/eventroleassignmentjsonuser.md)                                               | :heavy_minus_sign:                                                                                                                             | The user to whom the event role is assigned. For more details, use the [Get User](#tag/User-SCIM/operation/getUser) endpoint with the user ID. |                                                                                                                                                |
| `eventRole`                                                                                                                                    | [components.EventRoleJson](../../models/components/eventrolejson.md)                                                                           | :heavy_minus_sign:                                                                                                                             | An object that contains the event role ID. This is an **expandable** object and, if requested, will contain the name of the event role.        |                                                                                                                                                |
| `assigned`                                                                                                                                     | [Date](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date)                                                  | :heavy_minus_sign:                                                                                                                             | The ISO 8601 zoned date-time when the event role was assigned to the user.                                                                     | 2017-01-02T02:00:00Z                                                                                                                           |
| `assignedBy`                                                                                                                                   | *string*                                                                                                                                       | :heavy_minus_sign:                                                                                                                             | The identifier of the user who assigned the event role.                                                                                        | hporter                                                                                                                                        |
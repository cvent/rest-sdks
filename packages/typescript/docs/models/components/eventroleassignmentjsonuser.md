# EventRoleAssignmentJsonUser

The user to whom the event role is assigned. For more details, use the [Get User](#tag/User-SCIM/operation/getUser) endpoint with the user ID.

## Example Usage

```typescript
import { EventRoleAssignmentJsonUser } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentJsonUser = {
  id: "6807e044-993b-428c-aec8-7316f13c1b95",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `id`                                 | *string*                             | :heavy_minus_sign:                   | The unique ID of the user.           | 6807e044-993b-428c-aec8-7316f13c1b95 |
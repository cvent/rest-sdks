# EventRoleAssignmentAccountUser

An account user to receive an event role.

## Example Usage

```typescript
import { EventRoleAssignmentAccountUser } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentAccountUser = {
  type: "ACCOUNT_USER",
  id: "7c9e6679-7425-40de-944b-e07fc1f90ae7",
};
```

## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                         | [components.EventRoleAssignmentAccountUserType](../../models/components/eventroleassignmentaccountusertype.md) | :heavy_check_mark:                                                                                             | Identifies the user as an account user.                                                                        |
| `id`                                                                                                           | *string*                                                                                                       | :heavy_check_mark:                                                                                             | The ID of the account user who receives the event role.                                                        |
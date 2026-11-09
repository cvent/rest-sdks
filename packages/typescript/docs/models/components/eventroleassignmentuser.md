# EventRoleAssignmentUser

The user to whom the event role is assigned. For a no-login user, the `id` is the resolved user ID, not the email address.

## Example Usage

```typescript
import { EventRoleAssignmentUser } from "@cvent/sdk/models/components";

let value: EventRoleAssignmentUser = {
  id: "6807e044-993b-428c-aec8-7316f13c1b95",
  type: "ACCOUNT_USER",
};
```

## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     | Example                                                                                         |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `id`                                                                                            | *string*                                                                                        | :heavy_minus_sign:                                                                              | The unique ID of the user.                                                                      | 6807e044-993b-428c-aec8-7316f13c1b95                                                            |
| `type`                                                                                          | [components.EventRoleAssignmentType](../../models/components/eventroleassignmenttype.md)        | :heavy_minus_sign:                                                                              | Whether the assigned user is an account user (ACCOUNT_USER) or a no-login user (NO_LOGIN_USER). | ACCOUNT_USER                                                                                    |
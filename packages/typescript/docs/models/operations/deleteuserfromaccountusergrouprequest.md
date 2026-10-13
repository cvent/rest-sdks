# DeleteUserFromAccountUserGroupRequest

## Example Usage

```typescript
import { DeleteUserFromAccountUserGroupRequest } from "@cvent/sdk/models/operations";

let value: DeleteUserFromAccountUserGroupRequest = {
  userGroupId: "B089AC31-1212-63FB-AAEA-382037E1BCDF",
  userId: "ff8af134-3505-4d67-aaea-1975d8e1327c",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `userGroupId`                        | *string*                             | :heavy_check_mark:                   | The User Group's Id.<br/>            | B089AC31-1212-63FB-AAEA-382037E1BCDF |
| `userId`                             | *string*                             | :heavy_check_mark:                   | The Account User's Id.<br/>          | ff8af134-3505-4d67-aaea-1975d8e1327c |
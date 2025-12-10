# DeleteUserFromAccountUserGroupRequest

## Example Usage

```typescript
import { DeleteUserFromAccountUserGroupRequest } from "@cvent/sdk/models/operations";

let value: DeleteUserFromAccountUserGroupRequest = {
  userGroupId: "B089AC31-1212-63FB-AAEA-382037E1BCDF",
  userId: "FF8AF134-3505-4D67-AAEA-1975D8E1327C",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `userGroupId`                        | *string*                             | :heavy_check_mark:                   | The User Group's Id.<br/>            | B089AC31-1212-63FB-AAEA-382037E1BCDF |
| `userId`                             | *string*                             | :heavy_check_mark:                   | The Account User's Id.<br/>          | FF8AF134-3505-4D67-AAEA-1975D8E1327C |
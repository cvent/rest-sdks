# AssociateEventUserGroupRequest

## Example Usage

```typescript
import { AssociateEventUserGroupRequest } from "@cvent/sdk/models/operations";

let value: AssociateEventUserGroupRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  userGroupId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `id`                                                      | *string*                                                  | :heavy_check_mark:                                        | Unique ID of an event.                                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                      |
| `userGroupId`                                             | *string*                                                  | :heavy_check_mark:                                        | Unique ID of the user group to associate or disassociate. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                      |
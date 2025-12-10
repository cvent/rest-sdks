# GroupJson

Generic sample name. Not a real model used by any Cvent service.

## Example Usage

```typescript
import { GroupJson } from "@cvent/sdk/models/components";

let value: GroupJson = {
  value: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
  display: "Admin",
};
```

## Fields

| Field                                | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `value`                              | *string*                             | :heavy_check_mark:                   | The unique ID of the SCIM group.     | 3b2359a7-4583-40ed-8afd-67e5f15373d3 |
| `display`                            | *string*                             | :heavy_minus_sign:                   | The name of the user role.           | Admin                                |
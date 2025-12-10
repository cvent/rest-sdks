# GroupJson0

Generic sample name. Not a real model used by any Cvent service.

## Example Usage

```typescript
import { GroupJson0 } from "@cvent/sdk/models/components";

let value: GroupJson0 = {
  schemas: [
    "urn:ietf:params:scim:api:messages:2.0:ListResponse",
  ],
  id: "3b2359a7-4583-40ed-8afd-67e5f15373d3",
  displayName: "Admin",
  meta: {
    resourceType: "user",
    location: "https://<account>/scim/v2/Users/2",
    created: new Date("2021-12-16T00:59:14.570Z"),
    lastModified: new Date("2021-12-16T00:59:14.570Z"),
  },
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `schemas`                                                  | *string*[]                                                 | :heavy_minus_sign:                                         | The list of schemas using this resource.                   |                                                            |
| `id`                                                       | *string*                                                   | :heavy_check_mark:                                         | The unique ID of the SCIM group.                           | 3b2359a7-4583-40ed-8afd-67e5f15373d3                       |
| `displayName`                                              | *string*                                                   | :heavy_minus_sign:                                         | The name of the user role.                                 | Admin                                                      |
| `meta`                                                     | [components.MetaJson](../../models/components/metajson.md) | :heavy_minus_sign:                                         | Metadata of the resource.                                  |                                                            |
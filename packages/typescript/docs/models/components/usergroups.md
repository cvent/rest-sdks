# UserGroups

Groups

## Example Usage

```typescript
import { UserGroups } from "@cvent/sdk/models/components";

let value: UserGroups = {
  schemas: [
    "urn:ietf:params:scim:api:messages:2.0:ListResponse",
  ],
  itemsPerPage: 50,
  startIndex: 1,
  totalResults: 5,
  resources: [
    {
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
    },
  ],
};
```

## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `schemas`                                                        | *string*[]                                                       | :heavy_minus_sign:                                               | The collection of user schemas.                                  |                                                                  |
| `itemsPerPage`                                                   | *number*                                                         | :heavy_minus_sign:                                               | The number of schemas per page.                                  | 50                                                               |
| `startIndex`                                                     | *number*                                                         | :heavy_minus_sign:                                               | Starting index of the response.                                  | 1                                                                |
| `totalResults`                                                   | *number*                                                         | :heavy_minus_sign:                                               | The total count of schemas.                                      | 5                                                                |
| `resources`                                                      | [components.GroupJson0](../../models/components/groupjson0.md)[] | :heavy_minus_sign:                                               | The collection of schema resources.                              |                                                                  |
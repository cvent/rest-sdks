# UsersSchemas

Schemas

## Example Usage

```typescript
import { UsersSchemas } from "@cvent/sdk/models/components";

let value: UsersSchemas = {
  schemas: [
    "urn:ietf:params:scim:api:messages:2.0:ListResponse",
  ],
  itemsPerPage: 50,
  startIndex: 1,
  totalResults: 5,
  resources: [
    {
      id: "urn:ietf:params:scim:api:messages:2.0:ListResponse",
      name: "User",
      description: "This Attribute describes the Schema",
      attributes: [
        {
          name: "userName",
          type: "string",
          multiValued: true,
          description: "This Attribute describes the property",
          required: true,
          caseExact: false,
          mutability: "writeOnly",
          canonicalValues: [
            "work",
          ],
          returned: "always",
          uniqueness: "global",
          referenceTypes: [
            "Group",
          ],
          subAttributes: [
            {
              name: "userName",
              type: "string",
              multiValued: true,
              description: "This Attribute describes the property",
              required: true,
              caseExact: false,
              mutability: "writeOnly",
              canonicalValues: [
                "work",
              ],
              returned: "always",
              uniqueness: "global",
              referenceTypes: [
                "Group",
              ],
            },
          ],
        },
      ],
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
| `resources`                                                      | [components.SchemaJson](../../models/components/schemajson.md)[] | :heavy_minus_sign:                                               | The collection of schema resources.                              |                                                                  |
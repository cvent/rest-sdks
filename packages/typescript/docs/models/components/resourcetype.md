# ResourceType

Resource Type

## Example Usage

```typescript
import { ResourceType } from "@cvent/sdk/models/components";

let value: ResourceType = {
  schemas: [
    "urn:ietf:params:scim:api:messages:2.0:ListResponse",
  ],
  id: "urn:ietf:params:scim:api:messages:2.0:ListResponse",
  name: "User",
  description: "This Attribute describes the Schema",
  endpoint: "/Users",
  schema: "urn:ietf:params:scim:schemas:core:2.0:User",
  schemaExtensions: [
    {
      schema: "urn:ietf:params:scim:api:messages:2.0:ListResponse",
      required: true,
    },
  ],
  meta: {
    resourceType: "user",
    location: "https://<account>/scim/v2/Users/2",
    created: new Date("2021-12-16T00:59:14.570Z"),
    lastModified: new Date("2021-12-16T00:59:14.570Z"),
  },
};
```

## Fields

| Field                                                                                              | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `schemas`                                                                                          | *string*[]                                                                                         | :heavy_minus_sign:                                                                                 | The list of schemas using this resource.                                                           |                                                                                                    |
| `id`                                                                                               | *string*                                                                                           | :heavy_minus_sign:                                                                                 | The unique identifier of the resource type.                                                        | urn:ietf:params:scim:api:messages:2.0:ListResponse                                                 |
| `name`                                                                                             | *string*                                                                                           | :heavy_minus_sign:                                                                                 | The name of the resource type.                                                                     | User                                                                                               |
| `description`                                                                                      | *string*                                                                                           | :heavy_minus_sign:                                                                                 | The description of the resource type.                                                              | This Attribute describes the Schema                                                                |
| `endpoint`                                                                                         | *string*                                                                                           | :heavy_minus_sign:                                                                                 | The URL of the resource type endpoint.                                                             | /Users                                                                                             |
| `schema`                                                                                           | *string*                                                                                           | :heavy_minus_sign:                                                                                 | The schema of the resource type.                                                                   | urn:ietf:params:scim:schemas:core:2.0:User                                                         |
| `schemaExtensions`                                                                                 | [components.ResourceTypeSchemaExtension](../../models/components/resourcetypeschemaextension.md)[] | :heavy_minus_sign:                                                                                 | The list of schema extensions for the resource type.                                               |                                                                                                    |
| `meta`                                                                                             | [components.MetaJson](../../models/components/metajson.md)                                         | :heavy_minus_sign:                                                                                 | Metadata of the resource.                                                                          |                                                                                                    |
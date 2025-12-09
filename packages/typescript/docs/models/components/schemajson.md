# SchemaJson

Schema

## Example Usage

```typescript
import { SchemaJson } from "@cvent/sdk/models/components";

let value: SchemaJson = {
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
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *string*                                                               | :heavy_minus_sign:                                                     | The unique identifier of the schema.                                   | urn:ietf:params:scim:api:messages:2.0:ListResponse                     |
| `name`                                                                 | *string*                                                               | :heavy_minus_sign:                                                     | The name of the schema.                                                | User                                                                   |
| `description`                                                          | *string*                                                               | :heavy_minus_sign:                                                     | The description of the schema.                                         | This Attribute describes the Schema                                    |
| `attributes`                                                           | [components.AttributeJson](../../models/components/attributejson.md)[] | :heavy_minus_sign:                                                     | The collection of attributes for the schema.                           |                                                                        |
| `meta`                                                                 | [components.MetaJson](../../models/components/metajson.md)             | :heavy_minus_sign:                                                     | Metadata of the resource.                                              |                                                                        |
# ResourceTypeJsonSchemaExtension

## Example Usage

```typescript
import { ResourceTypeJsonSchemaExtension } from "@cvent/sdk/models/components";

let value: ResourceTypeJsonSchemaExtension = {
  schema: "urn:ietf:params:scim:api:messages:2.0:ListResponse",
  required: true,
};
```

## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `schema`                                            | *string*                                            | :heavy_minus_sign:                                  | The id of the schema extension                      | urn:ietf:params:scim:api:messages:2.0:ListResponse  |
| `required`                                          | *boolean*                                           | :heavy_minus_sign:                                  | True indicates if the schema extension is required. | true                                                |
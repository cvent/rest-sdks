# UsersSchema

Schema


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `id`                                                             | *Optional\<String>*                                              | :heavy_minus_sign:                                               | The unique identifier of the schema.                             | urn:ietf:params:scim:api:messages:2.0:ListResponse               |
| `name`                                                           | *Optional\<String>*                                              | :heavy_minus_sign:                                               | The name of the schema.                                          | User                                                             |
| `description`                                                    | *Optional\<String>*                                              | :heavy_minus_sign:                                               | The description of the schema.                                   | This Attribute describes the Schema                              |
| `attributes`                                                     | List\<[AttributeJson](../../models/components/AttributeJson.md)> | :heavy_minus_sign:                                               | The collection of attributes for the schema.                     |                                                                  |
| `meta`                                                           | [Optional\<MetaJson>](../../models/components/MetaJson.md)       | :heavy_minus_sign:                                               | Metadata of the resource.                                        |                                                                  |
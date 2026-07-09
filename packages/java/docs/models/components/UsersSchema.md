# UsersSchema

Schema


## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *Optional\<String>*                                      | :heavy_minus_sign:                                       | The unique identifier of the schema.                     | urn:ietf:params:scim:api:messages:2.0:ListResponse       |
| `name`                                                   | *Optional\<String>*                                      | :heavy_minus_sign:                                       | The name of the schema.                                  | User                                                     |
| `description`                                            | *Optional\<String>*                                      | :heavy_minus_sign:                                       | The description of the schema.                           | This Attribute describes the Schema                      |
| `attributes`                                             | List\<[Attribute](../../models/components/Attribute.md)> | :heavy_minus_sign:                                       | The collection of attributes for the schema.             |                                                          |
| `meta`                                                   | [Optional\<Meta>](../../models/components/Meta.md)       | :heavy_minus_sign:                                       | Metadata of the resource.                                |                                                          |
# SchemaJson

Schema


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `Id`                                                            | *string*                                                        | :heavy_minus_sign:                                              | The unique identifier of the schema.                            | urn:ietf:params:scim:api:messages:2.0:ListResponse              |
| `Name`                                                          | *string*                                                        | :heavy_minus_sign:                                              | The name of the schema.                                         | User                                                            |
| `Description`                                                   | *string*                                                        | :heavy_minus_sign:                                              | The description of the schema.                                  | This Attribute describes the Schema                             |
| `Attributes`                                                    | List<[AttributeJson](../../Models/Components/AttributeJson.md)> | :heavy_minus_sign:                                              | The collection of attributes for the schema.                    |                                                                 |
| `Meta`                                                          | [MetaJson](../../Models/Components/MetaJson.md)                 | :heavy_minus_sign:                                              | Metadata of the resource.                                       |                                                                 |
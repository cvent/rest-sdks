# AttributeJson

Attribute

## Example Usage

```typescript
import { AttributeJson } from "@cvent/sdk/models/components";

let value: AttributeJson = {
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
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `name`                                                                                           | *string*                                                                                         | :heavy_minus_sign:                                                                               | The name of the attribute.                                                                       | userName                                                                                         |
| `type`                                                                                           | [components.AttributeDataTypeJson](../../models/components/attributedatatypejson.md)             | :heavy_minus_sign:                                                                               | This is used to denote the type of the attribute.                                                | string                                                                                           |
| `multiValued`                                                                                    | *boolean*                                                                                        | :heavy_minus_sign:                                                                               | Indicates if the attribute is multivalued.                                                       | true                                                                                             |
| `description`                                                                                    | *string*                                                                                         | :heavy_minus_sign:                                                                               | The description of the attribute.                                                                | This Attribute describes the property                                                            |
| `required`                                                                                       | *boolean*                                                                                        | :heavy_minus_sign:                                                                               | True indicates the attribute is required.                                                        | true                                                                                             |
| `caseExact`                                                                                      | *boolean*                                                                                        | :heavy_minus_sign:                                                                               | True indicates the attribute is case sensitive.                                                  | false                                                                                            |
| `mutability`                                                                                     | [components.MutabilityJson](../../models/components/mutabilityjson.md)                           | :heavy_minus_sign:                                                                               | This is used to denote the mutability of the attribute.                                          | writeOnly                                                                                        |
| `canonicalValues`                                                                                | *string*[]                                                                                       | :heavy_minus_sign:                                                                               | The list of canonical values of the attribute.                                                   |                                                                                                  |
| `returned`                                                                                       | [components.AttributeReturnedTypeJson](../../models/components/attributereturnedtypejson.md)     | :heavy_minus_sign:                                                                               | This is used to denote the returned type of the attribute.                                       | always                                                                                           |
| `uniqueness`                                                                                     | [components.AttributeUniquenessTypeJson](../../models/components/attributeuniquenesstypejson.md) | :heavy_minus_sign:                                                                               | This is used to denote the uniqueness type of the attribute.                                     | global                                                                                           |
| `referenceTypes`                                                                                 | [components.AttributeReferenceTypeJson](../../models/components/attributereferencetypejson.md)[] | :heavy_minus_sign:                                                                               | This is used to denote the reference type of the attribute.                                      |                                                                                                  |
| `subAttributes`                                                                                  | [components.AttributeJson](../../models/components/attributejson.md)[]                           | :heavy_minus_sign:                                                                               | A collection of sub-attributes. Has the same structure as this attribute object.                 |                                                                                                  |
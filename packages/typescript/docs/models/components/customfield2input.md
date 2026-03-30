# CustomField2Input

A Custom Field

## Example Usage

```typescript
import { CustomField2Input } from "@cvent/sdk/models/components";

let value: CustomField2Input = {
  id: "1c92a326-f3b8-45b2-bc32-893799d3b38c",
  type: "MultiSelect",
  value: [
    "Choice C",
    "Choice A",
  ],
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | The unique ID representing this custom field.                                                    |                                                                                                  |
| `type`                                                                                           | [components.CustomField2CustomFieldType](../../models/components/customfield2customfieldtype.md) | :heavy_minus_sign:                                                                               | The type of data collected by a custom field.                                                    | MultiSelect                                                                                      |
| `value`                                                                                          | *string*[]                                                                                       | :heavy_check_mark:                                                                               | The set of answers or possible answers to a question.                                            | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                           |
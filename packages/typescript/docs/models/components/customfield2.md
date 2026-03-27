# CustomField2

A Custom Field

## Example Usage

```typescript
import { CustomField2 } from "@cvent/sdk/models/components";

let value: CustomField2 = {
  id: "f0699aef-ca73-47aa-8eba-544460fbc88c",
  name: "What is a your favorite color?",
  type: "MultiSelect",
  value: [
    "Choice C",
    "Choice A",
  ],
  order: 1,
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | The unique ID representing this custom field.                                                    |                                                                                                  |
| `name`                                                                                           | *string*                                                                                         | :heavy_minus_sign:                                                                               | The actual text of the custom field.                                                             | What is a your favorite color?                                                                   |
| `type`                                                                                           | [components.CustomField2CustomFieldType](../../models/components/customfield2customfieldtype.md) | :heavy_minus_sign:                                                                               | The type of data collected by a custom field.                                                    | MultiSelect                                                                                      |
| `value`                                                                                          | *string*[]                                                                                       | :heavy_check_mark:                                                                               | The set of answers or possible answers to a question.                                            | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                           |
| `order`                                                                                          | *number*                                                                                         | :heavy_minus_sign:                                                                               | The order of this question in the bigger list of questions.                                      | 1                                                                                                |
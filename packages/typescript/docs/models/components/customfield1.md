# CustomField1

A Custom Field

## Example Usage

```typescript
import { CustomField1 } from "@cvent/sdk/models/components";

let value: CustomField1 = {
  id: "404fc6d7-468f-47fa-a55e-bd46c6b26394",
  name: "What is your favorite color?",
  value: [
    "Choice C",
    "Choice A",
  ],
  order: 1,
  type: "MultiSelect",
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | The unique ID representing this custom field.                                                    |                                                                                                  |
| `name`                                                                                           | *string*                                                                                         | :heavy_minus_sign:                                                                               | The actual text of the custom field.                                                             | What is your favorite color?                                                                     |
| `value`                                                                                          | *string*[]                                                                                       | :heavy_check_mark:                                                                               | The set of answers or possible answers to a question.                                            | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                           |
| `order`                                                                                          | *number*                                                                                         | :heavy_minus_sign:                                                                               | The order of this question in the bigger list of questions.                                      | 1                                                                                                |
| `type`                                                                                           | [components.CustomField1CustomFieldType](../../models/components/customfield1customfieldtype.md) | :heavy_minus_sign:                                                                               | The type of data collected by a custom field.                                                    | MultiSelect                                                                                      |
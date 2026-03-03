# CustomField

A Custom Field

## Example Usage

```typescript
import { CustomField } from "@cvent/sdk/models/components";

let value: CustomField = {
  id: "fa5f9da7-c14a-4feb-8763-32e40bced6cf",
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

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `id`                                                                                           | *string*                                                                                       | :heavy_check_mark:                                                                             | The unique ID representing this custom field.                                                  |                                                                                                |
| `name`                                                                                         | *string*                                                                                       | :heavy_minus_sign:                                                                             | The actual text of the custom field.                                                           | What is a your favorite color?                                                                 |
| `type`                                                                                         | [components.CustomFieldCustomFieldType](../../models/components/customfieldcustomfieldtype.md) | :heavy_minus_sign:                                                                             | The type of data collected by a custom field.                                                  | MultiSelect                                                                                    |
| `value`                                                                                        | *string*[]                                                                                     | :heavy_check_mark:                                                                             | The set of answers or possible answers to a question.                                          | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                         |
| `order`                                                                                        | *number*                                                                                       | :heavy_minus_sign:                                                                             | The order of this question in the bigger list of questions.                                    | 1                                                                                              |
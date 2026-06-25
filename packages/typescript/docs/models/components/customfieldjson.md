# CustomFieldJson

A Custom Field

## Example Usage

```typescript
import { CustomFieldJson } from "@cvent/sdk/models/components";

let value: CustomFieldJson = {
  id: "1621ccd9-9925-4ae5-b3a7-47fd3acf4357",
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

| Field                                                                                                  | Type                                                                                                   | Required                                                                                               | Description                                                                                            | Example                                                                                                |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                   | *string*                                                                                               | :heavy_check_mark:                                                                                     | The unique ID representing this custom field.                                                          |                                                                                                        |
| `name`                                                                                                 | *string*                                                                                               | :heavy_minus_sign:                                                                                     | The actual text of the custom field.                                                                   | What is a your favorite color?                                                                         |
| `type`                                                                                                 | [components.CustomFieldJsonCustomFieldType](../../models/components/customfieldjsoncustomfieldtype.md) | :heavy_minus_sign:                                                                                     | The type of data collected by a custom field.                                                          | MultiSelect                                                                                            |
| `value`                                                                                                | *string*[]                                                                                             | :heavy_check_mark:                                                                                     | The set of answers or possible answers to a question.                                                  | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                                 |
| `order`                                                                                                | *number*                                                                                               | :heavy_minus_sign:                                                                                     | The order of this question in the bigger list of questions.                                            | 1                                                                                                      |
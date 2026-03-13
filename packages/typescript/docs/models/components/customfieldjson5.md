# CustomFieldJson5

A Custom Field

## Example Usage

```typescript
import { CustomFieldJson5 } from "@cvent/sdk/models/components";

let value: CustomFieldJson5 = {
  id: "d23abb80-5918-44ac-bdaf-5e9dbce2cd6e",
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

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                     | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The unique ID representing this custom field.                                                            |                                                                                                          |
| `name`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | The actual text of the custom field.                                                                     | What is your favorite color?                                                                             |
| `value`                                                                                                  | *string*[]                                                                                               | :heavy_check_mark:                                                                                       | The set of answers or possible answers to a question.                                                    | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                                   |
| `order`                                                                                                  | *number*                                                                                                 | :heavy_minus_sign:                                                                                       | The order of this question in the bigger list of questions.                                              | 1                                                                                                        |
| `type`                                                                                                   | [components.CustomFieldJson5CustomFieldType](../../models/components/customfieldjson5customfieldtype.md) | :heavy_minus_sign:                                                                                       | The type of data collected by a custom field.                                                            | MultiSelect                                                                                              |
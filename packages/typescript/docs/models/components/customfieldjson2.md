# CustomFieldJson2

A Custom Field

## Example Usage

```typescript
import { CustomFieldJson2 } from "@cvent/sdk/models/components";

let value: CustomFieldJson2 = {
  id: "aafda261-f00a-4f9b-8520-7aa20daa5fc2",
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
| `type`                                                                                                   | [components.CustomFieldJson2CustomFieldType](../../models/components/customfieldjson2customfieldtype.md) | :heavy_minus_sign:                                                                                       | The type of data collected by a custom field.                                                            | MultiSelect                                                                                              |
# CustomFieldJson1

A Custom Field

## Example Usage

```typescript
import { CustomFieldJson1 } from "@cvent/sdk/models/components";

let value: CustomFieldJson1 = {
  id: "affe3a06-1368-4744-8d32-a9f3a059bfa9",
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

| Field                                                                                                    | Type                                                                                                     | Required                                                                                                 | Description                                                                                              | Example                                                                                                  |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                     | *string*                                                                                                 | :heavy_check_mark:                                                                                       | The unique ID representing this custom field.                                                            |                                                                                                          |
| `name`                                                                                                   | *string*                                                                                                 | :heavy_minus_sign:                                                                                       | The actual text of the custom field.                                                                     | What is a your favorite color?                                                                           |
| `type`                                                                                                   | [components.CustomFieldJson1CustomFieldType](../../models/components/customfieldjson1customfieldtype.md) | :heavy_minus_sign:                                                                                       | The type of data collected by a custom field.                                                            | MultiSelect                                                                                              |
| `value`                                                                                                  | *string*[]                                                                                               | :heavy_check_mark:                                                                                       | The set of answers or possible answers to a question.                                                    | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                                   |
| `order`                                                                                                  | *number*                                                                                                 | :heavy_minus_sign:                                                                                       | The order of this question in the bigger list of questions.                                              | 1                                                                                                        |
# CustomFieldSchema1

A Custom Field

## Example Usage

```typescript
import { CustomFieldSchema1 } from "@cvent/sdk/models/components";

let value: CustomFieldSchema1 = {
  id: "5fa68fb7-2fb7-4c1b-bdf9-cfd270206165",
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

| Field                                                                                                      | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                       | *string*                                                                                                   | :heavy_check_mark:                                                                                         | The unique ID representing this custom field.                                                              |                                                                                                            |
| `name`                                                                                                     | *string*                                                                                                   | :heavy_minus_sign:                                                                                         | The actual text of the custom field.                                                                       | What is your favorite color?                                                                               |
| `value`                                                                                                    | *string*[]                                                                                                 | :heavy_check_mark:                                                                                         | The set of answers or possible answers to a question.                                                      | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                                     |
| `order`                                                                                                    | *number*                                                                                                   | :heavy_minus_sign:                                                                                         | The order of this question in the bigger list of questions.                                                | 1                                                                                                          |
| `type`                                                                                                     | [components.CustomFieldSchemaCustomFieldType](../../models/components/customfieldschemacustomfieldtype.md) | :heavy_minus_sign:                                                                                         | The type of data collected by a custom field.                                                              | MultiSelect                                                                                                |
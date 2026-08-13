# BudgetItemCustomField

A Budget Item Custom Field

## Example Usage

```typescript
import { BudgetItemCustomField } from "@cvent/sdk/models/components";

let value: BudgetItemCustomField = {
  id: "b71227f7-dcb6-4c7c-b255-e417a656c25f",
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

| Field                                                                                                              | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                               | *string*                                                                                                           | :heavy_check_mark:                                                                                                 | The unique ID representing this budget item custom field.                                                          |                                                                                                                    |
| `name`                                                                                                             | *string*                                                                                                           | :heavy_minus_sign:                                                                                                 | The actual text of the custom field.                                                                               | What is a your favorite color?                                                                                     |
| `type`                                                                                                             | [components.BudgetItemCustomFieldCustomFieldType](../../models/components/budgetitemcustomfieldcustomfieldtype.md) | :heavy_minus_sign:                                                                                                 | The type of data collected by a custom field.                                                                      | MultiSelect                                                                                                        |
| `value`                                                                                                            | *string*[]                                                                                                         | :heavy_check_mark:                                                                                                 | The set of answers or possible answers to a question.                                                              | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                                             |
| `order`                                                                                                            | *number*                                                                                                           | :heavy_minus_sign:                                                                                                 | The order of this question in the bigger list of questions.                                                        | 1                                                                                                                  |
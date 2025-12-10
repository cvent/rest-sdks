# BudgetItemCustomFieldJson

A Budget Item Custom Field

## Example Usage

```typescript
import { BudgetItemCustomFieldJson } from "@cvent/sdk/models/components";

let value: BudgetItemCustomFieldJson = {
  id: "41405814-e7e1-4c66-be68-f979cc148e59",
  name: "What is a your favorite color?",
  type: "General",
  value: [
    "Choice C",
    "Choice A",
  ],
  order: 1,
};
```

## Fields

| Field                                                                                                                      | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                | Example                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                       | *string*                                                                                                                   | :heavy_check_mark:                                                                                                         | The unique ID representing this budget item custom field.                                                                  |                                                                                                                            |
| `name`                                                                                                                     | *string*                                                                                                                   | :heavy_minus_sign:                                                                                                         | The actual text of the custom field.                                                                                       | What is a your favorite color?                                                                                             |
| `type`                                                                                                                     | [components.BudgetItemCustomFieldJsonCustomFieldType](../../models/components/budgetitemcustomfieldjsoncustomfieldtype.md) | :heavy_minus_sign:                                                                                                         | The type of data collected by a custom field.                                                                              | General                                                                                                                    |
| `value`                                                                                                                    | *string*[]                                                                                                                 | :heavy_check_mark:                                                                                                         | The set of answers or possible answers to a question.                                                                      | [<br/>"Choice C",<br/>"Choice A"<br/>]                                                                                     |
| `order`                                                                                                                    | *number*                                                                                                                   | :heavy_minus_sign:                                                                                                         | The order of this question in the bigger list of questions.                                                                | 1                                                                                                                          |
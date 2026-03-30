# AnswerBudgetCustomFieldRequest

## Example Usage

```typescript
import { AnswerBudgetCustomFieldRequest } from "@cvent/sdk/models/operations";

let value: AnswerBudgetCustomFieldRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  budgetItemId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  customFieldId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  customField2: {
    id: "585e5c41-ee97-4ef4-9915-aa47a6ca9361",
    type: "MultiSelect",
    value: [
      "Choice C",
      "Choice A",
    ],
  },
};
```

## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `id`                                                                         | *string*                                                                     | :heavy_check_mark:                                                           | Unique ID of an event.                                                       | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `budgetItemId`                                                               | *string*                                                                     | :heavy_check_mark:                                                           | Unique ID of a budget item.                                                  | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `customFieldId`                                                              | *string*                                                                     | :heavy_check_mark:                                                           | Unique ID of the custom field.                                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                         |
| `customField2`                                                               | [components.CustomField2Input](../../models/components/customfield2input.md) | :heavy_check_mark:                                                           | Custom field answer to be updated.                                           |                                                                              |
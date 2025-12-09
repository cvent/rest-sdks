# BudgetCategoryJson

Denotes the category assigned to the budget item.

## Example Usage

```typescript
import { BudgetCategoryJson } from "@cvent/sdk/models/components";

let value: BudgetCategoryJson = {
  id: 3,
  name: "Travel",
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *number*                                                 | :heavy_check_mark:                                       | Unique identifier of the budget category.                | 3                                                        |
| `name`                                                   | *string*                                                 | :heavy_minus_sign:                                       | Name of the budget category assigned to the budget item. | Travel                                                   |
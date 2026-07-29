# BudgetCategory

Denotes the category assigned to the budget item.

## Example Usage

```typescript
import { BudgetCategory } from "@cvent/sdk/models/components";

let value: BudgetCategory = {
  id: 3,
  name: "Travel",
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *number*                                                 | :heavy_check_mark:                                       | Unique identifier of the budget category.                | 3                                                        |
| `name`                                                   | *string*                                                 | :heavy_minus_sign:                                       | Name of the budget category assigned to the budget item. | Travel                                                   |
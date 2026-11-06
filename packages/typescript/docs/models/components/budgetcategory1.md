# BudgetCategory1

Denotes the category assigned to the budget item.

## Example Usage

```typescript
import { BudgetCategory1 } from "@cvent/sdk/models/components";

let value: BudgetCategory1 = {
  id: 3,
  name: "Travel",
};
```

## Fields

| Field                                                    | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `id`                                                     | *number*                                                 | :heavy_check_mark:                                       | Budget category ID.                                      | 3                                                        |
| `name`                                                   | *string*                                                 | :heavy_minus_sign:                                       | Name of the budget category assigned to the budget item. | Travel                                                   |
# CategoryJson1

A category of items.

## Example Usage

```typescript
import { CategoryJson1 } from "@cvent/sdk/models/components";

let value: CategoryJson1 = {
  type: "AVProduction",
  name: "Audio Video Production",
  totalCost: 10000.99,
  items: [
    {
      itemId: "AC-127-3B",
      name: "Earphones",
      quantity: 20,
      totalCost: 10000.99,
      notes: "This item is very popular.",
    },
  ],
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `type`                                                       | *string*                                                     | :heavy_minus_sign:                                           | The category type.                                           | AVProduction                                                 |
| `name`                                                       | *string*                                                     | :heavy_minus_sign:                                           | The name of the category.                                    | Audio Video Production                                       |
| `totalCost`                                                  | *number*                                                     | :heavy_minus_sign:                                           | Total cost for all items within this category.               | 10000.99                                                     |
| `items`                                                      | [components.ItemJson](../../models/components/itemjson.md)[] | :heavy_minus_sign:                                           | List of items in this category.                              |                                                              |
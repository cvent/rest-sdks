# ItemJson

An item that has cost information.

## Example Usage

```typescript
import { ItemJson } from "@cvent/sdk/models/components";

let value: ItemJson = {
  itemId: "AC-127-3B",
  name: "Earphones",
  quantity: 20,
  totalCost: 10000.99,
  notes: "This item is very popular.",
};
```

## Fields

| Field                           | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `itemId`                        | *string*                        | :heavy_minus_sign:              | Unique ID for the item.         | AC-127-3B                       |
| `name`                          | *string*                        | :heavy_minus_sign:              | The name of the item.           | Earphones                       |
| `quantity`                      | *number*                        | :heavy_minus_sign:              | The number of items.            | 20                              |
| `totalCost`                     | *number*                        | :heavy_minus_sign:              | Total cost of the item(s).      | 10000.99                        |
| `notes`                         | *string*                        | :heavy_minus_sign:              | Notes associated with the item. | This item is very popular.      |
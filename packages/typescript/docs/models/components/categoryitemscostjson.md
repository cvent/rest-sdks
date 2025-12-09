# ~~CategoryItemsCostJson~~

Category items cost. DEPRECATED - This field is deprecated. Only applied to proposals made by vendors, and the vendor marketplace is sunset.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.

## Example Usage

```typescript
import { CategoryItemsCostJson } from "@cvent/sdk/models/components";

let value: CategoryItemsCostJson = {
  notes: "We are offering a discount on projectors.",
  totalCost: 10000.99,
  categories: [
    {
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
    },
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `notes`                                                                | *string*                                                               | :heavy_minus_sign:                                                     | Notes on category items cost from the venue.                           | We are offering a discount on projectors.                              |
| `totalCost`                                                            | *number*                                                               | :heavy_minus_sign:                                                     | Total cost across all categories.                                      | 10000.99                                                               |
| `categories`                                                           | [components.CategoryJson1](../../models/components/categoryjson1.md)[] | :heavy_minus_sign:                                                     | List of categories.                                                    |                                                                        |
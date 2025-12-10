# CategoryJson1

A category of items.


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `Type`                                                | *string*                                              | :heavy_minus_sign:                                    | The category type.                                    | AVProduction                                          |
| `Name`                                                | *string*                                              | :heavy_minus_sign:                                    | The name of the category.                             | Audio Video Production                                |
| `TotalCost`                                           | *double*                                              | :heavy_minus_sign:                                    | Total cost for all items within this category.        | 10000.99                                              |
| `Items`                                               | List<[ItemJson](../../Models/Components/ItemJson.md)> | :heavy_minus_sign:                                    | List of items in this category.                       |                                                       |
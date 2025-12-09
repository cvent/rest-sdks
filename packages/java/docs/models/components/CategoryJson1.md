# CategoryJson1

A category of items.


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `type`                                                 | *Optional\<String>*                                    | :heavy_minus_sign:                                     | The category type.                                     | AVProduction                                           |
| `name`                                                 | *Optional\<String>*                                    | :heavy_minus_sign:                                     | The name of the category.                              | Audio Video Production                                 |
| `totalCost`                                            | *Optional\<Double>*                                    | :heavy_minus_sign:                                     | Total cost for all items within this category.         | 10000.99                                               |
| `items`                                                | List\<[ItemJson](../../models/components/ItemJson.md)> | :heavy_minus_sign:                                     | List of items in this category.                        |                                                        |
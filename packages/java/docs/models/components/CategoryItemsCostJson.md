# ~~CategoryItemsCostJson~~

Category items cost. DEPRECATED - This field is deprecated. Only applied to proposals made by vendors, and the vendor marketplace is sunset.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `notes`                                                          | *Optional\<String>*                                              | :heavy_minus_sign:                                               | Notes on category items cost from the venue.                     | We are offering a discount on projectors.                        |
| `totalCost`                                                      | *Optional\<Double>*                                              | :heavy_minus_sign:                                               | Total cost across all categories.                                | 10000.99                                                         |
| `categories`                                                     | List\<[CategoryJson1](../../models/components/CategoryJson1.md)> | :heavy_minus_sign:                                               | List of categories.                                              |                                                                  |
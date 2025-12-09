# ~~CategoryItemsCostJson~~

Category items cost. DEPRECATED - This field is deprecated. Only applied to proposals made by vendors, and the vendor marketplace is sunset.

> :warning: **DEPRECATED**: This will be removed in a future release, please migrate away from it as soon as possible.


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `Notes`                                                         | *string*                                                        | :heavy_minus_sign:                                              | Notes on category items cost from the venue.                    | We are offering a discount on projectors.                       |
| `TotalCost`                                                     | *double*                                                        | :heavy_minus_sign:                                              | Total cost across all categories.                               | 10000.99                                                        |
| `Categories`                                                    | List<[CategoryJson1](../../Models/Components/CategoryJson1.md)> | :heavy_minus_sign:                                              | List of categories.                                             |                                                                 |
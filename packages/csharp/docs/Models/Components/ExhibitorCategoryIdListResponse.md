# ExhibitorCategoryIdListResponse

A paginated response containing a list of exhibitor category Ids.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_minus_sign:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[ExhibitorCategoryIdJson](../../Models/Components/ExhibitorCategoryIdJson.md)> | :heavy_minus_sign:                                                                  | Paginated list of exhibitor category Ids for an exhibitor.                          |
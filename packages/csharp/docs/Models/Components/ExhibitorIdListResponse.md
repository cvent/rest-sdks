# ExhibitorIdListResponse

Exhibitor Id Paginated Response schema


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_minus_sign:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[ExhibitorIdJson](../../Models/Components/ExhibitorIdJson.md)> | :heavy_minus_sign:                                                  | Paginated list of exhibitor Ids for an exhibitor category.          |
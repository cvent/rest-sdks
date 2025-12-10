# ExhibitorIdListResponse

Exhibitor Id Paginated Response schema


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [Optional\<PagingJson>](../../models/components/PagingJson.md)       | :heavy_minus_sign:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[ExhibitorIdJson](../../models/components/ExhibitorIdJson.md)> | :heavy_minus_sign:                                                   | Paginated list of exhibitor Ids for an exhibitor category.           |
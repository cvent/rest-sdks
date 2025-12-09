# ExhibitorCategoryIdListResponse

A paginated response containing a list of exhibitor category Ids.


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `paging`                                                                             | [Optional\<PagingJson>](../../models/components/PagingJson.md)                       | :heavy_minus_sign:                                                                   | Represents pagination information for a collection of resources.                     |
| `data`                                                                               | List\<[ExhibitorCategoryIdJson](../../models/components/ExhibitorCategoryIdJson.md)> | :heavy_minus_sign:                                                                   | Paginated list of exhibitor category Ids for an exhibitor.                           |
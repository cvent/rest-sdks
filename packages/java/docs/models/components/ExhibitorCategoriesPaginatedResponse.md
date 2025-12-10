# ExhibitorCategoriesPaginatedResponse

The response object containing the paginated list of exhibitor categories.


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `paging`                                                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)                                   | :heavy_minus_sign:                                                                               | Represents pagination information for a collection of resources.                                 |
| `data`                                                                                           | List\<[ExistingExhibitorCategoryJson](../../models/components/ExistingExhibitorCategoryJson.md)> | :heavy_minus_sign:                                                                               | Paginated list of all exhibitor categories for an event.                                         |
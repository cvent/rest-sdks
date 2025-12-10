# ExhibitorCategoriesPaginatedResponse

The response object containing the paginated list of exhibitor categories.


## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `Paging`                                                                                        | [PagingJson](../../Models/Components/PagingJson.md)                                             | :heavy_minus_sign:                                                                              | Represents pagination information for a collection of resources.                                |
| `Data`                                                                                          | List<[ExistingExhibitorCategoryJson](../../Models/Components/ExistingExhibitorCategoryJson.md)> | :heavy_minus_sign:                                                                              | Paginated list of all exhibitor categories for an event.                                        |
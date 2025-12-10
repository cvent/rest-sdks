# SessionCategoryPaginatedResponse

The response from a request to get the list of session categories.  This includes the paging object as well as the collection of session categories.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [PagingJson](../../Models/Components/PagingJson.md)                 | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[SessionCategory](../../Models/Components/SessionCategory.md)> | :heavy_check_mark:                                                  | Collection of session categories.                                   |
# SessionCategoryPaginatedResponse

The response from a request to get the list of session categories.  This includes the paging object as well as the collection of session categories.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[SessionCategory](../../models/components/SessionCategory.md)> | :heavy_check_mark:                                                   | Collection of session categories.                                    |
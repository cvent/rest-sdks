# WebcastPaginatedResponse

The response from a request to get the list of webcasts.  This includes the paging object as well as the collection of webcasts.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [PagingJson](../../models/components/PagingJson.md)                  | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[ExistingWebcast](../../models/components/ExistingWebcast.md)> | :heavy_check_mark:                                                   | Collection of webcasts.                                              |
# BulkResultsPaginatedResponse

The response from a request to get the list of results from a Bulk Job run.  This includes the paging object as well
as the collection of bulk results.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Paging`                                                          | [PagingJson](../../Models/Components/PagingJson.md)               | :heavy_minus_sign:                                                | Represents pagination information for a collection of resources.  |
| `Data`                                                            | List<[BulkResultJson](../../Models/Components/BulkResultJson.md)> | :heavy_check_mark:                                                | Collection of bulk result objects.                                |
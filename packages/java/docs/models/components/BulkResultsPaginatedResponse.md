# BulkResultsPaginatedResponse

The response from a request to get the list of results from a Bulk Job run.  This includes the paging object as well
as the collection of bulk results.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `paging`                                                           | [Optional\<PagingJson>](../../models/components/PagingJson.md)     | :heavy_minus_sign:                                                 | Represents pagination information for a collection of resources.   |
| `data`                                                             | List\<[BulkResultJson](../../models/components/BulkResultJson.md)> | :heavy_check_mark:                                                 | Collection of bulk result objects.                                 |
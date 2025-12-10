# TableAssignmentPaginatedResponse

The response from a request to get the table assignment.


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `paging`                                                                     | [Optional\<PagingJson>](../../models/components/PagingJson.md)               | :heavy_minus_sign:                                                           | Represents pagination information for a collection of resources.             |
| `data`                                                                       | List\<[TableAssignmentJson](../../models/components/TableAssignmentJson.md)> | :heavy_check_mark:                                                           | A list of table assignments                                                  |
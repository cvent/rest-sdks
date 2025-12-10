# TableAssignmentPaginatedResponse

The response from a request to get the table assignment.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Paging`                                                                    | [PagingJson](../../Models/Components/PagingJson.md)                         | :heavy_minus_sign:                                                          | Represents pagination information for a collection of resources.            |
| `Data`                                                                      | List<[TableAssignmentJson](../../Models/Components/TableAssignmentJson.md)> | :heavy_check_mark:                                                          | A list of table assignments                                                 |
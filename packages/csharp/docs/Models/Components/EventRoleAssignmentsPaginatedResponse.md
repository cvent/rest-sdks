# EventRoleAssignmentsPaginatedResponse

The response to a request to get a paginated list of event role assignments. This includes the paging object and the collection of event role assignments.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[EventRoleAssignmentJson](../../Models/Components/EventRoleAssignmentJson.md)> | :heavy_check_mark:                                                                  | A collection of event role assignments.                                             |
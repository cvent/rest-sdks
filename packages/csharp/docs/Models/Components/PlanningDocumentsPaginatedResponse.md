# PlanningDocumentsPaginatedResponse

Represents a paginated collection of event planning documents.


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Paging`                                                                      | [PagingJson](../../Models/Components/PagingJson.md)                           | :heavy_check_mark:                                                            | Represents pagination information for a collection of resources.              |
| `Data`                                                                        | List<[PlanningDocumentJson](../../Models/Components/PlanningDocumentJson.md)> | :heavy_check_mark:                                                            | Collection of event planning documents.                                       |
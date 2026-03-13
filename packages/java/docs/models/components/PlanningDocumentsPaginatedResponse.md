# PlanningDocumentsPaginatedResponse

Represents a paginated collection of event planning documents.


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `paging`                                                                       | [PagingJson](../../models/components/PagingJson.md)                            | :heavy_check_mark:                                                             | Represents pagination information for a collection of resources.               |
| `data`                                                                         | List\<[PlanningDocumentJson](../../models/components/PlanningDocumentJson.md)> | :heavy_check_mark:                                                             | Collection of event planning documents.                                        |
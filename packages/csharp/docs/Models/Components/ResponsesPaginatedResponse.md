# ResponsesPaginatedResponse

Response include paging and responses for surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[ResponseJson](../../Models/Components/ResponseJson.md)>    | :heavy_check_mark:                                               | Responses for a survey.                                          |
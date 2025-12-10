# ResponsesPaginatedResponse

Response include paging and responses for surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[ResponseJson](../../models/components/ResponseJson.md)>   | :heavy_check_mark:                                               | Responses for a survey.                                          |
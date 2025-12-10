# QuestionsPaginatedResponse

Response include paging and collection of questions of surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [PagingJson](../../models/components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[QuestionJson2](../../models/components/QuestionJson2.md)> | :heavy_check_mark:                                               | Collection of questions for surveys.                             |
# QuestionsPaginatedResponse

Response include paging and collection of questions of surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[QuestionJson2](../../Models/Components/QuestionJson2.md)>  | :heavy_check_mark:                                               | Collection of questions for surveys.                             |
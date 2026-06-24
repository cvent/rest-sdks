# QuestionsPaginatedResponse

Response include paging and collection of questions of surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [PagingJson](../../Models/Components/PagingJson.md)              | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[QuestionJson1](../../Models/Components/QuestionJson1.md)>  | :heavy_check_mark:                                               | Collection of questions for surveys.                             |
# QuestionsPaginatedResponse

Response include paging and collection of questions of surveys


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[Question2](../../Models/Components/Question2.md)>          | :heavy_check_mark:                                               | Collection of questions for surveys.                             |
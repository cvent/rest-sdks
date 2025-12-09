# QuestionPaginatedResponse

A paginated list of Questions.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)   | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Question](../../models/components/Question.md)>           | :heavy_minus_sign:                                               | Collection of Questions.                                         |
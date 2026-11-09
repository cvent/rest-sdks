# StandardSurveyQuestionsPaginatedResponse

Response include paging and collection of questions of a particular standard survey


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [Paging](../../models/components/Paging.md)                                        | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[StandardSurveyQuestion](../../models/components/StandardSurveyQuestion.md)> | :heavy_check_mark:                                                                 | Collection of standard survey questions                                            |
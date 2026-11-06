# StandardSurveyQuestionsPaginatedResponse

Response include paging and collection of questions of a particular standard survey


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `Paging`                                                                          | [Paging](../../Models/Components/Paging.md)                                       | :heavy_check_mark:                                                                | Represents pagination information for a collection of resources.                  |
| `Data`                                                                            | List<[StandardSurveyQuestion](../../Models/Components/StandardSurveyQuestion.md)> | :heavy_check_mark:                                                                | Collection of standard survey questions                                           |
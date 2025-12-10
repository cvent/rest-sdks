# StandardSurveyQuestionsPaginatedResponse

Response include paging and collection of questions of a particular standard survey


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `Paging`                                                                                  | [PagingJson](../../Models/Components/PagingJson.md)                                       | :heavy_check_mark:                                                                        | Represents pagination information for a collection of resources.                          |
| `Data`                                                                                    | List<[StandardSurveyQuestionJson](../../Models/Components/StandardSurveyQuestionJson.md)> | :heavy_check_mark:                                                                        | Collection of standard survey questions                                                   |
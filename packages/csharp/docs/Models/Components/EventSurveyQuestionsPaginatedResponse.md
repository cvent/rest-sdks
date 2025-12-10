# EventSurveyQuestionsPaginatedResponse

Response include Paging and collection os questions


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_check_mark:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[EventSurveyQuestionJson](../../Models/Components/EventSurveyQuestionJson.md)> | :heavy_check_mark:                                                                  | Collection of Questions                                                             |
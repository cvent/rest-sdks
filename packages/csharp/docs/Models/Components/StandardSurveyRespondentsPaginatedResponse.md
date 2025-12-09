# StandardSurveyRespondentsPaginatedResponse

Response include paging and respondents for a survey


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Paging`                                                                              | [PagingJson](../../Models/Components/PagingJson.md)                                   | :heavy_check_mark:                                                                    | Represents pagination information for a collection of resources.                      |
| `Data`                                                                                | List<[StandardSurveyRespondent](../../Models/Components/StandardSurveyRespondent.md)> | :heavy_check_mark:                                                                    | Respondent for a survey                                                               |
# StandardSurveyRespondentsPaginatedResponse

Response include paging and respondents for a survey


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `paging`                                                                               | [PagingJson](../../models/components/PagingJson.md)                                    | :heavy_check_mark:                                                                     | Represents pagination information for a collection of resources.                       |
| `data`                                                                                 | List\<[StandardSurveyRespondent](../../models/components/StandardSurveyRespondent.md)> | :heavy_check_mark:                                                                     | Respondent for a survey                                                                |
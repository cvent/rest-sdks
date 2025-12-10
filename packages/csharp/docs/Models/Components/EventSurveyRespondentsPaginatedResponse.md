# EventSurveyRespondentsPaginatedResponse

Response includes paging and respondents data for a event survey


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `Paging`                                                                        | [PagingJson](../../Models/Components/PagingJson.md)                             | :heavy_check_mark:                                                              | Represents pagination information for a collection of resources.                |
| `Data`                                                                          | List<[EventSurveyRespondent](../../Models/Components/EventSurveyRespondent.md)> | :heavy_check_mark:                                                              | Respondent information for an event survey                                      |
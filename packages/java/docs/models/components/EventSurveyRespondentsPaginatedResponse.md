# EventSurveyRespondentsPaginatedResponse

Response includes paging and respondents data for a event survey


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `paging`                                                                         | [Paging](../../models/components/Paging.md)                                      | :heavy_check_mark:                                                               | Represents pagination information for a collection of resources.                 |
| `data`                                                                           | List\<[EventSurveyRespondent](../../models/components/EventSurveyRespondent.md)> | :heavy_check_mark:                                                               | Respondent information for an event survey                                       |
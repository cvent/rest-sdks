# EventSurveyResponsesPaginatedResponse

Response include paging and responses for a survey


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `Paging`                                                                    | [PagingJson](../../Models/Components/PagingJson.md)                         | :heavy_check_mark:                                                          | Represents pagination information for a collection of resources.            |
| `Data`                                                                      | List<[EventSurveyResponse](../../Models/Components/EventSurveyResponse.md)> | :heavy_check_mark:                                                          | Response for a survey                                                       |
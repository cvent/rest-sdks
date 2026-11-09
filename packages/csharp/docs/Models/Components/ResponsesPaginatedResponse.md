# ResponsesPaginatedResponse

Response include paging and responses for surveys


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Paging`                                                            | [Paging](../../Models/Components/Paging.md)                         | :heavy_check_mark:                                                  | Represents pagination information for a collection of resources.    |
| `Data`                                                              | List<[SurveyResponses](../../Models/Components/SurveyResponses.md)> | :heavy_check_mark:                                                  | Responses for a survey.                                             |
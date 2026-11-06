# ResponsesPaginatedResponse

Response include paging and responses for surveys


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `paging`                                                             | [Paging](../../models/components/Paging.md)                          | :heavy_check_mark:                                                   | Represents pagination information for a collection of resources.     |
| `data`                                                               | List\<[SurveyResponses](../../models/components/SurveyResponses.md)> | :heavy_check_mark:                                                   | Responses for a survey.                                              |
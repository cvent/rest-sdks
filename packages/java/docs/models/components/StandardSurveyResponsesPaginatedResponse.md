# StandardSurveyResponsesPaginatedResponse

Response include paging and responses for a survey


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `paging`                                                                           | [PagingJson](../../models/components/PagingJson.md)                                | :heavy_check_mark:                                                                 | Represents pagination information for a collection of resources.                   |
| `data`                                                                             | List\<[StandardSurveyResponse](../../models/components/StandardSurveyResponse.md)> | :heavy_check_mark:                                                                 | Response for a survey                                                              |
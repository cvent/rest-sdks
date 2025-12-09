# EventSurveyQuestionsPaginatedResponse

Response include Paging and collection os questions


## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `paging`                                                                             | [PagingJson](../../models/components/PagingJson.md)                                  | :heavy_check_mark:                                                                   | Represents pagination information for a collection of resources.                     |
| `data`                                                                               | List\<[EventSurveyQuestionJson](../../models/components/EventSurveyQuestionJson.md)> | :heavy_check_mark:                                                                   | Collection of Questions                                                              |
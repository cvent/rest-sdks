# EventQuestionsPaginatedResponse

Represents the response from a request to get the list of event questions. This includes the paging object as well as the collection of event questions.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Paging](../../models/components/Paging.md)                      | :heavy_check_mark:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[EventQuestion](../../models/components/EventQuestion.md)> | :heavy_check_mark:                                               | Collection of event questions.                                   |
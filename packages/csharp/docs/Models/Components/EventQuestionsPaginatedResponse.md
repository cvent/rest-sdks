# EventQuestionsPaginatedResponse

Represents the response from a request to get the list of event questions. This includes the paging object as well as the collection of event questions.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `Paging`                                                                | [PagingJson](../../Models/Components/PagingJson.md)                     | :heavy_check_mark:                                                      | Represents pagination information for a collection of resources.        |
| `Data`                                                                  | List<[EventQuestionJson](../../Models/Components/EventQuestionJson.md)> | :heavy_check_mark:                                                      | Collection of event questions.                                          |
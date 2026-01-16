# EventQuestionChoicesResponse

Response to the request to get a list of event question choices.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Paging`                                                                            | [PagingJson](../../Models/Components/PagingJson.md)                                 | :heavy_minus_sign:                                                                  | Represents pagination information for a collection of resources.                    |
| `Data`                                                                              | List<[EventQuestionChoiceJson](../../Models/Components/EventQuestionChoiceJson.md)> | :heavy_check_mark:                                                                  | Collection of choices for a choice question.                                        |
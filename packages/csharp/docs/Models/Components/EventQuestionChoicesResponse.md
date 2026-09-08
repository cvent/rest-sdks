# EventQuestionChoicesResponse

Response to the request to get a list of event question choices.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `Paging`                                                         | [Paging](../../Models/Components/Paging.md)                      | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `Data`                                                           | List<[Choice2](../../Models/Components/Choice2.md)>              | :heavy_check_mark:                                               | Collection of choices for a choice question.                     |
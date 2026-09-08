# EventQuestionChoicesResponse

Response to the request to get a list of event question choices.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<Paging>](../../models/components/Paging.md)           | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `data`                                                           | List\<[Choice2](../../models/components/Choice2.md)>             | :heavy_check_mark:                                               | Collection of choices for a choice question.                     |
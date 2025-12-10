# EventQuestionChoicesResponse

Response to the request to get a list of event question choices.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `paging`                                                         | [Optional\<PagingJson>](../../models/components/PagingJson.md)   | :heavy_minus_sign:                                               | Represents pagination information for a collection of resources. |
| `choices`                                                        | List\<[ChoiceJson4](../../models/components/ChoiceJson4.md)>     | :heavy_check_mark:                                               | Collection of choices for a choice question.                     |
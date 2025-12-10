# EventSurveyResponseInput

Response object for event survey respondent.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [UuidJson](../../models/components/UuidJson.md)                                  | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `answers`                                                                        | List\<[AnswerJson1](../../models/components/AnswerJson1.md)>                     | :heavy_check_mark:                                                               | List of responded survey answers.                                                |
| `survey`                                                                         | [Optional\<UuidJson>](../../models/components/UuidJson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `session`                                                                        | [Optional\<UuidJson>](../../models/components/UuidJson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `speaker`                                                                        | [Optional\<UuidJson>](../../models/components/UuidJson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
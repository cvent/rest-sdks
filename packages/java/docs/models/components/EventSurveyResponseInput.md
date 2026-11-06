# EventSurveyResponseInput

Response object for event survey respondent.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `question`                                                                       | [Uuid](../../models/components/Uuid.md)                                          | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `answers`                                                                        | List\<[Answer11](../../models/components/Answer11.md)>                           | :heavy_check_mark:                                                               | List of responded survey answers.                                                |
| `survey`                                                                         | [Optional\<Uuid>](../../models/components/Uuid.md)                               | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `session`                                                                        | [Optional\<Uuid>](../../models/components/Uuid.md)                               | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `speaker`                                                                        | [Optional\<Uuid>](../../models/components/Uuid.md)                               | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
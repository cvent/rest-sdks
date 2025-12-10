# EventSurveyResponseInput

Response object for event survey respondent.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Question`                                                                       | [UuidJson](../../Models/Components/UuidJson.md)                                  | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Answers`                                                                        | List<[AnswerJson1](../../Models/Components/AnswerJson1.md)>                      | :heavy_check_mark:                                                               | List of responded survey answers.                                                |
| `Survey`                                                                         | [UuidJson](../../Models/Components/UuidJson.md)                                  | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Session`                                                                        | [UuidJson](../../Models/Components/UuidJson.md)                                  | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Speaker`                                                                        | [UuidJson](../../Models/Components/UuidJson.md)                                  | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
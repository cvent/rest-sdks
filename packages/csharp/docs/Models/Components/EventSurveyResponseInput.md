# EventSurveyResponseInput

Response object for event survey respondent.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Question`                                                                       | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_check_mark:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Answers`                                                                        | List<[Answer11](../../Models/Components/Answer11.md)>                            | :heavy_check_mark:                                                               | List of responded survey answers.                                                |
| `Survey`                                                                         | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Session`                                                                        | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
| `Speaker`                                                                        | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |
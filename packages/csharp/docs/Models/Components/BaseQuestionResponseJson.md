# BaseQuestionResponseJson

Base entity for a question response.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `Question`                                                        | [ZeroAllOf4](../../Models/Components/ZeroAllOf4.md)               | :heavy_minus_sign:                                                | The question that was answered.                                   |
| `Answers`                                                         | List<[BaseAnswerJson](../../Models/Components/BaseAnswerJson.md)> | :heavy_minus_sign:                                                | List of answers.                                                  |
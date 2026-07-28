# BaseQuestionResponse

Base entity for a question response.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Question`                                                | [BaseQuestion](../../Models/Components/BaseQuestion.md)   | :heavy_minus_sign:                                        | The question that was answered.                           |
| `Answers`                                                 | List<[BaseAnswer](../../Models/Components/BaseAnswer.md)> | :heavy_minus_sign:                                        | List of answers.                                          |
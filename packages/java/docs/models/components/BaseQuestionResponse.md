# BaseQuestionResponse

Base entity for a question response.


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `question`                                                         | [Optional\<BaseQuestion>](../../models/components/BaseQuestion.md) | :heavy_minus_sign:                                                 | The question that was answered.                                    |
| `answers`                                                          | List\<[BaseAnswer](../../models/components/BaseAnswer.md)>         | :heavy_minus_sign:                                                 | List of answers.                                                   |
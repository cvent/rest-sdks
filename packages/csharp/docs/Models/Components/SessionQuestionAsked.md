# SessionQuestionAsked

The question asked activity details for the session.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `Session`                                                           | [SessionActivity7](../../Models/Components/SessionActivity7.md)     | :heavy_minus_sign:                                                  | The activity session.                                               |                                                                     |
| `Question`                                                          | [QuestionDetailJson](../../Models/Components/QuestionDetailJson.md) | :heavy_minus_sign:                                                  | The question asked in a session.                                    |                                                                     |
| `Platform`                                                          | *string*                                                            | :heavy_minus_sign:                                                  | The platform used by the user.                                      | Attendee Hub                                                        |
| `Votes`                                                             | *long*                                                              | :heavy_minus_sign:                                                  | The number of votes for a question.                                 | 0                                                                   |
| `Anonymous`                                                         | *bool*                                                              | :heavy_minus_sign:                                                  | True indicates the question was posted anonymously.                 | false                                                               |
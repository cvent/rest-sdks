# SessionQuestionUpvoted

This denotes the question asked in the session.


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `Session`                                                       | [SessionActivity5](../../Models/Components/SessionActivity5.md) | :heavy_minus_sign:                                              | The activity session.                                           |                                                                 |
| `Question`                                                      | [QuestionDetail](../../Models/Components/QuestionDetail.md)     | :heavy_minus_sign:                                              | The question asked in a session.                                |                                                                 |
| `Platform`                                                      | *string*                                                        | :heavy_minus_sign:                                              | The platform used by the user.                                  | Attendee Hub                                                    |
| `Votes`                                                         | *long*                                                          | :heavy_minus_sign:                                              | The number of votes for a question.                             | 0                                                               |
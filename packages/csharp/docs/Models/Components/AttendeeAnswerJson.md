# AttendeeAnswerJson

An attendee's answer to registration questions.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `Question`                                                                          | [AttendeeAnswerJsonQuestion](../../Models/Components/AttendeeAnswerJsonQuestion.md) | :heavy_check_mark:                                                                  | The registration question.                                                          |
| `Value`                                                                             | List<*string*>                                                                      | :heavy_check_mark:                                                                  | The set of answers to the given question.                                           |
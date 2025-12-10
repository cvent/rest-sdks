# AttendeeAnswerJson

An attendee's answer to registration questions.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `question`                                                                          | [AttendeeAnswerJsonQuestion](../../models/components/AttendeeAnswerJsonQuestion.md) | :heavy_check_mark:                                                                  | The registration question.                                                          |
| `value`                                                                             | List\<*String*>                                                                     | :heavy_check_mark:                                                                  | The set of answers to the given question.                                           |
# AttendeeAnswer

An attendee's answer to registration questions.


## Fields

| Field                                                                       | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `question`                                                                  | [AttendeeAnswerQuestion](../../models/components/AttendeeAnswerQuestion.md) | :heavy_check_mark:                                                          | The registration question.                                                  |
| `value`                                                                     | List\<*String*>                                                             | :heavy_check_mark:                                                          | The set of answers to the given question.                                   |
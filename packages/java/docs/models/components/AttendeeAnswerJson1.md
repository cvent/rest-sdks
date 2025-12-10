# AttendeeAnswerJson1

Answer for the question answered by attendee.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `question`                                                                            | [AttendeeAnswerJson1Question](../../models/components/AttendeeAnswerJson1Question.md) | :heavy_check_mark:                                                                    | The reference to the question entity. Contains only the ID of the question entity.    |
| `value`                                                                               | List\<*String*>                                                                       | :heavy_check_mark:                                                                    | The set of answers to a question.                                                     |
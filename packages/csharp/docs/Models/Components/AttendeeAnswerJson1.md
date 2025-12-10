# AttendeeAnswerJson1

Answer for the question answered by attendee.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Question`                                                                            | [AttendeeAnswerJson1Question](../../Models/Components/AttendeeAnswerJson1Question.md) | :heavy_check_mark:                                                                    | The reference to the question entity. Contains only the ID of the question entity.    |
| `Value`                                                                               | List<*string*>                                                                        | :heavy_check_mark:                                                                    | The set of answers to a question.                                                     |
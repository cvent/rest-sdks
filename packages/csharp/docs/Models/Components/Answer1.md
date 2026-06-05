# Answer1

An object representing the possible answers for lead qualification questions.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `Type`                                                                           | [AnswerType](../../Models/Components/AnswerType.md)                              | :heavy_check_mark:                                                               | Type of answer                                                                   | File                                                                             |
| `Value`                                                                          | *string*                                                                         | :heavy_minus_sign:                                                               | Answered value like: Choice text, text answer input etc.                         | Choice A                                                                         |
| `Choice`                                                                         | [Uuid](../../Models/Components/Uuid.md)                                          | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
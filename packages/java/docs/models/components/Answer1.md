# Answer1

An object representing the possible answers for lead qualification questions.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `type`                                                                           | [AnswerType](../../models/components/AnswerType.md)                              | :heavy_check_mark:                                                               | Type of answer                                                                   | File                                                                             |
| `value`                                                                          | *Optional\<String>*                                                              | :heavy_minus_sign:                                                               | Answered value like: Choice text, text answer input etc.                         | Choice A                                                                         |
| `choice`                                                                         | [Optional\<Uuid1>](../../models/components/Uuid1.md)                             | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
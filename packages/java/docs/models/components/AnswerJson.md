# AnswerJson

An object representing the possible answers for lead qualification questions.


## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `type`                                                                           | [AnswerTypeJson](../../models/components/AnswerTypeJson.md)                      | :heavy_check_mark:                                                               | Type of answer                                                                   | File                                                                             |
| `value`                                                                          | *Optional\<String>*                                                              | :heavy_minus_sign:                                                               | Answered value like: Choice text, text answer input etc.                         | Choice A                                                                         |
| `choice`                                                                         | [Optional\<UuidJson>](../../models/components/UuidJson.md)                       | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
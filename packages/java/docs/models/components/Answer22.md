# Answer22

A JSON schema representing an answer object.


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `type`                                                               | [AnswerType11](../../models/components/AnswerType11.md)              | :heavy_check_mark:                                                   | Type of answer                                                       | Choice                                                               |
| `value`                                                              | *Optional\<String>*                                                  | :heavy_minus_sign:                                                   | Answered value like: Choice text, text answer input etc.             | Choice A                                                             |
| `choice`                                                             | [Optional\<Answer2Choice>](../../models/components/Answer2Choice.md) | :heavy_minus_sign:                                                   | The choice that was selected.                                        |                                                                      |
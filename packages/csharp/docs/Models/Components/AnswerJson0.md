# AnswerJson0

A JSON schema representing an answer object.


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `Type`                                                        | [AnswerTypeJson0](../../Models/Components/AnswerTypeJson0.md) | :heavy_check_mark:                                            | Type of answer                                                | Choice                                                        |
| `Value`                                                       | *string*                                                      | :heavy_minus_sign:                                            | Answered value like: Choice text, text answer input etc.      | Choice A                                                      |
| `Choice`                                                      | [Choice](../../Models/Components/Choice.md)                   | :heavy_minus_sign:                                            | The choice that was selected.                                 |                                                               |
# Answer22

A JSON schema representing an answer object.


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `Type`                                                    | [AnswerType11](../../Models/Components/AnswerType11.md)   | :heavy_check_mark:                                        | Type of answer                                            | Choice                                                    |
| `Value`                                                   | *string*                                                  | :heavy_minus_sign:                                        | Answered value like: Choice text, text answer input etc.  | Choice A                                                  |
| `Choice`                                                  | [Answer2Choice](../../Models/Components/Answer2Choice.md) | :heavy_minus_sign:                                        | The choice that was selected.                             |                                                           |
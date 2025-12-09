# PollResponseJson

This is used to denote the poll details.


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `name`                                                                                 | *Optional\<String>*                                                                    | :heavy_minus_sign:                                                                     | The name of the poll.                                                                  | Do you like the session?                                                               |
| `responses`                                                                            | List\<[BaseQuestionResponseJson](../../models/components/BaseQuestionResponseJson.md)> | :heavy_minus_sign:                                                                     | The list of question and answers for a poll.                                           |                                                                                        |
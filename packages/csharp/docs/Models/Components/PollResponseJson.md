# PollResponseJson

This is used to denote the poll details.


## Fields

| Field                                                                                 | Type                                                                                  | Required                                                                              | Description                                                                           | Example                                                                               |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `Name`                                                                                | *string*                                                                              | :heavy_minus_sign:                                                                    | The name of the poll.                                                                 | Do you like the session?                                                              |
| `Responses`                                                                           | List<[BaseQuestionResponseJson](../../Models/Components/BaseQuestionResponseJson.md)> | :heavy_minus_sign:                                                                    | The list of question and answers for a poll.                                          |                                                                                       |
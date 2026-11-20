# UpdateRfpQuestionRequest


## Fields

| Field                                                           | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `RfpId`                                                         | *string*                                                        | :heavy_check_mark:                                              | The unique identifier of the RFP we are requesting              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                            |
| `QuestionId`                                                    | *string*                                                        | :heavy_check_mark:                                              | The unique identifier of the Question.                          | a4ca6ae2-0dc3-487b-953e-86d6abbdf7d3                            |
| `RfpQuestion`                                                   | [RfpQuestionInput](../../Models/Components/RfpQuestionInput.md) | :heavy_check_mark:                                              | Request body for updating an RFP question.                      |                                                                 |
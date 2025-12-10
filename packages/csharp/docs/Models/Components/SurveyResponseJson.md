# SurveyResponseJson

A survey response.


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `Id`                                                                          | *string*                                                                      | :heavy_minus_sign:                                                            | The unique identifier of the survey.                                          |                                                                               |
| `ResponseMethod`                                                              | *string*                                                                      | :heavy_minus_sign:                                                            | The method used to capture the survey response.                               | sample method                                                                 |
| `Responses`                                                                   | List<[QuestionResponseJson](../../Models/Components/QuestionResponseJson.md)> | :heavy_minus_sign:                                                            | The list of question and answers for a survey.                                |                                                                               |
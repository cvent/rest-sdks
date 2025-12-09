# SurveyResponseJson

A survey response.


## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `id`                                                                           | *Optional\<String>*                                                            | :heavy_minus_sign:                                                             | The unique identifier of the survey.                                           |                                                                                |
| `responseMethod`                                                               | *Optional\<String>*                                                            | :heavy_minus_sign:                                                             | The method used to capture the survey response.                                | sample method                                                                  |
| `responses`                                                                    | List\<[QuestionResponseJson](../../models/components/QuestionResponseJson.md)> | :heavy_minus_sign:                                                             | The list of question and answers for a survey.                                 |                                                                                |
# SurveyResponseJson

A survey response.

## Example Usage

```typescript
import { SurveyResponseJson } from "@cvent/sdk/models/components";

let value: SurveyResponseJson = {
  responseMethod: "sample method",
  responses: [
    {
      question: {
        id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
        text: "How would you rate this session?",
        code: "CODE_A",
      },
      answers: [
        {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
        },
      ],
    },
  ],
};
```

## Fields

| Field                                                                                | Type                                                                                 | Required                                                                             | Description                                                                          | Example                                                                              |
| ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------ |
| `id`                                                                                 | *string*                                                                             | :heavy_minus_sign:                                                                   | The unique identifier of the survey.                                                 |                                                                                      |
| `responseMethod`                                                                     | *string*                                                                             | :heavy_minus_sign:                                                                   | The method used to capture the survey response.                                      | sample method                                                                        |
| `responses`                                                                          | [components.QuestionResponseJson](../../models/components/questionresponsejson.md)[] | :heavy_minus_sign:                                                                   | The list of question and answers for a survey.                                       |                                                                                      |
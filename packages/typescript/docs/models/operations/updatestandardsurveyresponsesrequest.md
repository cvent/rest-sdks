# UpdateStandardSurveyResponsesRequest

## Example Usage

```typescript
import { UpdateStandardSurveyResponsesRequest } from "@cvent/sdk/models/operations";

let value: UpdateStandardSurveyResponsesRequest = {
  surveyId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  respondentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  responseId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  standardSurveyResponse: {
    question: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    answers: [],
    survey: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    loopingChoice: {
      id: "9463c74e-18c6-401a-a710-ae0f485bf059",
    },
  },
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `surveyId`                                                                                       | *string*                                                                                         | :heavy_check_mark:                                                                               | Id of a survey or Id of a chapter in event survey                                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `respondentId`                                                                                   | *string*                                                                                         | :heavy_check_mark:                                                                               | Id of a respondent                                                                               | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `responseId`                                                                                     | *string*                                                                                         | :heavy_check_mark:                                                                               | Id of a response                                                                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                             |
| `standardSurveyResponse`                                                                         | [components.StandardSurveyResponseInput](../../models/components/standardsurveyresponseinput.md) | :heavy_check_mark:                                                                               | Used to update responses for a standalone survey's respondents.                                  |                                                                                                  |
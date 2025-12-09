# UpdateStandardSurveyRespondentRequest

## Example Usage

```typescript
import { UpdateStandardSurveyRespondentRequest } from "@cvent/sdk/models/operations";

let value: UpdateStandardSurveyRespondentRequest = {
  surveyId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  respondentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  standardSurveyRespondent: {
    localeId: "en-US",
    respondedThrough: "API",
    referenceId: "facebook",
    sourceId: "IN4IDS1",
    contact: {
      id: "9463c74e-18c6-401a-a710-ae0f485bf059",
    },
    status: "No Response",
    invitationList: {
      id: "9463c74e-18c6-401a-a710-ae0f485bf059",
    },
    transactionId: "TR5IDS4",
  },
};
```

## Fields

| Field                                                                                                | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `surveyId`                                                                                           | *string*                                                                                             | :heavy_check_mark:                                                                                   | Id of a survey or Id of a chapter in event survey                                                    | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                 |
| `respondentId`                                                                                       | *string*                                                                                             | :heavy_check_mark:                                                                                   | Id of a respondent                                                                                   | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                                 |
| `standardSurveyRespondent`                                                                           | [components.StandardSurveyRespondentInput](../../models/components/standardsurveyrespondentinput.md) | :heavy_check_mark:                                                                                   | Used to update respondent for a standalone survey.                                                   |                                                                                                      |
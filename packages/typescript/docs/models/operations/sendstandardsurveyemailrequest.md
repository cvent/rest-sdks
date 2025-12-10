# SendStandardSurveyEmailRequest

## Example Usage

```typescript
import { SendStandardSurveyEmailRequest } from "@cvent/sdk/models/operations";

let value: SendStandardSurveyEmailRequest = {
  surveyId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  respondentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  emailTemplateId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `surveyId`                                        | *string*                                          | :heavy_check_mark:                                | Id of a survey or Id of a chapter in event survey | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3              |
| `respondentId`                                    | *string*                                          | :heavy_check_mark:                                | Id of a respondent                                | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3              |
| `emailTemplateId`                                 | *string*                                          | :heavy_check_mark:                                | Id of an email template                           | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3              |
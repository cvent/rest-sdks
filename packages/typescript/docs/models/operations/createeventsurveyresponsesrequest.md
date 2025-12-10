# CreateEventSurveyResponsesRequest

## Example Usage

```typescript
import { CreateEventSurveyResponsesRequest } from "@cvent/sdk/models/operations";

let value: CreateEventSurveyResponsesRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  surveyId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  respondentId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  eventSurveyResponse: {
    question: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    answers: [],
    survey: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    session: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
    speaker: {
      id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    },
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `id`                                                                                       | *string*                                                                                   | :heavy_check_mark:                                                                         | Id of an event                                                                             | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                       |
| `surveyId`                                                                                 | *string*                                                                                   | :heavy_check_mark:                                                                         | Id of a survey or Id of a chapter in event survey                                          | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                       |
| `respondentId`                                                                             | *string*                                                                                   | :heavy_check_mark:                                                                         | Id of a respondent                                                                         | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                       |
| `eventSurveyResponse`                                                                      | [components.EventSurveyResponseInput](../../models/components/eventsurveyresponseinput.md) | :heavy_check_mark:                                                                         | Used to create responses for an event survey's respondent.                                 |                                                                                            |
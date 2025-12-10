# CreateEventSurveyRespondentRequest

## Example Usage

```typescript
import { CreateEventSurveyRespondentRequest } from "@cvent/sdk/models/operations";

let value: CreateEventSurveyRespondentRequest = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  surveyId: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  eventSurveyRespondent: {
    localeId: "en-US",
    respondedThrough: "API",
    referenceId: "facebook",
    sourceId: "IN4IDS1",
    attendee: {
      id: "9463c74e-18c6-401a-a710-ae0f485bf059",
    },
  },
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    | Example                                                                                        |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `id`                                                                                           | *string*                                                                                       | :heavy_check_mark:                                                                             | Id of an event                                                                                 | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                           |
| `surveyId`                                                                                     | *string*                                                                                       | :heavy_check_mark:                                                                             | Id of a survey or Id of a chapter in event survey                                              | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                                           |
| `eventSurveyRespondent`                                                                        | [components.EventSurveyRespondentInput](../../models/components/eventsurveyrespondentinput.md) | :heavy_check_mark:                                                                             | Used to create respondent for an event survey.                                                 |                                                                                                |
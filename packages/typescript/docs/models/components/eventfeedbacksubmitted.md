# EventFeedbackSubmitted

An event-feedback-submitted activity.

## Example Usage

```typescript
import { EventFeedbackSubmitted } from "@cvent/sdk/models/components";

let value: EventFeedbackSubmitted = {
  survey: {
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
  },
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `event`                                                                                | [components.ActivityDataJsonEvent4](../../models/components/activitydatajsonevent4.md) | :heavy_minus_sign:                                                                     | The event in which this activity occurred.                                             |
| `survey`                                                                               | [components.SurveyResponseJson](../../models/components/surveyresponsejson.md)         | :heavy_minus_sign:                                                                     | A survey response.                                                                     |
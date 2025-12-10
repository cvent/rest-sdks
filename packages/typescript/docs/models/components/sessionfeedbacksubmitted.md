# SessionFeedbackSubmitted

A session feedback-submitted activity.

## Example Usage

```typescript
import { SessionFeedbackSubmitted } from "@cvent/sdk/models/components";

let value: SessionFeedbackSubmitted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
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

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `session`                                                                      | [components.SessionActivity4](../../models/components/sessionactivity4.md)     | :heavy_minus_sign:                                                             | The activity session.                                                          |
| `survey`                                                                       | [components.SurveyResponseJson](../../models/components/surveyresponsejson.md) | :heavy_minus_sign:                                                             | A survey response.                                                             |
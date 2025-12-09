# SpeakerFeedbackSubmitted

A speaker feedback-submitted activity.

## Example Usage

```typescript
import { SpeakerFeedbackSubmitted } from "@cvent/sdk/models/components";

let value: SpeakerFeedbackSubmitted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  speaker: {
    name: "Henry Ford",
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
| `session`                                                                      | [components.SessionActivity11](../../models/components/sessionactivity11.md)   | :heavy_minus_sign:                                                             | The activity session.                                                          |
| `speaker`                                                                      | [components.SpeakerJson](../../models/components/speakerjson.md)               | :heavy_minus_sign:                                                             | An activity speaker.                                                           |
| `survey`                                                                       | [components.SurveyResponseJson](../../models/components/surveyresponsejson.md) | :heavy_minus_sign:                                                             | A survey response.                                                             |
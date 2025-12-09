# SessionQuestionUpvoted

This denotes the question asked in the session.

## Example Usage

```typescript
import { SessionQuestionUpvoted } from "@cvent/sdk/models/components";

let value: SessionQuestionUpvoted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    text: "Is this a new session?",
  },
  platform: "Attendee Hub",
  votes: 0,
};
```

## Fields

| Field                                                                          | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `session`                                                                      | [components.SessionActivity8](../../models/components/sessionactivity8.md)     | :heavy_minus_sign:                                                             | The activity session.                                                          |                                                                                |
| `question`                                                                     | [components.QuestionDetailJson](../../models/components/questiondetailjson.md) | :heavy_minus_sign:                                                             | The question asked in a session.                                               |                                                                                |
| `platform`                                                                     | *string*                                                                       | :heavy_minus_sign:                                                             | The platform used by the user.                                                 | Attendee Hub                                                                   |
| `votes`                                                                        | *number*                                                                       | :heavy_minus_sign:                                                             | The number of votes for a question.                                            | 0                                                                              |
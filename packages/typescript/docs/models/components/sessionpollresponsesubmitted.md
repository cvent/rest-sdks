# SessionPollResponseSubmitted

The poll created for a session.

## Example Usage

```typescript
import { SessionPollResponseSubmitted } from "@cvent/sdk/models/components";

let value: SessionPollResponseSubmitted = {
  session: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
    title: "tech_session",
    code: "XRNGB4YY3CX",
  },
  poll: {
    name: "Do you like the session?",
    responses: [
      {
        question: {
          id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
          text: "How would you rate this session?",
        },
        answers: [
          {
            value: "my answer",
          },
        ],
      },
    ],
  },
};
```

## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `session`                                                                  | [components.SessionActivity6](../../models/components/sessionactivity6.md) | :heavy_minus_sign:                                                         | The activity session.                                                      |
| `poll`                                                                     | [components.PollResponseJson](../../models/components/pollresponsejson.md) | :heavy_minus_sign:                                                         | This is used to denote the poll details.                                   |
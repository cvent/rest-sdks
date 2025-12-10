# PollResponseJson

This is used to denote the poll details.

## Example Usage

```typescript
import { PollResponseJson } from "@cvent/sdk/models/components";

let value: PollResponseJson = {
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
};
```

## Fields

| Field                                                                                        | Type                                                                                         | Required                                                                                     | Description                                                                                  | Example                                                                                      |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `name`                                                                                       | *string*                                                                                     | :heavy_minus_sign:                                                                           | The name of the poll.                                                                        | Do you like the session?                                                                     |
| `responses`                                                                                  | [components.BaseQuestionResponseJson](../../models/components/basequestionresponsejson.md)[] | :heavy_minus_sign:                                                                           | The list of question and answers for a poll.                                                 |                                                                                              |
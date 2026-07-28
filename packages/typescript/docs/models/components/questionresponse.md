# QuestionResponse

A Question response.

## Example Usage

```typescript
import { QuestionResponse } from "@cvent/sdk/models/components";

let value: QuestionResponse = {
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
};
```

## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `question`                                                   | [components.Question2](../../models/components/question2.md) | :heavy_minus_sign:                                           | The question that was answered.                              |
| `answers`                                                    | [components.Answer21](../../models/components/answer21.md)[] | :heavy_minus_sign:                                           | List of answers.                                             |
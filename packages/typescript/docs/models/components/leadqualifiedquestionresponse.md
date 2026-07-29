# LeadQualifiedQuestionResponse

A Question response.

## Example Usage

```typescript
import { LeadQualifiedQuestionResponse } from "@cvent/sdk/models/components";

let value: LeadQualifiedQuestionResponse = {
  question: {
    id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
    text: "How would you rate this session?",
    code: "CODE_A",
  },
  answers: [
    {
      id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
      text: "How would you rate this session?",
      type: "simple",
    },
  ],
};
```

## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `question`                                                                         | [components.Question2](../../models/components/question2.md)                       | :heavy_minus_sign:                                                                 | The question that was answered.                                                    |
| `answers`                                                                          | [components.LeadQualifiedAnswer](../../models/components/leadqualifiedanswer.md)[] | :heavy_minus_sign:                                                                 | List of answers.                                                                   |
# LeadQualifiedQuestionResponseJson

A Question response.

## Example Usage

```typescript
import { LeadQualifiedQuestionResponseJson } from "@cvent/sdk/models/components";

let value: LeadQualifiedQuestionResponseJson = {
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

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `question`                                                                                 | [components.QuestionJson3](../../models/components/questionjson3.md)                       | :heavy_minus_sign:                                                                         | The question that was answered.                                                            |
| `answers`                                                                                  | [components.LeadQualifiedAnswerJson](../../models/components/leadqualifiedanswerjson.md)[] | :heavy_minus_sign:                                                                         | List of answers.                                                                           |
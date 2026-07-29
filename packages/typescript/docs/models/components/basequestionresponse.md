# BaseQuestionResponse

Base entity for a question response.

## Example Usage

```typescript
import { BaseQuestionResponse } from "@cvent/sdk/models/components";

let value: BaseQuestionResponse = {
  question: {
    id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
    text: "How would you rate this session?",
  },
  answers: [
    {
      value: "my answer",
    },
  ],
};
```

## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `question`                                                         | [components.BaseQuestion](../../models/components/basequestion.md) | :heavy_minus_sign:                                                 | The question that was answered.                                    |
| `answers`                                                          | [components.BaseAnswer](../../models/components/baseanswer.md)[]   | :heavy_minus_sign:                                                 | List of answers.                                                   |
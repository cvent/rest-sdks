# BaseQuestionResponseJson

Base entity for a question response.

## Example Usage

```typescript
import { BaseQuestionResponseJson } from "@cvent/sdk/models/components";

let value: BaseQuestionResponseJson = {
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

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `question`                                                               | [components.ZeroAllOf4](../../models/components/zeroallof4.md)           | :heavy_minus_sign:                                                       | The question that was answered.                                          |
| `answers`                                                                | [components.BaseAnswerJson](../../models/components/baseanswerjson.md)[] | :heavy_minus_sign:                                                       | List of answers.                                                         |
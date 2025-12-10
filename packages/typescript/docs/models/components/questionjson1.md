# QuestionJson1

Question details

## Example Usage

```typescript
import { QuestionJson1 } from "@cvent/sdk/models/components";

let value: QuestionJson1 = {
  id: "2385098a-ab4e-4e06-b3b7-487cad288587",
  text: "Sample question?",
  status: "approved",
  anonymous: true,
  answer: "Sample answer.",
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `id`                                   | *string*                               | :heavy_check_mark:                     | The question ID.                       | 2385098a-ab4e-4e06-b3b7-487cad288587   |
| `text`                                 | *string*                               | :heavy_minus_sign:                     | The question text.                     | Sample question?                       |
| `status`                               | *string*                               | :heavy_minus_sign:                     | The status of the question.            | approved                               |
| `anonymous`                            | *boolean*                              | :heavy_minus_sign:                     | Whether question is asked anonymously. | true                                   |
| `answer`                               | *string*                               | :heavy_minus_sign:                     | The answer text.                       | Sample answer.                         |
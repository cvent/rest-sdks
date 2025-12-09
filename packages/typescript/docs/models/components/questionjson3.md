# QuestionJson3

The question that was answered.

## Example Usage

```typescript
import { QuestionJson3 } from "@cvent/sdk/models/components";

let value: QuestionJson3 = {
  id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
  text: "How would you rate this session?",
  code: "CODE_A",
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `id`                                   | *string*                               | :heavy_minus_sign:                     | The unique identifier of the question. | 861b51ec-aa7e-475f-b38d-4c8e35c47d63   |
| `text`                                 | *string*                               | :heavy_minus_sign:                     | Question text.                         | How would you rate this session?       |
| `code`                                 | *string*                               | :heavy_minus_sign:                     | Question code.                         | CODE_A                                 |
# ProcessFormSubmissionQuestion

A question for a process form submission.

## Example Usage

```typescript
import { ProcessFormSubmissionQuestion } from "@cvent/sdk/models/components";

let value: ProcessFormSubmissionQuestion = {
  id: "f1ea56cd-6860-4f1a-baf7-973118384384",
  name: "What is your favorite color?",
  type: "Decimal",
  value: [
    "Green",
  ],
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *string*                                                               | :heavy_check_mark:                                                     | The unique ID representing this question.                              | f1ea56cd-6860-4f1a-baf7-973118384384                                   |
| `name`                                                                 | *string*                                                               | :heavy_minus_sign:                                                     | The actual text of the custom field.                                   | What is your favorite color?                                           |
| `type`                                                                 | [components.QuestionType11](../../models/components/questiontype11.md) | :heavy_minus_sign:                                                     | Denotes the type of data collected by a question.                      | FreeText                                                               |
| `value`                                                                | *string*[]                                                             | :heavy_check_mark:                                                     | The set of answers to the question.                                    |                                                                        |
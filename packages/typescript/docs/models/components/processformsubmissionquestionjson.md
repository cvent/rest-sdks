# ProcessFormSubmissionQuestionJson

A question for a process form submission.

## Example Usage

```typescript
import { ProcessFormSubmissionQuestionJson } from "@cvent/sdk/models/components";

let value: ProcessFormSubmissionQuestionJson = {
  id: "f1ea56cd-6860-4f1a-baf7-973118384384",
  name: "What is your favorite color?",
  type: "SingleSelect",
  value: [
    "Green",
  ],
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `id`                                                                                             | *string*                                                                                         | :heavy_check_mark:                                                                               | The unique ID representing this question.                                                        | f1ea56cd-6860-4f1a-baf7-973118384384                                                             |
| `name`                                                                                           | *string*                                                                                         | :heavy_minus_sign:                                                                               | The actual text of the custom field.                                                             | What is your favorite color?                                                                     |
| `type`                                                                                           | [components.ProcessFormQuestionTypeJson](../../models/components/processformquestiontypejson.md) | :heavy_minus_sign:                                                                               | Denotes the type of data collected by a question.                                                | FreeText                                                                                         |
| `value`                                                                                          | *string*[]                                                                                       | :heavy_check_mark:                                                                               | The set of answers to the question.                                                              |                                                                                                  |
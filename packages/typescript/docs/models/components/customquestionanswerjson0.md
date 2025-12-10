# CustomQuestionAnswerJson0

Represents custom question associated with a travel proposal.

## Example Usage

```typescript
import { CustomQuestionAnswerJson0 } from "@cvent/sdk/models/components";

let value: CustomQuestionAnswerJson0 = {
  question: {
    id: "565ceabb-786a-4a6d-8c85-e2fccc867e88",
  },
  answer: "No.",
};
```

## Fields

| Field                                                                                                        | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  | Example                                                                                                      |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `question`                                                                                                   | [components.CustomQuestionAnswerJson0Question](../../models/components/customquestionanswerjson0question.md) | :heavy_minus_sign:                                                                                           | Travel account that the proposal is responding to.                                                           |                                                                                                              |
| `answer`                                                                                                     | *string*                                                                                                     | :heavy_minus_sign:                                                                                           | Hotel's answer to the program's custom question.                                                             | No.                                                                                                          |
# Answer2

A JSON schema representing an answer object.

## Example Usage

```typescript
import { Answer2 } from "@cvent/sdk/models/components";

let value: Answer2 = {
  type: "Choice",
  value: "Choice A",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `type`                                                               | [components.AnswerType1](../../models/components/answertype1.md)     | :heavy_check_mark:                                                   | Type of answer                                                       | Choice                                                               |
| `value`                                                              | *string*                                                             | :heavy_minus_sign:                                                   | Answered value like: Choice text, text answer input etc.             | Choice A                                                             |
| `choice`                                                             | [components.Answer2Choice](../../models/components/answer2choice.md) | :heavy_minus_sign:                                                   | The choice that was selected.                                        |                                                                      |
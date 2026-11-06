# Answer2

Answer to an exhibitor question.

## Example Usage

```typescript
import { Answer2 } from "@cvent/sdk/models/components";

let value: Answer2 = {
  type: "Choice",
  value: "Choice A",
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `type`                                                                                     | [components.AnswerType11](../../models/components/answertype11.md)                         | :heavy_check_mark:                                                                         | Type of the answer.                                                                        | Choice                                                                                     |
| `value`                                                                                    | *string*                                                                                   | :heavy_minus_sign:                                                                         | Value of the answer, such as the text of a choice or the text that the respondent entered. | Choice A                                                                                   |
| `choice`                                                                                   | [components.Answer2Choice](../../models/components/answer2choice.md)                       | :heavy_minus_sign:                                                                         | Selected choice.                                                                           |                                                                                            |
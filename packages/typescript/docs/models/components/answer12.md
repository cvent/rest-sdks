# Answer12

Answer to a lead qualification question.

## Example Usage

```typescript
import { Answer12 } from "@cvent/sdk/models/components";

let value: Answer12 = {
  type: "Other",
  value: "Choice A",
  choice: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `type`                                                                                     | [components.AnswerType](../../models/components/answertype.md)                             | :heavy_check_mark:                                                                         | Type of the answer.                                                                        | File                                                                                       |
| `value`                                                                                    | *string*                                                                                   | :heavy_minus_sign:                                                                         | Value of the answer, such as the text of a choice or the text that the respondent entered. | Choice A                                                                                   |
| `choice`                                                                                   | [components.Uuid](../../models/components/uuid.md)                                         | :heavy_minus_sign:                                                                         | The reference to the related entity. Contains only the ID of the related entity.           |                                                                                            |
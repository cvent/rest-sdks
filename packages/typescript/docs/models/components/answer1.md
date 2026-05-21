# Answer1

An object representing the possible answers for lead qualification questions.

## Example Usage

```typescript
import { Answer1 } from "@cvent/sdk/models/components";

let value: Answer1 = {
  type: "Text",
  value: "Choice A",
  choice: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                            | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `type`                                                                           | [components.AnswerType](../../models/components/answertype.md)                   | :heavy_check_mark:                                                               | Type of answer                                                                   | File                                                                             |
| `value`                                                                          | *string*                                                                         | :heavy_minus_sign:                                                               | Answered value like: Choice text, text answer input etc.                         | Choice A                                                                         |
| `choice`                                                                         | [components.Uuid1](../../models/components/uuid1.md)                             | :heavy_minus_sign:                                                               | The reference to the related entity. Contains only the ID of the related entity. |                                                                                  |
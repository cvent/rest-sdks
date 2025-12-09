# LargeChoiceJson

Choice of large choices question.

## Example Usage

```typescript
import { LargeChoiceJson } from "@cvent/sdk/models/components";

let value: LargeChoiceJson = {
  text: "Choice A",
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            | Example                                                                |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `id`                                                                   | *string*                                                               | :heavy_minus_sign:                                                     | The ID of the choice.                                                  |                                                                        |
| `text`                                                                 | *string*                                                               | :heavy_minus_sign:                                                     | The text of the choice.                                                | Choice A                                                               |
| `question`                                                             | [components.QuestionIdJson](../../models/components/questionidjson.md) | :heavy_minus_sign:                                                     | An object that holds the ID of the question.                           |                                                                        |
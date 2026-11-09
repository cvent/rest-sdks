# LargeChoice

Choice of large choices question.

## Example Usage

```typescript
import { LargeChoice } from "@cvent/sdk/models/components";

let value: LargeChoice = {
  text: "Choice A",
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
};
```

## Fields

| Field                                                          | Type                                                           | Required                                                       | Description                                                    | Example                                                        |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `id`                                                           | *string*                                                       | :heavy_minus_sign:                                             | The ID of the choice.                                          |                                                                |
| `text`                                                         | *string*                                                       | :heavy_minus_sign:                                             | The text of the choice.                                        | Choice A                                                       |
| `question`                                                     | [components.Question11](../../models/components/question11.md) | :heavy_minus_sign:                                             | An object that holds the ID of the question.                   |                                                                |
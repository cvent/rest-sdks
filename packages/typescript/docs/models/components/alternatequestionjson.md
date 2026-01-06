# AlternateQuestionJson

Represents a reference to an alternate travel question entity, containing only the question ID and text.

## Example Usage

```typescript
import { AlternateQuestionJson } from "@cvent/sdk/models/components";

let value: AlternateQuestionJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  text: "Why are you not booking a hotel with us?",
};
```

## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `id`                                       | *string*                                   | :heavy_minus_sign:                         | Unique identifier for the question entity. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3       |
| `text`                                     | *string*                                   | :heavy_minus_sign:                         | Text of the alternate travel question.     | Why are you not booking a hotel with us?   |
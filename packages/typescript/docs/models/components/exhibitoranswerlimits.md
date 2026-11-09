# ExhibitorAnswerLimits

Limits of the answers to an exhibitor question.

## Example Usage

```typescript
import { ExhibitorAnswerLimits } from "@cvent/sdk/models/components";

let value: ExhibitorAnswerLimits = {
  minSelections: 1,
  maxSelections: 10,
};
```

## Fields

| Field                                                                                                                      | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                | Example                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `minLength`                                                                                                                | *number*                                                                                                                   | :heavy_minus_sign:                                                                                                         | Minimum length of the answer to an `OpenEndedTextCommentBox` question. The value is less than or equal to `maxLength`.     | 1                                                                                                                          |
| `maxLength`                                                                                                                | *number*                                                                                                                   | :heavy_minus_sign:                                                                                                         | Maximum length of the answer to an `OpenEndedTextCommentBox` question.                                                     | 2000                                                                                                                       |
| `minSelections`                                                                                                            | *number*                                                                                                                   | :heavy_minus_sign:                                                                                                         | Minimum number of selected choices for a `MultiChoice` question. The value is less than or equal to `maxSelections`.       | 1                                                                                                                          |
| `maxSelections`                                                                                                            | *number*                                                                                                                   | :heavy_minus_sign:                                                                                                         | Maximum number of selected choices for a `MultiChoice` question. The value is less than or equal to the number of choices. | 10                                                                                                                         |
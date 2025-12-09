# ExhibitorAnswerLimitsJson

Defines the limits for answers to exhibitor questions.

## Example Usage

```typescript
import { ExhibitorAnswerLimitsJson } from "@cvent/sdk/models/components";

let value: ExhibitorAnswerLimitsJson = {
  minSelections: 1,
  maxSelections: 10,
};
```

## Fields

| Field                                                                                                                | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `minLength`                                                                                                          | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Minimum length of the answer for OpenEndedTextCommentBox questions. It must be less than or equal to maxLength.      | 1                                                                                                                    |
| `maxLength`                                                                                                          | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Maximum length of the answer for OpenEndedTextCommentBox questions.                                                  | 2000                                                                                                                 |
| `minSelections`                                                                                                      | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Minimum number of choices required for MultiChoice questions. It must be less than or equal to maxSelections.        | 1                                                                                                                    |
| `maxSelections`                                                                                                      | *number*                                                                                                             | :heavy_minus_sign:                                                                                                   | Maximum number of choices allowed for MultiChoice questions. It cannot exceed the total number of available choices. | 10                                                                                                                   |
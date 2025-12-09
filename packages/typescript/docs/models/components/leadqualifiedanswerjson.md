# LeadQualifiedAnswerJson

A question answer.

## Example Usage

```typescript
import { LeadQualifiedAnswerJson } from "@cvent/sdk/models/components";

let value: LeadQualifiedAnswerJson = {
  id: "861b51ec-aa7e-475f-b38d-4c8e35c47d63",
  text: "How would you rate this session?",
  type: "simple",
};
```

## Fields

| Field                                  | Type                                   | Required                               | Description                            | Example                                |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `id`                                   | *string*                               | :heavy_minus_sign:                     | The unique identifier of the question. | 861b51ec-aa7e-475f-b38d-4c8e35c47d63   |
| `text`                                 | *string*                               | :heavy_minus_sign:                     | Question text.                         | How would you rate this session?       |
| `type`                                 | *string*                               | :heavy_minus_sign:                     | Data type of an answer.                | simple                                 |
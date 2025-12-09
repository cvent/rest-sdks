# QuestionDetailJson

The question asked in a session.

## Example Usage

```typescript
import { QuestionDetailJson } from "@cvent/sdk/models/components";

let value: QuestionDetailJson = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  text: "Is this a new session?",
};
```

## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          | Example                                                              |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `id`                                                                 | *string*                                                             | :heavy_minus_sign:                                                   | A string that has to be a format matching the industry standard uuid | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3                                 |
| `text`                                                               | *string*                                                             | :heavy_minus_sign:                                                   | Question text.                                                       | Is this a new session?                                               |
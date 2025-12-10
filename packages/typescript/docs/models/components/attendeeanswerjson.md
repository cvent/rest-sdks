# AttendeeAnswerJson

An attendee's answer to registration questions.

## Example Usage

```typescript
import { AttendeeAnswerJson } from "@cvent/sdk/models/components";

let value: AttendeeAnswerJson = {
  question: {
    id: "60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a",
  },
  value: [
    "1234",
  ],
};
```

## Fields

| Field                                                                                          | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `question`                                                                                     | [components.AttendeeAnswerJsonQuestion](../../models/components/attendeeanswerjsonquestion.md) | :heavy_check_mark:                                                                             | The registration question.                                                                     |
| `value`                                                                                        | *string*[]                                                                                     | :heavy_check_mark:                                                                             | The set of answers to the given question.                                                      |
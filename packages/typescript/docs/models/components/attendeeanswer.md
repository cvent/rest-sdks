# AttendeeAnswer

An attendee's answer to registration questions.

## Example Usage

```typescript
import { AttendeeAnswer } from "@cvent/sdk/models/components";

let value: AttendeeAnswer = {
  question: {
    id: "60f1d05b-e3ee-4d70-a7f3-0edb9a76af4a",
  },
  value: [
    "1234",
  ],
};
```

## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `question`                                                                             | [components.AttendeeAnswerQuestion](../../models/components/attendeeanswerquestion.md) | :heavy_check_mark:                                                                     | The registration question.                                                             |
| `value`                                                                                | *string*[]                                                                             | :heavy_check_mark:                                                                     | The set of answers to the given question.                                              |
# AttendeeAnswerJson1

Answer for the question answered by attendee.

## Example Usage

```typescript
import { AttendeeAnswerJson1 } from "@cvent/sdk/models/components";

let value: AttendeeAnswerJson1 = {
  question: {
    id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
  },
  value: [
    "1234",
  ],
};
```

## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `question`                                                                                       | [components.AttendeeAnswerJson1Question](../../models/components/attendeeanswerjson1question.md) | :heavy_check_mark:                                                                               | The reference to the question entity. Contains only the ID of the question entity.               |
| `value`                                                                                          | *string*[]                                                                                       | :heavy_check_mark:                                                                               | The set of answers to a question.                                                                |
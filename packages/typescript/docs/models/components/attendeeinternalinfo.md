# AttendeeInternalInfo

Model representing internal information answers for an attendee to be added or updated.

## Example Usage

```typescript
import { AttendeeInternalInfo } from "@cvent/sdk/models/components";

let value: AttendeeInternalInfo = {
  question: {
    id: "adcc4376-4560-4fb3-8594-2fdbb637c07c",
    code: "DIETARY",
  },
  value: [
    "1234",
  ],
};
```

## Fields

| Field                                                                                                                     | Type                                                                                                                      | Required                                                                                                                  | Description                                                                                                               |
| ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------- |
| `question`                                                                                                                | [components.AttendeeInternalInfoQuestion](../../models/components/attendeeinternalinfoquestion.md)                        | :heavy_check_mark:                                                                                                        | The registration question identified by its ID or code. If both fields are present, they must identify the same question. |
| `value`                                                                                                                   | *string*[]                                                                                                                | :heavy_check_mark:                                                                                                        | The set of answers to a question.                                                                                         |
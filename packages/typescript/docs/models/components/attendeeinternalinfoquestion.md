# AttendeeInternalInfoQuestion

The registration question identified by its ID or code. If both fields are present, they must identify the same question.

## Example Usage

```typescript
import { AttendeeInternalInfoQuestion } from "@cvent/sdk/models/components";

let value: AttendeeInternalInfoQuestion = {
  id: "adcc4376-4560-4fb3-8594-2fdbb637c07c",
  code: "DIETARY",
};
```

## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                | Example                                                    |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `id`                                                       | *string*                                                   | :heavy_minus_sign:                                         | The question ID.                                           | adcc4376-4560-4fb3-8594-2fdbb637c07c                       |
| `code`                                                     | *string*                                                   | :heavy_minus_sign:                                         | The planner configured internal information question code. | DIETARY                                                    |
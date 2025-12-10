# BaseAnswerJson

Base entity of a question answer.

## Example Usage

```typescript
import { BaseAnswerJson } from "@cvent/sdk/models/components";

let value: BaseAnswerJson = {
  value: "my answer",
};
```

## Fields

| Field                               | Type                                | Required                            | Description                         | Example                             |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `id`                                | *string*                            | :heavy_minus_sign:                  | The unique identifier of the Answer |                                     |
| `value`                             | *string*                            | :heavy_minus_sign:                  | Value of an answer.                 | my answer                           |
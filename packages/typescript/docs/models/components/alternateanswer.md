# AlternateAnswer

Represents the answer(s) to an alternate travel question submitted by an attendee.

## Example Usage

```typescript
import { AlternateAnswer } from "@cvent/sdk/models/components";

let value: AlternateAnswer = {
  value: [
    "1234",
  ],
};
```

## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `value`                                                   | *string*[]                                                | :heavy_minus_sign:                                        | The set of answers to a single alternate travel question. | [<br/>"1234"<br/>]                                        |
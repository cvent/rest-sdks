# AnswerJson0

A JSON schema representing an answer object.

## Example Usage

```typescript
import { AnswerJson0 } from "@cvent/sdk/models/components";

let value: AnswerJson0 = {
  type: "Choice",
  value: "Choice A",
};
```

## Fields

| Field                                                                    | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `type`                                                                   | [components.AnswerTypeJson0](../../models/components/answertypejson0.md) | :heavy_check_mark:                                                       | Type of answer                                                           | Choice                                                                   |
| `value`                                                                  | *string*                                                                 | :heavy_minus_sign:                                                       | Answered value like: Choice text, text answer input etc.                 | Choice A                                                                 |
| `choice`                                                                 | [components.Choice](../../models/components/choice.md)                   | :heavy_minus_sign:                                                       | The choice that was selected.                                            |                                                                          |
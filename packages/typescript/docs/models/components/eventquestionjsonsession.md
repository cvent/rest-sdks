# EventQuestionJsonSession

Represents the session associated to the question, if any. Blank if no session is associated. In addition, only one of the `session` or `admissionItem` object are populated - never both.

## Example Usage

```typescript
import { EventQuestionJsonSession } from "@cvent/sdk/models/components";

let value: EventQuestionJsonSession = {
  id: "04ca6ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                           | Type                                            | Required                                        | Description                                     | Example                                         |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `id`                                            | *string*                                        | :heavy_minus_sign:                              | ID of the session associated with the question. | 04ca6ae2-0dc3-487b-953e-86d6abbdf7d3            |
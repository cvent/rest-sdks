# EventQuestionAdmissionItem

Represents the admission item associated to the question, if any. Blank if no admission item is associated. In addition, only one of the `session` or `admissionItem` object are populated - never both.

## Example Usage

```typescript
import { EventQuestionAdmissionItem } from "@cvent/sdk/models/components";

let value: EventQuestionAdmissionItem = {
  id: "06ca5ae2-0dc3-487b-953e-86d6abbdf7d3",
};
```

## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `id`                                                   | *string*                                               | :heavy_minus_sign:                                     | ID of the admission item associated with the question. | 06ca5ae2-0dc3-487b-953e-86d6abbdf7d3                   |